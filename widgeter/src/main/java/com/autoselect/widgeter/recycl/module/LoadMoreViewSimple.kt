package com.autoselect.widgeter.recycl.module

import android.view.View
import android.view.ViewGroup
import com.autoselect.widgeter.R
import com.autoselect.widgeter.recycl.common.getItemView
import com.autoselect.widgeter.recycl.common.ViewHolderBase

class LoadMoreViewSimple : LoadMoreViewBase() {
    override fun getRootView(parent: ViewGroup): View =
        parent.getItemView(R.layout.recycler_load_more)

    override fun getLoadingView(holder: ViewHolderBase): View =
        holder.getView(R.id.load_more_loading)

    override fun getLoadFailView(holder: ViewHolderBase): View = holder.getView(R.id.load_more_fail)
    override fun getLoadComplete(holder: ViewHolderBase): View =
        holder.getView(R.id.load_more_complete)

    override fun getLoadEndView(holder: ViewHolderBase): View = holder.getView(R.id.load_more_end)
}