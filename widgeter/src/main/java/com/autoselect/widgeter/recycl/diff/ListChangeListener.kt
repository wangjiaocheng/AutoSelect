package com.autoselect.widgeter.recycl.diff

interface ListChangeListener<T> {
    fun onCurrentListChanged(previousList: List<T>, currentList: List<T>)
}