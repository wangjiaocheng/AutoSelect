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
| 001  | *001.PayHelper(596)*         | 支付 |
| 002  | *002.PayActivity(27)*        | 活动 |
| 003  | *003.PayWxEntryActivity(41)* | 微信 |

### *001.支付PayHelper(596)*

| 序号 | 方法                         | 功能 |
|:-----|:-----------------------------|:----|
| 01   | 01. HttpType                 | 功能 |
| 02   | 02. NetworkClientType        | 功能 |
| 03   | 03. PayWay                   | 功能 |
| 04   | 04. PayParams                | 功能 |
| 05   | 05. NetworkClientInter       | 功能 |
| 06   | 06. OnPayInfoRequestListener | 功能 |
| 07   | 07. OnPayResultListener      | 功能 |
| 08   | 08. execute                  | 功能 |
| 09   | 09. shutdown                 | 功能 |
| 10   | 10. HttpUrlConnectionClient  | 功能 |
| 11   | 11. VolleyClient             | 功能 |
| 12   | 12. OkHttpClientImpl         | 功能 |
| 13   | 13. PrePayInfoService        | 功能 |
| 14   | 14. RetrofitClient           | 功能 |
| 15   | 15. newClient                | 功能 |
| 16   | 16. PayStrategyInter         | 功能 |
| 17   | 17. PayContext               | 功能 |
| 18   | 18. AutoPay                  | 功能 |
| 19   | 19. PayStrategyBase          | 功能 |
| 20   | 20. PrePayInfo               | 功能 |
| 21   | 21. WeChatPayStrategy        | 功能 |
| 22   | 22. ALiPayResult             | 功能 |
| 23   | 23. ALiPayStrategy           | 功能 |
| 24   | 24. UPPayStrategy            | 功能 |

### *002.活动PayActivity(27)*

| 序号 | 方法 | 功能 |
|:-----|:----|:-----|
| 01   | 01. | 功能 |

### *003.微信PayWxEntryActivity(41)*

| 序号 | 方法 | 功能 |
|:-----|:----|:-----|
| 01   | 01. | 功能 |

