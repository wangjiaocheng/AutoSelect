package com.autoselect.widgeter.recycl.item

import com.autoselect.widgeter.R
import com.autoselect.widgeter.recycl.binder.ItemBinderQuick

abstract class PlainBinderQuick : ItemBinderQuick<PlainBean>() {
    override fun getLayoutId(): Int = R.layout.binder_plain
}