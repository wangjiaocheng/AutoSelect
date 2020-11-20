package com.autoselect.maper

import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.amap.api.maps.AMap
import com.amap.api.maps.CameraUpdateFactory
import com.amap.api.maps.model.*
import com.amap.api.services.core.AMapException
import com.amap.api.services.core.LatLonPoint
import com.amap.api.services.route.*
import com.amap.api.services.routepoisearch.RoutePOIItem
import com.amap.api.services.routepoisearch.RoutePOISearch
import com.amap.api.services.routepoisearch.RoutePOISearchQuery
import com.amap.api.services.routepoisearch.RoutePOISearchResult
import com.autoselect.helper.ToastHelper.showLong
import com.autoselect.maper.MapCommon.getFriendlyLength
import com.autoselect.maper.MapCommon.getFriendlyTime
import com.autoselect.maper.MapCommon.toLatLng
import com.autoselect.maper.MapErrorToast.showError
import kotlinx.android.synthetic.main.activity_route.*

class MapRouteActivity : AppCompatActivity(), RouteSearch.OnRouteSearchListener,
    RoutePOISearch.OnRoutePOISearchListener {
    private var aMap: AMap? = null
    private var searchSearch: RouteSearch? = null
    var startPoint: LatLonPoint = LatLonPoint(39.942295, 116.335891)
    var endPoint: LatLonPoint = LatLonPoint(39.995576, 116.481288)
    private val setFromAndToMarker = {
        aMap?.addMarker(
            MarkerOptions().position(startPoint.toLatLng)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.start))
        )
        aMap?.addMarker(
            MarkerOptions().position(endPoint.toLatLng)
                .icon(BitmapDescriptorFactory.fromResource(R.mipmap.end))
        )
    }

    override fun onCreate(bundle: Bundle?) {
        super.onCreate(bundle)
        setContentView(R.layout.activity_route)
        route_map.onCreate(bundle)
        if (aMap == null) aMap = route_map.map
        searchSearch = RouteSearch(this)
        searchSearch?.setRouteSearchListener(this)
        setFromAndToMarker
    }

    override fun onResume() {
        super.onResume()
        route_map.onResume()
    }

    override fun onPause() {
        super.onPause()
        route_map.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        route_map.onSaveInstanceState(outState)
    }

    override fun onDestroy() {
        super.onDestroy()
        route_map.onDestroy()
    }

    private var progressDialog: ProgressDialog? = null
    private val showProgressDialog = {
        if (progressDialog == null) progressDialog = ProgressDialog(this)
        progressDialog?.apply {
            setProgressStyle(ProgressDialog.STYLE_SPINNER)
            isIndeterminate = false
            setCancelable(true)
            setMessage("正在搜索:\n")
        }?.show()
    }
    private val routeTypeBus = 1
    private val routeTypeDrive = 2
    private val routeTypeRide = 3
    private val routeTypeWalk = 4
    private val routeTypeCrosstown = 0
    var currentCityName = "北京"
    var endCityName = "农安县"
    fun searchRouteResult(routeType: Int, mode: Int) {
        showProgressDialog
        searchSearch?.run {
            val fromAndTo: RouteSearch.FromAndTo = RouteSearch.FromAndTo(startPoint, endPoint)
            when (routeType) {
                routeTypeBus -> calculateBusRouteAsyn(
                    RouteSearch.BusRouteQuery(fromAndTo, mode, currentCityName, 0)
                )
                routeTypeDrive -> calculateDriveRouteAsyn(
                    RouteSearch.DriveRouteQuery(fromAndTo, mode, null, null, "")
                )
                routeTypeRide -> calculateRideRouteAsyn(RouteSearch.RideRouteQuery(fromAndTo, mode))
                routeTypeWalk -> calculateWalkRouteAsyn(RouteSearch.WalkRouteQuery(fromAndTo, mode))
                routeTypeCrosstown -> calculateBusRouteAsyn(
                    RouteSearch.BusRouteQuery(fromAndTo, mode, currentCityName, 0)
                        .apply { cityd = endCityName })
            }
        }
    }

    fun onBusClick(view: View?) {
        searchRouteResult(routeTypeBus, RouteSearch.BusDefault)
        route_bus.setImageResource(R.mipmap.route_bus_select)
        route_drive.setImageResource(R.mipmap.route_drive_normal)
        route_walk.setImageResource(R.mipmap.route_walk_normal)
        route_map.visibility = View.GONE
        bus_result.visibility = View.VISIBLE
    }

    fun onDriveClick(view: View?) {
        searchRouteResult(routeTypeDrive, RouteSearch.DrivingDefault)
        route_bus.setImageResource(R.mipmap.route_bus_normal)
        route_drive.setImageResource(R.mipmap.route_drive_select)
        route_walk.setImageResource(R.mipmap.route_walk_normal)
        route_map.visibility = View.VISIBLE
        bus_result.visibility = View.GONE
    }

    fun onRideClick(view: View?) {
        searchRouteResult(routeTypeRide, RouteSearch.RidingDefault)
        route_bus.setImageResource(R.mipmap.route_bus_normal)
        route_drive.setImageResource(R.mipmap.route_drive_normal)
        route_walk.setImageResource(R.mipmap.route_walk_normal)
        route_map.visibility = View.VISIBLE
        bus_result.visibility = View.GONE
    }

    fun onWalkClick(view: View?) {
        searchRouteResult(routeTypeWalk, RouteSearch.WalkDefault)
        route_bus.setImageResource(R.mipmap.route_bus_normal)
        route_drive.setImageResource(R.mipmap.route_drive_normal)
        route_walk.setImageResource(R.mipmap.route_walk_select)
        route_map.visibility = View.VISIBLE
        bus_result.visibility = View.GONE
    }

    fun onCrosstownBusClick(view: View?) {
        searchRouteResult(routeTypeCrosstown, RouteSearch.BusDefault)
        route_bus.setImageResource(R.mipmap.route_bus_normal)
        route_drive.setImageResource(R.mipmap.route_drive_normal)
        route_walk.setImageResource(R.mipmap.route_walk_normal)
        route_map.visibility = View.GONE
        bus_result.visibility = View.VISIBLE
    }

    private val dismissProgressDialog = progressDialog?.dismiss()
    private var context: Context = applicationContext
    override fun onBusRouteSearched(result: BusRouteResult?, errorCode: Int) {
        dismissProgressDialog
        bottom_layout.visibility = View.GONE
        aMap?.clear()
        when (errorCode) {
            AMapException.CODE_AMAP_SUCCESS -> result?.paths?.run {
                if (size > 0) bus_result_list.adapter =
                    MapRouteBusResultListAdapter(context, result)
            } ?: showLong(R.string.no_result)
            else -> showError(errorCode)
        }
    }

    override fun onDriveRouteSearched(result: DriveRouteResult?, errorCode: Int) {
        dismissProgressDialog
        aMap?.clear()
        when (errorCode) {
            AMapException.CODE_AMAP_SUCCESS -> result?.paths?.run {
                if (size > 0) {
                    val drivePath: DrivePath = this[0]
                    MapRouteDriveOverlay(
                        context, aMap, drivePath, result.startPos, result.targetPos, null
                    ).apply {
                        throughPointMarkerVisible = false
                        isColorFullLine = true
                        removeFromMap
                        addToMap
                        zoomToSpan
                    }
                    bottom_layout.visibility = View.VISIBLE
                    firstline.text =
                        "${getFriendlyTime(drivePath.duration.toInt())}(${
                            getFriendlyLength(
                                drivePath.distance.toInt()
                            )
                        })"
                    secondline.apply {
                        visibility = View.VISIBLE
                        text = "打车约${result.taxiCost}元"
                    }
                    bottom_layout.setOnClickListener {
                        Intent(context, MapRouteDriveDetailActivity::class.java).apply {
                            putExtra("drive_path", drivePath)
                            putExtra("drive_result", result)
                        }.let { startActivity(it) }
                    }
                }
            } ?: showLong(R.string.no_result)
            else -> showError(errorCode)
        }
    }

    override fun onRideRouteSearched(result: RideRouteResult?, errorCode: Int) {
        dismissProgressDialog
        aMap?.clear()
        when (errorCode) {
            AMapException.CODE_AMAP_SUCCESS -> result?.paths?.run {
                if (size > 0) {
                    val ridePath: RidePath = this[0]
                    MapRouteRideOverlay(
                        context, aMap, ridePath, result.startPos, result.targetPos
                    ).apply {
                        removeFromMap
                        addToMap
                        zoomToSpan
                    }
                    bottom_layout.visibility = View.VISIBLE
                    firstline.text =
                        "${getFriendlyTime(ridePath.duration.toInt())}(${getFriendlyLength(ridePath.distance.toInt())})"
                    secondline.visibility = View.GONE
                    bottom_layout.setOnClickListener {
                        Intent(context, MapRouteRideDetailActivity::class.java).apply {
                            putExtra("ride_path", ridePath)
                            putExtra("ride_result", result)
                        }.let { startActivity(it) }
                    }
                }
            } ?: showLong(R.string.no_result)
            else -> showError(errorCode)
        }
    }

    override fun onWalkRouteSearched(result: WalkRouteResult?, errorCode: Int) {
        dismissProgressDialog
        aMap?.clear()
        when (errorCode) {
            AMapException.CODE_AMAP_SUCCESS -> result?.paths?.run {
                if (size > 0) {
                    val walkPath: WalkPath = this[0]
                    MapRouteWalkOverlay(
                        context, aMap, walkPath, result.startPos, result.targetPos
                    ).apply {
                        removeFromMap
                        addToMap
                        zoomToSpan
                    }
                    bottom_layout.visibility = View.VISIBLE
                    firstline.text =
                        "${getFriendlyTime(walkPath.duration.toInt())}(${getFriendlyLength(walkPath.distance.toInt())})"
                    secondline.visibility = View.GONE
                    bottom_layout.setOnClickListener {
                        Intent(context, MapRouteWalkDetailActivity::class.java).apply {
                            putExtra("walk_path", walkPath)
                            putExtra("walk_result", result)
                        }.let { startActivity(it) }
                    }
                }
            } ?: showLong(R.string.no_result)
            else -> showError(errorCode)
        }
    }

    private var innerRoutePoiOverlay: InnerRoutePoiOverlay? = null
    fun searchRoutePOI(mode: Int, type: RoutePOISearch.RoutePOISearchType) {
        innerRoutePoiOverlay?.removeFromMap
        RoutePOISearch(this, RoutePOISearchQuery(startPoint, endPoint, mode, type, 250))
            .apply { setPoiSearchListener(this@MapRouteActivity) }.searchRoutePOIAsyn()
    }//RoutePOISearchType.TypeGasStation气站、TypeATM银行机、TypeMaintenanceStation维修站、TypeToilet厕所

    override fun onRoutePoiSearched(result: RoutePOISearchResult?, errorCode: Int) {
        when (errorCode) {
            AMapException.CODE_AMAP_SUCCESS -> result?.run {
                when {
                    routePois.isNotEmpty() -> {
                        innerRoutePoiOverlay?.removeFromMap
                        innerRoutePoiOverlay = InnerRoutePoiOverlay(aMap, routePois)
                        innerRoutePoiOverlay?.addToMap
                    }
                    else -> showLong(R.string.no_result)
                }
            } ?: showLong(R.string.no_result)
            else -> showError(errorCode)
        }
    }

    private inner class
    InnerRoutePoiOverlay(private val aMap: AMap?, private val poiList: MutableList<RoutePOIItem>?) {
        private val poiMarkers: MutableList<Marker> = mutableListOf()
        val addToMap = poiList?.run {
            for ((index, value) in withIndex()) {
                aMap?.addMarker(getMarkerOptions(index))?.apply { setObject(value) }
                    ?.let { poiMarkers.add(it) }
            }
        }

        private fun getMarkerOptions(index: Int): MarkerOptions? = poiList?.let {
            MarkerOptions().title(it[index].title)
                .snippet(it[index].run { "${distance}米  ${duration}秒" })
                .position(it[index].point.run { LatLng(latitude, longitude) })
        }

        val removeFromMap = {
            for (mark in poiMarkers) {
                mark.remove()
            }
        }
        val zoomToSpan = poiList?.run {
            if (size > 0) aMap?.moveCamera(CameraUpdateFactory.newLatLngBounds(latLngBounds, 100))
        }
        private val latLngBounds: LatLngBounds
            get() = LatLngBounds.builder().apply {
                poiList?.let {
                    for (poiItem in it) {
                        include(poiItem.point.run { LatLng(latitude, longitude) })
                    }
                }
            }.build()

        fun getPoiItem(index: Int): RoutePOIItem? =
            poiList?.run { if (index in 0 until size) poiList[index] else null }

        fun getPoiIndex(marker: Marker?): Int {
            for ((index, value) in poiMarkers.withIndex()) {
                if (value == marker) return index
            }
            return -1
        }
    }
}