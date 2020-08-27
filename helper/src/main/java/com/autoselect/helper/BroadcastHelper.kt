package com.autoselect.helper

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.net.ConnectivityManager
import com.autoselect.helper.NetworkHelper.netWorkType

object BroadcastHelper {
    class BroadcastReceiverNetWork : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            netWorkType
        }
    }//网络状态改变广播

    fun registerReceiverNetWork(context: Context): BroadcastReceiverNetWork =
        BroadcastReceiverNetWork().apply {
            IntentFilter().apply { addAction(ConnectivityManager.CONNECTIVITY_ACTION) }
                .let { context.registerReceiver(this, it) }
        }//注册网络状态改变广播
}