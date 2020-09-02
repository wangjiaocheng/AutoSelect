# ***库文档***
| 序号 | 类库                                          | 功能 |
|:-----|:---------------------------------------------|:-----|
| 001  | ### *00.MapActivity(3033)*                   | 地图 |
## **地图库maper**
### *00.地图MapActivity*
序号|方法|功能
---|--------------------------------------------------|---
01 |01. selectMapCustomStyleFile                      |选择地图自定义风格文件
02 |02. selectTypeMap                                 |选择地图类型：普通、卫星、夜景、导航、公交
03 |03. selectTypeLocationSpinner                     |选择定位类型：功能已实现，只需创建选择器
04 |04. selectTypeLanguage                            |选择语言类型：中文、英文
05 |05. selectPositionLogo                            |选择logo位置：下左、下中、下右
06 |06. selectPositionControls                        |选择控件位置：右中、右下
07 |07. changeStop                                    |地图改变动画停止
08 |08. changeCamera                                  |地图改变动画：是否动画、持续时间、完成回调、取消回调
09 |09. changePosition                                |地图改变坐标：缩放、倾斜、转向、图标
10 |10. Direction                                     |地图移动方向：左、上、右、下
11 |11. changeScroll                                  |地图移动像素
12 |12. changeLimits                                  |地图改变坐标区域
13 |13. zoomIn                                        |地图放大
14 |14. zoomOut                                       |地图缩小
15 |15. zoomLevel                                     |地图设置缩放等级：当前、最大、最小、是否重置
16 |16. showUiSettings                                |地图启用手势控件定位：拖拽、缩放、倾斜、旋转、比例尺、缩放按钮、指南针、定位按钮、室内地图控件
17 |17. showLayers                                    |地图显示图层：交通、建筑、文字、室内地图
18 |18. mapIndoorFloorSwitchView                      |自定义室内地图：控件已实现，只需创建其实例
19 |19. showIndoor                                    |显示自定义室内地图：MapIndoorFloorSwitchView
20 |20. showOpenGl                                    |显示自定义图形：MapCubeRender、MapCube
21 |21. Companion                                     |自定义静态属性：地域级别（国、省、市、区、圈）、离线消息、热力图梯度
22 |22. showHeatMap                                   |显示热力图：批量坐标TileOverlay
23 |23. showOverlayTile                               |显示Tile覆盖物：指定"http://a.tile.openstreetmap.org/%d/%d/%d.png"
24 |24. showOverlayGround                             |显示Ground覆盖物：指定坐标范围和图片资源
25 |25. showOverlayMultiPoint                         |显示MultiPoint覆盖物：指定文本资源
26 |26. showNavigateArrow                             |显示导航箭头：指定宽度和坐标
27 |27. showText                                      |显示文本：坐标、文字、字号、字型、字色、背景、角度、深度
28 |28. showMarkers                                   |显示批量Marker
29 |29. showMarkerDefault                             |显示原生Marker：标题、详情、可拖动性、是否平坦、刷新频率、原生图标、角度、像素位置、信息窗口
30 |30. showMarkerRes                                 |显示自定义资源Marker：标题、详情、可拖动性、是否平坦、刷新频率、资源图标、角度、像素位置、信息窗口
31 |31. showMarkerView                                |显示自定义视图Marker：标题、详情、可拖动性、是否平坦、刷新频率、视图图标、角度、像素位置、信息窗口
32 |32. showMarkerIcons                               |显示自定义多图Marker：标题、详情、可拖动性、是否平坦、刷新频率、多图图标、角度、像素位置、信息窗口
33 |33. showMarkerLocation                            |显示定位Marker
34 |34. showMarkerCar                                 |显示汽车Marker
35 |35. showMarkerInScreenCenter                      |显示屏中Marker
36 |36. showAnimationDrop                             |Marker降低动画
37 |37. showAnimationGrow                             |Marker生长动画
38 |38. showAnimationGrowClick                        |Marker点击生长动画
39 |39. showAnimationJump                             |Marker跳动动画
40 |40. showAnimationJumpClick                        |Marker点击跳动动画
41 |41. showPolygon                                   |显示多边形：坐标列表、宽度、边框颜色、填充颜色
42 |42. showPolygonRectangle                          |显示矩形：中心坐标、半宽、半高、边框宽度、边框颜色、填充颜色
43 |43. showPolygonEllipse                            |显示椭圆：中心坐标、边框宽度、边框颜色、填充颜色
44 |44. showArc                                       |显示弧线：起点、中点、终点、边框颜色
45 |45. showCircle                                    |显示圆形：中心坐标、半径、边框宽度、边框颜色、填充颜色
46 |46. showCirclePolyline                            |显示多边圆形：中心坐标、半径、边框宽度、边框颜色、纹理、渐变、虚线、大地
47 |47. showPolyline                                  |显示线段：坐标列表、边框宽度、边框颜色、纹理、渐变、虚线、大地
48 |48. update                                        |坐标经纬度等值偏移
49 |49. showColorsPolyline                            |显示多彩线段：坐标、偏移、边框宽度、边框颜色、纹理、渐变、虚线、大地
50 |50. showTexturePolyline                           |显示纹理线段：坐标、偏移、边框宽度
51 |51. showPolylineInPlayGround                      |显示操场线段：中心坐标、半径、边框宽度、渐变、虚线、大地
52 |52. listenerEvent                                 |启用事件监听：加载、移动、点击、长按、触摸、兴趣点点击、Marker拖动、Marker点击、信息窗口点击
53 |53. listenerShot                                  |地图截屏
54 |54. cityCode                                      |城市代码处理：截取“-”后部分，搜索公交站点线路需要
55 |55. searchStation                                 |搜索公交站点
56 |56. searchLine                                    |搜索公交线路：MapBusLineAdapter、MapBusLineOverlay
57 |57. tableId                                       |搜索云详情需要
58 |58. lineId                                        |搜索云详情需要
59 |59. searchById                                    |搜索云详情：通过tableId和lineId
60 |60. keyWord                                       |搜索周边范围关键词
61 |61. pointCenter                                   |搜索周边范围中心坐标
62 |62. searchByBound                                 |搜索周边范围：通过tableId、关键词和中心坐标
63 |63. point1                                        |多边形坐标1
64 |64. point2                                        |多边形坐标2
65 |65. point3                                        |多边形坐标3
66 |66. point4                                        |多边形坐标4
67 |67. searchByPolygon                               |搜索多边形范围：通过tableId、关键词和中心坐标
68 |68. localCityName                                 |本地城市名称
69 |69. searchByLocal                                 |搜索城市范围：MapCloudOverlay、MapCloudImageCache、MapCloudDetailActivity、MapCloudPreviewActivity
70 |70. searchLatLngByAddress                         |搜索城市地址：地址、城市
71 |71. toLatLonPoints                                |双精度数组转经纬度点列表
72 |72. searchAddressesByLatLonList                   |搜索地址以经纬度点列表
73 |73. point                                         |经纬度点
74 |74. searchAddressByLatLon                         |搜索地址以经纬度点
75 |75. isWithBoundary                                |是否带行政区划边界
76 |76. searchDistrict                                |搜索行政区划
77 |77. searchDistrictWithBoundary                    |搜索行政区划带边界
78 |78. infoCountry                                   |国家信息：用于获取，而非赋值
79 |79. infoProvince                                  |省州信息：用于获取，而非赋值
80 |80. infoCity                                      |城市信息：用于获取，而非赋值
81 |81. infoDistrict                                  |区划信息：用于获取，而非赋值
82 |82. spinnerProvince                               |选择省州：功能已实现，只需创建选择器
83 |83. spinnerCity                                   |选择城市：功能已实现，只需创建选择器
84 |84. spinnerDistrict                               |选择区划：功能已实现，只需创建选择器
85 |85. keywordText                                   |关键词文本输入框：AutoCompleteTextView类型
86 |86. poiSearchList                                 |兴趣点搜索列表视图：ListView类型
87 |87. searchPoiSub                                  |搜索子兴趣点：MapPoiListAdapter、MapPoiSubAdapter
88 |88. detailMarker                                  |详情Marker：需要创建
89 |89. mPoiName                                      |兴趣点名称：需要创建TextView
90 |90. mPoiAddress                                   |兴趣点地址：需要创建TextView
91 |91. mPoiInfo                                      |兴趣点信息：需要创建TextView
92 |92. mPoiDetail                                    |兴趣点详情：需要创建RelativeLayout
93 |93. searchPoiId                                   |搜索兴趣点以ID
94 |94. searchPoiKeyword                              |搜索兴趣点以关键词：MapPoiOverlay
95 |95. nextPagePoiKeyword                            |下一页兴趣点关键词
96 |96. resetLastMarker                               |重置最近Marker
97 |97. searchPoiAround                               |搜索兴趣点周边
98 |98. cityNameTv                                    |城市名称：需要创建TextView
99 |99. reportTimeLive                                |即报时间：需要创建TextView
100|100 weatherTv                                     |天气：需要创建TextView
101|101.temperatureTv                                 |温度：需要创建TextView
102|102.windTv                                        |风力：需要创建TextView
103|103.humidityTv                                    |湿度：需要创建TextView
104|104.reportTimeForecast                            |预报时间：需要创建TextView
105|105.forecastTv                                    |预报：需要创建TextView
106|106.searchWeatherLiveOrForecast                   |搜索天气即报或预报
107|107.urlView                                       |路线WebView：需要创建
108|108.shareRoute                                    |分享路线：起点、终点
109|109.sharePoi                                      |分享兴趣点：坐标、标题、详情
110|110.shareLocation                                 |分享定位：坐标、标题、详情
111|111.shareNavi                                     |分享导航：起点、终点
112|112.contentViewPage                               |内容视图页面：功能已实现，需要创建ViewPager
113|113.textDownload                                  |功能
114|114.textDownloaded                                |功能
115|115.offlineStartInPause                           |MapOfflineListAdapter
116|116.offlineCancelInPause                          |MapOfflineChild
117|117.offlineStop                                   |MapOfflineDownloadedAdapter
118|118.offlineLog                                    |MapOfflinePagerAdapter
119|119.backImage                                     |功能
120|120.metrePerPixel                                 |功能
121|121.distance                                      |功能
122|122.markersList                                   |功能
123|123.markersSize                                   |功能
124|124.isContain                                     |指定多边形是否包含坐标
125|125.isContain                                     |显示范围内是否包含坐标
126|126.toPoint                                       |功能
127|127.toLatLng                                      |功能
128|128.types                                         |功能
129|129.Convert                                       |功能
130|130.startNavi                                     |功能
131|131.watchText                                     |功能
132|132.startMove                                     |功能
133|133.register                                      |功能
134|134.unRegister                                    |功能
135|135.markerRotate                                  |功能
136|136.onOrientationListener                         |功能
137|137.startTrace                                    |功能
138|138.stopTrace                                     |功能
139|139.distanceSum                                   |功能
140|140.timeWait                                      |功能
141|141.coordinateType                                |功能
142|142.traceGrasp                                    |功能
143|143.cleanFinishTrace                              |功能
144|144.setMapFragment                                |功能
145|145.aMapLocationClientOption                      |功能
146|146.locationMsg                                   |功能
147|147.locationStr                                   |功能
148|148.errorStr                                      |功能
149|149.alarmInterval                                 |功能
150|150.locationStart                                 |功能
151|151.locationStop                                  |功能
152|152.assistantStart                                |功能
153|153.assistantStop                                 |功能
154|154.locationLast                                  |功能
155|155.locationDestroy                               |功能
156|156.isAvailable                                   |功能
157|157.Convert                                       |功能
158|158.addCenterMarker                               |功能
159|159.addPolygonMarker                              |功能
160|160.locationInfo                                  |功能
161|161.toDPoint                                      |功能
162|162.customId                                      |功能
163|163.addPolygonFence                               |功能
164|164.keyword                                       |功能
165|165.addDistrictFence                              |功能
166|166.centerLatLng                                  |功能
167|167.radiusStr                                     |功能
168|168.addRoundFence                                 |功能
169|169.poiType                                       |功能
170|170.sizeStr                                       |功能
171|171.addNearbyFence                                |功能
172|172.city                                          |功能
173|173.addKeywordFence                               |功能
174|174.clearGeoFence                                 |功能
175|175.NoScrollGridView                              |功能
176|176.MapCommon                                     |功能
177|177.MapErrorToast                                 |功能
178|178.MapRouteCalculateActivity                     |MapRouteSearchActivity、MapTipListAdapter
179|179.MapRouteActivity                              |MapRouteBusDetailActivity、MapRouteDriveDetailActivity、MapRouteRideDetailActivity、MapRouteWalkDetailActivity
180|180.MapRouteBusResultListAdapter                  |MapRouteBusSegmentListAdapter、MapRouteDriveSegmentListAdapter、MapRouteRideSegmentListAdapter、MapRouteWalkSegmentListAdapter
181|181.MapRouteOverlay                               |MapRouteBusOverlay、MapRouteDriveOverlay、MapRouteRideOverlay、MapRouteWalkOverlay
182|182.MapNaviActivity                               |MapNaviDriveActivity、MapNaviRideActivity、MapNaviWalkActivity、MapNaviComponentActivity、TtsControllerAMap、TtsController、TtsSystem、TtsIFly、Tts、TtsCallBack