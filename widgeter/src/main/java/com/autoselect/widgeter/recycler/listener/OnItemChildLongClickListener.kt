package com.autoselect.widgeter.recycler.listener

import android.view.View
import com.autoselect.widgeter.recycler.BaseAdapterQuick

interface OnItemChildLongClickListener {
    fun onItemChildLongClick(adapter: BaseAdapterQuick<*, *>, view: View, position: Int): Boolean
}