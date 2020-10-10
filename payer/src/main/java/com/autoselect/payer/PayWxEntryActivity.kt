package com.autoselect.payer

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import com.autoselect.helper.LoggerHelper
import com.autoselect.helper.debug
import com.autoselect.payer.PayHelper.AutoPay.Companion.newInstance
import com.tencent.mm.opensdk.modelbase.BaseReq
import com.tencent.mm.opensdk.modelbase.BaseResp
import com.tencent.mm.opensdk.openapi.IWXAPI
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
import com.tencent.mm.opensdk.openapi.WXAPIFactory

class PayWxEntryActivity : AppCompatActivity(), IWXAPIEventHandler, LoggerHelper {
    private var iwxapi: IWXAPI? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        iwxapi = WXAPIFactory.createWXAPI(this, newInstance(null)?.weChatAppID)
        iwxapi?.handleIntent(intent, this)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        setIntent(intent)
        iwxapi?.handleIntent(intent, this)
    }

    override fun onReq(baseReq: BaseReq?) = debug("$loggerTag->请求发出的回调")
    override fun onResp(baseResp: BaseResp?) = baseResp?.errCode?.let { sendPayResultBroadcast(it) }
        ?: Unit

    private fun sendPayResultBroadcast(resultCode: Int) {
        LocalBroadcastManager.getInstance(applicationContext).sendBroadcast(Intent().apply {
            action = PayHelper.WeChatPayStrategy.WECHAT_PAY_RESULT_ACTION
            putExtra(PayHelper.WeChatPayStrategy.WECHAT_PAY_RESULT_EXTRA, resultCode)
        })
        finish()
    }//本地广播比全局广播高效安全
}