package com.autoselect.widgeter.recycl.listener

import android.view.View
import com.autoselect.widgeter.recycl.BaseAdapterQuick

interface OnItemClickListener {
    fun onItemClick(adapter: BaseAdapterQuick<*, *>, view: View, position: Int)
}