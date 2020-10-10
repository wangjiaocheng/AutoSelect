package com.autoselect.widgeter.recycl.diff

interface Differ<T> {
    fun addListListener(listChangeListener: ListChangeListener<T>)
}