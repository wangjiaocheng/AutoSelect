package com.autoselect.widgeter.recycler

import com.autoselect.widgeter.recycler.entity.NodeBase

abstract class BaseProviderNode : BaseProviderItem<NodeBase>() {
    override fun getAdapter(): BaseAdapterNode? = super.getAdapter() as? BaseAdapterNode
}