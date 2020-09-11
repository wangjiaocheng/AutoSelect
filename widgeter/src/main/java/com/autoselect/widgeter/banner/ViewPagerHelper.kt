package com.autoselect.widgeter.banner

import android.content.Context
import android.widget.Scroller
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSmoothScroller
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

object ViewPagerHelper {
    const val LOOP_COUNT = 5000
    const val LOOP_TAIL_MODE = 0x1001
    const val LOOP_MODE = 0x1002
    const val GLIDE_MODE = 0x1002
    const val VIEWPAGER_DATA_URL = 0x2002
    const val VIEWPAGER_DATA_RES = 0x2003
    const val VIEWPAGER_DATA_VIEW = 0x2004
    fun initSwitchTime(context: Context?, viewPager: ViewPager?, time: Int) {
        try {
            ViewPager::class.java.getDeclaredField("mScroller")
                .apply { isAccessible = true }
                .let { it[viewPager] = ViewPagerScroller(context, time) }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    internal class ViewPagerScroller(context: Context?, var time: Int) : Scroller(context) {
        override fun startScroll(startX: Int, startY: Int, dx: Int, dy: Int, duration: Int) =
            super.startScroll(startX, startY, dx, dy, time)
    }

    fun initSwitchTime(context: Context?, viewPager2: ViewPager2, time: Int) = try {
        val recyclerView = viewPager2.getChildAt(0) as RecyclerView
        recyclerView.overScrollMode = RecyclerView.OVER_SCROLL_NEVER
        val proxyLayoutManger = ProxyLayoutManger(context, viewPager2.orientation, time)
        recyclerView.layoutManager = proxyLayoutManger
        ViewPager2::class.java.getDeclaredField("mLayoutManager")
            .apply { isAccessible = true }.let { it[viewPager2] = proxyLayoutManger }
        ViewPager2::class.java.getDeclaredField("mPageTransformerAdapter")
            .apply { isAccessible = true }.let {
                it[viewPager2]?.let { adapter ->
                    adapter.javaClass.getDeclaredField("mLayoutManager")
                        .apply { isAccessible = true }
                        .let { manager -> manager[adapter] = proxyLayoutManger }
                }
            }
        ViewPager2::class.java.getDeclaredField("mScrollEventAdapter")
            .apply { isAccessible = true }.let {
                it[viewPager2]?.let { adapter ->
                    adapter.javaClass.getDeclaredField("mLayoutManager")
                        .apply { isAccessible = true }
                        .let { manager -> manager[adapter] = proxyLayoutManger }
                }
            }
    } catch (e: NoSuchFieldException) {
        e.printStackTrace()
    } catch (e: IllegalAccessException) {
        e.printStackTrace()
    }

    private class ProxyLayoutManger(context: Context?, orientation: Int, var time: Int) :
        LinearLayoutManager(context, orientation, false) {
        override fun smoothScrollToPosition(
            recyclerView: RecyclerView, state: RecyclerView.State, position: Int
        ) = object : LinearSmoothScroller(recyclerView.context) {
            override fun calculateTimeForDeceleration(dx: Int): Int = (time * (1 - .3356)).toInt()
        }.apply { targetPosition = position }.let { startSmoothScroll(it) }
    }
}