package com.autoselect.helper

import android.content.Context
import android.net.wifi.WifiConfiguration
import android.net.wifi.WifiConfiguration.KeyMgmt
import android.net.wifi.WifiManager
import android.os.Build
import java.lang.reflect.InvocationTargetException

object WifiApHelper {
    private val wifiManager = AHelper.app.getSystemService(Context.WIFI_SERVICE) as WifiManager
    private val isVersion = try {
        Build.VERSION.SDK_INT
    } catch (e: NumberFormatException) {
        0
    } >= Build.VERSION_CODES.HONEYCOMB
    private val wifiApStateDisabling = if (isVersion) 10 else 0
    private val wifiApStateDisabled = if (isVersion) 11 else 1
    private val wifiApStateEnabling = if (isVersion) 12 else 2
    private val wifiApStateEnabled = if (isVersion) 13 else 3
    private val wifiApStateFailed = if (isVersion) 14 else 4
    val wifiApState: Int = try {
        wifiManager.javaClass.getMethod("getWifiApState").invoke(wifiManager) as Int
    } catch (e: Exception) {
        wifiApStateFailed
    }
    val isWifiApEnable: Boolean = wifiApState == wifiApStateEnabled
    fun startWifiAp(wifiApSsid: String?, wifiApPassword: String?) = try {
        wifiManager.javaClass.getMethod(
            "setWifiApEnabled", WifiConfiguration::class.java, Boolean::class.javaPrimitiveType
        ).invoke(wifiManager, getWifiApConfig(wifiApSsid, wifiApPassword), true)
    } catch (e: IllegalArgumentException) {
        e.printStackTrace()
    } catch (e: IllegalAccessException) {
        e.printStackTrace()
    } catch (e: SecurityException) {
        e.printStackTrace()
    } catch (e: InvocationTargetException) {
        e.printStackTrace()
    } catch (e: NoSuchMethodException) {
        e.printStackTrace()
    }

    fun stopWifiAp(wifiAPSsid: String?, wifiAPPassword: String?) = try {
        wifiManager.javaClass.getMethod(
            "setWifiApEnabled", WifiConfiguration::class.java, Boolean::class.javaPrimitiveType
        ).invoke(wifiManager, getWifiApConfig(wifiAPSsid, wifiAPPassword), false)
    } catch (e: IllegalArgumentException) {
        e.printStackTrace()
    } catch (e: IllegalAccessException) {
        e.printStackTrace()
    } catch (e: SecurityException) {
        e.printStackTrace()
    } catch (e: InvocationTargetException) {
        e.printStackTrace()
    } catch (e: NoSuchMethodException) {
        e.printStackTrace()
    }

    val securityType: Int = try {
        KeyMgmt::class.java.getField("WPA2_PSK")[null] as Int
    } catch (e: IllegalArgumentException) {
        e.printStackTrace()
        0
    } catch (e: IllegalAccessException) {
        e.printStackTrace()
        0
    } catch (e: NoSuchFieldException) {
        e.printStackTrace()
        0
    }

    private fun getWifiApConfig(wifiApSsid: String?, wifiApPassword: String?): WifiConfiguration =
        WifiConfiguration().apply {
            SSID = wifiApSsid//名称
            preSharedKey = wifiApPassword//密码
            allowedAuthAlgorithms.set(WifiConfiguration.AuthAlgorithm.OPEN)
            allowedProtocols.set(WifiConfiguration.Protocol.RSN)
            allowedProtocols.set(WifiConfiguration.Protocol.WPA)
            allowedKeyManagement.set(securityType)
            allowedPairwiseCiphers.set(WifiConfiguration.PairwiseCipher.CCMP)
            allowedPairwiseCiphers.set(WifiConfiguration.PairwiseCipher.TKIP)
            allowedGroupCiphers.set(WifiConfiguration.GroupCipher.CCMP)
            allowedGroupCiphers.set(WifiConfiguration.GroupCipher.TKIP)
        }
}