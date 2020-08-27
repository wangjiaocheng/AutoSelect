package com.autoselect.maper

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.amap.api.services.route.DriveStep
import com.autoselect.maper.MapCommon.getDriveActionID
import kotlinx.android.synthetic.main.item_bus_segment.view.*

class MapRouteDriveSegmentListAdapter(
    private val context: Context, driveStepList: MutableList<DriveStep>
) : BaseAdapter() {
    private val driveSteps: MutableList<DriveStep> = mutableListOf<DriveStep>().apply {
        add(DriveStep())
        for (driveStep in driveStepList) {
            add(driveStep)
        }
        add(DriveStep())
    }

    override fun getCount(): Int = driveSteps.size
    override fun getItem(position: Int): Any = driveSteps[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? =
        (convertView ?: View.inflate(context, R.layout.item_bus_segment, null).apply {
            tag = ViewHolder().apply {
                driveDirIcon = bus_dir_icon
                driveLineName = bus_line_name
                driveDirUp = bus_dir_icon_up
                driveDirDown = bus_dir_icon_down
                splitLine = bus_seg_split_line
            }
        }).apply {
            driveSteps[position].let { driveStep ->
                (tag as ViewHolder).apply {
                    when (position) {
                        0 -> {
                            driveDirIcon?.setImageResource(R.mipmap.dir_start)
                            driveLineName?.text = "出发"
                            driveDirUp?.visibility = View.GONE
                            driveDirDown?.visibility = View.VISIBLE
                            splitLine?.visibility = View.GONE
                        }
                        driveSteps.size - 1 -> {
                            driveDirIcon?.setImageResource(R.mipmap.dir_end)
                            driveLineName?.text = "到达终点"
                            driveDirUp?.visibility = View.VISIBLE
                            driveDirDown?.visibility = View.GONE
                            splitLine?.visibility = View.VISIBLE
                        }
                        else -> {
                            driveDirIcon?.setImageResource(getDriveActionID(driveStep.action))
                            driveLineName?.text = driveStep.instruction
                            driveDirUp?.visibility = View.VISIBLE
                            driveDirDown?.visibility = View.VISIBLE
                            splitLine?.visibility = View.VISIBLE
                        }
                    }
                }
            }
        }

    private inner class ViewHolder {
        var driveDirIcon: ImageView? = null
        var driveLineName: TextView? = null
        var driveDirUp: ImageView? = null
        var driveDirDown: ImageView? = null
        var splitLine: ImageView? = null
    }
}