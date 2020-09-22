package com.autoselect.widgeter.recycler.diff

interface Differ<T> {
    fun addListListener(listChangeListener: ListChangeListener<T>)
}