package com.autoselect.maper

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.amap.api.services.route.RidePath
import com.autoselect.maper.MapCommon.getFriendlyLength
import com.autoselect.maper.MapCommon.getFriendlyTime
import kotlinx.android.synthetic.main.activity_route_detail.*

class MapRouteRideDetailActivity : AppCompatActivity() {
    private var ridePath: RidePath? = intent.getParcelableExtra("ride_path")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route_detail)
        title_center.text = "骑行路线详情"
        firstline.text =
            "${getFriendlyTime(ridePath?.duration?.toInt()?:0)}(${getFriendlyLength(ridePath?.distance?.toInt()?:0)})"
        bus_segment_list.adapter =
            ridePath?.steps?.let { MapRouteRideSegmentListAdapter(applicationContext, it) }
    }

    fun onBackClick(view: View?) = finish()
}