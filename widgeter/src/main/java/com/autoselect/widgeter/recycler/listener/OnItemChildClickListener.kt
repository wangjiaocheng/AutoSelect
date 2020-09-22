package com.autoselect.widgeter.recycler.listener

import android.view.View
import com.autoselect.widgeter.recycler.BaseAdapterQuick

interface OnItemChildClickListener {
    fun onItemChildClick(adapter: BaseAdapterQuick<*, *>, view: View, position: Int)
}