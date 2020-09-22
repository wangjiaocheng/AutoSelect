package com.autoselect.widgeter.recycler.module

import android.view.View
import android.view.ViewGroup
import com.autoselect.widgeter.recycler.common.ViewHolderBase

enum class LoadMoreStatus { Loading, Complete, Fail, End }
abstract class LoadMoreViewBase {
    abstract fun getRootView(parent: ViewGroup): View
    abstract fun getLoadingView(holder: ViewHolderBase): View
    abstract fun getLoadComplete(holder: ViewHolderBase): View
    abstract fun getLoadFailView(holder: ViewHolderBase): View
    abstract fun getLoadEndView(holder: ViewHolderBase): View
    open fun convert(holder: ViewHolderBase, position: Int, loadMoreStatus: LoadMoreStatus) {
        when (loadMoreStatus) {
            LoadMoreStatus.Loading -> {
                getLoadingView(holder).isVisible(true)
                getLoadComplete(holder).isVisible(false)
                getLoadFailView(holder).isVisible(false)
                getLoadEndView(holder).isVisible(false)
            }
            LoadMoreStatus.Complete -> {
                getLoadingView(holder).isVisible(false)
                getLoadComplete(holder).isVisible(true)
                getLoadFailView(holder).isVisible(false)
                getLoadEndView(holder).isVisible(false)
            }
            LoadMoreStatus.Fail -> {
                getLoadingView(holder).isVisible(false)
                getLoadComplete(holder).isVisible(false)
                getLoadFailView(holder).isVisible(true)
                getLoadEndView(holder).isVisible(false)
            }
            LoadMoreStatus.End -> {
                getLoadingView(holder).isVisible(false)
                getLoadComplete(holder).isVisible(false)
                getLoadFailView(holder).isVisible(false)
                getLoadEndView(holder).isVisible(true)
            }
        }
    }//重写自定义逻辑

    private fun View.isVisible(visible: Boolean) =
        apply { visibility = if (visible) View.VISIBLE else View.GONE }
}//继承自定义loadMore视图