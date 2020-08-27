package com.autoselect.widgeter.card

interface DelegateScroll {
    var viewScrollX: Int
    var viewScrollY: Int
    fun scrollViewTo(x: Int, y: Int)
}