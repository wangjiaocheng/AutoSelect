package com.autoselect.maper

import android.content.Context
import android.content.Intent
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.amap.api.services.route.BusPath
import com.amap.api.services.route.BusRouteResult
import com.autoselect.maper.MapCommon.getBusPathDes
import com.autoselect.maper.MapCommon.getBusPathTitle
import kotlinx.android.synthetic.main.item_bus_result.view.*

class MapRouteBusResultListAdapter(
    private val context: Context?, private val busRouteResult: BusRouteResult?
) : BaseAdapter() {
    private val busPathList: MutableList<BusPath> = busRouteResult?.paths ?: mutableListOf()
    override fun getCount(): Int = busPathList.size
    override fun getItem(position: Int): Any = busPathList[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, viewGroup: ViewGroup): View? =
        (convertView ?: View.inflate(context, R.layout.item_bus_result, null).apply {
            tag = ViewHolder().apply {
                title = bus_path_title
                des = bus_path_des
            }
        }).apply {
            busPathList[position].let { busPath ->
                (tag as ViewHolder).apply {
                    title?.text = getBusPathTitle(busPath)
                    des?.text = getBusPathDes(busPath)
                }
                setOnClickListener {
                    Intent(
                        context?.applicationContext, MapRouteBusDetailActivity::class.java
                    ).apply {
                        flags = Intent.FLAG_ACTIVITY_NEW_TASK
                        putExtra("bus_result", busRouteResult)
                        putExtra("bus_path", busPath)
                    }.let { context?.startActivity(it) }
                }
            }
        }

    private inner class ViewHolder {
        var title: TextView? = null
        var des: TextView? = null
    }
}