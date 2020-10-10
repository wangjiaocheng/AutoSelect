package com.autoselect.maper

import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Parcelable
import android.text.TextUtils
import android.util.SparseArray
import android.view.View
import android.widget.CompoundButton
import com.amap.api.maps.AMap
import com.amap.api.maps.CameraUpdateFactory
import com.amap.api.maps.model.*
import com.amap.api.navi.AMapNavi
import com.amap.api.navi.model.AMapCarInfo
import com.amap.api.navi.model.AMapNaviPath
import com.amap.api.navi.model.NaviLatLng
import com.amap.api.navi.view.PoiInputItemWidget
import com.amap.api.navi.view.RouteOverLay
import com.autoselect.helper.LoggerHelper
import com.autoselect.helper.ToastHelper.showShort
import kotlinx.android.synthetic.main.activity_route_calculate.*

class MapRouteCalculateActivity : LoggerHelper, MapNaviActivity(),
    View.OnClickListener, CompoundButton.OnCheckedChangeListener {
    private var aMap: AMap? = null
    private var startMarker: Marker? = null
    private var endMarker: Marker? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route_calculate)
        congestion.setOnCheckedChangeListener(this)
        avoidhightspeed.setOnCheckedChangeListener(this)
        cost.setOnCheckedChangeListener(this)
        hightspeed.setOnCheckedChangeListener(this)
        startpoint.setOnClickListener(this)
        endpoint.setOnClickListener(this)
        calculate.setOnClickListener(this)
        selectroute.setOnClickListener(this)
        gpsnavi.setOnClickListener(this)
        emulatornavi.setOnClickListener(this)
        navi_view.onCreate(savedInstanceState)
        aMap = navi_view.map
        startMarker = BitmapDescriptorFactory.fromBitmap(
            BitmapFactory.decodeResource(resources, R.mipmap.start)
        ).let { aMap?.addMarker(MarkerOptions().icon(it)) }
        endMarker = BitmapDescriptorFactory.fromBitmap(
            BitmapFactory.decodeResource(resources, R.mipmap.end)
        ).let { aMap?.addMarker(MarkerOptions().icon(it)) }
        aMapNavi = AMapNavi.getInstance(applicationContext)
            .apply { addAMapNaviListener(this@MapRouteCalculateActivity) }
    }

    override fun onResume() {
        super.onResume()
        navi_view.onResume()
    }

    override fun onPause() {
        super.onPause()
        navi_view.onPause()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        navi_view.onSaveInstanceState(outState)
    }

    private val routeOverlays: SparseArray<RouteOverLay?> = SparseArray<RouteOverLay?>()
    override fun onDestroy() {
        super.onDestroy()
        startPoints.clear()
        endPoints.clear()
        routeOverlays.clear()
        navi_view.onDestroy()
        aMapNavi?.apply {
            removeAMapNaviListener(this@MapRouteCalculateActivity)
            destroy()
        }
    }

    private val clearRoute = routeOverlays.apply {
        for (i in 0 until size()) {
            valueAt(i)?.removeFromMap()
        }
    }.clear()

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        data?.getParcelableExtra<Parcelable?>("poi")?.let {
            clearRoute
            val poi: Poi? = data.getParcelableExtra("poi")
            poi?.coordinate?.run {
                when (requestCode) {
                    100 -> {
                        showShort("100")
                        startMarker?.position = LatLng(latitude, longitude)
                        startPoints.apply { clear() }
                            .add(NaviLatLng(latitude, longitude).apply { startLatLng = this })
                    }//起点选择完成
                    200 -> {
                        showShort("200")
                        endMarker?.position = LatLng(latitude, longitude)
                        endPoints.apply { clear() }
                            .add(NaviLatLng(latitude, longitude).apply { endLatLng = this })
                    }//终点选择完成
                    else -> {
                    }
                }
            }
        }
    }

    override fun onGpsSignalWeak(boolean: Boolean) {}
    private var isCongestion: Boolean = false//交通拥堵
    private var isAvoidHeightSpeed: Boolean = false//避免高速
    private var isCost: Boolean = false//付费
    private var isHeightSpeed: Boolean = false//高速
    override fun onCheckedChanged(buttonView: CompoundButton?, isChecked: Boolean) =
        when (buttonView?.id) {
            R.id.congestion -> isCongestion = isChecked
            R.id.avoidhightspeed -> isAvoidHeightSpeed = isChecked
            R.id.cost -> isCost = isChecked
            R.id.hightspeed -> isHeightSpeed = isChecked
            else -> {
            }
        }

    private var isSuccessCalculate: Boolean = false
    private var isSuccessChooseRoute: Boolean = false
    private var routeIndex: Int = 0
    private var zindex: Int = 1
    val changeRoute: Any? = when {
        !isSuccessCalculate -> showShort("请先算路")
        routeOverlays.size() == 1 -> {
            isSuccessChooseRoute = true
            aMapNavi?.run {
                selectRouteId(routeOverlays.keyAt(0))
                showShort(naviPath.run { "导航距离:${allLength}m\n导航时间:${allTime}s" })
            }
        }
        else -> {
            routeOverlays.apply {
                if (routeIndex >= size()) routeIndex = 0
                for (i in 0 until size()) {
                    valueAt(i)?.setTransparency(0.4f)
                }
                keyAt(routeIndex).let { routeID ->
                    get(routeID)?.apply {
                        setTransparency(1f)
                        setZindex(zindex++)
                    }
                    aMapNavi?.selectRouteId(routeID)
                }
            }
            showShort("路线标签:${aMapNavi?.naviPath?.labels}")
            routeIndex++
            isSuccessChooseRoute = true
            aMapNavi?.naviPath?.restrictionInfo?.restrictionTitle
                .let { if (!TextUtils.isEmpty(it)) showShort(it ?: "") else Unit }
        }
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.startpoint -> Intent(this, MapRouteSearchActivity::class.java).apply {
                putExtras(Bundle().apply { putInt("pointType", PoiInputItemWidget.TYPE_START) })
            }.let { startActivityForResult(it, 100) }
            R.id.endpoint -> Intent(this, MapRouteSearchActivity::class.java).apply {
                putExtras(Bundle().apply { putInt("pointType", PoiInputItemWidget.TYPE_DEST) })
            }.let { startActivityForResult(it, 200) }
            R.id.calculate -> {
                clearRoute
                if (isAvoidHeightSpeed && isHeightSpeed) showShort("不走高速与高速优先不能同时为true.")
                if (isCost && isHeightSpeed) showShort("高速优先与避免收费不能同时为true.")
                val strategy = try {
                    aMapNavi?.strategyConvert(
                        isCongestion, isAvoidHeightSpeed, isCost, isHeightSpeed, true
                    ) ?: 0
                } catch (e: Exception) {
                    e.printStackTrace()
                    0
                }
                if (strategy >= 0) aMapNavi?.apply {
                    setCarInfo(AMapCarInfo().apply {
                        carNumber = car_number.text.toString()
                        isRestriction = true
                    })
                    showShort("策略:$strategy")
                }?.calculateDriveRoute(startPoints, endPoints, endPoints, strategy)
            }
            R.id.selectroute -> changeRoute
            R.id.gpsnavi -> Intent(applicationContext, MapNaviActivity::class.java)
                .apply { putExtra("gps", true) }.let { startActivity(it) }
            R.id.emulatornavi -> Intent(applicationContext, MapNaviActivity::class.java)
                .apply { putExtra("gps", false) }.let { startActivity(it) }
        }
    }

    override fun onCalculateRouteFailure(errorInfo: Int) {
        isSuccessCalculate = false
        super.onCalculateRouteFailure(errorInfo)
    }

    override fun onCalculateRouteSuccess(ints: IntArray?) {
        routeOverlays.clear()
        ints?.run {
            for (id in this) {
                aMapNavi?.naviPaths?.get(id)?.let { drawRoutes(id, it) }
            }
        }
    }

    private fun drawRoutes(routeId: Int, path: AMapNaviPath?) {
        isSuccessCalculate = true
        aMap?.moveCamera(CameraUpdateFactory.changeTilt(0f))
        RouteOverLay(aMap, path, this).apply {
            isTrafficLine = false
            routeOverlays.put(routeId, this)
        }.addToMap()
    }
}