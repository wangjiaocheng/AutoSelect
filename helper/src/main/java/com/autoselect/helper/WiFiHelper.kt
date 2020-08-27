package com.autoselect.helper

import android.Manifest.permission.ACCESS_WIFI_STATE
import android.Manifest.permission.CHANGE_WIFI_STATE
import android.net.wifi.ScanResult
import android.net.wifi.WifiConfiguration
import android.net.wifi.WifiInfo
import android.net.wifi.WifiManager
import androidx.annotation.RequiresPermission
import com.autoselect.helper.AHelper.app
import org.jetbrains.anko.wifiManager

object WiFiHelper {
    private val wifiManager: WifiManager = app.wifiManager
    val isWifiEnabled: Boolean
        get() = wifiManager.isWifiEnabled

    @RequiresPermission(CHANGE_WIFI_STATE)
    fun openWifi(): Boolean = if (isWifiEnabled) false else wifiManager.setWifiEnabled(true)

    @RequiresPermission(CHANGE_WIFI_STATE)
    fun closeWifi(): Boolean = if (isWifiEnabled) wifiManager.setWifiEnabled(false) else true

    @RequiresPermission(CHANGE_WIFI_STATE)
    fun netWorkLinkAdd(config: WifiConfiguration): Boolean =
        wifiManager.run { enableNetwork(addNetwork(config), true) }

    @RequiresPermission(CHANGE_WIFI_STATE)
    fun netWorkLinkRemove(NetId: Int): Boolean = wifiManager.removeNetwork(NetId)

    @RequiresPermission(CHANGE_WIFI_STATE)
    fun netWorkLinkDisable(NetId: Int): Boolean = wifiManager.run {
        disableNetwork(NetId)
        disconnect()
    }

    private val wifiInfo: WifiInfo = wifiManager.connectionInfo//@RequiresPermission无效
    val mac: String
        get() = wifiInfo.macAddress
    val ip: Int
        get() = wifiInfo.ipAddress
    val ssid: String
        get() = wifiInfo.ssid
    val bssid: String
        get() = wifiInfo.bssid
    val currentNetId: Int
        get() = wifiInfo.networkId
    val wifiInfoStr: String = wifiInfo.toString()
    private val wifiLock: WifiManager.WifiLock = wifiManager.createWifiLock("flag")
    fun wifiLock() = wifiLock.acquire()//held
    fun wifiUnLock() = wifiLock.run { if (!isHeld) release() }
    var wifiList: MutableList<ScanResult>? = null
        private set//网络连接列表
    var wifiConfigList: MutableList<WifiConfiguration>? = null
        private set//网络配置列表

    @RequiresPermission(allOf = [ACCESS_WIFI_STATE, CHANGE_WIFI_STATE])
    fun startScan() = wifiManager.apply { startScan() }.run {
        wifiList = scanResults
        wifiConfigList = configuredNetworks
    }

    fun lookupScanInfo(): String = wifiList?.let {
        StringBuilder().apply {
            for ((index, value) in it.withIndex()) {
                append("编号：${(index + 1)} $value\n")
            }
            append("--------------------连接|配置--------------------")
            wifiConfigList?.let { configs ->
                for (value in configs) {
                    append("$value\n")
                }
            }
        }.toString()
    } ?: ""

    fun getSSID(NetId: Int): String = wifiList!![NetId].SSID
    fun getBSSID(NetId: Int): String = wifiList!![NetId].BSSID//物理地址
    fun getFrequency(NetId: Int): Int = wifiList!![NetId].frequency//频率
    fun getLevel(NetId: Int): Int = wifiList!![NetId].level//强度
    fun getCapabilities(NetId: Int): String = wifiList!![NetId].capabilities//功能
    fun hiddenSSID(NetId: Int): WifiConfiguration =
        wifiConfigList!![NetId].apply { hiddenSSID = true }

    fun displaySSID(NetId: Int): WifiConfiguration =
        wifiConfigList!![NetId].apply { hiddenSSID = false }
}