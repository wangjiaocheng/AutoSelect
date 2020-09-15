package com.autoselect.widgeter.flow.adapter

abstract class AdapterTab<T>(layoutId: Int, data: MutableList<T?>?) :
    AdapterTemplate<T?>(layoutId, data) {
    fun resetAllColor(viewId: Int, color: Int) =
        flowListenerAdapter?.resetAllTextColor(viewId, color)//恢复某个id颜色
}