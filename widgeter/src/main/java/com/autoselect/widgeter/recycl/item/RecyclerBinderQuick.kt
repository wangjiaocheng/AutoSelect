package com.autoselect.widgeter.recycl.item

import com.autoselect.widgeter.R
import com.autoselect.widgeter.recycl.binder.ItemBinderQuick

abstract class RecyclerBinderQuick : ItemBinderQuick<RecyclerBean>() {
    override fun getLayoutId(): Int = R.layout.binder_recycler
}