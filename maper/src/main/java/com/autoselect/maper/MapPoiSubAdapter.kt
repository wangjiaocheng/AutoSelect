package com.autoselect.maper

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.amap.api.services.poisearch.SubPoiItem
import kotlinx.android.synthetic.main.gridview_item.view.*

class MapPoiSubAdapter(private val context: Context, private val poiList: MutableList<SubPoiItem>) :
    BaseAdapter() {
    override fun getCount(): Int = poiList.size
    override fun getItem(position: Int): Any = poiList[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? =
        (convertView ?: View.inflate(context, R.layout.gridview_item, null)
            .apply { tag = ViewHolder().apply { poiTitle = gridview_item } })
            ?.apply { (tag as ViewHolder).poiTitle?.text = poiList[position].subName }

    private inner class ViewHolder {
        var poiTitle: TextView? = null
    }
}