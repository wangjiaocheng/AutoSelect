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

## **工具库helper**

| 序号 | 类库                                                               | 类别 |
|:-----|:------------------------------------------------------------------|:-----|
| 001  | *001.设备、存储、网络、无线、热点、蓝牙、定位、亮度、闪光、振动、蜂鸣* | 硬件 |
| 002  | *002.系统、版本、机型、重启、命令、破解、应用、崩溃、退出、清理、快捷* | 系统 |
| 003  | *003.路由、活动、分享、片段、服务、管理、轮询、广播、意图、元数、权限* | 组件 |
| 004  | *004.屏幕、窗口、多栏、视图、网视、着色、吐司、零食、连点、防抖、抖动* | 视图 |
| 005  | *005.全局、接口、总线、内存、磁盘、双重、线程、进程、反射、单例、空判* | 管理 |
| 006  | *006.输入、剪贴、字串、富文、文本、随机、验证、身份、银行、图码、软包* | 字符 |
| 007  | *007.编码、加密、位算、压缩、平面、计算、尺寸、坐标、转换、迁移、数库* | 运算 |
| 008  | *008.文件、存取、压制、密压、打开、图像、照片、图片、动画、信息、属性* | 文件 |
| 009  | *009.记录、日志、数据、解析、处理、标记、路径、资源、共享、主题、消息* | 资源 |
| 010  | *010.日期、农历、关闭、工具、通讯、地图、网服、网连、标识、安全、超文* | 连接 |

| 序号 | 类库                                                    | 功能 |
|:-----|:-------------------------------------------------------|:-----|
| 001  | *001.DeviceHelper(446)*                                | 设备 |
| 002  | *002.SdHelper(188)*                                    | 存储 |
| 003  | *003.NetHelper(580)*                                   | 网络 |
| 004  | *004.WifiHelper(254)*                                  | 无线 |
| 005  | *005.ApHelper(185)*                                    | 热点 |
| 006  | *006.BluetoothHelper(201)*                             | 蓝牙 |
| 007  | *007.LocationHelper(283)*                              | 定位 |
| 008  | *008.BrightnessHelper(48)*                             | 亮度 |
| 009  | *009.FlashlightHelper(58)*                             | 闪光 |
| 010  | *010.VibrateHelper(20)*                                | 振动 |
| 011  | *011.BeepHelper(39)*                                   | 蜂鸣 |
| 012  | *012.SystemHelper：SystemLanguage(230)*                | 系统 |
| 013  | *013.VersionHelper(66)*                                | 版本 |
| 014  | *014.RomHelper(215)*                                   | 机型 |
| 015  | *015.RebootHelper(35)*                                 | 重启 |
| 016  | *016.ShellHelper(86)*                                  | 命令 |
| 017  | *017.RootHelper(43)*                                   | 破解 |
| 018  | *018.ApplicationHelper(603)*                           | 应用 |
| 019  | *019.CrashHelper(143)*                                 | 崩溃 |
| 020  | *020.ExitHelper(59)*                                   | 退出 |
| 021  | *021.CleanHelper(50)*                                  | 清理 |
| 022  | *022.ShortcutHelper(40)*                               | 快捷 |
| 023  | *023.RouteHelper(142)*                                 | 路由 |
| 024  | *024.ActivityHelper(669)*                              | 活动 |
| 025  | *025.ShareHelper(238)*                                 | 分享 |
| 026  | *026.FragmentHelper(485)*                              | 片段 |
| 027  | *027.ServiceHelper(66)*                                | 服务 |
| 028  | *028.ManagerHelper(167)*                               | 管理 |
| 029  | *029.PollingHelper(38)*                                | 轮询 |
| 030  | *030.BroadcastHelper(22)*                              | 广播 |
| 031  | *031.IntentHelper(316)*                                | 意图 |
| 032  | *032.MetaDataHelper(53)*                               | 元数 |
| 033  | *033.PermissionHelper(443)*                            | 权限 |
| 034  | *034.ScreenHelper(260)*                                | 屏幕 |
| 035  | *035.WindowHelper(60)*                                 | 窗口 |
| 036  | *036.BarHelper(531)*                                   | 多栏 |
| 037  | *037.ViewHelper：ViewTouch、ViewClick、ViewShadow(945)* | 视图 |
| 038  | *038.WebViewHelper(76)*                                | 网视 |
| 039  | *039.ColorHelper(76)*                                  | 着色 |
| 040  | *040.ToastHelper(360)*                                 | 吐司 |
| 041  | *041.SnackHelper(107)*                                 | 零食 |
| 042  | *042.ClickHelper(40)*                                  | 连点 |
| 043  | *043.AntiShakeHelper(20)*                              | 防抖 |
| 044  | *044.ShakeHelper(26)*                                  | 抖动 |
| 045  | *045.AHelper(287)*                                     | 全局 |
| 046  | *046.ApiHelper(44)*                                    | 接口 |
| 047  | *047.BusHelper(239)*                                   | 总线 |
| 048  | *048.CacheMemoryHelper(78)*                            | 内存 |
| 049  | *049.CacheDiskHelper(523)*                             | 磁盘 |
| 050  | *050.CacheDoubleHelper(247)*                           | 双重 |
| 051  | *051.ThreadHelper(328)*                                | 线程 |
| 052  | *052.ProcessHelper(150)*                               | 进程 |
| 053  | *053.ReflectionHelper(64)*                             | 反射 |
| 054  | *054.SingletonHelper.Singleton(16)*                    | 单例 |
| 055  | *055.EmptyHelper(72)*                                  | 空判 |
| 056  | *056.InputMethodHelper(248)*                           | 输入 |
| 057  | *057.ClipboardHelper(20)*                              | 剪贴 |
| 058  | *058.StringHelper(120)*                                | 字串 |
| 059  | *059.SpanHelper(795)*                                  | 富文 |
| 060  | *060.TextHelper(444)*                                  | 文本 |
| 061  | *061.RandomHelper(78)*                                 | 随机 |
| 062  | *062.ValidationHelper(280)*                            | 验证 |
| 063  | *063.IdHelper(396)*                                    | 身份 |
| 064  | *064.BankHelper(1720)*                                 | 银行 |
| 065  | *065.BarQRHelper(149)*                                 | 图码 |
| 066  | *066.PackageHelper(18)*                                | 软包 |
| 067  | *067.EncodeHelper(115)*                                | 编码 |
| 068  | *068.EncryptHelper(510)*                               | 加密 |
| 069  | *069.BitHelper(35)*                                    | 位算 |
| 070  | *070.CompressHelper(92)*                               | 压缩 |
| 071  | *071.PlaneHelper(15)*                                  | 平面 |
| 072  | *072.CalculateHelper(222)*                             | 计算 |
| 073  | *073.DensityHelper(58)*                                | 尺寸 |
| 074  | *074.CoordinateHelper(94)*                             | 坐标 |
| 075  | *075.ConvertHelper(520)*                               | 转换 |
| 076  | *076.MigrationHelper(97)*                              | 迁移 |
| 077  | *077.DbHelper(35)*                                     | 数库 |
| 078  | *078.FileHelper(914)*                                  | 文件 |
| 079  | *079.FileIoHelper(366)*                                | 存取 |
| 080  | *080.ZipHelper(336)*                                   | 压制 |
| 081  | *081.ZipPlusHelper(320)*                               | 密压 |
| 082  | *082.OpenHelper(102)*                                  | 打开 |
| 083  | *083.ImageHelper(1298)*                                | 图像 |
| 084  | *084.PhotoHelper(125)*                                 | 照片 |
| 085  | *085.PictureHelper(43)*                                | 图片 |
| 086  | *086.AnimationHelper(209)*                             | 动画 |
| 087  | *087.ExifHelper(41)*                                   | 信息 |
| 088  | *088.PropertiesHelper(40)*                             | 属性 |
| 089  | *089.LoggerHelper(84)*                                 | 记录 |
| 090  | *090.LogHelper(681)*                                   | 日志 |
| 091  | *091.DataHelper(146)*                                  | 数据 |
| 092  | *092.JsonHelper(273)*                                  | 解析 |
| 093  | *093.GsonHelper(50)*                                   | 处理 |
| 094  | *094.XmlParseHelper(138)*                              | 标记 |
| 095  | *095.PathHelper(178)*                                  | 路径 |
| 096  | *096.ResourceHelper(247)*                              | 资源 |
| 097  | *097.PreferenceHelper(109)*                            | 共享 |
| 098  | *098.ThemeHelper(157)*                                 | 主题 |
| 099  | *099.UiMessageHelper(166)*                             | 消息 |
| 100  | *100.DateHelper(514)*                                  | 日期 |
| 101  | *101.LunarHelper(177)*                                 | 农历 |
| 102  | *102.CloseHelper(25)*                                  | 关闭 |
| 103  | *103.ToolHelper(137)*                                  | 工具 |
| 104  | *104.ContactsHelper(221)*                              | 通讯 |
| 105  | *105.MapHelper(69)*                                    | 地图 |
| 106  | *106.WebServiceHelper(63)*                             | 网服 |
| 107  | *107.HttpUrlConnectionHelper(107)*                     | 网连 |
| 108  | *108.UriHelper(91)*                                    | 标识 |
| 109  | *109.SslHelper(57)*                                    | 安全 |
| 110  | *110.HtmlHelper(59)*                                   | 超文 |

### *001.设备DeviceHelper(446)*

| 序号 | 方法                    | 功能                                                               |
|:-----|:------------------------|:------------------------------------------------------------------|
| 01   | 01. isAdbEnabled        | Adb是否启用                                                        |
| 02   | 02. numberCpuSerial     | CPU序列号                                                         |
| 03   | 03. statePhone          | 手机状态：android.permission.READ_PRIVILEGED_PHONE_STATE           |
| 04   | 04. imsi                | 唯一用户ID：android.permission.READ_PRIVILEGED_PHONE_STATE         |
| 05   | 05. carrierDevice       | imsi方式获取运营商                                                 |
| 06   | 06. androidId           | 安卓ID                                                            |
| 07   | 07. deviceId            | 唯一设备ID：android.permission.READ_PRIVILEGED_PHONE_STATE         |
| 08   | 08. imei                | IMEI：android.permission.READ_PRIVILEGED_PHONE_STATE              |
| 09   | 09. getImei             | 根据slotId获取IMEI：android.permission.READ_PRIVILEGED_PHONE_STATE |
| 10   | 10. meid                | MEID：android.permission.READ_PRIVILEGED_PHONE_STATE              |
| 11   | 11. getMeid             | 根据slotId获取MEID：android.permission.READ_PRIVILEGED_PHONE_STATE |
| 12   | 12. deviceSoftVersion   | 设备软件版本号                                                     |
| 13   | 13. stateSim            | sim卡状态                                                         |
| 14   | 14. isSimReady          | sim卡是否准备好                                                    |
| 15   | 15. simCountryIso       | sim卡国家代码                                                      |
| 16   | 16. simCountry          | sim国家                                                           |
| 17   | 17. getCountryCode      | 获取国家代码                                                       |
| 18   | 18. simOperator         | 移动国家码网络码                                                   |
| 19   | 19. simCarrier          | 网络码方式获取运营商                                               |
| 20   | 20. simOperatorName     | 运营商名称                                                         |
| 21   | 21. simType             | sim卡类型                                                         |
| 22   | 22. isPhone             | 是否手机                                                           |
| 23   | 23. isTablet            | 是否平板                                                           |
| 24   | 24. numberSimSerial     | sim卡序列号：android.permission.READ_PRIVILEGED_PHONE_STATE        |
| 25   | 25. networkCountryIso   | 网络国家代码                                                       |
| 26   | 26. networkOperator     | 网络运营商                                                         |
| 27   | 27. networkOperatorName | 网络运营商名称                                                     |
| 28   | 28. networkType         | 网络类型                                                           |
| 29   | 29. numberPhone         | 手机号码                                                           |
| 30   | 30. numberVoiceMail     | 语音信箱号码                                                       |
| 31   | 31. stateCall           | 手机状态：0无活动；1响铃；2待机。                                   |
| 32   | 32. stateLocation       | 手机方位                                                           |

### *002.存储SdHelper(188)*

| 序号 | 方法                    | 功能         |
|:-----|:------------------------|:------------|
| 01   | 01. isSdCardEnable      | Sd是否启用  |
| 02   | 02. isSdCardDisable     | Sd是否禁用  |
| 03   | 03. isSdCardAvailable   | Sd是否可用  |
| 04   | 04. isSdCardUnavailable | Sd是否停用  |
| 05   | 05. sdCardPathEx        | Sd路径列表  |
| 06   | 06. sdCardPath          | Sd路径      |
| 07   | 07. getAllBytes         | 获取路径容量 |
| 08   | 08. getAvailableBytes   | 获取可用容量 |
| 09   | 09. getFreeBytes        | 获取剩余容量 |
| 10   | 10. getStatFs           | 获取StatFs  |
| 11   | 11. sdCardInfo          | Sd信息      |
| 12   | 12. sdCardInfoList      | Sd信息列表  |

### *003.网络NetHelper(580)*

| 序号 | 方法                          | 功能 |
|:-----|:------------------------------|:----|
| 01   | 01. openSettingsWireless      | 功能 |
| 02   | 02. settingsWireless          | 功能 |
| 03   | 03. currentNetworkState       | 功能 |
| 04   | 04. isConnectingByState       | 功能 |
| 05   | 05. isConnectedByState        | 功能 |
| 06   | 06. isSuspendedByState        | 功能 |
| 07   | 07. isDisconnectingByState    | 功能 |
| 08   | 08. isDisconnectedByState     | 功能 |
| 09   | 09. isUnknownByState          | 功能 |
| 10   | 10. currentNetworkType        | 功能 |
| 11   | 11. isWifiByType              | 功能 |
| 12   | 12. isMobileByType            | 功能 |
| 13   | 13. isMobileMmsByType         | 功能 |
| 14   | 14. isMobileSuplByType        | 功能 |
| 15   | 15. isMobileDunByType         | 功能 |
| 16   | 16. isMobileHipriByType       | 功能 |
| 17   | 17. isWimaxByType             | 功能 |
| 18   | 18. isBluetoothByType         | 功能 |
| 19   | 19. isDummyByType             | 功能 |
| 20   | 20. isEthernetByType          | 功能 |
| 21   | 21. currentNetworkSubtype     | 功能 |
| 22   | 22. isEDGEBySubtype           | 功能 |
| 23   | 23. isGPRSBySubtype           | 功能 |
| 24   | 24. isCDMABySubtype           | 功能 |
| 25   | 25. is1XRTTBySubtype          | 功能 |
| 26   | 26. isIDENBySubtype           | 功能 |
| 27   | 27. isEVDO_ABySubtype         | 功能 |
| 28   | 28. isUMTSBySubtype           | 功能 |
| 29   | 29. isEVDO_0BySubtype         | 功能 |
| 30   | 30. isHSDPABySubtype          | 功能 |
| 31   | 31. isHSUPABySubtype          | 功能 |
| 32   | 32. isHSPABySubtype           | 功能 |
| 33   | 33. isEVDO_BBySubtype         | 功能 |
| 34   | 34. isEHRPDBySubtype          | 功能 |
| 35   | 35. isHSPAPBySubtype          | 功能 |
| 36   | 36. isLTEBySubtype            | 功能 |
| 37   | 37. isUNKNOWNBySubtype        | 功能 |
| 38   | 38. isChinaMobile2G           | 功能 |
| 39   | 39. isChinaUnicom2G           | 功能 |
| 40   | 40. isChinaTelecom2G          | 功能 |
| 41   | 41. isChinaUnicom3G           | 功能 |
| 42   | 42. isChinaTelecom3G          | 功能 |
| 43   | 43. NetworkType               | 功能 |
| 44   | 44. netWorkType               | 功能 |
| 45   | 45. netWorkTypeName           | 功能 |
| 46   | 46. networkState              | 功能 |
| 47   | 47. isConnectedWifiOrMobile   | 功能 |
| 48   | 48. isConnectedNetwork        | 功能 |
| 49   | 49. isConnected               | 功能 |
| 50   | 50. isAvailable               | 功能 |
| 51   | 51. isAvailableByPing         | 功能 |
| 52   | 52. ping                      | 功能 |
| 53   | 53. wifiEnabled               | 功能 |
| 54   | 54. isWifiAvailable           | 功能 |
| 55   | 55. isWifiConnected           | 功能 |
| 56   | 56. wifiState                 | 功能 |
| 57   | 57. wifiConnectionInfo        | 功能 |
| 58   | 58. wifiScanResults           | 功能 |
| 59   | 59. getWifiScanResultsByBSSID | 功能 |
| 60   | 60. gateWayByWifi             | 功能 |
| 61   | 61. netMaskByWifi             | 功能 |
| 62   | 62. ipAddressByWifi           | 功能 |
| 63   | 63. serverAddressByWifi       | 功能 |
| 64   | 64. is4GConnected             | 功能 |
| 65   | 65. isDataEnabled             | 功能 |
| 66   | 66. setDataEnabled            | 功能 |
| 67   | 67. setMobileDataEnabled      | 功能 |
| 68   | 68. isDataOpen                | 功能 |
| 69   | 69. isDataConnected           | 功能 |
| 70   | 70. getAddressDomain          | 功能 |
| 71   | 71. addressProxy              | 功能 |
| 72   | 72. ipBroadcast               | 功能 |
| 73   | 73. ipWifi                    | 功能 |
| 74   | 74. ipGprs                    | 功能 |
| 75   | 75. getIpGprs                 | 功能 |
| 76   | 76. addressIp                 | 功能 |
| 77   | 77. macBluetooth              | 功能 |
| 78   | 78. addressMac                | 功能 |
| 79   | 79. getAddressMac             | 功能 |

### *004.无线WifiHelper(254)*

| 序号 | 方法                           | 功能 |
|:-----|:-------------------------------|:----|
| 01   | 01. connectWifi                | 功能 |
| 02   | 02. checkState                 | 功能 |
| 03   | 03. openWifi                   | 功能 |
| 04   | 04. closeWifi                  | 功能 |
| 05   | 05. wifiConfigList             | 功能 |
| 06   | 06. hiddenSSID                 | 功能 |
| 07   | 07. displaySSID                | 功能 |
| 08   | 08. configWifiList             | 功能 |
| 09   | 09. timeOut                    | 功能 |
| 10   | 10. onWifiConnectStateListener | 功能 |
| 11   | 11. wifiInfo                   | 功能 |
| 12   | 12. mac                        | 功能 |
| 13   | 13. ip                         | 功能 |
| 14   | 14. currentNetId               | 功能 |
| 15   | 15. bssId                      | 功能 |
| 16   | 16. ssId                       | 功能 |
| 17   | 17. checkSSIDState             | 功能 |
| 18   | 18. isConnectSuccess           | 功能 |
| 19   | 19. wifiList                   | 功能 |
| 20   | 20. getSSID                    | 功能 |
| 21   | 21. getBSSID                   | 功能 |
| 22   | 22. getFrequency               | 功能 |
| 23   | 23. getLevel                   | 功能 |
| 24   | 24. getCapabilities            | 功能 |
| 25   | 25. scanResultList             | 功能 |
| 26   | 26. lookUpScan                 | 功能 |
| 27   | 27. checkScanResult            | 功能 |
| 28   | 28. startScan                  | 功能 |
| 29   | 29. isExistSSID                | 功能 |
| 30   | 30. connectConfigurationWifi   | 功能 |
| 31   | 31. addNetwork                 | 功能 |
| 32   | 32. removeWifi                 | 功能 |
| 33   | 33. disconnectWifi             | 功能 |
| 34   | 34. connectConfiguration       | 功能 |
| 35   | 35. releaseWifiLock            | 功能 |
| 36   | 36. acquireWifiLock            | 功能 |
| 37   | 37. release                    | 功能 |

### *005.热点ApHelper(185)*

| 序号 | 方法                              | 功能 |
|:-----|:----------------------------------|:----|
| 01   | 01. isWifiConnectSuccess          | 功能 |
| 02   | 02. wifiApState                   | 功能 |
| 03   | 03. isWifiApEnable                | 功能 |
| 04   | 04. onWifiAPStatusChangedListener | 功能 |
| 05   | 05. wifiAPSsid                    | 功能 |
| 06   | 06. wifiAPPassword                | 功能 |
| 07   | 07. startWifiAp                   | 功能 |
| 08   | 08. closeWifiAp                   | 功能 |
| 09   | 09. startAp                       | 功能 |
| 10   | 10. closeAp                       | 功能 |
| 11   | 11. securityType                  | 功能 |
| 12   | 12. release                       | 功能 |

### *006.蓝牙BluetoothHelper(201)*

| 序号 | 方法                          | 功能 |
|:-----|:------------------------------|:----|
| 01   | 01. bluetoothAdapter          | 功能 |
| 02   | 02. getBluetoothDevice        | 功能 |
| 03   | 03. isOpenBluetooth           | 功能 |
| 04   | 04. onBluetoothDeviceListener | 功能 |
| 05   | 05. openBluetooth             | 功能 |
| 06   | 06. bluetoothDeviceFilter     | 功能 |
| 07   | 07. isCorrectDevice           | 功能 |
| 08   | 08. stopSearch                | 功能 |
| 09   | 09. startSearch               | 功能 |
| 10   | 10. searchDevices             | 功能 |
| 11   | 11. createBind                | 功能 |
| 12   | 12. createBind                | 功能 |
| 13   | 13. pairBtDevice              | 功能 |
| 14   | 14. isCorrectDevice           | 功能 |
| 15   | 15. isBluetoothBond           | 功能 |
| 16   | 16. isBtAddressValid          | 功能 |
| 17   | 17. release                   | 功能 |

### *007.定位LocationHelper(283)*

| 序号 | 方法                       | 功能           |
|:-----|:---------------------------|:--------------|
| 01   | 01. settingsGps            | GPS设置界面   |
| 02   | 02. LocationService        | 定位服务      |
| 03   | 03. HelperLocationListener | 定位监听器    |
| 04   | 04. registerLocation       | 注册定位      |
| 05   | 05. unRegisterLocation     | 注销定位      |
| 06   | 06. getAddress             | 获取地址      |
| 07   | 07. getCountryName         | 获取国家      |
| 08   | 08. getLocality            | 获取地点      |
| 09   | 09. getStreet              | 获取街道      |
| 10   | 10. isMove                 | 是否移动      |
| 11   | 11. isBetterLocation       | 是否更佳定位   |
| 12   | 12. isSameProvider         | 是否相同提供者 |
| 13   | 13. isLocationEnabled      | 是否定位可用   |
| 14   | 14. isGpsEnabled           | 是否GPS可用   |
| 15   | 15. getLocation            | 获取定位      |
| 16   | 16. locationToDegree       | 定位转度数    |

### *008.亮度BrightnessHelper(48)*

| 序号 | 方法                         | 功能 |
|:-----|:-----------------------------|:----|
| 01   | 01. isAutoBrightnessEnabled  | 功能 |
| 02   | 02. setAutoBrightnessEnabled | 功能 |
| 03   | 03. brightness               | 功能 |
| 04   | 04. setBrightness            | 功能 |
| 05   | 05. getWindowBrightness      | 功能 |
| 06   | 06. setWindowBrightness      | 功能 |

### *009.闪光FlashlightHelper(58)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. isFlashlightEnable  | 功能 |
| 02   | 02. isFlashlightOn      | 功能 |
| 03   | 03. setFlashlightStatus | 功能 |
| 04   | 04. destroy             | 功能 |

### *010.振动VibrateHelper(20)*

| 序号 | 方法                   | 功能 |
|:-----|:-----------------------|:----|
| 01   | 01. vibrateOnce        | 功能 |
| 02   | 02. vibrateComplicated | 功能 |
| 03   | 03. vibrateStop        | 功能 |

### *011.蜂鸣BeepHelper(39)*

| 序号 | 方法         | 功能 |
|:-----|:-------------|:----|
| 01   | 01. playBeep | 功能 |

>- beep.ogg

### *012.系统SystemHelper：SystemLanguage(230)*

| 序号 | 方法                                 | 功能 |
|:-----|:-------------------------------------|:----|
| 01   | 01. buildManufacturer                | 功能 |
| 02   | 02. buildModel                       | 功能 |
| 03   | 03. serial                           | 功能 |
| 04   | 04. uniqueSerial                     | 功能 |
| 05   | 05. uniqueId                         | 功能 |
| 06   | 06. buildSerial                      | 功能 |
| 07   | 07. buildBrand                       | 功能 |
| 08   | 08. buildHost                        | 功能 |
| 09   | 09. buildUser                        | 功能 |
| 10   | 10. buildTags                        | 功能 |
| 11   | 11. buildTime                        | 功能 |
| 12   | 12. buildFingerprint                 | 功能 |
| 13   | 13. buildProduct                     | 功能 |
| 14   | 14. buildDevice                      | 功能 |
| 15   | 15. buildHardware                    | 功能 |
| 16   | 16. buildBoard                       | 功能 |
| 17   | 17. buildID                          | 功能 |
| 18   | 18. buildDisplayVersion              | 功能 |
| 19   | 19. buildBootloaderVersion           | 功能 |
| 20   | 20. buildRadioVersion                | 功能 |
| 21   | 21. buildAbis                        | 功能 |
| 22   | 22. buildVersionSDK                  | 功能 |
| 23   | 23. buildVersionRelease              | 功能 |
| 24   | 24. buildVersionCodename             | 功能 |
| 25   | 25. buildVersionIncremental          | 功能 |
| 26   | 26. locales                          | 功能 |
| 27   | 27. currentLocale                    | 功能 |
| 28   | 28. currentLanguage                  | 功能 |
| 29   | 29. gsfId                            | 功能 |
| 30   | 30. googleAccounts                   | 功能 |
| 31   | #### SystemLanguage                  | 功能 |
| 32   | 01. applyLanguageSystem              | 功能 |
| 33   | 02. applyLanguageCustom              | 功能 |
| 34   | 03. isAppliedLanguageSystem          | 功能 |
| 35   | 04. applyLanguageSystemInAppOnCreate | 功能 |
| 36   | 05. isAppliedLanguageCustom          | 功能 |
| 37   | 06. applyLanguageCustomInAppOnCreate | 功能 |
| 38   | 07. applyLanguage                    | 功能 |

### *013.版本VersionHelper(66)*

| 序号 | 方法                         | 功能       |
|:-----|:-----------------------------|:----------|
| 01   | 01. aboveAstro               | 版本01以上 |
| 02   | 02. aboveBender              | 版本02以上 |
| 03   | 03. aboveCupcake             | 版本03以上 |
| 04   | 04. aboveDonut               | 版本04以上 |
| 05   | 05. aboveEclair              | 版本05以上 |
| 06   | 06. aboveEclair01            | 版本06以上 |
| 07   | 07. aboveEclairMR1           | 版本07以上 |
| 08   | 08. aboveFroyo               | 版本08以上 |
| 09   | 09. aboveGingerbread         | 版本09以上 |
| 10   | 10. aboveGingerbreadMR1      | 版本10以上 |
| 11   | 11. aboveHoneycomb           | 版本11以上 |
| 12   | 12. aboveHoneycombMR1        | 版本12以上 |
| 13   | 13. aboveHoneycombMR2        | 版本13以上 |
| 14   | 14. aboveIceCreamSandwich    | 版本14以上 |
| 15   | 15. aboveIceCreamSandwichMR1 | 版本15以上 |
| 16   | 16. aboveJellyBean           | 版本16以上 |
| 17   | 17. aboveJellyBeanMR1        | 版本17以上 |
| 18   | 18. aboveJellyBeanMR2        | 版本18以上 |
| 19   | 19. aboveKitKat              | 版本19以上 |
| 20   | 20. aboveKitKatWatch         | 版本20以上 |
| 21   | 21. aboveLollipop            | 版本21以上 |
| 22   | 22. aboveLollipopMR1         | 版本22以上 |
| 23   | 23. aboveMarshmallow         | 版本23以上 |
| 24   | 24. aboveNougat              | 版本24以上 |
| 25   | 25. aboveNougatMR1           | 版本25以上 |
| 26   | 26. aboveOreo                | 版本26以上 |
| 27   | 27. aboveOreoMR1             | 版本27以上 |
| 28   | 28. abovePie                 | 版本28以上 |
| 29   | 29. aboveQ                   | 版本29以上 |
| 30   | 30. aboveR                   | 版本30以上 |

### *014.机型RomHelper(215)*

| 序号 | 方法            | 功能 |
|:-----|:----------------|:----|
| 01   | 01. isHuawei    | 功能 |
| 02   | 02. isVivo      | 功能 |
| 03   | 03. isXiaomi    | 功能 |
| 04   | 04. isOppo      | 功能 |
| 05   | 05. isLeeco     | 功能 |
| 06   | 06. is360       | 功能 |
| 07   | 07. isZte       | 功能 |
| 08   | 08. isOneplus   | 功能 |
| 09   | 09. isNubia     | 功能 |
| 10   | 10. isCoolpad   | 功能 |
| 11   | 11. isLg        | 功能 |
| 12   | 12. isGoogle    | 功能 |
| 13   | 13. isSamsung   | 功能 |
| 14   | 14. isMeizu     | 功能 |
| 15   | 15. isLenovo    | 功能 |
| 16   | 16. isSmartisan | 功能 |
| 17   | 17. isHtc       | 功能 |
| 18   | 18. isSony      | 功能 |
| 19   | 19. isAmigo     | 功能 |

### *015.重启RebootHelper(35)*

| 序号 | 方法                  | 功能                       |
|:-----|:----------------------|:--------------------------|
| 01   | 01. reboot            | android.permission.REBOOT |
| 02   | 02. reboot2Recovery   | 功能                      |
| 03   | 03. reboot2Bootloader | 功能                      |
| 04   | 04. shutdown          | 功能                      |

### *016.命令ShellHelper(86)*

| 序号 | 方法        | 功能 |
|:-----|:------------|:----|
| 01   | 01. execCmd | 功能 |

### *017.破解RootHelper(43)*

| 序号 | 方法               | 功能 |
|:-----|:-------------------|:----|
| 01   | 01. isRoot         | 功能 |
| 02   | 02. isRooted       | 功能 |
| 03   | 03. rootPermission | 功能 |

### *018.应用ApplicationHelper(603)*

| 序号 | 方法                                   | 功能 |
|:-----|:---------------------------------------|:----|
| 01   | 01. numCores                           | 功能 |
| 02   | 02. isServiceRunning                   | 功能 |
| 03   | 03. stopRunningService                 | 功能 |
| 04   | 04. runScript                          | 功能 |
| 05   | 05. killProcess                        | 功能 |
| 06   | 06. registerAppStatusChangedListener   | 功能 |
| 07   | 07. unregisterAppStatusChangedListener | 功能 |
| 08   | 08. appPackageName                     | 功能 |
| 09   | 09. installApp                         | 功能 |
| 10   | 10. installAppSilent                   | 功能 |
| 11   | 11. uninstallApp                       | 功能 |
| 12   | 12. uninstallAppSilent                 | 功能 |
| 13   | 13. isAppInstalled                     | 功能 |
| 14   | 14. isAppRoot                          | 功能 |
| 15   | 15. isAppDebug                         | 功能 |
| 16   | 16. isAppSystem                        | 功能 |
| 17   | 17. isAppBackground                    | 功能 |
| 18   | 18. isAppForeground                    | 功能 |
| 19   | 19. launchApp                          | 功能 |
| 20   | 20. relaunchApp                        | 功能 |
| 21   | 21. launchAppDetailsSettings           | 功能 |
| 22   | 22. getAppInstaller                    | 功能 |
| 23   | 23. getAppFirstInstallTime             | 功能 |
| 24   | 24. getAppLastUpdateTime               | 功能 |
| 25   | 25. getAppTargetSdkVersion             | 功能 |
| 26   | 26. getAppUid                          | 功能 |
| 27   | 27. getApplicationMetaData             | 功能 |
| 28   | 28. getAppSize                         | 功能 |
| 29   | 29. appIcon                            | 功能 |
| 30   | 30. getAppIcon                         | 功能 |
| 31   | 31. appName                            | 功能 |
| 32   | 32. getAppName                         | 功能 |
| 33   | 33. appPath                            | 功能 |
| 34   | 34. getAppPath                         | 功能 |
| 35   | 35. appVersionName                     | 功能 |
| 36   | 36. getAppVersionName                  | 功能 |
| 37   | 37. appVersionCode                     | 功能 |
| 38   | 38. getAppVersionCode                  | 功能 |
| 39   | 39. appSignature                       | 功能 |
| 40   | 40. getAppSignature                    | 功能 |
| 41   | 41. appSignatureSHA1                   | 功能 |
| 42   | 42. getAppSignatureSHA1                | 功能 |
| 43   | 43. appSignatureSHA256                 | 功能 |
| 44   | 44. getAppSignatureSHA256              | 功能 |
| 45   | 45. appSignatureMD5                    | 功能 |
| 46   | 46. getAppSignatureMD5                 | 功能 |
| 47   | 47. appsInfo                           | 功能 |
| 48   | 48. appInfo                            | 功能 |
| 49   | 49. getAppInfo                         | 功能 |
| 50   | 50. getApkInfo                         | 功能 |

### *019.崩溃CrashHelper(143)*

| 序号 | 方法                | 功能 |
|:-----|:--------------------|:----|
| 01   | 01. init            | 功能 |
| 02   | 02. crashTip        | 功能 |
| 03   | 03. OnCrashListener | 功能 |

### *020.退出ExitHelper(59)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. exitApp             | 功能 |
| 02   | 02. OnExitClickListener | 功能 |

### *021.清理CleanHelper(50)*

| 序号 | 方法                      | 功能 |
|:-----|:--------------------------|:----|
| 01   | 01. cleanAppData          | 功能 |
| 02   | 02. cleanInternalFiles    | 功能 |
| 03   | 03. cleanInternalCache    | 功能 |
| 04   | 04. cleanExternalCache    | 功能 |
| 05   | 05. cleanInternalSP       | 功能 |
| 06   | 06. cleanInternalDbs      | 功能 |
| 07   | 07. cleanInternalDbByName | 功能 |
| 08   | 08. cleanCustomCache      | 功能 |
| 09   | 09. totalCacheSize        | 功能 |

### *022.快捷ShortcutHelper(40)*

| 序号 | 方法            | 功能 |
|:-----|:----------------|:----|
| 01   | 01. hasShortcut | 功能 |
| 02   | 02. addShortcut | 功能 |
| 03   | 03. delShortcut | 功能 |

### *023.路由RouteHelper(142)*

| 序号 | 方法               | 功能 |
|:-----|:-------------------|:----|
| 01   | 01. requestCode    | 功能 |
| 02   | 02. newIntent      | 功能 |
| 03   | 03. addFlags       | 功能 |
| 04   | 04. putExtraParam  | 功能 |
| 05   | 05. setCallback    | 功能 |
| 06   | 06. to             | 功能 |
| 07   | 07. putBundle      | 功能 |
| 08   | 08. putBundleParam | 功能 |
| 09   | 09. options        | 功能 |
| 10   | 10. anim           | 功能 |
| 11   | 11. launch         | 功能 |
| 12   | 12. pop            | 功能 |

### *024.活动ActivityHelper(669)*

| 序号 | 方法                                | 功能 |
|:-----|:------------------------------------|:----|
| 01   | 01. startActivity                   | 功能 |
| 02   | 02. startActivityForResult          | 功能 |
| 03   | 03. startActivities                 | 功能 |
| 04   | 04. startHomeActivity               | 功能 |
| 05   | 05. activityList                    | 功能 |
| 06   | 06. currentActivity                 | 功能 |
| 07   | 07. topActivityName                 | 功能 |
| 08   | 08. launcherActivityName            | 功能 |
| 09   | 09. getLauncherActivityName         | 功能 |
| 10   | 10. getActivityByView               | 功能 |
| 11   | 11. isActivityExists                | 功能 |
| 12   | 12. isActivityExistsInList          | 功能 |
| 13   | 13. finishActivity                  | 功能 |
| 14   | 14. finishToActivity                | 功能 |
| 15   | 15. finishOtherActivities           | 功能 |
| 16   | 16. finishAllActivitiesExceptNewest | 功能 |
| 17   | 17. finishAllActivities             | 功能 |
| 18   | 18. getActivityIcon                 | 功能 |
| 19   | 19. getActivityLogo                 | 功能 |

### *025.分享ShareHelper(238)*

| 序号 | 方法                                              | 功能 |
|:-----|:--------------------------------------------------|:----|
| 01   | 01. shareMultiplePicture                          | 功能 |
| 02   | 02. shareMultiplePictureForResult                 | 功能 |
| 03   | 03. shareMultiplePictureToWeChatCircle            | 功能 |
| 04   | 04. shareMultiplePictureToWeChatCircleForResult   | 功能 |
| 05   | 05. shareMultiplePictureToWeChatContacts          | 功能 |
| 06   | 06. shareMultiplePictureToWeChatContactsForResult | 功能 |
| 07   | 07. sharePicture                                  | 功能 |
| 08   | 08. sharePictureToWeChatCircle                    | 功能 |
| 09   | 09. sharePictureToWeChatContacts                  | 功能 |
| 10   | 10. sharePictureForResult                         | 功能 |
| 11   | 11. sharePictureToWeChatCircleForResult           | 功能 |
| 12   | 12. sharePictureToWeChatContactsForResult         | 功能 |
| 13   | 13. shareVideo                                    | 功能 |
| 14   | 14. shareVideoToWeChatContacts                    | 功能 |
| 15   | 15. shareVideoForResult                           | 功能 |
| 16   | 16. shareVideoToWeChatContactsForResult           | 功能 |
| 17   | 17. shareFile                                     | 功能 |
| 18   | 18. shareFileToWeChatContacts                     | 功能 |
| 19   | 19. shareFileForResult                            | 功能 |
| 20   | 20. shareFileToWeChatContactsForResult            | 功能 |

### *026.片段FragmentHelper(485)*

| 序号 | 方法                       | 功能 |
|:-----|:---------------------------|:----|
| 01   | 01. addFragment            | 功能 |
| 02   | 02. addFragments           | 功能 |
| 03   | 03. hideAddFragment        | 功能 |
| 04   | 04. popAddFragment         | 功能 |
| 05   | 05. replaceFragment        | 功能 |
| 06   | 06. showFragment           | 功能 |
| 07   | 07. showFragments          | 功能 |
| 08   | 08. hideFragment           | 功能 |
| 09   | 09. hideFragments          | 功能 |
| 10   | 10. hideAllShowFragment    | 功能 |
| 11   | 11. hideOthersShowFragment | 功能 |
| 12   | 12. hideShowFragment       | 功能 |
| 13   | 13. removeFragment         | 功能 |
| 14   | 14. removeToFragment       | 功能 |
| 15   | 15. removeFragments        | 功能 |
| 16   | 16. popFragment            | 功能 |
| 17   | 17. popToFragment          | 功能 |
| 18   | 18. popFragments           | 功能 |
| 19   | 19. getLastAddFragment     | 功能 |
| 20   | 20. getTopShowFragment     | 功能 |
| 21   | 21. getFragments           | 功能 |
| 22   | 22. getNodes               | 功能 |
| 23   | 23. getPreFragment         | 功能 |
| 24   | 24. getFragment            | 功能 |
| 25   | 25. OnBackClickListener    | 功能 |
| 26   | 26. dispatchBackPress      | 功能 |
| 27   | 27. setBackgroundColor     | 功能 |
| 28   | 28. setBackgroundResource  | 功能 |
| 29   | 29. setBackgroundDrawable  | 功能 |
| 30   | 30. getSimpleName          | 功能 |

### *027.服务ServiceHelper(66)*

| 序号 | 方法                   | 功能 |
|:-----|:-----------------------|:----|
| 01   | 01. allRunningServices | 功能 |
| 02   | 02. isServiceRunning   | 功能 |
| 03   | 03. startService       | 功能 |
| 04   | 04. stopService        | 功能 |
| 05   | 05. bindService        | 功能 |
| 06   | 06. unbindService      | 功能 |

### *028.管理ManagerHelper(167)*

| 序号 | 方法                          | 功能 |
|:-----|:------------------------------|:----|
| 01   | 01. accessibilityManager      | 功能 |
| 02   | 02. accountManager            | 功能 |
| 03   | 03. activityManager           | 功能 |
| 04   | 04. alarmManager              | 功能 |
| 05   | 05. appOpsManager             | 功能 |
| 06   | 06. audioManager              | 功能 |
| 07   | 07. batteryManager            | 功能 |
| 08   | 08. bluetoothManager          | 功能 |
| 09   | 09. cameraManager             | 功能 |
| 10   | 10. captioningManager         | 功能 |
| 11   | 11. carrierConfigManager      | 功能 |
| 12   | 12. clipboardManager          | 功能 |
| 13   | 13. companionDeviceManager    | 功能 |
| 14   | 14. connectivityManager       | 功能 |
| 15   | 15. consumerIrManager         | 功能 |
| 16   | 16. devicePolicyManager       | 功能 |
| 17   | 17. displayManager            | 功能 |
| 18   | 18. downloadManager           | 功能 |
| 19   | 19. fingerprintManager        | 功能 |
| 20   | 20. hardwarePropertiesManager | 功能 |
| 21   | 21. inputManager              | 功能 |
| 22   | 22. inputMethodManager        | 功能 |
| 23   | 23. keyguardManager           | 功能 |
| 24   | 24. layoutInflater            | 功能 |
| 25   | 25. locationManager           | 功能 |
| 26   | 26. mediaProjectionManager    | 功能 |
| 27   | 27. mediaSessionManager       | 功能 |
| 28   | 28. midiManager               | 功能 |
| 29   | 29. networkStatsManager       | 功能 |
| 30   | 30. nfcManager                | 功能 |
| 31   | 31. notificationManager       | 功能 |
| 32   | 32. nsdManager                | 功能 |
| 33   | 33. powerManager              | 功能 |
| 34   | 34. printManager              | 功能 |
| 35   | 35. restrictionsManager       | 功能 |
| 36   | 36. searchManager             | 功能 |
| 37   | 37. sensorManager             | 功能 |
| 38   | 38. shortcutManager           | 功能 |
| 39   | 39. storageManager            | 功能 |
| 40   | 40. storageStatsManager       | 功能 |
| 41   | 41. systemHealthManager       | 功能 |
| 42   | 42. telecomManager            | 功能 |
| 43   | 43. telephonyManager          | 功能 |
| 44   | 44. textClassificationManager | 功能 |
| 45   | 45. tvInputManager            | 功能 |
| 46   | 46. uiModeManager             | 功能 |
| 47   | 47. usageStatsManager         | 功能 |
| 48   | 48. usbManager                | 功能 |
| 49   | 49. userManager               | 功能 |
| 50   | 50. vibrator                  | 功能 |
| 51   | 51. wallpaperManager          | 功能 |
| 52   | 52. wifiAwareManager          | 功能 |
| 53   | 53. wifiManager               | 功能 |
| 54   | 54. wifiP2pManager            | 功能 |
| 55   | 55. windowManager             | 功能 |

### *029.轮询PollingHelper(38)*

| 序号 | 方法                      | 功能 |
|:-----|:--------------------------|:----|
| 01   | 01. isExistPollingService | 功能 |
| 02   | 02. startPollingService   | 功能 |
| 03   | 03. stopPollingService    | 功能 |

### *030.广播BroadcastHelper(22)*

| 序号 | 方法                        | 功能 |
|:-----|:----------------------------|:----|
| 01   | 01. registerReceiverNetWork | 功能 |

### *031.意图IntentHelper(316)*

| 序号 | 方法                            | 功能 |
|:-----|:--------------------------------|:----|
| 01   | 01. isIntentAvailable           | 功能 |
| 02   | 02. getInstallAppIntent         | 功能 |
| 03   | 03. getUninstallAppIntent       | 功能 |
| 04   | 04. getLaunchAppIntent          | 功能 |
| 05   | 05. getAppDetailsSettingsIntent | 功能 |
| 06   | 06. getAppStoreIntent           | 功能 |
| 07   | 07. getCaptureIntent            | 功能 |
| 08   | 08. getPickIntentWithGallery    | 功能 |
| 09   | 09. getPickIntentWithDocuments  | 功能 |
| 10   | 10. buildImageGetIntent         | 功能 |
| 11   | 11. buildImageCropIntent        | 功能 |
| 12   | 12. getShareImageIntent         | 功能 |
| 13   | 13. getShareTextIntent          | 功能 |
| 14   | 14. getDialIntent               | 功能 |
| 15   | 15. getCallIntent               | 功能 |
| 16   | 16. getSendSmsIntent            | 功能 |
| 17   | 17. shutdownIntent              | 功能 |
| 18   | 18. getShutdownIntent           | 功能 |
| 19   | 19. getComponentIntent          | 功能 |

### *032.元数MetaDataHelper(53)*

| 序号 | 方法                      | 功能 |
|:-----|:--------------------------|:----|
| 01   | 01. getMetaDataInApp      | 功能 |
| 02   | 02. getMetaDataInActivity | 功能 |
| 03   | 03. getMetaDataInService  | 功能 |
| 04   | 04. getMetaDataInReceiver | 功能 |

### *033.权限PermissionHelper(443)*

| 序号 | 方法                         | 功能 |
|:-----|:-----------------------------|:----|
| 01   | 01. builderSimple            | 功能 |
| 02   | 02. addPermission            | 功能 |
| 03   | 03. initPermission           | 功能 |
| 04   | 04. builderPermissions       | 功能 |
| 05   | 05. PermissionConstants      | 功能 |
| 06   | 06. request                  | 功能 |
| 07   | 07. rationale                | 功能 |
| 08   | 08. simple                   | 功能 |
| 09   | 09. full                     | 功能 |
| 10   | 10. theme                    | 功能 |
| 11   | 11. permission               | 功能 |
| 12   | 12. getPermissions           | 功能 |
| 13   | 13. launchAppDetailsSettings | 功能 |
| 14   | 14. isGrantedWriteSettings   | 功能 |
| 15   | 15. requestWriteSettings     | 功能 |
| 16   | 16. isGrantedDrawOverlays    | 功能 |
| 17   | 17. requestDrawOverlays      | 功能 |
| 18   | 18. isGranted                | 功能 |
| 19   | #### PermissionConstants     | 功能 |
| 20   | 01. PHONE                    | 功能 |
| 21   | 02. SENSORS                  | 功能 |
| 22   | 03. LOCATION                 | 功能 |
| 23   | 04. MICROPHONE               | 功能 |
| 24   | 05. CAMERA                   | 功能 |
| 25   | 06. STORAGE                  | 功能 |
| 26   | 07. CALENDAR                 | 功能 |
| 27   | 08. CONTACTS                 | 功能 |
| 28   | 09. SMS                      | 功能 |
| 29   | 10. getPermissions           | 功能 |

### *034.屏幕ScreenHelper(260)*

| 序号 | 方法                            | 功能 |
|:-----|:--------------------------------|:----|
| 01   | 01. isScreenLock                | 功能 |
| 02   | 02. sleepDuration               | 功能 |
| 03   | 03. noShootScreen               | 功能 |
| 04   | 04. shootScreenWithStatusBar    | 功能 |
| 05   | 05. shootScreenWithoutStatusBar | 功能 |
| 06   | 06. shootWebView                | 功能 |
| 07   | 07. realScreenHeight            | 功能 |
| 08   | 08. screenWidthByPoint          | 功能 |
| 09   | 09. screenHeightByPoint         | 功能 |
| 10   | 10. screenWidth                 | 功能 |
| 11   | 11. screenWidth8                | 功能 |
| 12   | 12. screenHeight                | 功能 |
| 13   | 13. screenHeight8               | 功能 |
| 14   | 14. navigationAreaHeight        | 功能 |
| 15   | 15. navigationBarHeight         | 功能 |
| 16   | 16. toolbarHeight               | 功能 |
| 17   | 17. statusBarHeight             | 功能 |
| 18   | 18. getTitleBarHeight           | 功能 |
| 19   | 19. screenDisplayId             | 功能 |
| 20   | 20. screenDensity               | 功能 |
| 21   | 21. screenDensityDpi            | 功能 |
| 22   | 22. screenDensityDpiStr         | 功能 |
| 23   | 23. getSysSampleSize            | 功能 |
| 24   | 24. adaptWidth                  | 功能 |
| 25   | 25. adaptHeight                 | 功能 |
| 26   | 26. closeAdapt                  | 功能 |

### *035.窗口WindowHelper(60)*

| 序号 | 方法                 | 功能 |
|:-----|:---------------------|:----|
| 01   | 01. displayRotation  | 功能 |
| 02   | 02. isLandscape      | 功能 |
| 03   | 03. setLandscape     | 功能 |
| 04   | 04. isPortrait       | 功能 |
| 05   | 05. setPortrait      | 功能 |
| 06   | 06. toggleFullScreen | 功能 |
| 07   | 07. isFullScreen     | 功能 |
| 08   | 08. setNoFullScreen  | 功能 |
| 09   | 09. setFullScreen    | 功能 |
| 10   | 10. dimBackground    | 功能 |

### *036.多栏BarHelper(531)*

| 序号 | 方法                                                | 功能 |
|:-----|:----------------------------------------------------|:----|
| 01   | 01. isStatusBarExists                               | 功能 |
| 02   | 02. isStatusBarVisible                              | 功能 |
| 03   | 03. setStatusBarVisibility                          | 功能 |
| 04   | 04. isStatusBarModeDark                             | 功能 |
| 05   | 05. Mode                                            | 功能 |
| 06   | 06. setStatusBarModeDark                            | 功能 |
| 07   | 07. getStatusBarColor                               | 功能 |
| 08   | 08. setStatusBarColor                               | 功能 |
| 09   | 09. setStatusBarColorDiff                           | 功能 |
| 10   | 10. setStatusBarColorForDrawerLayout                | 功能 |
| 11   | 11. setStatusBarColorForDrawerLayoutDiff            | 功能 |
| 12   | 12. setStatusBarColorForSwipeBack                   | 功能 |
| 13   | 13. setAllTransparent                               | 功能 |
| 14   | 14. setStatusBarTranslucent                         | 功能 |
| 15   | 15. setStatusBarTransparent                         | 功能 |
| 16   | 16. setStatusBarTranslucentDiff                     | 功能 |
| 17   | 17. setStatusBarTranslucentForDrawerLayout          | 功能 |
| 18   | 18. setStatusBarTranslucentForDrawerLayoutDiff      | 功能 |
| 19   | 19. setStatusBarTranslucentForCoordinatorLayout     | 功能 |
| 20   | 20. setStatusBarTranslucentForImageViewIsInFragment | 功能 |
| 21   | 21. setNotificationBarVisibility                    | 功能 |
| 22   | 22. actionBarHeight                                 | 功能 |
| 23   | 23. isNavBarSupported                               | 功能 |
| 24   | 24. isNavBarVisible                                 | 功能 |
| 25   | 25. setNavBarVisibility                             | 功能 |
| 26   | 26. getNavBarColor                                  | 功能 |
| 27   | 27. setNavBarColor                                  | 功能 |

### *037.视图ViewHelper：ViewTouch、ViewClick、ViewShadow(945)*

| 序号 | 方法                          | 功能 |
|:-----|:------------------------------|:----|
| 01   | 01. showPopupWindow           | 功能 |
| 02   | 02. dismissPopupWindow        | 功能 |
| 03   | 03. setTVUnderLine            | 功能 |
| 04   | 04. setViewEnabled            | 功能 |
| 05   | 05. isLayoutRtl               | 功能 |
| 06   | 06. isTouchInView             | 功能 |
| 07   | 07. fixScrollViewTopping      | 功能 |
| 08   | 08. removeSelfFromParent      | 功能 |
| 09   | 09. requestLayoutParent       | 功能 |
| 10   | 10. getActivity               | 功能 |
| 11   | 11. bitmapView                | 功能 |
| 12   | 12. shootView                 | 功能 |
| 13   | 13. captureView               | 功能 |
| 14   | 14. captureActivity           | 功能 |
| 15   | 15. bigImage                  | 功能 |
| 16   | #### ViewTouch                | 功能 |
| 17   | 01. UNKNOWN                   | 功能 |
| 18   | 02. LEFT                      | 功能 |
| 19   | 03. UP                        | 功能 |
| 20   | 04. RIGHT                     | 功能 |
| 21   | 05. DOWN                      | 功能 |
| 22   | 06. Direction                 | 功能 |
| 23   | 07. setOnTouchListener        | 功能 |
| 24   | 08. OnTouchUtilsListener      | 功能 |
| 25   | #### ViewClick                | 功能 |
| 26   | 01. applyPressedViewScale     | 功能 |
| 27   | 02. applyPressedViewAlpha     | 功能 |
| 28   | 03. applyPressedBgAlpha       | 功能 |
| 29   | 04. applyPressedBgDark        | 功能 |
| 30   | 05. applyDebouncingGlobal     | 功能 |
| 31   | 06. OnDebouncingClickListener | 功能 |
| 32   | 07. applyDebouncingSingle     | 功能 |
| 33   | 08. OnMultiClickListener      | 功能 |
| 34   | #### ViewShadow               | 功能 |
| 35   | 01. apply                     | 功能 |

### *038.网视WebViewHelper(76)*

| 序号 | 方法          | 功能 |
|:-----|:--------------|:----|
| 01   | 01. init      | 功能 |
| 02   | 02. userAgent | 功能 |
| 03   | 03. loadData  | 功能 |
| 04   | 04. goBack    | 功能 |

### *039.着色ColorHelper(76)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. randomColor         | 功能 |
| 02   | 02. getRandomColor      | 功能 |
| 03   | 03. getColor            | 功能 |
| 04   | 04. setAlphaComponent   | 功能 |
| 05   | 05. setRedComponent     | 功能 |
| 06   | 06. setGreenComponent   | 功能 |
| 07   | 07. setBlueComponent    | 功能 |
| 08   | 08. string2ColorInt     | 功能 |
| 09   | 09. int2ArgbOrRgbString | 功能 |
| 10   | 10. tintCursorDrawable  | 功能 |
| 11   | 11. tintDrawable        | 功能 |

### *040.吐司ToastHelper(360)*

| 序号 | 方法                   | 功能 |
|:-----|:-----------------------|:----|
| 01   | 01. TopCenter          | 功能 |
| 02   | 02. TopLeft            | 功能 |
| 03   | 03. TopRight           | 功能 |
| 04   | 04. Center             | 功能 |
| 05   | 05. CenterLeft         | 功能 |
| 06   | 06. CenterRight        | 功能 |
| 07   | 07. BottomCenter       | 功能 |
| 08   | 08. BottomLeft         | 功能 |
| 09   | 09. BottomRight        | 功能 |
| 10   | 10. setGravity         | 功能 |
| 11   | 11. setMsgTextSize     | 功能 |
| 12   | 12. COLOR_TEXT_DEFAULT | 功能 |
| 13   | 13. setMsgColor        | 功能 |
| 14   | 14. setBgResource      | 功能 |
| 15   | 15. COLOR_BG_INFO      | 功能 |
| 16   | 16. COLOR_BG_SUCCESS   | 功能 |
| 17   | 17. COLOR_BG_WARNING   | 功能 |
| 18   | 18. COLOR_BG_ERROR     | 功能 |
| 19   | 19. setBgColor         | 功能 |
| 20   | 20. showShort          | 功能 |
| 21   | 21. showLong           | 功能 |
| 22   | 22. cancel             | 功能 |
| 23   | 23. showCustomShort    | 功能 |
| 24   | 24. showCustomLong     | 功能 |

### *041.零食SnackHelper(107)*

| 序号 | 方法                      | 功能 |
|:-----|:--------------------------|:----|
| 01   | 01. colorSnackbar         | 功能 |
| 02   | 02. typeSnackbar          | 功能 |
| 03   | 03. DEFAULT_INFO_BLUE     | 功能 |
| 04   | 04. SUCCESS_CONFIRM_GREEN | 功能 |
| 05   | 05. WARNING_ORANGE        | 功能 |
| 06   | 06. ERROR_ALERT_RED       | 功能 |
| 07   | 07. ERROR_ALERT_YELLOW    | 功能 |
| 08   | 08. switchType            | 功能 |
| 09   | 09. setColor              | 功能 |
| 10   | 10. setBottomMargin       | 功能 |
| 11   | 11. setBackgroundResource | 功能 |
| 12   | 12. setAction             | 功能 |
| 13   | 13. getView               | 功能 |
| 14   | 14. addView               | 功能 |

>- implementation "com.google.android.material:material:1.2.1"

### *042.连点ClickHelper(40)*

| 序号 | 方法                  | 功能 |
|:-----|:----------------------|:----|
| 01   | 01. isFastDoubleClick | 功能 |
| 02   | 02. doClick           | 功能 |

### *043.防抖AntiShakeHelper(20)*

| 序号 | 方法        | 功能 |
|:-----|:------------|:----|
| 01   | 01. isValid | 功能 |

### *044.抖动ShakeHelper(26)*

| 序号 | 方法               | 功能 |
|:-----|:-------------------|:----|
| 01   | 01. shakeAnimation | 功能 |
| 02   | 02. shake          | 功能 |

### *045.全局AHelper(287)*

| 序号 | 方法                       | 功能 |
|:-----|:---------------------------|:----|
| 01   | 01. FileProvider4Helper    | 功能 |
| 02   | 02. ContentProvider4Helper | 功能 |
| 03   | 03. initContext            | 功能 |
| 04   | 04. app                    | 功能 |
| 05   | 05. activityLifecycle      | 功能 |
| 06   | 06. activityLinkedList     | 功能 |
| 07   | 07. isForegroundApp        | 功能 |
| 08   | 08. topActivityOrApp       | 功能 |
| 09   | 09. handler                | 功能 |
| 10   | 10. runOnUiThread          | 功能 |
| 11   | 11. runOnUiThreadDelayed   | 功能 |

### *046.接口ApiHelper(44)*

| 序号 | 方法            | 功能 |
|:-----|:----------------|:----|
| 01   | 01. registerApi | 功能 |
| 02   | 02. toString    | 功能 |
| 03   | 03. BaseApi     | 功能 |
| 04   | 04. getApi      | 功能 |
| 05   | 05. Api         | 功能 |

### *047.总线BusHelper(239)*

| 序号 | 方法             | 功能 |
|:-----|:-----------------|:----|
| 01   | 01. registerBus  | 功能 |
| 02   | 02. toString     | 功能 |
| 03   | 03. register     | 功能 |
| 04   | 04. post         | 功能 |
| 05   | 05. unregister   | 功能 |
| 06   | 06. postSticky   | 功能 |
| 07   | 07. removeSticky | 功能 |
| 08   | 08. ThreadMode   | 功能 |
| 09   | 09. Bus          | 功能 |

### *048.内存CacheMemoryHelper(78)*

| 序号 | 方法              | 功能 |
|:-----|:------------------|:----|
| 01   | 01. SEC           | 功能 |
| 02   | 02. MIN           | 功能 |
| 03   | 03. HOUR          | 功能 |
| 04   | 04. DAY           | 功能 |
| 05   | 05. getInstance   | 功能 |
| 06   | 06. toString      | 功能 |
| 07   | #### CacheMemory  | 功能 |
| 08   | 01. cacheCount    | 功能 |
| 09   | 02. getCacheCount | 功能 |
| 10   | 03. put           | 功能 |
| 11   | 04. get           | 功能 |
| 12   | 05. remove        | 功能 |
| 13   | 06. clear         | 功能 |

### *049.磁盘CacheDiskHelper(523)*

| 序号 | 方法                  | 功能 |
|:-----|:----------------------|:----|
| 01   | 01. SEC               | 功能 |
| 02   | 02. MIN               | 功能 |
| 03   | 03. HOUR              | 功能 |
| 04   | 04. DAY               | 功能 |
| 05   | 05. getInstance       | 功能 |
| 06   | 06. toString          | 功能 |
| 07   | 07. XFileOutputStream | 功能 |
| 08   | #### CacheDisk        | 功能 |
| 09   | 01. cacheCount        | 功能 |
| 10   | 02. getCacheCount     | 功能 |
| 11   | 03. cacheSize         | 功能 |
| 12   | 04. getCacheSize      | 功能 |
| 13   | 05. put               | 功能 |
| 14   | 06. getBytes          | 功能 |
| 15   | 07. getString         | 功能 |
| 16   | 08. getJSONObject     | 功能 |
| 17   | 09. getJSONArray      | 功能 |
| 18   | 10. getBitmap         | 功能 |
| 19   | 11. getDrawable       | 功能 |
| 20   | 12. getSerializable   | 功能 |
| 21   | 13. getParcelable     | 功能 |
| 22   | 14. remove            | 功能 |
| 23   | 15. clear             | 功能 |

### *050.双重CacheDoubleHelper(247)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. SEC                 | 功能 |
| 02   | 02. MIN                 | 功能 |
| 03   | 03. HOUR                | 功能 |
| 04   | 04. DAY                 | 功能 |
| 05   | 05. getInstance         | 功能 |
| 06   | #### CacheDouble        | 功能 |
| 07   | 01. cacheMemoryCount    | 功能 |
| 08   | 02. getCacheMemoryCount | 功能 |
| 09   | 03. cacheDiskCount      | 功能 |
| 10   | 04. getCacheDiskCount   | 功能 |
| 11   | 05. cacheDiskSize       | 功能 |
| 12   | 06. getCacheDiskSize    | 功能 |
| 13   | 07. put                 | 功能 |
| 14   | 08. getBytes            | 功能 |
| 15   | 09. getString           | 功能 |
| 16   | 10. getJSONObject       | 功能 |
| 17   | 11. getJSONArray        | 功能 |
| 18   | 12. getBitmap           | 功能 |
| 19   | 13. getDrawable         | 功能 |
| 20   | 14. getSerializable     | 功能 |
| 21   | 15. getParcelable       | 功能 |
| 22   | 16. remove              | 功能 |
| 23   | 17. clear               | 功能 |

### *051.线程ThreadHelper(328)*

| 序号 | 方法                         | 功能 |
|:-----|:-----------------------------|:----|
| 01   | 01. defaultThreadPoolSize    | 功能 |
| 02   | 02. isMainThread             | 功能 |
| 03   | 03. SimpleTask               | 功能 |
| 04   | 04. Task                     | 功能 |
| 05   | 05. cancel                   | 功能 |
| 06   | 06. executeBySingleWithDelay | 功能 |
| 07   | 07. executeByCachedWithDelay | 功能 |
| 08   | 08. executeByIOWithDelay     | 功能 |
| 09   | 09. executeByCPUWithDelay    | 功能 |
| 10   | 10. executeByFixedWithDelay  | 功能 |
| 11   | 11. executeWithDelay         | 功能 |
| 12   | 12. executeBySingleAtFixRate | 功能 |
| 13   | 13. executeByCachedAtFixRate | 功能 |
| 14   | 14. executeByIOAtFixRate     | 功能 |
| 15   | 15. executeByCPUAtFixRate    | 功能 |
| 16   | 16. executeByFixedAtFixRate  | 功能 |
| 17   | 17. executeAtFixedRate       | 功能 |
| 18   | 18. poolSingle               | 功能 |
| 19   | 19. getPoolSingle            | 功能 |
| 20   | 20. poolCached               | 功能 |
| 21   | 21. getPoolCached            | 功能 |
| 22   | 22. poolIo                   | 功能 |
| 23   | 23. getPoolIo                | 功能 |
| 24   | 24. poolCpu                  | 功能 |
| 25   | 25. getPoolCpu               | 功能 |
| 26   | 26. getPoolFixed             | 功能 |
| 27   | 27. getPool                  | 功能 |
| 28   | 28. executorService          | 功能 |
| 29   | 29. shutDown                 | 功能 |
| 30   | 30. shutDownNow              | 功能 |
| 31   | 31. isShutDown               | 功能 |
| 32   | 32. isTerminated             | 功能 |
| 33   | 33. awaitTermination         | 功能 |
| 34   | 34. submit                   | 功能 |
| 35   | 35. invokeAny                | 功能 |
| 36   | 36. invokeAll                | 功能 |

### *052.进程ProcessHelper(150)*

| 序号 | 方法                           | 功能 |
|:-----|:-------------------------------|:----|
| 01   | 01. isMainProcess              | 功能 |
| 02   | 02. currentProcessName         | 功能 |
| 03   | 03. foregroundProcessName      | 功能 |
| 04   | 04. allBackgroundProcesses     | 功能 |
| 05   | 05. killBackgroundProcesses    | 功能 |
| 06   | 06. killAllBackgroundProcesses | 功能 |

### *053.反射ReflectionHelper(64)*

| 序号 | 方法                      | 功能 |
|:-----|:--------------------------|:----|
| 01   | 01. getClassListByPackage | 功能 |
| 02   | 02. isInstance            | 功能 |
| 03   | 03. newInstance           | 功能 |
| 04   | 04. invokeMethod          | 功能 |
| 05   | 05. invokeStaticMethod    | 功能 |
| 06   | 06. getProperty           | 功能 |
| 07   | 07. getStaticProperty     | 功能 |
| 08   | 08. setProperty           | 功能 |
| 09   | 09. setStaticProperty     | 功能 |

### *054.单例SingletonHelper.Singleton(16)*

| 序号 | 方法            | 功能 |
|:-----|:----------------|:----|
| 01   | 01. newInstance | 功能 |
| 02   | 02. getInstance | 功能 |

### *055.空判EmptyHelper(72)*

| 序号 | 方法               | 功能 |
|:-----|:-------------------|:----|
| 01   | 01. isEmptyAny     | 功能 |
| 02   | 02. isNotEmptyAny  | 功能 |
| 03   | 03. hashCode       | 功能 |
| 04   | 04. getOrDefault   | 功能 |
| 05   | 05. equalsAny      | 功能 |
| 06   | 06. requireNonNull | 功能 |

### *056.输入InputMethodHelper(248)*

| 序号 | 方法                                   | 功能 |
|:-----|:---------------------------------------|:----|
| 01   | 01. showInputMethod                    | 功能 |
| 02   | 02. toggleInputMethod                  | 功能 |
| 03   | 03. hideInputMethod                    | 功能 |
| 04   | 04. hideInputMethodTimer               | 功能 |
| 05   | 05. isInputMethodActive                | 功能 |
| 06   | 06. isInputMethodVisible               | 功能 |
| 07   | 07. OnSoftInputChangedListener         | 功能 |
| 08   | 08. registerSoftInputChangedListener   | 功能 |
| 09   | 09. unregisterSoftInputChangedListener | 功能 |
| 10   | 10. fixSoftInputLeaks                  | 功能 |
| 11   | 11. fixAndroidBug5497                  | 功能 |
| 12   | 12. clickBlankArea2HideSoftInput       | 功能 |

### *057.剪贴ClipboardHelper(20)*

| 序号 | 方法           | 功能 |
|:-----|:---------------|:----|
| 01   | 01. textClip   | 功能 |
| 02   | 02. uriClip    | 功能 |
| 03   | 03. intentClip | 功能 |

### *058.字串StringHelper(120)*

| 序号 | 方法                   | 功能 |
|:-----|:-----------------------|:----|
| 01   | 01. isEmptyNoTrim      | 功能 |
| 02   | 02. isEmptyTrim        | 功能 |
| 03   | 03. isNotNull          | 功能 |
| 04   | 04. isNull             | 功能 |
| 05   | 05. isNotSpace         | 功能 |
| 06   | 06. isSpace            | 功能 |
| 07   | 07. isNumberStr        | 功能 |
| 08   | 08. isIntegerStr       | 功能 |
| 09   | 09. isDoubleStr        | 功能 |
| 10   | 10. isCnCharContains   | 功能 |
| 11   | 11. isCnCharAll        | 功能 |
| 12   | 12. isNotCnChar        | 功能 |
| 13   | 13. isCnChar           | 功能 |
| 14   | 14. isMessyCode        | 功能 |
| 15   | 15. equalsString       | 功能 |
| 16   | 16. equalsCharSequence | 功能 |
| 17   | 17. firstMatcher       | 功能 |
| 18   | 18. firstSplit         | 功能 |
| 19   | 19. anySplit           | 功能 |
| 20   | 20. concatNoSpilt      | 功能 |
| 21   | 21. concatSpilt        | 功能 |

### *059.富文SpanHelper(795)*

| 序号 | 方法                   | 功能 |
|:-----|:-----------------------|:----|
| 01   | 01. builderSpan        | 功能 |
| 02   | 02. setFlag            | 功能 |
| 03   | 03. setForegroundColor | 功能 |
| 04   | 04. setBackgroundColor | 功能 |
| 05   | 05. ALIGN_BOTTOM       | 功能 |
| 06   | 06. ALIGN_BASELINE     | 功能 |
| 07   | 07. ALIGN_CENTER       | 功能 |
| 08   | 08. ALIGN_TOP          | 功能 |
| 09   | 09. setLineHeight      | 功能 |
| 10   | 10. setQuoteColor      | 功能 |
| 11   | 11. setMargin          | 功能 |
| 12   | 12. setLeadingMargin   | 功能 |
| 13   | 13. setBullet          | 功能 |
| 14   | 14. setFontSize        | 功能 |
| 15   | 15. setFontProportion  | 功能 |
| 16   | 16. setFontXProportion | 功能 |
| 17   | 17. setStrikeThrough   | 功能 |
| 18   | 18. setUnderline       | 功能 |
| 19   | 19. setSuperscript     | 功能 |
| 20   | 20. setSubscript       | 功能 |
| 21   | 21. setBold            | 功能 |
| 22   | 22. setItalic          | 功能 |
| 23   | 23. setBoldItalic      | 功能 |
| 24   | 24. setFontFamily      | 功能 |
| 25   | 25. setTypeface        | 功能 |
| 26   | 26. setHorizontalAlign | 功能 |
| 27   | 27. setVerticalAlign   | 功能 |
| 28   | 28. setClickSpan       | 功能 |
| 29   | 29. setUrl             | 功能 |
| 30   | 30. setBlur            | 功能 |
| 31   | 31. setShader          | 功能 |
| 32   | 32. setShadow          | 功能 |
| 33   | 33. setSpans           | 功能 |
| 34   | 34. append             | 功能 |
| 35   | 35. appendLine         | 功能 |
| 36   | 36. appendImage        | 功能 |
| 37   | 37. appendSpace        | 功能 |
| 38   | 38. create             | 功能 |

### *060.文本TextHelper(444)*

| 序号 | 方法                      | 功能 |
|:-----|:--------------------------|:----|
| 01   | 01. string2Unicode        | 功能 |
| 02   | 02. string2Ascii          | 功能 |
| 03   | 03. string2Dbc            | 功能 |
| 04   | 04. string2Sbc            | 功能 |
| 05   | 05. reverseStr            | 功能 |
| 06   | 06. underLine2Camel       | 功能 |
| 07   | 07. camel2UnderLine       | 功能 |
| 08   | 08. upperFirstLetter      | 功能 |
| 09   | 09. lowerFirstLetter      | 功能 |
| 10   | 10. getPyFirstLetters     | 功能 |
| 11   | 11. allGb2Py              | 功能 |
| 12   | 12. oneGb2Py              | 功能 |
| 13   | 13. oneGb2Ascii           | 功能 |
| 14   | 14. getSurnameFirstLetter | 功能 |
| 15   | 15. surname2Py            | 功能 |

### *061.随机RandomHelper(78)*

| 序号 | 方法                           | 功能 |
|:-----|:-------------------------------|:----|
| 01   | 01. getRandomNumbersAndLetters | 功能 |
| 02   | 02. getRandomNumbers           | 功能 |
| 03   | 03. getRandomLetters           | 功能 |
| 04   | 04. getRandomCapitalLetters    | 功能 |
| 05   | 05. getRandomLowerCaseLetters  | 功能 |
| 06   | 06. getRandom                  | 功能 |
| 07   | 07. randomColor                | 功能 |
| 08   | 08. shuffle                    | 功能 |

### *062.验证ValidationHelper(280)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. cutStringFromChar   | 功能 |
| 02   | 02. cutString           | 功能 |
| 03   | 03. getStringLength     | 功能 |
| 04   | 04. getReplaceFirst     | 功能 |
| 05   | 05. getReplaceAll       | 功能 |
| 06   | 06. getSplits           | 功能 |
| 07   | 07. getMatches          | 功能 |
| 08   | 08. isMatch             | 功能 |
| 09   | 09. isDigit             | 功能 |
| 10   | 10. isPositiveDigit     | 功能 |
| 11   | 11. isNegativeDigit     | 功能 |
| 12   | 12. isNotNegativeDigit  | 功能 |
| 13   | 13. isNotPositiveDigit  | 功能 |
| 14   | 14. isDecimals          | 功能 |
| 15   | 15. isPositiveDecimals  | 功能 |
| 16   | 16. isNegativeDecimals  | 功能 |
| 17   | 17. isNotZeroNumeric    | 功能 |
| 18   | 18. isNumeric           | 功能 |
| 19   | 19. isBlankLine         | 功能 |
| 20   | 20. isUpLetter          | 功能 |
| 21   | 21. isLowLetter         | 功能 |
| 22   | 22. isLetter            | 功能 |
| 23   | 23. isChinese           | 功能 |
| 24   | 24. isDoubleByteChar    | 功能 |
| 25   | 25. hasSpecialCharacter | 功能 |
| 26   | 26. isBirthday          | 功能 |
| 27   | 27. isDate              | 功能 |
| 28   | 28. isPay               | 功能 |
| 29   | 29. isBankNo            | 功能 |
| 30   | 30. isQqNo              | 功能 |
| 31   | 31. isVehicleNo         | 功能 |
| 32   | 32. isOneCode           | 功能 |
| 33   | 33. isPostalCode        | 功能 |
| 34   | 34. isChinaPostalCode   | 功能 |
| 35   | 35. hasChinaPostalCode  | 功能 |
| 36   | 36. isEmail             | 功能 |
| 37   | 37. isSimplePhone       | 功能 |
| 38   | 38. isExactPhone        | 功能 |
| 39   | 39. isChinaPlane        | 功能 |
| 40   | 40. isGlobalPlane       | 功能 |
| 41   | 41. isIpAddress         | 功能 |
| 42   | 42. isUrl               | 功能 |
| 43   | 43. isUserName          | 功能 |
| 44   | 44. isRealName          | 功能 |
| 45   | 45. isPassword          | 功能 |
| 46   | 46. isCss               | 功能 |
| 47   | 47. isHtmlTag           | 功能 |
| 48   | 48. isHtmlNotes         | 功能 |
| 49   | 49. isHtmlHyperLink     | 功能 |
| 50   | 50. isHtmlImage         | 功能 |
| 51   | 51. isHtmlColor         | 功能 |
| 52   | 52. isHtmlRoute         | 功能 |
| 53   | 53. isUrlInText         | 功能 |
| 54   | 54. isHttpOrHttps       | 功能 |
| 55   | 55. isIpV4              | 功能 |
| 56   | 56. isIpV6              | 功能 |
| 57   | 57. isIeVersion         | 功能 |
| 58   | 58. isIntStr            | 功能 |
| 59   | 59. isDoubleTwoUp       | 功能 |
| 60   | 60. isContinuousNo      | 功能 |
| 61   | 61. isContinuousWord    | 功能 |
| 62   | 62. isPeculiarStr       | 功能 |
| 63   | 63. isNumberLetter      | 功能 |
| 64   | 64. isContainChinese    | 功能 |
| 65   | 65. lengthChinese       | 功能 |
| 66   | 66. lengthString        | 功能 |
| 67   | 67. lengthCharStringSub | 功能 |
| 68   | 68. uuid                | 功能 |

>1. [常用正则表达式测试](http://tool.oschina.net/regex)
>2. [常用正则表达式大全](http://toutiao.com/i6231678548520731137)
>3. [最新手机号码、电话号码正则表达式](http://caibaojian.com/regexp-example.html)

### *063.身份IdHelper(396)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. isIdCard15          | 功能 |
| 02   | 02. isIdCard18          | 功能 |
| 03   | 03. isIdCard            | 功能 |
| 04   | 04. isIdCardExact       | 功能 |
| 05   | 05. validateCard        | 功能 |
| 06   | 06. cnCityCode          | 功能 |
| 07   | 07. validateIdCard18    | 功能 |
| 08   | 08. validateIdCard15    | 功能 |
| 09   | 09. card15ToCard18      | 功能 |
| 10   | 10. getProvinceByIdCard | 功能 |
| 11   | 11. getBirthdayByIdCard | 功能 |
| 12   | 12. getBirthByIdCard    | 功能 |
| 13   | 13. getAgeByIdCard      | 功能 |
| 14   | 14. getYearByIdCard     | 功能 |
| 15   | 15. getMonthByIdCard    | 功能 |
| 16   | 16. getDateByIdCard     | 功能 |
| 17   | 17. getGenderByIdCard   | 功能 |
| 18   | 18. cnMinority          | 功能 |
| 19   | 19. validateIdCard10    | 功能 |
| 20   | 20. hkFirstCode         | 功能 |
| 21   | 21. validateHKCard      | 功能 |
| 22   | 22. twFirstCode         | 功能 |
| 23   | 23. validateTWCard      | 功能 |

### *064.银行BankHelper(1720)*

| 序号 | 方法                     | 功能 |
|:-----|:-------------------------|:----|
| 01   | 01. getNameOfBank        | 功能 |
| 02   | 02. checkBankCard        | 功能 |
| 03   | 03. getBankCardCheckCode | 功能 |

### *065.图码BarQRHelper(149)*

| 序号 | 方法                 | 功能 |
|:-----|:---------------------|:----|
| 01   | 01. decodeFromBitmap | 功能 |
| 02   | 02. builderBarCode   | 功能 |
| 03   | 03. createBarCode    | 功能 |
| 04   | 04. builderQRCode    | 功能 |
| 05   | 05. createQRCode     | 功能 |

>- implementation "com.google.zxing:core:3.4.1"

### *066.软包PackageHelper(18)*

| 序号 | 方法                        | 功能 |
|:-----|:----------------------------|:----|
| 01   | 01. isExistPackageName      | 功能 |
| 02   | 02. getInstalledPackageInfo | 功能 |

### *067.编码EncodeHelper(115)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. base64Encode2String | 功能 |
| 02   | 02. base64EncodeUrlSafe | 功能 |
| 03   | 03. base64Encode        | 功能 |
| 04   | 04. base64Decode        | 功能 |
| 05   | 05. binEncode           | 功能 |
| 06   | 06. binDecode           | 功能 |
| 07   | 07. urlEncode           | 功能 |
| 08   | 08. urlDecode           | 功能 |
| 09   | 09. htmlEncode          | 功能 |
| 10   | 10. htmlDecode          | 功能 |

### *068.加密EncryptHelper(510)*

| 序号 | 方法                           | 功能 |
|:-----|:-------------------------------|:----|
| 01   | 01. xorEncode                  | 功能 |
| 02   | 02. xorDecode                  | 功能 |
| 03   | 03. checkMD2                   | 功能 |
| 04   | 04. encryptMD2ToString         | 功能 |
| 05   | 05. encryptMD2                 | 功能 |
| 06   | 06. checkMD5                   | 功能 |
| 07   | 07. encryptMD5ToString         | 功能 |
| 08   | 08. encryptMD5                 | 功能 |
| 09   | 09. encryptMD5ToStringWithSalt | 功能 |
| 10   | 10. checkSHA1                  | 功能 |
| 11   | 11. encryptSHA1ToString        | 功能 |
| 12   | 12. encryptSHA1                | 功能 |
| 13   | 13. checkSHA224                | 功能 |
| 14   | 14. encryptSHA224ToString      | 功能 |
| 15   | 15. encryptSHA224              | 功能 |
| 16   | 16. checkSHA256                | 功能 |
| 17   | 17. encryptSHA256ToString      | 功能 |
| 18   | 18. encryptSHA256              | 功能 |
| 19   | 19. checkSHA384                | 功能 |
| 20   | 20. encryptSHA384ToString      | 功能 |
| 21   | 21. encryptSHA384              | 功能 |
| 22   | 22. checkSHA512                | 功能 |
| 23   | 23. encryptSHA512ToString      | 功能 |
| 24   | 24. encryptSHA512              | 功能 |
| 25   | 25. checkHmacMD5               | 功能 |
| 26   | 26. encryptHmacMD5ToString     | 功能 |
| 27   | 27. encryptHmacMD5             | 功能 |
| 28   | 28. checkHmacSHA1              | 功能 |
| 29   | 29. encryptHmacSHA1ToString    | 功能 |
| 30   | 30. encryptHmacSHA1            | 功能 |
| 31   | 31. checkHmacSHA224            | 功能 |
| 32   | 32. encryptHmacSHA224ToString  | 功能 |
| 33   | 33. encryptHmacSHA224          | 功能 |
| 34   | 34. checkHmacSHA256            | 功能 |
| 35   | 35. encryptHmacSHA256ToString  | 功能 |
| 36   | 36. encryptHmacSHA256          | 功能 |
| 37   | 37. checkHmacSHA384            | 功能 |
| 38   | 38. encryptHmacSHA384ToString  | 功能 |
| 39   | 39. encryptHmacSHA384          | 功能 |
| 40   | 40. checkHmacSHA512            | 功能 |
| 41   | 41. encryptHmacSHA512ToString  | 功能 |
| 42   | 42. encryptHmacSHA512          | 功能 |
| 43   | 43. checkFile                  | 功能 |
| 44   | 44. encryptFile2String         | 功能 |
| 45   | 45. encryptFile                | 功能 |
| 46   | 46. initKeyDES                 | 功能 |
| 47   | 47. encryptDES2Base64          | 功能 |
| 48   | 48. encryptDES2HexString       | 功能 |
| 49   | 49. encryptDES                 | 功能 |
| 50   | 50. decryptDES4Base64          | 功能 |
| 51   | 51. decryptDES4HexString       | 功能 |
| 52   | 52. decryptDES                 | 功能 |
| 53   | 53. initKey3DES                | 功能 |
| 54   | 54. encrypt3DES2Base64         | 功能 |
| 55   | 55. encrypt3DES2HexString      | 功能 |
| 56   | 56. encrypt3DES                | 功能 |
| 57   | 57. decrypt3DES4Base64         | 功能 |
| 58   | 58. decrypt3DES4HexString      | 功能 |
| 59   | 59. decrypt3DES                | 功能 |
| 60   | 60. initKeyAES                 | 功能 |
| 61   | 61. encryptAES2Base64          | 功能 |
| 62   | 62. encryptAES2HexString       | 功能 |
| 63   | 63. encryptAES                 | 功能 |
| 64   | 64. decryptAES4Base64          | 功能 |
| 65   | 65. decryptAES4HexString       | 功能 |
| 66   | 66. decryptAES                 | 功能 |
| 67   | 67. AES_Transformation         | 功能 |
| 68   | 68. DES_Transformation         | 功能 |
| 69   | 69. TripleDES_Transformation   | 功能 |
| 70   | 70. initKeyRSA                 | 功能 |
| 71   | 71. encryptRSA2Base64          | 功能 |
| 72   | 72. encryptRSA2HexString       | 功能 |
| 73   | 73. encryptRSA                 | 功能 |
| 74   | 74. decryptRSA4Base64          | 功能 |
| 75   | 75. decryptRSA4HexString       | 功能 |
| 76   | 76. decryptRSA                 | 功能 |

### *069.位算BitHelper(35)*

| 序号 | 方法                | 功能 |
|:-----|:--------------------|:----|
| 01   | 01. checkBitValue   | 功能 |
| 02   | 02. getBitValue     | 功能 |
| 03   | 03. reverseBitValue | 功能 |
| 04   | 04. setBitValue     | 功能 |

### *070.压缩CompressHelper(92)*

| 序号 | 方法           | 功能 |
|:-----|:---------------|:----|
| 01   | 01. compress   | 功能 |
| 02   | 02. decompress | 功能 |

### *071.平面PlaneHelper(15)*

| 序号 | 方法               | 功能 |
|:-----|:-------------------|:----|
| 01   | 01. pointToDegrees | 功能 |
| 02   | 02. distance       | 功能 |
| 03   | 03. checkInRound   | 功能 |

### *072.计算CalculateHelper(222)*

| 序号 | 方法                  | 功能 |
|:-----|:----------------------|:----|
| 01   | 01. add               | 功能 |
| 02   | 02. subtract          | 功能 |
| 03   | 03. multiply          | 功能 |
| 04   | 04. divide            | 功能 |
| 05   | 05. remainder         | 功能 |
| 06   | 06. round             | 功能 |
| 07   | 07. compareBigDecimal | 功能 |
| 08   | 08. formatMoney       | 功能 |
| 09   | 09. adjustDouble      | 功能 |

### *073.尺寸DensityHelper(58)*

| 序号 | 方法                  | 功能 |
|:-----|:----------------------|:----|
| 01   | 01. dip2px            | 功能 |
| 02   | 02. sp2px             | 功能 |
| 03   | 03. value2px          | 功能 |
| 04   | 04. px2dip            | 功能 |
| 05   | 05. px2sp             | 功能 |
| 06   | 06. px2value          | 功能 |
| 07   | 07. OnGetSizeListener | 功能 |
| 08   | 08. forceGetViewSize  | 功能 |
| 09   | 09. getViewWidth      | 功能 |
| 10   | 10. getViewHeight     | 功能 |
| 11   | 11. measureView       | 功能 |

### *074.坐标CoordinateHelper(94)*

| 序号 | 方法             | 功能 |
|:-----|:-----------------|:----|
| 01   | 01. bd09ToWgs84  | 功能 |
| 02   | 02. bd09ToGcj02  | 功能 |
| 03   | 03. gcj02ToWgs84 | 功能 |
| 04   | 04. outOfChina   | 功能 |
| 05   | 05. transformLng | 功能 |
| 06   | 06. transformLat | 功能 |
| 07   | 07. transform    | 功能 |
| 08   | 08. wgs84ToBd09  | 功能 |
| 09   | 09. wgs84ToGcj02 | 功能 |
| 10   | 10. gcj02ToBd09  | 功能 |

### *075.转换ConvertHelper(520)*

| 序号 | 方法                        | 功能 |
|:-----|:----------------------------|:----|
| 01   | 01. BYTE                    | 功能 |
| 02   | 02. KB                      | 功能 |
| 03   | 03. MB                      | 功能 |
| 04   | 04. GB                      | 功能 |
| 05   | 05. MemoryUnit              | 功能 |
| 06   | 06. memorySize2ByteSize     | 功能 |
| 07   | 07. byteSize2MemorySize     | 功能 |
| 08   | 08. byteSize2MemorySizeFit  | 功能 |
| 09   | 09. byteSize2MemorySizeDesc | 功能 |
| 10   | 10. MSEC                    | 功能 |
| 11   | 11. SEC                     | 功能 |
| 12   | 12. MIN                     | 功能 |
| 13   | 13. HOUR                    | 功能 |
| 14   | 14. DAY                     | 功能 |
| 15   | 15. TimeUnit                | 功能 |
| 16   | 16. timeSpan2Millis         | 功能 |
| 17   | 17. millis2TimeSpan         | 功能 |
| 18   | 18. millis2TimeSpanFit      | 功能 |
| 19   | 19. millis2TimeSpanFitByNow | 功能 |
| 20   | 20. timeZonePhone           | 功能 |
| 21   | 21. timeZoneBeijing         | 功能 |
| 22   | 22. phoneTime2BeijingTime   | 功能 |
| 23   | 23. beijingTime2PhoneTime   | 功能 |
| 24   | 24. changeTimeZone          | 功能 |
| 25   | 25. millis2Date             | 功能 |
| 26   | 26. date2Millis             | 功能 |
| 27   | 27. millis2String           | 功能 |
| 28   | 28. string2Millis           | 功能 |
| 29   | 29. date2String             | 功能 |
| 30   | 30. string2Date             | 功能 |
| 31   | 31. bytes2Chars             | 功能 |
| 32   | 32. chars2Bytes             | 功能 |
| 33   | 33. bytes2Bits              | 功能 |
| 34   | 34. bits2Bytes              | 功能 |
| 35   | 35. hexDigitsLower          | 功能 |
| 36   | 36. hexDigitsUpper          | 功能 |
| 37   | 37. bytes2HexStringIsUpper  | 功能 |
| 38   | 38. bytes2HexString         | 功能 |
| 39   | 39. hexString2Bytes         | 功能 |
| 40   | 40. hex2Int                 | 功能 |
| 41   | 41. outputStream2String     | 功能 |
| 42   | 42. outputStream2Bytes      | 功能 |
| 43   | 43. string2OutputStream     | 功能 |
| 44   | 44. bytes2OutputStream      | 功能 |
| 45   | 45. inputStream2String      | 功能 |
| 46   | 46. inputStream2Bytes       | 功能 |
| 47   | 47. bytes2InputStream       | 功能 |
| 48   | 48. input2OutputStream      | 功能 |
| 49   | 49. output2InputStream      | 功能 |
| 50   | 50. string2InputStream      | 功能 |
| 51   | 51. drawable2Bytes          | 功能 |
| 52   | 52. bitmap2Bytes            | 功能 |
| 53   | 53. drawable2Bitmap         | 功能 |
| 54   | 54. bytes2Drawable          | 功能 |
| 55   | 55. bitmap2Drawable         | 功能 |
| 56   | 56. bytes2Bitmap            | 功能 |
| 57   | 57. nullOfString            | 功能 |
| 58   | 58. saveDecimals            | 功能 |
| 59   | 59. int2Bytes               | 功能 |
| 60   | 60. bytes2Int               | 功能 |
| 61   | 61. ip2Long                 | 功能 |
| 62   | 62. string2Byte             | 功能 |
| 63   | 63. string2Short            | 功能 |
| 64   | 64. string2Int              | 功能 |
| 65   | 65. string2Long             | 功能 |
| 66   | 66. string2Float            | 功能 |
| 67   | 67. string2Double           | 功能 |
| 68   | 68. string2Boolean          | 功能 |
| 69   | 69. double2Int              | 功能 |
| 70   | 70. double2Long             | 功能 |
| 71   | 71. long2Int                | 功能 |
| 72   | 72. long2Double             | 功能 |
| 73   | 73. char2Int                | 功能 |

### *076.迁移MigrationHelper(97)*

| 序号 | 方法        | 功能 |
|:-----|:------------|:----|
| 01   | 01. isDebug | 功能 |
| 02   | 02. migrate | 功能 |

>- implementation "org.greenrobot:greendao:3.2.2"

### *077.数库DbHelper(35)*

| 序号 | 方法                | 功能              |
|:-----|:--------------------|:-----------------|
| 01   | 01. sqlInjection    | 防止数据注入      |
| 02   | 02. exportDb2SdCard | 导出数据库到存储卡 |

### *078.文件FileHelper(914)*

| 序号 | 方法                          | 功能 |
|:-----|:------------------------------|:----|
| 01   | 01. zip                       | 功能 |
| 02   | 02. unzip                     | 功能 |
| 03   | 03. bitmap2JpegFile           | 功能 |
| 04   | 04. bitmap2PngFile            | 功能 |
| 05   | 05. encodeFile2Base64String   | 功能 |
| 06   | 06. decoderBase64String2File  | 功能 |
| 07   | 07. pathCacheImageAppIcon     | 功能 |
| 08   | 08. pathCacheImageMainGallery | 功能 |
| 09   | 09. pathCacheImageBrowse      | 功能 |
| 10   | 10. pathCacheImageChooseHead  | 功能 |
| 11   | 11. pathCacheImage            | 功能 |
| 12   | 12. getCacheSdCard            | 功能 |
| 13   | 13. getFileByPath             | 功能 |
| 14   | 14. isExistsTimestamp         | 功能 |
| 15   | 15. isExistDirSdCard          | 功能 |
| 16   | 16. isExistsDir               | 功能 |
| 17   | 17. isExistFileSdCard         | 功能 |
| 18   | 18. isExistsFile              | 功能 |
| 19   | 19. pathRootData              | 功能 |
| 20   | 20. createRootData            | 功能 |
| 21   | 21. pathAppData               | 功能 |
| 22   | 22. createAppData             | 功能 |
| 23   | 23. pathAppFiles              | 功能 |
| 24   | 24. createAppFiles            | 功能 |
| 25   | 25. pathAppCache              | 功能 |
| 26   | 26. createAppCache            | 功能 |
| 27   | 27. createDirSdCard           | 功能 |
| 28   | 28. createDirNone             | 功能 |
| 29   | 29. createDirNew              | 功能 |
| 30   | 30. createFileSdCard          | 功能 |
| 31   | 31. createFileNone            | 功能 |
| 32   | 32. createFileNew             | 功能 |
| 33   | 33. cutDir                    | 功能 |
| 34   | 34. copyDir                   | 功能 |
| 35   | 35. cutFile                   | 功能 |
| 36   | 36. copyFile                  | 功能 |
| 37   | 37. cut                       | 功能 |
| 38   | 38. copy                      | 功能 |
| 39   | 39. mergeFiles                | 功能 |
| 40   | 40. shareFile                 | 功能 |
| 41   | 41. downloadFile              | 功能 |
| 42   | 42. DownloadService           | 功能 |
| 43   | 43. upgradeApp                | 功能 |
| 44   | 44. delete                    | 功能 |
| 45   | 45. deleteDir                 | 功能 |
| 46   | 46. deleteFile                | 功能 |
| 47   | 47. deleteFiles               | 功能 |
| 48   | 48. deleteFilesByFilter       | 功能 |
| 49   | 49. listFilesInDirWithFilter  | 功能 |
| 50   | 50. getFileLastModified       | 功能 |
| 51   | 51. getFileCharset            | 功能 |
| 52   | 52. getFileLines              | 功能 |
| 53   | 53. allSizeInternal           | 功能 |
| 54   | 54. allSizeExternal           | 功能 |
| 55   | 55. getAllSize                | 功能 |
| 56   | 56. availableSizeInternal     | 功能 |
| 57   | 57. availableSizeExternal     | 功能 |
| 58   | 58. getAvailableSize          | 功能 |
| 59   | 59. freeSizeInternal          | 功能 |
| 60   | 60. freeSizeExternal          | 功能 |
| 61   | 61. getFreeSize               | 功能 |
| 62   | 62. getDirsSizeFit            | 功能 |
| 63   | 63. getDirsSize               | 功能 |
| 64   | 64. getDirSizeFit             | 功能 |
| 65   | 65. getDirSize                | 功能 |
| 66   | 66. getFileSizeFit            | 功能 |
| 67   | 67. getFileSize               | 功能 |
| 68   | 68. getDirName                | 功能 |
| 69   | 69. getFileName               | 功能 |
| 70   | 70. getFileNoExtension        | 功能 |
| 71   | 71. getFileExtension          | 功能 |
| 72   | 72. getFileIntent             | 功能 |
| 73   | 73. getNativeM3u8             | 功能 |
| 74   | 74. getFileUri                | 功能 |
| 75   | 75. getImageContentUri        | 功能 |
| 76   | 76. getFileFromUri            | 功能 |
| 77   | 77. getPathFromUri            | 功能 |
| 78   | 78. isExternalStorageDocument | 功能 |
| 79   | 79. isDownloadsDocument       | 功能 |
| 80   | 80. isMediaDocument           | 功能 |
| 81   | 81. isGooglePhotosUri         | 功能 |
| 82   | 82. getDataColumn             | 功能 |
| 83   | 83. rename                    | 功能 |

### *079.存取FileIoHelper(366)*

| 序号 | 方法                            | 功能 |
|:-----|:--------------------------------|:----|
| 01   | 01. writeFileFromIS             | 功能 |
| 02   | 02. writeFileFromString         | 功能 |
| 03   | 03. writeAppFileFormBytes       | 功能 |
| 04   | 04. writeFileFromBytesByStream  | 功能 |
| 05   | 05. writeFileFromBytesByChannel | 功能 |
| 06   | 06. writeFileFromBytesByMap     | 功能 |
| 07   | 07. readFile2List               | 功能 |
| 08   | 08. readFile2StringByLine       | 功能 |
| 09   | 09. readFile2StringByBytes      | 功能 |
| 10   | 10. readFile2BytesByStream      | 功能 |
| 11   | 11. readFile2BytesByChannel     | 功能 |
| 12   | 12. readFile2BytesByMap         | 功能 |

### *080.压制ZipHelper(336)*

| 序号 | 方法                  | 功能 |
|:-----|:----------------------|:----|
| 01   | 01. zipFiles          | 功能 |
| 02   | 02. zipFile           | 功能 |
| 03   | 03. ZipListener       | 功能 |
| 04   | 04. isStopZip         | 功能 |
| 05   | 05. fileToZip         | 功能 |
| 06   | 06. unzipSelectedFile | 功能 |
| 07   | 07. unzipOneFile      | 功能 |
| 08   | 08. getFilesPath      | 功能 |
| 09   | 09. getComments       | 功能 |
| 10   | 10. getEntries        | 功能 |

### *081.密压ZipPlusHelper(320)*

| 序号 | 方法                        | 功能 |
|:-----|:----------------------------|:----|
| 01   | 01. zipEncrypt              | 功能 |
| 02   | 02. zipEncryptRargo         | 功能 |
| 03   | 03. zipInfo                 | 功能 |
| 04   | 04. unzipFilesByKeyword     | 功能 |
| 05   | 05. unzipFileByKeyword      | 功能 |
| 06   | 06. unzipFile               | 功能 |
| 07   | 07. unzipFileWithMonitor    | 功能 |
| 08   | 08. removeDirFromZipArchive | 功能 |

>- implementation "net.lingala.zip4j:zip4j:2.6.3"

### *082.打开OpenHelper(102)*

| 序号 | 方法                           | 功能 |
|:-----|:-------------------------------|:----|
| 01   | 01. openInputStreamByUrlString | 功能 |
| 02   | 02. openWebSite                | 功能 |
| 03   | 03. openImage                  | 功能 |
| 04   | 04. openVideo                  | 功能 |
| 05   | 05. openPdfFile                | 功能 |
| 06   | 06. openWordFile               | 功能 |
| 07   | 07. openOfficeFileByWps        | 功能 |

### *083.图像ImageHelper(1298)*

| 序号 | 方法                        | 功能 |
|:-----|:----------------------------|:----|
| 01   | 01. makeKey                 | 功能 |
| 02   | 02. isSameKey               | 功能 |
| 03   | 03. crc64Long               | 功能 |
| 04   | 04. getColorByInt           | 功能 |
| 05   | 05. getColorHexString       | 功能 |
| 06   | 06. getAlphaPercent         | 功能 |
| 07   | 07. setColorAlphaByInt      | 功能 |
| 08   | 08. setColorAlphaByFloat    | 功能 |
| 09   | 09. getColorLightness       | 功能 |
| 10   | 10. setColorLightness       | 功能 |
| 11   | 11. getDrawableFromMap      | 功能 |
| 12   | 12. getBitmapFromMap        | 功能 |
| 13   | 13. recycleBitmaps          | 功能 |
| 14   | 14. getBitmapFromLocalOrNet | 功能 |
| 15   | 15. getPicPathFromUri       | 功能 |
| 16   | 16. getBitmap               | 功能 |
| 17   | 17. drawNinePatch           | 功能 |
| 18   | 18. drawColor               | 功能 |
| 19   | 19. getDropShadow           | 功能 |
| 20   | 20. toClip                  | 功能 |
| 21   | 21. toSkew                  | 功能 |
| 22   | 22. toRotate                | 功能 |
| 23   | 23. getRotateDegree         | 功能 |
| 24   | 24. toRound                 | 功能 |
| 25   | 25. toRoundCorner           | 功能 |
| 26   | 26. addBorder               | 功能 |
| 27   | 27. addReflection           | 功能 |
| 28   | 28. createTextImage         | 功能 |
| 29   | 29. addTextWatermark        | 功能 |
| 30   | 30. addImageWatermark       | 功能 |
| 31   | 31. toAlpha                 | 功能 |
| 32   | 32. setAlpha                | 功能 |
| 33   | 33. toGray                  | 功能 |
| 34   | 34. toGrey                  | 功能 |
| 35   | 35. grayMasking             | 功能 |
| 36   | 36. fastBlur                | 功能 |
| 37   | 37. renderScriptBlur        | 功能 |
| 38   | 38. stackBlur               | 功能 |
| 39   | 39. BoxBlurFilter           | 功能 |
| 40   | 40. blur                    | 功能 |
| 41   | 41. clamp                   | 功能 |
| 42   | 42. saveImage               | 功能 |
| 43   | 43. isImage                 | 功能 |
| 44   | 44. getImageType            | 功能 |
| 45   | 45. getImageFormat          | 功能 |
| 46   | 46. getThumbVideo           | 功能 |
| 47   | 47. getThumbBitmap          | 功能 |
| 48   | 48. compressByScale         | 功能 |
| 49   | 49. compressByQuality       | 功能 |
| 50   | 50. compressBySampleSize    | 功能 |
| 51   | 51. calculateInSampleSize   | 功能 |
| 52   | 52. getBitmapSize           | 功能 |

### *084.照片PhotoHelper(125)*

| 序号 | 方法                 | 功能 |
|:-----|:---------------------|:----|
| 01   | 01. openGalleryMedia | 功能 |
| 02   | 02. openGalleryImage | 功能 |
| 03   | 03. openCameraImage  | 功能 |
| 04   | 04. cropImage        | 功能 |
| 05   | 05. getCropIntent    | 功能 |

### *085.图片PictureHelper(43)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. getChoosedImagePath | 功能 |
| 02   | 02. getChoosedImage     | 功能 |
| 03   | 03. getTakePictureFile  | 功能 |

### *086.动画AnimationHelper(209)*

| 序号 | 方法                       | 功能 |
|:-----|:---------------------------|:----|
| 01   | 01. isRunning              | 功能 |
| 02   | 02. isStarted              | 功能 |
| 03   | 03. start                  | 功能 |
| 04   | 04. stop                   | 功能 |
| 05   | 05. popupAppear            | 功能 |
| 06   | 06. popupDisappear         | 功能 |
| 07   | 07. animationCardFlip      | 功能 |
| 08   | 08. animationZoomIn        | 功能 |
| 09   | 09. animationZoomOut       | 功能 |
| 10   | 10. ScaleUpDown            | 功能 |
| 11   | 11. animateHeight          | 功能 |
| 12   | 12. OnDoIntListener        | 功能 |
| 13   | 13. animationColorGradient | 功能 |
| 14   | 14. addTouchDark           | 功能 |
| 15   | 15. addTouchLight          | 功能 |

### *087.信息ExifHelper(41)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. writeLatLonIntoJpeg | 功能 |

### *088.属性PropertiesHelper(40)*

| 序号 | 方法                 | 功能 |
|:-----|:---------------------|:----|
| 01   | 01. propertiesAll    | 功能 |
| 02   | 02. getPropertyByKey | 功能 |
| 03   | 03. init             | 功能 |

### *089.记录LoggerHelper(84)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. loggerTag           | 功能 |
| 02   | 02. getLogger           | 功能 |
| 03   | 03. verbose             | 功能 |
| 04   | 04. debug               | 功能 |
| 05   | 05. info                | 功能 |
| 06   | 06. warn                | 功能 |
| 07   | 07. error               | 功能 |
| 08   | 08. wtf                 | 功能 |
| 09   | 09. getStackTraceString | 功能 |

### *090.日志LogHelper(681)*

| 序号 | 方法           | 功能 |
|:-----|:---------------|:----|
| 01   | 01. IFormatter | 功能 |
| 02   | 02. config     | 功能 |
| 03   | 03. v          | 功能 |
| 04   | 04. d          | 功能 |
| 05   | 05. i          | 功能 |
| 06   | 06. w          | 功能 |
| 07   | 07. e          | 功能 |
| 08   | 08. a          | 功能 |
| 09   | 09. vTag       | 功能 |
| 10   | 10. dTag       | 功能 |
| 11   | 11. iTag       | 功能 |
| 12   | 12. wTag       | 功能 |
| 13   | 13. eTag       | 功能 |
| 14   | 14. aTag       | 功能 |
| 15   | 15. file       | 功能 |
| 16   | 16. json       | 功能 |
| 17   | 17. xml        | 功能 |

>- implementation "com.google.code.gson:gson:2.8.6"

### *091.数据DataHelper(146)*

| 序号 | 方法                      | 功能 |
|:-----|:--------------------------|:----|
| 01   | 01. . toDoubleWithDefault | 功能 |
| 02   | 02. isNumberByAny         | 功能 |
| 03   | 03. isIntegerByAny        | 功能 |
| 04   | 04. isDecimalByAny        | 功能 |
| 05   | 05. isNullOrEmpty         | 功能 |
| 06   | 06. compileRegex          | 功能 |
| 07   | 07. toIntWithDefault      | 功能 |
| 08   | 08. toLongWithDefault     | 功能 |
| 09   | 09. toStringWithDefault   | 功能 |
| 10   | 10. isTrue                | 功能 |
| 11   | 11. isFalse               | 功能 |
| 12   | 12. isBoolean             | 功能 |
| 13   | 13. fitDistance           | 功能 |
| 14   | 14. hideMobileMid         | 功能 |
| 15   | 15. hideId18Mid           | 功能 |
| 16   | 16. hideBankMid           | 功能 |
| 17   | 17. hideBankLeft          | 功能 |
| 18   | 18. formatDefault         | 功能 |
| 19   | 19. formatZero            | 功能 |
| 20   | 20. formatTwo             | 功能 |
| 21   | 21. formatPercent         | 功能 |
| 22   | 22. formatE               | 功能 |
| 23   | 23. formatSplit           | 功能 |
| 24   | 24. formatAdd             | 功能 |
| 25   | 25. formatAmount          | 功能 |
| 26   | 26. string2Ints           | 功能 |
| 27   | 27. getPercentValue       | 功能 |
| 28   | 28. getRoundUp            | 功能 |

### *092.解析JsonHelper(273)*

| 序号 | 方法                     | 功能 |
|:-----|:-------------------------|:----|
| 01   | 01. getInt               | 功能 |
| 02   | 02. getLong              | 功能 |
| 03   | 03. getDouble            | 功能 |
| 04   | 04. getBoolean           | 功能 |
| 05   | 05. getString            | 功能 |
| 06   | 06. getJSONObject        | 功能 |
| 07   | 07. getJSONArray         | 功能 |
| 08   | 08. string2JSONObject    | 功能 |
| 09   | 09. any2JsonArray        | 功能 |
| 10   | 10. collection2JsonArray | 功能 |
| 11   | 11. map2JsonObject       | 功能 |
| 12   | 12. any2json             | 功能 |
| 13   | 13. string2json          | 功能 |
| 14   | 14. array2json           | 功能 |
| 15   | 15. list2json            | 功能 |
| 16   | 16. set2json             | 功能 |
| 17   | 17. map2json             | 功能 |
| 18   | 18. formatJson           | 功能 |

### *093.处理GsonHelper(50)*

| 序号 | 方法             | 功能 |
|:-----|:-----------------|:----|
| 01   | 01. gson         | 功能 |
| 02   | 02. gsonNoNulls  | 功能 |
| 03   | 03. deepClone    | 功能 |
| 04   | 04. toJson       | 功能 |
| 05   | 05. fromJson     | 功能 |
| 06   | 06. getArrayType | 功能 |
| 07   | 07. getListType  | 功能 |
| 08   | 08. getSetType   | 功能 |
| 09   | 09. getMapType   | 功能 |
| 10   | 10. getType      | 功能 |

>- implementation "com.google.code.gson:gson:2.8.6"

### *094.标记XmlParseHelper(138)*

| 序号 | 方法             | 功能 |
|:-----|:-----------------|:----|
| 01   | 01. getXmlList   | 功能 |
| 02   | 02. getXmlObject | 功能 |

### *095.路径PathHelper(178)*

| 序号 | 方法                             | 功能 |
|:-----|:---------------------------------|:----|
| 01   | 01. pathRoot                     | 功能 |
| 02   | 02. pathData                     | 功能 |
| 03   | 03. pathDownloadCache            | 功能 |
| 04   | 04. pathInternalAppData          | 功能 |
| 05   | 05. pathInternalAppCache         | 功能 |
| 06   | 06. pathInternalAppCodeCache     | 功能 |
| 07   | 07. pathInternalAppFiles         | 功能 |
| 08   | 08. pathInternalAppNoBackupFiles | 功能 |
| 09   | 09. pathInternalAppSp            | 功能 |
| 10   | 10. pathInternalAppDbs           | 功能 |
| 11   | 11. getPathInternalAppDb         | 功能 |
| 12   | 12. pathExternal                 | 功能 |
| 13   | 13. pathExternalMusic            | 功能 |
| 14   | 14. pathExternalPodcasts         | 功能 |
| 15   | 15. pathExternalRingtones        | 功能 |
| 16   | 16. pathExternalAlarms           | 功能 |
| 17   | 17. pathExternalNotifications    | 功能 |
| 18   | 18. pathExternalPictures         | 功能 |
| 19   | 19. pathExternalMovies           | 功能 |
| 20   | 20. pathExternalDownload         | 功能 |
| 21   | 21. pathExternalDcim             | 功能 |
| 22   | 22. pathExternalDocuments        | 功能 |
| 23   | 23. pathExternalAppData          | 功能 |
| 24   | 24. pathExternalAppCache         | 功能 |
| 25   | 25. pathExternalAppFiles         | 功能 |
| 26   | 26. pathExternalAppMusic         | 功能 |
| 27   | 27. pathExternalAppPodcasts      | 功能 |
| 28   | 28. pathExternalAppRingtones     | 功能 |
| 29   | 29. pathExternalAppAlarms        | 功能 |
| 30   | 30. pathExternalAppNotifications | 功能 |
| 31   | 31. pathExternalAppPictures      | 功能 |
| 32   | 32. pathExternalAppMovies        | 功能 |
| 33   | 33. pathExternalAppDownload      | 功能 |
| 34   | 34. pathExternalAppDcim          | 功能 |
| 35   | 35. pathExternalAppDocuments     | 功能 |
| 36   | 36. pathExternalAppObb           | 功能 |

### *096.资源ResourceHelper(247)*

| 序号 | 方法                      | 功能                    |
|:-----|:--------------------------|:-----------------------|
| 01   | 01. ID                    | ID                     |
| 02   | 02. LAYOUT                | 布局                   |
| 03   | 03. MENU                  | 目录                   |
| 04   | 04. DRAWABLE              | 可绘制对象              |
| 05   | 05. MIPMAP                | 图片                   |
| 06   | 06. ANIM                  | 动画                   |
| 07   | 07. RAW                   | 原始                   |
| 08   | 08. STYLE                 | 风格                   |
| 09   | 09. STYLEABLE             | 自制控件                |
| 10   | 10. DIMEN                 | 尺寸                   |
| 11   | 11. COLOR                 | 颜色                   |
| 12   | 12. INTEGER               | 数字                   |
| 13   | 13. BOOL                  | 布尔                   |
| 14   | 14. STRING                | 字符串                  |
| 15   | 15. ATTR                  | 数组                   |
| 16   | 16. getColorById          | 通过ID获取颜色          |
| 17   | 17. getDrawableById       | 通过ID获取可绘制对象    |
| 18   | 18. getStringById         | 通过ID获取字符串        |
| 19   | 19. getStringWithArgsById | 通过ID获取系列格式字符串 |
| 20   | 20. getStringArrayById    | 通过ID获取字符串数组    |
| 21   | 21. getResourceId         | 通过ID获取资源          |
| 22   | 22. unZipAssets           | 解压到Assets            |
| 23   | 23. unZipRaw              | 解压到Raw               |
| 24   | 24. copyFileByAssets      | 复制Assets到文件        |
| 25   | 25. copyFileByRaw         | 复制Raw到文件           |
| 26   | 26. getBytesByAssets      | 通过Assets获取字节数组  |
| 27   | 27. getBytesByRaw         | 通过Raw获取字节数组     |
| 28   | 28. getStringByAssets     | 通过Assets获取字符串    |
| 29   | 29. getStringByRaw        | 通过Raw获取字符串       |
| 30   | 30. getListByAssets       | 通过Assets获取列表      |
| 31   | 31. getListByRaw          | 通过Raw获取列表         |

### *097.共享PreferenceHelper(109)*

| 序号 | 方法             | 功能           |
|:-----|:-----------------|:--------------|
| 01   | 01. fileName     | 名称          |
| 02   | 02. all          | 所有值        |
| 03   | 03. putAll       | 批量放入值    |
| 04   | 04. getImage     | 提取图片      |
| 05   | 05. putImage     | 放入图片      |
| 06   | 06. get          | 提取值        |
| 07   | 07. put          | 放入值        |
| 08   | 08. getStringSet | 提取字符串集合 |
| 09   | 09. putStringSet | 放入字符串集合 |
| 10   | 10. contains     | 是否包含值    |
| 11   | 11. remove       | 移除值        |
| 12   | 12. clear        | 清空值        |

### *098.主题ThemeHelper(157)*

| 序号 | 方法                                | 功能                            |
|:-----|:------------------------------------|:--------------------------------|
| 01   | 01. resolveColor                    | 解析颜色                        |
| 02   | 02. resolveDimension                | 解析尺寸                        |
| 03   | 03. resolveBoolean                  | 解析布尔                        |
| 04   | 04. resolveDrawable                 | 解析绘制                        |
| 05   | 05. resolveString                   | 解析字串                        |
| 06   | 06. resolveFloat                    | 解析浮点                        |
| 07   | 07. resolveInt                      | 解析整型                        |
| 08   | 08. getColorFromAttrRes             | 从属性获取颜色                   |
| 09   | 09. resolveActionTextColorStateList | 从颜色数组获取ColorStateList     |
| 10   | 10. getActionTextColorStateList     | 用颜色ID获取ColorStateList跨版本 |
| 11   | 11. getActionTextStateList          | 用颜色ID获取ColorStateList      |
| 12   | 12. getColorArray                   | 获取颜色数组                    |
| 13   | 13. isNightMode                     | 是否深色模式                    |

### *099.消息UiMessageHelper(166)*

| 序号 | 方法                  | 功能           |
|:-----|:----------------------|:--------------|
| 01   | 01. send              | 发送UI消息    |
| 02   | 02. UiMessage         | UI消息        |
| 03   | 03. UiMessageCallback | UI消息回调    |
| 04   | 04. addListener       | 添加UI消息回调 |
| 05   | 05. removeListener    | 移除UI消息回调 |

### *100.日期DateHelper(514)*

| 序号 | 方法                         | 功能                        |
|:-----|:-----------------------------|:---------------------------|
| 001  | 01. timeZoneNameCurrent      | 当前时区                   |
| 002  | 02. createGmtOffsetString    | 创建GMT时区字符串           |
| 003  | 03. sdfDateExcel             | excel格式日期              |
| 004  | 04. sdfDateByFullFileName    | 文件名全格式日期时间        |
| 005  | 05. sdfYear                  | 年格式                     |
| 006  | 06. sdfMonth                 | 月格式                     |
| 007  | 07. sdfDay                   | 日格式                     |
| 008  | 08. sdfHour                  | 时格式                     |
| 009  | 09. sdfMinute                | 分格式                     |
| 010  | 10. sdfSecond                | 秒格式                     |
| 011  | 11. sdfMillisecond           | 毫格式                     |
| 012  | 12. sdfTimeCn                | 中文时间格式                |
| 013  | 13. sdfDateCn                | 中文日期格式                |
| 014  | 14. sdfDateByHourCn          | 中文日期时格式              |
| 015  | 15. sdfDateByMinuteCn        | 中文日期时分格式            |
| 016  | 16. sdfDateByFullCn          | 中文日期时间格式            |
| 017  | 17. sdfDateByAllCn           | 中文日期时间毫格式          |
| 018  | 18. sdfTimeEn                | 英文时间格式                |
| 019  | 19. sdfDateEn                | 英文日期格式                |
| 020  | 20. sdfDateByHourEn          | 英文日期时格式              |
| 021  | 21. sdfDateByMinuteEn        | 英文日期时分格式            |
| 022  | 22. sdfDateByFullEn          | 英文日期时间格式            |
| 023  | 23. sdfDateByAllEn           | 英文日期时间毫格式          |
| 024  | 24. sdfTimeX                 | 时间连续格式                |
| 025  | 25. sdfDateX                 | 日期连续格式                |
| 026  | 26. sdfDateByHourX           | 日期时连续格式              |
| 027  | 27. sdfDateByMinuteX         | 日期时分连续格式            |
| 028  | 28. sdfDateByFullX           | 日期时间连续格式            |
| 029  | 29. sdfDateByAllX            | 日期时间毫连续格式          |
| 030  | 30. nowDateByFullRandom2     | 日期时间连续格式加两位随机   |
| 031  | 31. nowDateByFullRandom4     | 日期时间连续格式加四位随机   |
| 032  | 32. nowDateByFullRandom6     | 日期时间连续格式加六位随机   |
| 033  | 33. nowDateByFullRandom8     | 日期时间连续格式加八位随机   |
| 034  | 34. nowDateByAllRandom2      | 日期时间毫连续格式加八位随机 |
| 035  | 35. nowDateByAllRandom4      | 日期时间毫连续格式加八位随机 |
| 036  | 36. nowDateByAllRandom6      | 日期时间毫连续格式加八位随机 |
| 037  | 37. nowDateByAllRandom8      | 日期时间毫连续格式加八位随机 |
| 038  | 38. calendarToday            | 日历今天                   |
| 039  | 39. calendarTodayNextMonth   | 日历下月今天                |
| 040  | 40. sdfDateByFull            | 单线程英文日期时间格式      |
| 041  | 41. getTimeEn                | 英文格式化时间              |
| 042  | 42. getTimeCn                | 中文格式化时间              |
| 043  | 43. getTimeAlone             | 时间去文字                  |
| 044  | 44. getYyyy                  | 时间取年                   |
| 045  | 45. getMm                    | 时间取月                   |
| 046  | 46. getDd                    | 时间取日                   |
| 047  | 47. getWeekNumberCn          | 中文一周第几天              |
| 048  | 48. getWeekNumber            | 英文一周第几天              |
| 049  | 49. getWeekOfMonth           | 月第几周                   |
| 050  | 50. getWeekOfYear            | 年第几周                   |
| 051  | 51. getDaysForMonth          | 月天数日历方式              |
| 052  | 52. getDaysOfMonth           | 月天数                     |
| 053  | 53. isLeapYear               | 是否闰年                   |
| 054  | 54. getSecondsNightOrMorning | 前一天或后一天毫秒形式      |
| 055  | 55. getDayForwardOrBackward  | 前一天或后一天              |
| 056  | 56. getNowOffsetDay          | 增减天数                   |
| 057  | 57. yesterdayString          | 昨日此时                   |
| 058  | 58. getYesterdayString       | 昨日此时指定格式            |
| 059  | 59. nowString                | 此时                       |
| 060  | 60. getNowString             | 此时指定格式                |
| 061  | 61. nowMillis                | 当前毫秒                   |
| 062  | 62. nowDate                  | 当前日期                   |
| 063  | 63. getStringByTimeSpan      | 时间增减字符串              |
| 064  | 64. getMillisByTimeSpan      | 时间增减毫秒数              |
| 065  | 65. getDateByTimeSpan        | 时间增减日期对象            |
| 066  | 66. getTimeSpan              | 时间跨度                   |
| 067  | 67. getTimeSpanFit           | 时间跨度友好显示            |
| 068  | 68. getTimeSpanFitByNow      | 当前时间跨度友好显示        |
| 069  | 69. timeOffset               | 日期格式化01时间偏移        |
| 070  | 70. ymd                      | 日期格式化02年月日          |
| 071  | 71. mdy                      | 日期格式化03月日年          |
| 072  | 72. amOrPm                   | 日期格式化04上午或下午      |
| 073  | 73. hmsAmOrPm                | 日期格式化05时分秒上午或下午 |
| 074  | 74. hms                      | 日期格式化06时分秒          |
| 075  | 75. hm                       | 日期格式化07时分            |
| 076  | 76. timeAll                  | 日期格式化08全时间          |
| 077  | 77. time2Second              | 日期格式化09转秒            |
| 078  | 78. time2Millis              | 日期格式化10转毫            |
| 079  | 79. yearFullName             | 日期格式化11年全名          |
| 080  | 80. yearReferred             | 日期格式化12年描述          |
| 081  | 81. month                    | 日期格式化13月              |
| 082  | 82. monthFullName            | 日期格式化14月全名          |
| 083  | 83. monthReferred            | 日期格式化15月描述          |
| 084  | 84. weekFullName             | 日期格式化16周全名          |
| 085  | 85. weekReferred             | 日期格式化17周描述          |
| 086  | 86. day2Year                 | 日期格式化18日转年          |
| 087  | 87. dayOne                   | 日期格式化19单月日          |
| 088  | 88. dayTwo                   | 日期格式化20全月日          |
| 089  | 89. hourL                    | 日期格式化21十二小时制      |
| 090  | 90. hourH                    | 日期格式化22二十四小时制    |
| 091  | 91. minute                   | 日期格式化23分两位          |
| 092  | 92. second                   | 日期格式化24秒两位          |
| 093  | 93. millis                   | 日期格式化25毫三位          |
| 094  | 94. subtle                   | 日期格式化26微九位          |
| 095  | 95. isDateTrue               | 是否真实时间格式化方式      |
| 096  | 96. isDateReal               | 是否真实时间                |
| 097  | 97. isDaySame                | 是否相同时间                |
| 098  | 98. isToday                  | 是否今日                   |
| 099  | 99. zeroTimeOfToday          | 今日零点                   |
| 100  | 100. compareTime             | 比较时间                   |
| 101  | 101. isEqualTime             | 是否相同时间对象            |
| 102  | 102. isBeforeTime            | 是否之前时间                |
| 103  | 103. getWeekCn               | 中文周几字符串              |
| 104  | 104. getWeekUs               | 英文周几字符串              |
| 105  | 105. getValueByCalendarField | 通过日历属性获取对应值      |

### *101.农历LunarHelper(177)*

| 序号 | 方法                 | 功能       |
|:-----|:---------------------|:----------|
| 01   | 01. getZodiac        | 获取星座   |
| 02   | 02. getZodiacCn      | 获取属相   |
| 03   | 03. lunarYear2GanZhi | 农历转干支 |
| 04   | 04. solar2Lunar      | 公历转农历 |
| 05   | 05. lunar2Solar      | 农历转公历 |

### *102.关闭CloseHelper(25)*

| 序号 | 方法               | 功能              |
|:-----|:-------------------|:-----------------|
| 01   | 01. closeIo        | 关闭资源          |
| 02   | 02. closeIoQuietly | 关闭资源，忽略异常 |

### *103.工具ToolHelper(137)*

| 序号 | 方法                        | 功能                    |
|:-----|:----------------------------|:-----------------------|
| 01   | 01. backgroundHandler       | 背景处理器              |
| 02   | 02. OnSimpleListener        | 延迟操作监听器          |
| 03   | 03. delayToDo               | 延迟操作                |
| 04   | 04. OnDoListener            | 功能                   |
| 05   | 05. initFastClickAndVibrate | 快速点击振动            |
| 06   | 06. isFastClick             | 是否快速点击            |
| 07   | 07. getResIdByName          | 通过名字获取资源ID      |
| 08   | 08. fixListViewHeight       | 计算ListView高度        |
| 09   | 09. countDown               | 倒数                   |
| 10   | 10. setEditNumberAuto       | 设置EditText数字        |
| 11   | 11. setEditNumber           | 自动设置EditText数字    |
| 12   | 12. setEditDecimal          | 设置EditText小数        |
| 13   | 13. setEditType             | 设置EditText类型        |
| 14   | 14. stringFilter            | 只许数字汉字字符串过滤器 |

### *104.通讯ContactsHelper(221)*

| 序号 | 方法                         | 功能           |
|:-----|:-----------------------------|:--------------|
| 01   | 01. call                     | 直接拨号      |
| 02   | 02. dial                     | 拨号界面      |
| 03   | 03. sendSmsActivity          | 短信界面      |
| 04   | 04. sendSmsSilent            | 超长短信      |
| 05   | 05. sendSmsWithReceiver      | 短信回报      |
| 06   | 06. allSms2Xml               | 短信转xml     |
| 07   | 07. toContantNumberActivity  | 联系人单选界面 |
| 08   | 08. toContactsChooseActivity | 联系人多选界面 |
| 09   | 09. getContantNumberChoosed  | 选中联系人号码 |
| 10   | 10. contacts                 | 所有联系人号码 |

### *105.地图MapHelper(69)*

| 序号 | 方法                    | 功能            |
|:-----|:------------------------|:----------------|
| 01   | 01. openMap             | 打开地图进行导航 |
| 02   | 02. openGaodeMapToGuide | 打开高德地图导航 |
| 03   | 03. openBaiduMapToGuide | 打开百度地图导航 |
| 04   | 04. openBrowserToGuide  | 打开浏览器导航   |
| 05   | 05. metreToScreenPixel  | 米转屏幕像素    |
| 06   | 06. screenPixelToMetre  | 屏幕像素转米    |

### *106.网服WebServiceHelper(63)*

| 序号 | 方法                   | 功能           |
|:-----|:-----------------------|:--------------|
| 01   | 01. WebServiceCallBack | WebService回调 |
| 02   | 02. callWebService     | 调用WebService |

>- implementation "com.google.code.ksoap2-android:ksoap2-android:3.6.4"

### *107.网连HttpUrlConnectionHelper(107)*

| 序号 | 方法           | 功能         |
|:-----|:---------------|:------------|
| 01   | 01. CallBack   | 请求完成回调 |
| 02   | 02. doGetAsyn  | 异步get     |
| 03   | 03. doGet      | 普通get     |
| 04   | 04. doPostAsyn | 异步post    |
| 05   | 05. doPost     | 普通post    |

### *108.标识UriHelper(91)*

| 序号 | 方法                 | 功能           |
|:-----|:---------------------|:--------------|
| 01   | 01. getURLWithParams | 获取网址和参数 |
| 02   | 02. file2Uri         | 文件转URI     |
| 03   | 03. uri2File         | URI转文件     |

### *109.安全SslHelper(57)*

| 序号 | 方法                    | 功能                 |
|:-----|:------------------------|:--------------------|
| 01   | 01. getSslSocketFactory | 获取SSLSocketFactory |
| 02   | 02. getKeyManagers      | 获取KeyManager       |

### *110.超文HtmlHelper(59)*

| 序号 | 方法               | 功能               |
|:-----|:-------------------|:------------------|
| 01   | 01. keywordMadeRed | 关键词着红色       |
| 02   | 02. addHtmlRedFlag | 添加红色标签       |
| 03   | 03. getJson        | get方法json数据    |
| 04   | 04. getForm        | get方法非json数据  |
| 05   | 05. postJson       | post方法json数据   |
| 06   | 06. postForm       | post方法非json数据 |

