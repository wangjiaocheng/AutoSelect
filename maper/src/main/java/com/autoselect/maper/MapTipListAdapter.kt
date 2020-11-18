package com.autoselect.maper

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView
import com.amap.api.services.help.Tip
import com.autoselect.helper.StringHelper.isSpace
import kotlinx.android.synthetic.main.tip_item.view.*

class MapTipListAdapter(private val context: Context?, private val tipList: MutableList<Tip>) :
    BaseAdapter() {
    override fun getCount(): Int = tipList.size
    override fun getItem(position: Int): Any? = tipList[position]
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? =
        (convertView ?: View.inflate(context, R.layout.tip_item, null).apply {
            tag = ViewHolder().apply {
                tipName = name
                tipAddress = adress
            }
        })?.apply {
            tipList[position].run {
                (tag as ViewHolder).apply {
                    tipName?.text = name
                    tipAddress?.apply {
                        when {
                            isSpace(address) -> visibility = View.GONE
                            else -> {
                                visibility = View.VISIBLE
                                text = address
                            }
                        }
                    }
                }
            }
        }

    private inner class ViewHolder {
        var tipName: TextView? = null
        var tipAddress: TextView? = null
    }
}