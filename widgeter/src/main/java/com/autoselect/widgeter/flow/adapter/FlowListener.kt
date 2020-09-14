package com.autoselect.widgeter.flow.adapter

interface FlowListener {
    fun notifyDataChanged()
    fun resetAllTextColor(viewId: Int, color: Int)
    fun pagerClickChangeColor(viewId: Int, unSelectedColor: Int, selectedColor: Int)
}