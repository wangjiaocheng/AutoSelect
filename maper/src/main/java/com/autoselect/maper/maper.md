# ***库文档***
序号|分层|功能
---|--------------------------------------------------|---
01 |01. 服务器数据层                                   |数据库
02 |02. 服务器实体层entity                             |数据库实体类data类型
03 |03. 服务器持久层repository                         |数据库修改类interface类型
04 |04. 服务器业务层service                            |业务逻辑实现class类型
05 |05. 服务器控制层controller                         |业务开关控制class类型
06 |06. 服务器表现层：客户端实体层Model                 |对应数据实体data类型
07 |07. 服务器表现层：客户端控制层Controller            |对应业务逻辑object类型
08 |08. 服务器表现层：客户端视图层View                  |布局控件逻辑activity类型
09 |09. 服务器表现层：客户端布局层View                  |布局控件位置xml类型
## **地图库maper归属客户端布局层属于控件库**
| 序号 | 类库                                          | 功能 |
|:-----|:---------------------------------------------|:-----|
| 001  | ### *001.MapActivity(3033)*                  | 地图 |
### *001.地图MapActivity*
序号|方法|功能（设置-选项、设置-开关、开发-调用、开发-创建、开发-依赖、开发-独立）
---|--------------------------------------------------|---
01 |01. selectMapCustomStyleFile                      |（设置-选项1）选择地图自定义风格文件
02 |02. selectTypeMap                                 |（设置-选项2）选择地图类型：普通、卫星、夜景、导航、公交
03 |03. selectTypeLocationSpinner                     |（设置-选项3）选择定位类型：功能已实现，只需创建选择器
04 |04. selectTypeLanguage                            |（设置-选项4）选择语言类型：中文、英文
05 |05. selectPositionLogo                            |（设置-选项5）选择logo位置：下左、下中、下右
06 |06. selectPositionControls                        |（设置-选项6）选择控件位置：右中、右下
07 |07. changeStop                                    |（开发-调用）地图改变动画停止
08 |08. changeCamera                                  |（开发-调用）地图改变动画：是否动画、持续时间、完成回调、取消回调
09 |09. changePosition                                |（开发-调用）地图改变坐标：缩放、倾斜、转向、图标
10 |10. Direction                                     |（开发-调用）地图移动方向：左、上、右、下
11 |11. changeScroll                                  |（开发-调用）地图移动像素
12 |12. changeLimits                                  |（开发-调用）地图改变坐标区域
13 |13. zoomIn                                        |（开发-调用）地图放大
14 |14. zoomOut                                       |（开发-调用）地图缩小
15 |15. zoomLevel                                     |（开发-调用）地图设置缩放等级：当前、最大、最小、是否重置
16 |16. showUiSettings                                |（设置-开关9+）地图启用手势控件定位：拖拽、缩放、倾斜、旋转、比例尺、缩放按钮、指南针、定位按钮、室内地图控件
17 |17. showLayers                                    |（设置-开关4+）地图显示图层：交通、建筑、文字、室内地图
18 |18. mapIndoorFloorSwitchView                      |（开发-创建）自定义室内地图：控件已实现，只需创建其实例
19 |19. showIndoor                                    |（设置-开关1+）显示自定义室内地图：MapIndoorFloorSwitchView
20 |20. showOpenGl                                    |（开发-调用）显示自定义图形：MapCubeRender、MapCube
21 |21. Companion                                     |（开发-调用）自定义静态属性：地域级别（国、省、市、区、圈）、离线消息、热力图梯度
22 |22. showHeatMap                                   |（开发-调用）显示热力图：批量坐标TileOverlay
23 |23. showOverlayTile                               |（开发-调用）显示Tile覆盖物：指定"http://a.tile.openstreetmap.org/%d/%d/%d.png"
24 |24. showOverlayGround                             |（开发-调用）显示Ground覆盖物：指定坐标范围和图片资源
25 |25. showOverlayMultiPoint                         |（开发-调用）显示MultiPoint覆盖物：指定文本资源
26 |26. showNavigateArrow                             |（开发-调用）显示导航箭头：指定宽度和坐标
27 |27. showText                                      |（开发-调用）显示文本：坐标、文字、字号、字型、字色、背景、角度、深度
28 |28. showMarkers                                   |（开发-调用）显示批量Marker
29 |29. showMarkerDefault                             |（开发-调用）显示原生Marker：标题、详情、可拖动性、是否平坦、刷新频率、原生图标、角度、像素位置、信息窗口
30 |30. showMarkerRes                                 |（开发-调用）显示自定义资源Marker：标题、详情、可拖动性、是否平坦、刷新频率、资源图标、角度、像素位置、信息窗口
31 |31. showMarkerView                                |（开发-调用）显示自定义视图Marker：标题、详情、可拖动性、是否平坦、刷新频率、视图图标、角度、像素位置、信息窗口
32 |32. showMarkerIcons                               |（开发-调用）显示自定义多图Marker：标题、详情、可拖动性、是否平坦、刷新频率、多图图标、角度、像素位置、信息窗口
33 |33. showMarkerLocation                            |（开发-调用）显示定位Marker
34 |34. showMarkerCar                                 |（开发-调用）显示汽车Marker
35 |35. showMarkerInScreenCenter                      |（开发-调用）显示屏中Marker
36 |36. showAnimationDrop                             |（开发-调用）Marker降低动画
37 |37. showAnimationGrow                             |（开发-调用）Marker生长动画
38 |38. showAnimationGrowClick                        |（开发-调用）Marker点击生长动画
39 |39. showAnimationJump                             |（开发-调用）Marker跳动动画
40 |40. showAnimationJumpClick                        |（开发-调用）Marker点击跳动动画
41 |41. showPolygon                                   |（开发-调用）显示多边形：坐标列表、宽度、边框颜色、填充颜色
42 |42. showPolygonRectangle                          |（开发-调用）显示矩形：中心坐标、半宽、半高、边框宽度、边框颜色、填充颜色
43 |43. showPolygonEllipse                            |（开发-调用）显示椭圆：中心坐标、边框宽度、边框颜色、填充颜色
44 |44. showArc                                       |（开发-调用）显示弧线：起点、中点、终点、边框颜色
45 |45. showCircle                                    |（开发-调用）显示圆形：中心坐标、半径、边框宽度、边框颜色、填充颜色
46 |46. showCirclePolyline                            |（开发-调用）显示多边圆形：中心坐标、半径、边框宽度、边框颜色、纹理、渐变、虚线、大地
47 |47. showPolyline                                  |（开发-调用）显示线段：坐标列表、边框宽度、边框颜色、纹理、渐变、虚线、大地
48 |48. update                                        |（开发-调用）坐标经纬度等值偏移
49 |49. showColorsPolyline                            |（开发-调用）显示多彩线段：坐标、偏移、边框宽度、边框颜色、纹理、渐变、虚线、大地
50 |50. showTexturePolyline                           |（开发-调用）显示纹理线段：坐标、偏移、边框宽度
51 |51. showPolylineInPlayGround                      |（开发-调用）显示操场线段：中心坐标、半径、边框宽度、渐变、虚线、大地
52 |52. listenerEvent                                 |（设置-开关9+）启用事件监听：加载、移动、点击、长按、触摸、兴趣点点击、Marker拖动、Marker点击、信息窗口点击
53 |53. listenerShot                                  |（开发-调用）地图截屏
54 |54. cityCode                                      |（开发-调用）城市代码处理：截取“-”后部分，搜索公交站点线路需要
55 |55. searchStation                                 |（开发-调用）搜索公交站点
56 |56. searchLine                                    |（开发-调用）搜索公交线路：MapBusLineAdapter、MapBusLineOverlay
57 |57. tableId                                       |（开发-依赖）搜索云详情需要
58 |58. lineId                                        |（开发-依赖）搜索云详情需要
59 |59. searchById                                    |（开发-调用）搜索云详情：通过tableId和lineId
60 |60. keyWord                                       |（开发-依赖）搜索周边范围关键词
61 |61. pointCenter                                   |（开发-依赖）搜索周边范围中心坐标
62 |62. searchByBound                                 |（开发-调用）搜索周边范围：通过tableId、关键词和中心坐标
63 |63. point1                                        |（开发-依赖）多边形坐标1
64 |64. point2                                        |（开发-依赖）多边形坐标2
65 |65. point3                                        |（开发-依赖）多边形坐标3
66 |66. point4                                        |（开发-依赖）多边形坐标4
67 |67. searchByPolygon                               |（开发-调用）搜索多边形范围：通过tableId、关键词和中心坐标
68 |68. localCityName                                 |（开发-依赖）本地城市名称
69 |69. searchByLocal                                 |（开发-调用）搜索城市范围：MapCloudOverlay、MapCloudImageCache、MapCloudDetailActivity、MapCloudPreviewActivity
70 |70. searchLatLngByAddress                         |（开发-调用）搜索城市地址：地址、城市
71 |71. toLatLonPoints                                |（开发-调用）双精度数组转经纬度点列表
72 |72. searchAddressesByLatLonList                   |（开发-调用）搜索地址以经纬度点列表
73 |73. point                                         |（开发-依赖）经纬度点
74 |74. searchAddressByLatLon                         |（开发-调用）搜索地址以经纬度点
75 |75. isWithBoundary                                |（开发-依赖）是否带行政区划边界
76 |76. searchDistrict                                |（开发-调用）搜索行政区划
77 |77. searchDistrictWithBoundary                    |（开发-调用）搜索行政区划带边界
78 |78. infoCountry                                   |（开发-依赖）国家信息：用于获取，而非赋值
79 |79. infoProvince                                  |（开发-依赖）省州信息：用于获取，而非赋值
80 |80. infoCity                                      |（开发-依赖）城市信息：用于获取，而非赋值
81 |81. infoDistrict                                  |（开发-依赖）区划信息：用于获取，而非赋值
82 |82. spinnerProvince                               |（开发-创建）选择省州：功能已实现，只需创建选择器
83 |83. spinnerCity                                   |（开发-创建）选择城市：功能已实现，只需创建选择器
84 |84. spinnerDistrict                               |（开发-创建）选择区划：功能已实现，只需创建选择器
85 |85. keywordText                                   |（开发-依赖）关键词文本输入框：AutoCompleteTextView类型
86 |86. poiSearchList                                 |（开发-依赖）兴趣点搜索列表视图：ListView类型
87 |87. searchPoiSub                                  |（开发-调用）搜索子兴趣点：MapPoiListAdapter、MapPoiSubAdapter
88 |88. detailMarker                                  |（开发-创建）详情Marker：需要创建
89 |89. mPoiName                                      |（开发-创建）兴趣点名称：需要创建TextView
90 |90. mPoiAddress                                   |（开发-创建）兴趣点地址：需要创建TextView
91 |91. mPoiInfo                                      |（开发-创建）兴趣点信息：需要创建TextView
92 |92. mPoiDetail                                    |（开发-创建）兴趣点详情：需要创建RelativeLayout
93 |93. searchPoiId                                   |（开发-调用）搜索兴趣点以ID
94 |94. searchPoiKeyword                              |（开发-调用）搜索兴趣点以关键词：MapPoiOverlay
95 |95. nextPagePoiKeyword                            |（开发-依赖）下一页兴趣点关键词
96 |96. resetLastMarker                               |（开发-调用）重置最近Marker
97 |97. searchPoiAround                               |（开发-调用）搜索兴趣点周边
98 |98. cityNameTv                                    |（开发-创建）城市名称：需要创建TextView
99 |99. reportTimeLive                                |（开发-创建）即报时间：需要创建TextView
100|100 weatherTv                                     |（开发-创建）天气：需要创建TextView
101|101.temperatureTv                                 |（开发-创建）温度：需要创建TextView
102|102.windTv                                        |（开发-创建）风力：需要创建TextView
103|103.humidityTv                                    |（开发-创建）湿度：需要创建TextView
104|104.reportTimeForecast                            |（开发-创建）预报时间：需要创建TextView
105|105.forecastTv                                    |（开发-创建）预报：需要创建TextView
106|106.searchWeatherLiveOrForecast                   |（开发-调用）搜索天气即报或预报
107|107.urlView                                       |（开发-创建）路线WebView：需要创建
108|108.shareRoute                                    |（开发-调用）分享路线：起点、终点
109|109.sharePoi                                      |（开发-调用）分享兴趣点：坐标、标题、详情
110|110.shareLocation                                 |（开发-调用）分享定位：坐标、标题、详情
111|111.shareNavi                                     |（开发-调用）分享导航：起点、终点
112|112.contentViewPage                               |（开发-创建）内容视图页面：功能已实现，需要创建ViewPager
113|113.textDownload                                  |（开发-创建）离线下载动态：功能已实现，需要创建TextView
114|114.textDownloaded                                |（开发-创建）离线已下载动态：功能已实现，需要创建TextView
115|115.offlineStartInPause                           |（开发-调用）暂停中开始离线下载：MapOfflineListAdapter、MapOfflineDownloadedAdapter、MapOfflinePagerAdapter、MapOfflineChild
116|116.offlineCancelInPause                          |（开发-调用）暂停中取消离线下载
117|117.offlineStop                                   |（开发-调用）停止离线下载
118|118.offlineLog                                    |（开发-调用）离线下载日志
119|119.backImage                                     |（开发-依赖）离线结束退出
120|120.metrePerPixel                                 |（开发-调用）当前每像素地理距离（米）
121|121.distance                                      |（开发-调用）两点坐标距离
122|122.markersList                                   |（开发-调用）屏显地图所有Marker列表
123|123.markersSize                                   |（开发-调用）屏显地图所有Marker数量
124|124.isContain                                     |（开发-调用）指定多边形是否包含坐标
125|125.isContain                                     |（开发-调用）显示范围内是否包含坐标
126|126.toPoint                                       |（开发-调用）经纬度转点
127|127.toLatLng                                      |（开发-调用）点转经纬度
128|128.types                                         |（开发-调用）地图类型数组：百度、图吧、wgs84、图盟、搜搜、阿里云、谷歌
129|129.Convert                                       |（开发-调用）高德坐标转指定地图类型坐标
130|130.startNavi                                     |（开发-调用）导航到Marker坐标
131|131.watchText                                     |（开发-调用）AutoCompleteTextView输入文本监测
132|132.startMove                                     |（开发-调用）按坐标列表移动
133|133.register                                      |（开发-调用）注册加速传感器和地磁传感器
134|134.unRegister                                    |（开发-调用）取消加速传感器和地磁传感器
135|135.markerRotate                                  |（开发-创建）转向Marker：需要创建
136|136.onOrientationListener                         |（开发-依赖）方向改变监听器：监听手机转向改变Marker方向
137|137.startTrace                                    |（开发-调用）开始轨迹纠偏
138|138.stopTrace                                     |（开发-调用）停止轨迹纠偏
139|139.distanceSum                                   |（开发-调用）纠偏覆盖物总计距离：用户获取，而非赋值
140|140.timeWait                                      |（开发-调用）纠偏覆盖物等待时间：用户获取，而非赋值
141|141.coordinateType                                |（开发-调用）设置纠偏坐标类型
142|142.traceGrasp                                    |（开发-调用）纠偏控制
143|143.cleanFinishTrace                              |（开发-调用）清除完成纠偏
144|144.setMapFragment                                |（开发-调用）MapFragment初始化：Activity中不可用
145|145.aMapLocationClientOption                      |（开发-依赖）定位选项：可以重设
146|146.locationMsg                                   |（开发-调用）定位消息：用户获取，而非赋值，包含定位资料
147|147.locationStr                                   |（开发-调用）定位资料：用户获取，而非赋值
148|148.errorStr                                      |（开发-调用）定位错误：用户获取，而非赋值
149|149.alarmInterval                                 |（开发-依赖）定位警报间隔时间
150|150.locationStart                                 |（开发-调用）开始定位
151|151.locationStop                                  |（开发-调用）停止定位
152|152.assistantStart                                |（开发-调用）开始H5辅助定位
153|153.assistantStop                                 |（开发-调用）停止H5辅助定位
154|154.locationLast                                  |（开发-调用）最近定位
155|155.locationDestroy                               |（开发-调用）销毁定位
156|156.isAvailable                                   |（开发-调用）DPoint可用与否
157|157.Convert                                       |（开发-调用）DPoint转指定地图类型DPoint
158|158.addCenterMarker                               |（开发-调用）添加指定坐标可拖动中心Marker
159|159.addPolygonMarker                              |（开发-调用）添加指定坐标可拖动多边Marker
160|160.locationInfo                                  |（开发-调用）定位信息
161|161.toDPoint                                      |（开发-调用）经纬度转DPoint
162|162.customId                                      |（开发-依赖）地理围栏自定义ID
163|163.addPolygonFence                               |（开发-调用）添加多边形地理围栏
164|164.keyword                                       |（开发-依赖）地理围栏关键词
165|165.addDistrictFence                              |（开发-调用）添加行政区划地理围栏
166|166.centerLatLng                                  |（开发-依赖）地理围栏坐标
167|167.radiusStr                                     |（开发-调用）地理围栏半径：转浮点数
168|168.addRoundFence                                 |（开发-调用）添加周边地理围栏
169|169.poiType                                       |（开发-依赖）地理围栏兴趣点类型
170|170.sizeStr                                       |（开发-依赖）地理围栏尺寸
171|171.addNearbyFence                                |（开发-调用）添加附近地理围栏
172|172.city                                          |（开发-依赖）地理围栏城市
173|173.addKeywordFence                               |（开发-调用）添加城市关键词地理围栏
174|174.clearGeoFence                                 |（开发-调用）清除地理围栏
175|175.NoScrollGridView                              |地图依赖控件
176|176.MapCommon                                     |地图依赖工具
177|177.MapErrorToast                                 |地图依赖错误
178|178.MapRouteCalculateActivity                     |（开发-独立）路线规划：MapRouteSearchActivity、MapTipListAdapter
179|179.MapRouteActivity                              |（开发-独立）路线规划：MapRouteBusDetailActivity、MapRouteDriveDetailActivity、MapRouteRideDetailActivity、MapRouteWalkDetailActivity
180|180.MapRouteBusResultListAdapter                  |（开发-独立）路线规划：MapRouteBusSegmentListAdapter、MapRouteDriveSegmentListAdapter、MapRouteRideSegmentListAdapter、MapRouteWalkSegmentListAdapter
181|181.MapRouteOverlay                               |（开发-独立）路线规划：MapRouteBusOverlay、MapRouteDriveOverlay、MapRouteRideOverlay、MapRouteWalkOverlay
182|182.MapNaviActivity                               |（开发-独立）路线导航：MapNaviDriveActivity、MapNaviRideActivity、MapNaviWalkActivity、MapNaviComponentActivity、TtsControllerAMap、TtsController、TtsSystem、TtsIFly、Tts、TtsCallBack