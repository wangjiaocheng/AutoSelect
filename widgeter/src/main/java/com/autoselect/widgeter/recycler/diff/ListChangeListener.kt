package com.autoselect.widgeter.recycler.diff

interface ListChangeListener<T> {
    fun onCurrentListChanged(previousList: List<T>, currentList: List<T>)
}