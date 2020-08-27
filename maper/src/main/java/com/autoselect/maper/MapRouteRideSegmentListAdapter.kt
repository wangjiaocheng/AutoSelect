package com.autoselect.maper

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.amap.api.services.route.RideStep
import com.autoselect.maper.MapCommon.getWalkActionID
import kotlinx.android.synthetic.main.item_bus_segment.view.*

class MapRouteRideSegmentListAdapter(
    private val context: Context, rideStepList: MutableList<RideStep>
) : BaseAdapter() {
    private val rideSteps: MutableList<RideStep> = mutableListOf<RideStep>().apply {
        add(RideStep())
        for (rideStep in rideStepList) {
            add(rideStep)
        }
        add(RideStep())
    }

    override fun getCount(): Int = rideSteps.size
    override fun getItem(position: Int): Any = rideSteps[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? =
        (convertView ?: View.inflate(context, R.layout.item_bus_segment, null).apply {
            tag = ViewHolder().apply {
                dirIcon = bus_dir_icon
                lineName = bus_line_name
                dirUp = bus_dir_icon_up
                dirDown = bus_dir_icon_down
                splitLine = bus_seg_split_line
            }
        }).apply {
            rideSteps[position].let { rideStep ->
                (tag as ViewHolder).apply {
                    when (position) {
                        0 -> {
                            dirIcon?.setImageResource(R.mipmap.dir_start)
                            lineName?.text = "出发"
                            dirUp?.visibility = View.INVISIBLE
                            dirDown?.visibility = View.VISIBLE
                            splitLine?.visibility = View.INVISIBLE
                        }
                        rideSteps.size - 1 -> {
                            dirIcon?.setImageResource(R.mipmap.dir_end)
                            lineName?.text = "到达终点"
                            dirUp?.visibility = View.VISIBLE
                            dirDown?.visibility = View.INVISIBLE
                        }
                        else -> {
                            dirIcon?.setImageResource(getWalkActionID(rideStep.action))
                            lineName?.text = rideStep.instruction
                            dirUp?.visibility = View.VISIBLE
                            dirDown?.visibility = View.VISIBLE
                            splitLine?.visibility = View.VISIBLE
                        }
                    }
                }
            }
        }

    private inner class ViewHolder {
        var dirIcon: ImageView? = null
        var lineName: TextView? = null
        var dirUp: ImageView? = null
        var dirDown: ImageView? = null
        var splitLine: ImageView? = null
    }
}