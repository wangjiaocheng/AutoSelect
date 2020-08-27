package com.autoselect.maper

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.amap.api.maps.AMap
import com.amap.api.services.route.BusPath
import com.amap.api.services.route.BusRouteResult
import com.autoselect.maper.MapCommon.getFriendlyLength
import com.autoselect.maper.MapCommon.getFriendlyTime
import kotlinx.android.synthetic.main.activity_route_detail.*

class MapRouteBusDetailActivity : AppCompatActivity(), AMap.OnMapLoadedListener {
    private var aMap: AMap? = null
    private var buspath: BusPath? = intent.getParcelableExtra("bus_path")
    private var busRouteResult: BusRouteResult? = intent.getParcelableExtra("bus_result")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route_detail)
        route_map.onCreate(savedInstanceState)
        if (aMap == null) aMap = route_map.map
        aMap?.setOnMapLoadedListener(this)
        title_center.text = "公交路线详情"
        firstline.text =
            "${getFriendlyTime(buspath?.duration?.toInt()?:0)}(${getFriendlyLength(buspath?.distance?.toInt()?:0)})"
        secondline.apply {
            text = "打车约${busRouteResult?.taxiCost}元"
            visibility = View.VISIBLE
        }
        title_map.visibility = View.VISIBLE
        bus_segment_list.adapter =
            buspath?.steps?.let { MapRouteBusSegmentListAdapter(applicationContext, it) }
    }

    private var routeBusOverlay: MapRouteBusOverlay? = null
    override fun onMapLoaded() {
        routeBusOverlay?.run {
            addToMap
            zoomToSpan
        }
    }

    fun onBackClick(view: View?) = finish()
    fun onMapClick(view: View?) {
        title_map.visibility = View.GONE
        bus_path.visibility = View.GONE
        route_map.visibility = View.VISIBLE
        aMap?.clear()
        routeBusOverlay = aMap?.let {
            buspath?.let { it1 ->
                busRouteResult?.startPos?.let { it2 ->
                    busRouteResult?.targetPos?.let { it3 ->
                        MapRouteBusOverlay(this, it,
                            it1, it2, it3
                        )
                    }
                }
            }
        }
        routeBusOverlay?.removeFromMap
    }
}