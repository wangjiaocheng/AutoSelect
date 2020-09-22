package com.autoselect.widgeter.recycler

import android.view.ViewGroup
import com.autoselect.widgeter.recycler.common.ViewHolderBase

abstract class BaseAdapterMultiDelegate<T, VH : ViewHolderBase>(data: MutableList<T>? = null) :
    BaseAdapterQuick<T, VH>(0, data) {
    var multiTypeDelegate: BaseTypeMultiDelegate<T>? = null
    override fun getDefItemViewType(position: Int): Int =
        checkNotNull(multiTypeDelegate?.getItemType(data, position))
        { "Please use setMultiTypeDelegate first!" }

    override fun onCreateDefViewHolder(parent: ViewGroup, viewType: Int): VH =
        createBaseViewHolder(parent, checkNotNull(multiTypeDelegate?.getLayoutId(viewType))
        { "Please use setMultiTypeDelegate first!" })
}//多类型布局通过代理类方式，返回布局id和item类型，适用于:1、实体类不方便扩展，此Adapter数据类型可任意类型，只需BaseTypeDelegateMulti.getItemType返回对应类型；2、item类型较少，类型较多，为隔离各类型业务逻辑用BaseAdapterBinder。