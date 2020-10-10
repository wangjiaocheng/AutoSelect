package com.autoselect.widgeter.recycl.listener

import android.view.View
import com.autoselect.widgeter.recycl.BaseAdapterQuick

interface OnItemLongClickListener {
    fun onItemLongClick(adapter: BaseAdapterQuick<*, *>, view: View, position: Int): Boolean
}