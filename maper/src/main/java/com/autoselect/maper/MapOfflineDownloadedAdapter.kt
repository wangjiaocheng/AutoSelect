package com.autoselect.maper

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.amap.api.maps.offlinemap.OfflineMapCity
import com.amap.api.maps.offlinemap.OfflineMapManager
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug

class MapOfflineDownloadedAdapter(
    private val context: Context, private val offlineMapManager: OfflineMapManager?
) : AnkoLogger, BaseAdapter() {
    private val cities: MutableList<OfflineMapCity> = mutableListOf()
    private val initCityList = {
        var start = System.currentTimeMillis()
        cities.apply {
            for (mapCity in this) {
                remove(mapCity)
            }
        }
        debug("$loggerTag->Offline Downloading notifyData cities iterator cost: ${System.currentTimeMillis() - start}")
        start = System.currentTimeMillis()
        cities.apply {
            offlineMapManager?.run {
                addAll(downloadOfflineMapCityList)
                addAll(downloadingCityList)
            }
        }
        debug("$loggerTag->Offline Downloading notifyData getDownloadingCityList cost: ${System.currentTimeMillis() - start}")
        start = System.currentTimeMillis()
        notifyDataSetChanged()
        debug("$loggerTag->Offline Downloading notifyData notifyDataSetChanged cost: ${System.currentTimeMillis() - start}")
    }

    init {
        initCityList
    }

    val notifyDataChange = {
        val start = System.currentTimeMillis()
        initCityList
        debug("$loggerTag->Offline Downloading notifyDataChange cost: ${System.currentTimeMillis() - start}")
    }

    override fun getItem(index: Int): Any = cities[index]
    override fun getItemViewType(position: Int): Int = 0
    override fun getItemId(position: Int): Long = position.toLong()
    override fun getCount(): Int = cities.size
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? =
        (convertView ?: MapOfflineChild(context, offlineMapManager).let { offLineChild ->
            offLineChild.offLineChildView
                ?.apply { tag = ViewHolder().apply { mapOfflineChild = offLineChild } }
        })?.apply {
            (tag as ViewHolder).mapOfflineChild?.apply { setOffLineCity(getItem(position) as OfflineMapCity) }
        }

    inner class ViewHolder {
        var mapOfflineChild: MapOfflineChild? = null
    }
}