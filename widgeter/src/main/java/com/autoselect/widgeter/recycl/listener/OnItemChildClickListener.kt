package com.autoselect.widgeter.recycl.listener

import android.view.View
import com.autoselect.widgeter.recycl.BaseAdapterQuick

interface OnItemChildClickListener {
    fun onItemChildClick(adapter: BaseAdapterQuick<*, *>, view: View, position: Int)
}