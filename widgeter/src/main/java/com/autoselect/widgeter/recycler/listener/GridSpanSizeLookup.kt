package com.autoselect.widgeter.recycler.listener

import androidx.recyclerview.widget.GridLayoutManager

interface GridSpanSizeLookup {
    fun getSpanSize(gridLayoutManager: GridLayoutManager, viewType: Int, position: Int): Int
}