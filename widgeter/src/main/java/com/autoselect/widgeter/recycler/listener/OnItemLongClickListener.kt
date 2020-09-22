package com.autoselect.widgeter.recycler.listener

import android.view.View
import com.autoselect.widgeter.recycler.BaseAdapterQuick

interface OnItemLongClickListener {
    fun onItemLongClick(adapter: BaseAdapterQuick<*, *>, view: View, position: Int): Boolean
}