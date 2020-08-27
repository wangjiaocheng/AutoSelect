package com.autoselect.maper

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.amap.api.services.route.WalkPath
import com.autoselect.maper.MapCommon.getFriendlyLength
import com.autoselect.maper.MapCommon.getFriendlyTime
import kotlinx.android.synthetic.main.activity_route_detail.*

class MapRouteWalkDetailActivity : AppCompatActivity() {
    private var walkPath: WalkPath? = intent.getParcelableExtra("walk_path")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route_detail)
        title_center.text = "步行路线详情"
        firstline.text =
            "${getFriendlyTime(walkPath?.duration?.toInt()?:0)}(${getFriendlyLength(walkPath?.distance?.toInt()?:0)})"
        bus_segment_list.adapter =
            walkPath?.steps?.let { MapRouteWalkSegmentListAdapter(applicationContext, it) }
    }

    fun onBackClick(view: View?) = finish()
}