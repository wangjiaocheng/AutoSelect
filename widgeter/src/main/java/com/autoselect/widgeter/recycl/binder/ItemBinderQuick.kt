package com.autoselect.widgeter.recycl.binder

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import com.autoselect.widgeter.recycl.common.getItemView
import com.autoselect.widgeter.recycl.common.ViewHolderBase

abstract class ItemBinderQuick<T> : ItemBinderBase<T, ViewHolderBase>() {
    @LayoutRes
    abstract fun getLayoutId(): Int
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderBase =
        ViewHolderBase(parent.getItemView(getLayoutId()))
}//使用布局ID快速构建Binder