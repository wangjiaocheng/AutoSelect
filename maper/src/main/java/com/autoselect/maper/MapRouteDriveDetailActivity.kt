package com.autoselect.maper

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.amap.api.services.route.DrivePath
import com.amap.api.services.route.DriveRouteResult
import com.autoselect.helper.LoggerHelper
import com.autoselect.helper.info
import com.autoselect.maper.MapCommon.getFriendlyLength
import com.autoselect.maper.MapCommon.getFriendlyTime
import kotlinx.android.synthetic.main.activity_route_detail.*

class MapRouteDriveDetailActivity : AppCompatActivity(), LoggerHelper {
    private var drivePath: DrivePath? = intent.getParcelableExtra("drive_path")
    private var driveRouteResult: DriveRouteResult? = intent.getParcelableExtra("drive_result")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_route_detail)
        drivePath?.run {
            for (driveStep in steps) {
                for (tmc in driveStep.tmCs) {
                    info(tmc.run { "$loggerTag->${polyline.size}${status}${distance}${polyline}" })
                }
            }
        }
        title_center.text = "驾车路线详情"
        firstline.text =
            "${getFriendlyTime(drivePath?.duration?.toInt() ?: 0)}(${getFriendlyLength(drivePath?.distance?.toInt() ?: 0)})"
        secondline.apply {
            text = "打车约${driveRouteResult?.taxiCost}元"
            visibility = View.VISIBLE
        }
        bus_segment_list.adapter =
            drivePath?.steps?.let { MapRouteDriveSegmentListAdapter(applicationContext, it) }
    }

    fun onBackClick(view: View?) = finish()
}