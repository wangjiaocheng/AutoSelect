package com.autoselect.widgeter.recycler.module

import android.view.View
import android.view.ViewGroup
import com.autoselect.widgeter.R
import com.autoselect.widgeter.recycler.common.getItemView
import com.autoselect.widgeter.recycler.common.ViewHolderBase

class LoadMoreViewSimple : LoadMoreViewBase() {
    override fun getRootView(parent: ViewGroup): View =
        parent.getItemView(R.layout.recycler_quick_view_load_more)

    override fun getLoadingView(holder: ViewHolderBase): View =
        holder.getView(R.id.load_more_loading_view)

    override fun getLoadComplete(holder: ViewHolderBase): View =
        holder.getView(R.id.load_more_load_complete_view)

    override fun getLoadFailView(holder: ViewHolderBase): View =
        holder.getView(R.id.load_more_load_fail_view)

    override fun getLoadEndView(holder: ViewHolderBase): View =
        holder.getView(R.id.load_more_load_end_view)
}