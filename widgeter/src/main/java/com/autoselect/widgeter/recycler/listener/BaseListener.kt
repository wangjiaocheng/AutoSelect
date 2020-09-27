package com.autoselect.widgeter.recycler.listener

interface BaseListener {
    fun setGridSpanSizeLookup(spanSizeLookup: GridSpanSizeLookup?)
    fun setOnItemClickListener(listener: OnItemClickListener?)
    fun setOnItemLongClickListener(listener: OnItemLongClickListener?)
    fun setOnItemChildClickListener(listener: OnItemChildClickListener?)
    fun setOnItemChildLongClickListener(listener: OnItemChildLongClickListener?)
}//BaseQuickAdapter需要设置，用java定义兼容java写法