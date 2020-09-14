package com.autoselect.widgeter.flow.adapter

open class FlowListenerAdapter {
    open fun notifyDataChanged() {}
    open fun resetAllStatus() {}
    open fun resetAllTextColor(viewId: Int, color: Int) {}
}