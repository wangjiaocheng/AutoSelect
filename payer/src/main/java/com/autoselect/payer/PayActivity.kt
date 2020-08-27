package com.autoselect.payer

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.autoselect.payer.PayHelper.AutoPay.Companion.newInstance

class PayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        newInstance(
            PayHelper.PayParams(
                this, "your_wechat_appid", PayHelper.PayWay.WeChatPay,
                0f, "产品名称", "产品详情",
                PayHelper.HttpType.Get, PayHelper.NetworkClientType.HttpUrlConnection,
                "http://www.autoselect.com/"//APP服务器host主机地址
            )
        )?.requestPayInfo(object : PayHelper.OnPayInfoRequestListener {
            override fun onPayInfoRequestStart() {}//TODO 做一些loading操作，progressBar.show()
            override fun onPayInfoRequestSuccess() {}//TODO 将loading状态去掉，请求预支付信息成功，跳转到客户端支付
            override fun onPayInfoRequestFailure() {}//TODO 将loading状态去掉，获取预支付信息失败，同时得到一个支付失败回调
        })?.toPay(object : PayHelper.OnPayResultListener {
            override fun onPaySuccess(payWay: PayHelper.PayWay?) {}
            override fun onPayCancel(payWay: PayHelper.PayWay?) {}
            override fun onPayFailure(payWay: PayHelper.PayWay?, errCode: Int) {}
        })
    }
}