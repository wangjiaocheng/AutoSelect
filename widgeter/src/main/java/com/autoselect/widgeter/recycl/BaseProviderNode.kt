package com.autoselect.widgeter.recycl

import com.autoselect.widgeter.recycl.entity.NodeBase

abstract class BaseProviderNode : BaseProviderItem<NodeBase>() {
    override fun getAdapter(): BaseAdapterNode? = super.getAdapter() as? BaseAdapterNode
}