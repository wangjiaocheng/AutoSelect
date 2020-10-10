package com.autoselect.maper

import android.os.Bundle
import com.autoselect.helper.ToastHelper.showShort

class MapNaviWalkActivity : MapNaviActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_navi_basic)
        aMapNaviView = findViewById(R.id.navi_view)
        aMapNaviView?.onCreate(savedInstanceState)
        aMapNaviView?.setAMapNaviViewListener(this)
    }

    val calculateWalkRoute =
        aMapNavi?.calculateWalkRoute(startPoints[0], endPoints[0]) ?: showShort("路线计算失败,检查参数情况")

    override fun onInitNaviSuccess() {
        calculateWalkRoute
    }

    override fun onGpsSignalWeak(boolean: Boolean) {}
}