# ***库文档***
| 序号 | 类库                                          | 功能 |
|:-----|:---------------------------------------------|:-----|
| 001  | ### *00.MapActivity(3036)*                   | 地图 |
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
26 |26. showNavigateArrow                             |功能
27 |27. showText                                      |功能
28 |28. showMarkers                                   |功能
29 |29. showMarkerDefault                             |功能
30 |30. showMarkerRes                                 |功能
31 |31. showMarkerView                                |功能
32 |32. showMarkerIcons                               |功能
33 |33. showMarkerLocation                            |功能
34 |34. showMarkerCar                                 |功能
35 |35. showMarkerInScreenCenter                      |功能
36 |36. showAnimationDrop                             |功能
37 |37. showAnimationGrow                             |功能
38 |38. showAnimationGrowClick                        |功能
39 |39. showAnimationJump                             |功能
40 |40. showAnimationJumpClick                        |功能
41 |41. showPolygon                                   |功能
42 |42. showPolygonRectangle                          |功能
43 |43. showPolygonEllipse                            |功能
44 |44. showArc                                       |功能
45 |45. showCircle                                    |功能
46 |46. showCirclePolyline                            |功能
47 |47. showPolyline                                  |功能
48 |48. update                                        |功能
49 |49. showColorsPolyline                            |功能
50 |50. showTexturePolyline                           |功能
51 |51. showPolylineInPlayGround                      |功能
52 |52. listenerEvent                                 |功能
53 |53. listenerShot                                  |功能
54 |54. cityCode                                      |功能
55 |55. searchStation                                 |功能
56 |56. searchLine                                    |MapBusLineAdapter、MapBusLineOverlay
57 |57. tableId                                       |功能
58 |58. lineId                                        |功能
59 |59. searchById                                    |功能
60 |60. keyWord                                       |功能
61 |61. pointCenter                                   |功能
62 |62. searchByBound                                 |功能
63 |63. point1                                        |功能
64 |64. point2                                        |功能
65 |65. point3                                        |功能
66 |66. point4                                        |功能
67 |67. searchByPolygon                               |功能
68 |68. localCityName                                 |功能
69 |69. searchByLocal                                 |MapCloudOverlay、MapCloudImageCache、MapCloudDetailActivity、MapCloudPreviewActivity
70 |70. searchLatLngByAddress                         |功能
71 |71. toLatLonPoints                                |功能
72 |72. searchAddressesByLatLonList                   |功能
73 |73. point                                         |功能
74 |74. searchAddressByLatLon                         |功能
75 |75. isWithBoundary                                |功能
76 |76. searchDistrict                                |功能
77 |77. searchDistrictWithBoundary                    |功能
78 |78. infoCountry                                   |功能
79 |79. infoProvince                                  |功能
80 |80. infoCity                                      |功能
81 |81. infoDistrict                                  |功能
82 |82. keywordText                                   |功能
83 |83. poiSearchList                                 |功能
84 |84. searchPoiSub                                  |MapPoiListAdapter、MapPoiSubAdapter
85 |85. detailMarker                                  |功能
86 |86. mPoiName                                      |功能
87 |87. mPoiAddress                                   |功能
88 |88. mPoiInfo                                      |功能
89 |89. mPoiDetail                                    |功能
90 |90. searchPoiId                                   |功能
91 |91. searchPoiKeyword                              |MapPoiOverlay
92 |92. nextPagePoiKeyword                            |功能
93 |93. resetLastMarker                               |功能
94 |94. searchPoiAround                               |功能
95 |95. cityNameTv                                    |功能
96 |96. reportTimeLive                                |功能
97 |97. weatherTv                                     |功能
98 |98. temperatureTv                                 |功能
99 |99. windTv                                        |功能
100|100 humidityTv                                    |功能
101|101.reportTimeForecast                            |功能
102|102.forecastTv                                    |功能
103|103.searchWeatherLiveOrForecast                   |功能
104|104.urlView                                       |功能
105|105.shareRoute                                    |功能
106|106.sharePoi                                      |功能
107|107.shareLocation                                 |功能
108|108.shareNavi                                     |功能
109|109.contentViewPage                               |功能
110|110.textDownload                                  |功能
111|111.textDownloaded                                |功能
112|112.offlineStartInPause                           |MapOfflineListAdapter
113|113.offlineCancelInPause                          |MapOfflineChild
114|114.offlineStop                                   |MapOfflineDownloadedAdapter
115|115.offlineLog                                    |MapOfflinePagerAdapter
116|116.backImage                                     |功能
117|117.metrePerPixel                                 |功能
118|118.distance                                      |功能
119|119.markersList                                   |功能
120|120.markersSize                                   |功能
121|121.isContain                                     |指定多边形是否包含坐标
122|122.isContain                                     |显示范围内是否包含坐标
123|123.toPoint                                       |功能
124|124.toLatLng                                      |功能
125|125.types                                         |功能
126|126.Convert                                       |功能
127|127.startNavi                                     |功能
128|128.watchText                                     |功能
129|129.startMove                                     |功能
130|130.register                                      |功能
131|131.unRegister                                    |功能
132|132.markerRotate                                  |功能
133|133.onOrientationListener                         |功能
134|134.startTrace                                    |功能
135|135.stopTrace                                     |功能
136|136.distanceSum                                   |功能
137|137.timeWait                                      |功能
138|138.coordinateType                                |功能
139|139.traceGrasp                                    |功能
140|140.cleanFinishTrace                              |功能
141|141.setMapFragment                                |功能
142|142.aMapLocationClientOption                      |功能
143|143.locationMsg                                   |功能
144|144.locationStr                                   |功能
145|145.errorStr                                      |功能
146|146.alarmInterval                                 |功能
147|147.locationStart                                 |功能
148|148.locationStop                                  |功能
149|149.assistantStart                                |功能
150|150.assistantStop                                 |功能
151|151.locationLast                                  |功能
152|152.locationDestroy                               |功能
153|153.isAvailable                                   |功能
154|154.Convert                                       |功能
155|155.addCenterMarker                               |功能
156|156.addPolygonMarker                              |功能
157|157.locationInfo                                  |功能
158|158.toDPoint                                      |功能
159|159.customId                                      |功能
160|160.addPolygonFence                               |功能
161|161.keyword                                       |功能
162|162.addDistrictFence                              |功能
163|163.centerLatLng                                  |功能
164|164.radiusStr                                     |功能
165|165.addRoundFence                                 |功能
166|166.poiType                                       |功能
167|167.sizeStr                                       |功能
168|168.addNearbyFence                                |功能
169|169.city                                          |功能
170|170.addKeywordFence                               |功能
171|171.NoScrollGridView                              |功能
172|172.MapCommon                                     |功能
173|173.MapErrorToast                                 |功能
174|174.MapRouteCalculateActivity                     |MapRouteSearchActivity、MapTipListAdapter
175|175.MapRouteActivity                              |MapRouteBusDetailActivity、MapRouteDriveDetailActivity、MapRouteRideDetailActivity、MapRouteWalkDetailActivity
176|176.MapRouteBusResultListAdapter                  |MapRouteBusSegmentListAdapter、MapRouteDriveSegmentListAdapter、MapRouteRideSegmentListAdapter、MapRouteWalkSegmentListAdapter
177|177.MapRouteOverlay                               |MapRouteBusOverlay、MapRouteDriveOverlay、MapRouteRideOverlay、MapRouteWalkOverlay
178|178.MapNaviActivity                               |MapNaviDriveActivity、MapNaviRideActivity、MapNaviWalkActivity、MapNaviComponentActivity、TtsControllerAMap、TtsController、TtsSystem、TtsIFly、Tts、TtsCallBack