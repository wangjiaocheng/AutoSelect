package com.autoselect.widgeter.recycler.binder

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.viewbinding.ViewBinding
import com.autoselect.widgeter.recycler.common.ViewHolderBase

abstract class ItemBinderView<T, VB : ViewBinding> :
    ItemBinderBase<T, ItemBinderView.BinderVBHolder<VB>>() {
    class BinderVBHolder<VB : ViewBinding>(viewBinding: VB) : ViewHolderBase(viewBinding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BinderVBHolder<VB> =
        BinderVBHolder(onCreateViewBinding(LayoutInflater.from(parent.context), parent, viewType))

    abstract fun onCreateViewBinding(
        layoutInflater: LayoutInflater, parent: ViewGroup, viewType: Int
    ): VB
}//使用ViewBinding快速构建Binder，仅适用BaseAdapterBinder