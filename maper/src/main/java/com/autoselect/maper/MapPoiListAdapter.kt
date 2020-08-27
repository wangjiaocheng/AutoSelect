package com.autoselect.maper

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.GridView
import android.widget.TextView
import com.amap.api.services.core.PoiItem
import kotlinx.android.synthetic.main.listview_item.view.*

class MapPoiListAdapter(private val context: Context, private val poiList: MutableList<PoiItem>) :
    BaseAdapter() {
    override fun getCount(): Int = poiList.size
    override fun getItem(position: Int): Any = poiList[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? =
        (convertView ?: View.inflate(context, R.layout.listview_item, null).apply {
            tag = ViewHolder().apply {
                poiTitle = poi_title
                poiSubs = listview_item_gridview
            }
        })?.apply {
            poiList[position].run {
                (tag as ViewHolder).apply {
                    poiTitle?.text = title
                    if (subPois.size > 0)
                        poiSubs?.adapter = MapPoiSubAdapter(context, subPois)
                }
            }
        }

    private inner class ViewHolder {
        var poiTitle: TextView? = null
        var poiSubs: GridView? = null
    }
}