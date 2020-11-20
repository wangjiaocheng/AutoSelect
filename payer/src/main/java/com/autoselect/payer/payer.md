# ***库文档***

| 序号 | 分层                                   | 功能                                             |
|:-----|:---------------------------------------|:------------------------------------------------|
| 01   | 01. 服务器数据层                        | 数据库                                          |
| 02   | 02. 服务器实体层entity                  | 数据库实体类data类型                             |
| 03   | 03. 服务器持久层repository              | 数据库修改类interface类型                        |
| 04   | 04. 服务器业务层service                 | 业务逻辑实现class类型                            |
| 05   | 05. 服务器控制层controller              | 业务开关控制class类型                            |
| 06   | 06. 服务器表现层：客户端实体层Model      | 对应数据实体data类型                             |
| 07   | 07. 服务器表现层：客户端控制层Controller | 对应业务逻辑object类型(工具库helper、支付库payer) |
| 08   | 08. 服务器表现层：客户端视图层View       | 布局控件逻辑activity类型                         |
| 09   | 09. 服务器表现层：客户端布局层View       | 布局控件位置xml类型(控件库widgeter、地图库maper)  |

## **支付库payer**

| 序号 | 类库                         | 功能 |
|:-----|:-----------------------------|:----|
| 001  | *001.PayHelper(591)*         | 支付 |
| 002  | *002.PayWxEntryActivity(41)* | 微信 |

### *001.支付PayHelper(591)*

| 序号 | 方法                                 | 功能                                                     |
|:-----|:-------------------------------------|:--------------------------------------------------------|
| 01   | 01. HttpType                         | 网络方法类型：Get、Post                                  |
| 02   | 02. NetworkClientType                | 网络连接类型：HttpUrlConnection、Volley、OkHttp、Retrofit |
| 03   | 03. PayWay                           | 支付渠道类型：WeChatPay、ALiPay、UPPay                    |
| 04   | 04. PayParams                        | 支付参数                                                 |
| 05   | 05. NetworkClientInter               | 网络连接接口                                             |
| 06   | 06. OnPayInfoRequestListener         | 支付信息请求监听                                         |
| 07   | 07. OnPayResultListener              | 支付结果监听                                             |
| 08   | 08. execute                          | 线程池执行                                               |
| 09   | 09. shutdown                         | 线程池关闭                                               |
| 10   | 10. HttpUrlConnectionClient          | 网络连接实现支付get和post                                 |
| 11   | 11. VolleyClient                     | 网络连接实现支付get和post                                 |
| 12   | 12. OkHttpClientImpl                 | 网络连接实现支付get和post                                 |
| 13   | 13. PrePayInfoService                | 预支付信息服务                                           |
| 14   | 14. RetrofitClient                   | 网络连接实现支付get和post                                 |
| 15   | 15. newClient                        | 创建网络连接                                             |
| 16   | 16. PayStrategyInter                 | 支付策略接口                                             |
| 17   | 17. PayContext                       | 支付上下文                                               |
| 18   | 18. PayStrategyBase                  | 支付策略基类                                             |
| 19   | 19. PrePayInfo                       | 预支付信息                                               |
| 20   | 20. WeChatPayStrategy                | 微信支付策略                                             |
| 21   | 21. ALiPayResult                     | 阿里支付结果                                             |
| 22   | 22. ALiPayStrategy                   | 阿里支付策略                                             |
| 23   | 23. UPPayStrategy                    | 银联支付策略                                             |
| 24   | #### AutoPay                         | 自动支付                                                 |
| 25   | 01. weChatAppID                      | 微信支付ID                                               |
| 26   | 02. requestPayInfo                   | 请求支付信息                                             |
| 27   | 03. toPay                            | 执行支付                                                 |
| 28   | 04. COMMON_OK_PAY                    | 支付正常                                                 |
| 29   | 05. COMMON_ERR_PAY                   | 支付错误                                                 |
| 30   | 06. COMMON_ERR_USER_CANCELED         | 用户取消错误                                             |
| 31   | 07. COMMON_ERR_NETWORK_NOT_AVAILABLE | 网络不可用错误                                           |
| 32   | 08. COMMON_ERR_REQUEST_TIME_OUT      | 请求超时错误                                             |
| 33   | 09. WECHAT_ERR_SENT_FAILED           | 微信发送失败错误                                         |
| 34   | 10. WECHAT_ERR_AUTH_DENIED           | 微信作者否认错误                                         |
| 35   | 11. WECHAT_ERR_UNSUPPORT             | 微信不支持错误                                           |
| 36   | 12. WECHAT_ERR_BAN                   | 微信禁止错误                                             |
| 37   | 13. WECHAT_ERR_NOT_INSTALLED         | 微信未安装错误                                           |
| 38   | 14. ALI_PAY_ERR_WAIT_CONFIRM         | 支付宝等待确认错误                                        |
| 39   | 15. ALI_PAY_ERR_NET                  | 支付宝网络错误                                           |
| 40   | 16. ALI_PAY_ERR_UNKNOWN              | 支付宝未知错误                                           |
| 41   | 17. ALI_PAY_ERR_OTHER                | 支付宝其他错误                                           |
| 42   | 18. UPPAY_PLUGIN_NOT_INSTALLED       | 插件未安装                                               |
| 43   | 19. UPPAY_PLUGIN_NEED_UPGRADE        | 插件需更新                                               |
| 44   | 20. newInstance                      | 创建支付实例                                             |

```kotlin
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
```

### *002.微信PayWxEntryActivity(41)*

