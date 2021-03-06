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

[![](https://img.shields.io/badge/CopyRight-%E7%8E%8B%E6%95%99%E6%88%90-brightgreen.svg)](https://github.com/wangjiaocheng/AutoSelect/tree/master/maper/src/main/java/com/autoselect/maper)
[![API](https://img.shields.io/badge/API-28%2B-brightgreen.svg?style=flat)](https://android-arsenal.com/api?level=28)
[![](https://jitpack.io/v/wangjiaocheng/AutoSelect.svg)](https://jitpack.io/#wangjiaocheng/AutoSelect)

```gradle
allprojects {
    repositories {
        maven { url "https://jitpack.io" }
    }
}
dependencies {
    implementation "com.github.wangjiaocheng.AutoSelect:maper:1.0.0"
}
```

## **地图库maper**

| 序号 | 类库                    | 功能 |
|:-----|:------------------------|:----|
| 001  | *001.MapActivity(3025)* | 地图 |

### *001.地图MapActivity(3025)*

| 序号 | 方法                             | 功能（设置-选项、设置-开关、开发-调用、开发-创建、开发-依赖、开发-独立）                                                                                                                  |
|:-----|:---------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 001  | 001.selectMapCustomStyleFile     | （设置-选项1）选择地图自定义风格文件                                                                                                                                                   |
| 002  | 002.selectTypeMap                | （设置-选项2）选择地图类型：普通、卫星、夜景、导航、公交                                                                                                                                 |
| 003  | 003.selectTypeLocationSpinner    | （设置-选项3）选择定位类型：功能已实现，只需创建选择器                                                                                                                                   |
| 004  | 004.selectTypeLanguage           | （设置-选项4）选择语言类型：中文、英文                                                                                                                                                 |
| 005  | 005.selectPositionLogo           | （设置-选项5）选择logo位置：下左、下中、下右                                                                                                                                            |
| 006  | 006.selectPositionControls       | （设置-选项6）选择控件位置：右中、右下                                                                                                                                                 |
| 007  | 007.changeStop                   | （开发-调用）地图改变动画停止                                                                                                                                                          |
| 008  | 008.changeCamera                 | （开发-调用）地图改变动画：是否动画、持续时间、完成回调、取消回调                                                                                                                        |
| 009  | 009.changePosition               | （开发-调用）地图改变坐标：缩放、倾斜、转向、图标                                                                                                                                       |
| 010  | 010.Direction                    | （开发-调用）地图移动方向：左、上、右、下                                                                                                                                               |
| 011  | 011.changeScroll                 | （开发-调用）地图移动像素                                                                                                                                                              |
| 012  | 012.changeLimits                 | （开发-调用）地图改变坐标区域                                                                                                                                                          |
| 013  | 013.zoomIn                       | （开发-调用）地图放大                                                                                                                                                                 |
| 014  | 014.zoomOut                      | （开发-调用）地图缩小                                                                                                                                                                 |
| 015  | 015.zoomLevel                    | （开发-调用）地图设置缩放等级：当前、最大、最小、是否重置                                                                                                                                |
| 016  | 016.showUiSettings               | （设置-开关9+）地图启用手势控件定位：拖拽、缩放、倾斜、旋转、比例尺、缩放按钮、指南针、定位按钮、室内地图控件                                                                               |
| 017  | 017.showLayers                   | （设置-开关4+）地图显示图层：交通、建筑、文字、室内地图                                                                                                                                  |
| 018  | 018.mapIndoorFloorSwitchView     | （开发-创建）自定义室内地图：控件已实现，只需创建其实例                                                                                                                                  |
| 019  | 019.showIndoor                   | （设置-开关1+）显示自定义室内地图：MapIndoorFloorSwitchView                                                                                                                            |
| 020  | 020.showOpenGl                   | （开发-调用）显示自定义图形：MapCubeRender、MapCube                                                                                                                                    |
| 021  | 021.Companion                    | （开发-调用）自定义静态属性：地域级别（国、省、市、区、圈）、离线消息、热力图梯度                                                                                                          |
| 022  | 022.showHeatMap                  | （开发-调用）显示热力图：批量坐标TileOverlay                                                                                                                                           |
| 023  | 023.showOverlayTile              | （开发-调用）显示Tile覆盖物：指定"http://a.tile.openstreetmap.org/%d/%d/%d.png"                                                                                                        |
| 024  | 024.showOverlayGround            | （开发-调用）显示Ground覆盖物：指定坐标范围和图片资源                                                                                                                                   |
| 025  | 025.showOverlayMultiPoint        | （开发-调用）显示MultiPoint覆盖物：指定文本资源                                                                                                                                        |
| 026  | 026.showNavigateArrow            | （开发-调用）显示导航箭头：指定宽度和坐标                                                                                                                                               |
| 027  | 027.showText                     | （开发-调用）显示文本：坐标、文字、字号、字型、字色、背景、角度、深度                                                                                                                     |
| 028  | 028.showMarkers                  | （开发-调用）显示批量Marker                                                                                                                                                           |
| 029  | 029.showMarkerDefault            | （开发-调用）显示原生Marker：标题、详情、可拖动性、是否平坦、刷新频率、原生图标、角度、像素位置、信息窗口                                                                                   |
| 030  | 030.showMarkerRes                | （开发-调用）显示自定义资源Marker：标题、详情、可拖动性、是否平坦、刷新频率、资源图标、角度、像素位置、信息窗口                                                                             |
| 031  | 031.showMarkerView               | （开发-调用）显示自定义视图Marker：标题、详情、可拖动性、是否平坦、刷新频率、视图图标、角度、像素位置、信息窗口                                                                             |
| 032  | 032.showMarkerIcons              | （开发-调用）显示自定义多图Marker：标题、详情、可拖动性、是否平坦、刷新频率、多图图标、角度、像素位置、信息窗口                                                                             |
| 033  | 033.showMarkerLocation           | （开发-调用）显示定位Marker                                                                                                                                                           |
| 034  | 034.showMarkerCar                | （开发-调用）显示汽车Marker                                                                                                                                                           |
| 035  | 035.showMarkerInScreenCenter     | （开发-调用）显示屏中Marker                                                                                                                                                           |
| 036  | 036.showAnimationDrop            | （开发-调用）Marker降低动画                                                                                                                                                           |
| 037  | 037.showAnimationGrow            | （开发-调用）Marker生长动画                                                                                                                                                           |
| 038  | 038.showAnimationGrowClick       | （开发-调用）Marker点击生长动画                                                                                                                                                        |
| 039  | 039.showAnimationJump            | （开发-调用）Marker跳动动画                                                                                                                                                           |
| 040  | 040.showAnimationJumpClick       | （开发-调用）Marker点击跳动动画                                                                                                                                                        |
| 041  | 041.showPolygon                  | （开发-调用）显示多边形：坐标列表、宽度、边框颜色、填充颜色                                                                                                                              |
| 042  | 042.showPolygonRectangle         | （开发-调用）显示矩形：中心坐标、半宽、半高、边框宽度、边框颜色、填充颜色                                                                                                                 |
| 043  | 043.showPolygonEllipse           | （开发-调用）显示椭圆：中心坐标、边框宽度、边框颜色、填充颜色                                                                                                                            |
| 044  | 044.showArc                      | （开发-调用）显示弧线：起点、中点、终点、边框颜色                                                                                                                                       |
| 045  | 045.showCircle                   | （开发-调用）显示圆形：中心坐标、半径、边框宽度、边框颜色、填充颜色                                                                                                                       |
| 046  | 046.showCirclePolyline           | （开发-调用）显示多边圆形：中心坐标、半径、边框宽度、边框颜色、纹理、渐变、虚线、大地                                                                                                      |
| 047  | 047.showPolyline                 | （开发-调用）显示线段：坐标列表、边框宽度、边框颜色、纹理、渐变、虚线、大地                                                                                                               |
| 048  | 048.update                       | （开发-调用）坐标经纬度等值偏移                                                                                                                                                        |
| 049  | 049.showColorsPolyline           | （开发-调用）显示多彩线段：坐标、偏移、边框宽度、边框颜色、纹理、渐变、虚线、大地                                                                                                          |
| 050  | 050.showTexturePolyline          | （开发-调用）显示纹理线段：坐标、偏移、边框宽度                                                                                                                                         |
| 051  | 051.showPolylineInPlayGround     | （开发-调用）显示操场线段：中心坐标、半径、边框宽度、渐变、虚线、大地                                                                                                                     |
| 052  | 052.listenerEvent                | （设置-开关9+）启用事件监听：加载、移动、点击、长按、触摸、兴趣点点击、Marker拖动、Marker点击、信息窗口点击                                                                                |
| 053  | 053.listenerShot                 | （开发-调用）地图截屏                                                                                                                                                                 |
| 054  | 054.cityCode                     | （开发-调用）城市代码处理：截取“-”后部分，搜索公交站点线路需要                                                                                                                           |
| 055  | 055.searchStation                | （开发-调用）搜索公交站点                                                                                                                                                              |
| 056  | 056.searchLine                   | （开发-调用）搜索公交线路：MapBusLineAdapter、MapBusLineOverlay                                                                                                                        |
| 057  | 057.tableId                      | （开发-依赖）搜索云详情需要                                                                                                                                                            |
| 058  | 058.lineId                       | （开发-依赖）搜索云详情需要                                                                                                                                                            |
| 059  | 059.searchById                   | （开发-调用）搜索云详情：通过tableId和lineId                                                                                                                                           |
| 060  | 060.keyWord                      | （开发-依赖）搜索周边范围关键词                                                                                                                                                        |
| 061  | 061.pointCenter                  | （开发-依赖）搜索周边范围中心坐标                                                                                                                                                      |
| 062  | 062.searchByBound                | （开发-调用）搜索周边范围：通过tableId、关键词和中心坐标                                                                                                                                |
| 063  | 063.point1                       | （开发-依赖）多边形坐标1                                                                                                                                                              |
| 064  | 064.point2                       | （开发-依赖）多边形坐标2                                                                                                                                                              |
| 065  | 065.point3                       | （开发-依赖）多边形坐标3                                                                                                                                                              |
| 066  | 066.point4                       | （开发-依赖）多边形坐标4                                                                                                                                                              |
| 067  | 067.searchByPolygon              | （开发-调用）搜索多边形范围：通过tableId、关键词和中心坐标                                                                                                                              |
| 068  | 068.localCityName                | （开发-依赖）本地城市名称                                                                                                                                                              |
| 069  | 069.searchByLocal                | （开发-调用）搜索城市范围：MapCloudOverlay、MapCloudImageCache、MapCloudDetailActivity、MapCloudPreviewActivity                                                                        |
| 070  | 070.searchLatLngByAddress        | （开发-调用）搜索城市地址：地址、城市                                                                                                                                                  |
| 071  | 071.toLatLonPoints               | （开发-调用）双精度数组转经纬度点列表                                                                                                                                                  |
| 072  | 072.searchAddressesByLatLonList  | （开发-调用）搜索地址以经纬度点列表                                                                                                                                                    |
| 073  | 073.point                        | （开发-依赖）经纬度点                                                                                                                                                                 |
| 074  | 074.searchAddressByLatLon        | （开发-调用）搜索地址以经纬度点                                                                                                                                                        |
| 075  | 075.isWithBoundary               | （开发-依赖）是否带行政区划边界                                                                                                                                                        |
| 076  | 076.searchDistrict               | （开发-调用）搜索行政区划                                                                                                                                                              |
| 077  | 077.searchDistrictWithBoundary   | （开发-调用）搜索行政区划带边界                                                                                                                                                        |
| 078  | 078.infoCountry                  | （开发-依赖）国家信息：用于获取，而非赋值                                                                                                                                               |
| 079  | 079.infoProvince                 | （开发-依赖）省州信息：用于获取，而非赋值                                                                                                                                               |
| 080  | 080.infoCity                     | （开发-依赖）城市信息：用于获取，而非赋值                                                                                                                                               |
| 081  | 081.infoDistrict                 | （开发-依赖）区划信息：用于获取，而非赋值                                                                                                                                               |
| 082  | 082.spinnerProvince              | （开发-创建）选择省州：功能已实现，只需创建选择器                                                                                                                                       |
| 083  | 083.spinnerCity                  | （开发-创建）选择城市：功能已实现，只需创建选择器                                                                                                                                       |
| 084  | 084.spinnerDistrict              | （开发-创建）选择区划：功能已实现，只需创建选择器                                                                                                                                       |
| 085  | 085.keywordText                  | （开发-依赖）关键词文本输入框：AutoCompleteTextView类型                                                                                                                                |
| 086  | 086.poiSearchList                | （开发-依赖）兴趣点搜索列表视图：ListView类型                                                                                                                                          |
| 087  | 087.searchPoiSub                 | （开发-调用）搜索子兴趣点：MapPoiListAdapter、MapPoiSubAdapter                                                                                                                         |
| 088  | 088.detailMarker                 | （开发-创建）详情Marker：需要创建                                                                                                                                                      |
| 089  | 089.mPoiName                     | （开发-创建）兴趣点名称：需要创建TextView                                                                                                                                              |
| 090  | 090.mPoiAddress                  | （开发-创建）兴趣点地址：需要创建TextView                                                                                                                                              |
| 091  | 091.mPoiInfo                     | （开发-创建）兴趣点信息：需要创建TextView                                                                                                                                              |
| 092  | 092.mPoiDetail                   | （开发-创建）兴趣点详情：需要创建RelativeLayout                                                                                                                                        |
| 093  | 093.searchPoiId                  | （开发-调用）搜索兴趣点以ID                                                                                                                                                            |
| 094  | 094.searchPoiKeyword             | （开发-调用）搜索兴趣点以关键词：MapPoiOverlay                                                                                                                                         |
| 095  | 095.nextPagePoiKeyword           | （开发-依赖）下一页兴趣点关键词                                                                                                                                                        |
| 096  | 096.resetLastMarker              | （开发-调用）重置最近Marker                                                                                                                                                           |
| 097  | 097.searchPoiAround              | （开发-调用）搜索兴趣点周边                                                                                                                                                            |
| 098  | 098.cityNameTv                   | （开发-创建）城市名称：需要创建TextView                                                                                                                                                |
| 099  | 099.reportTimeLive               | （开发-创建）即报时间：需要创建TextView                                                                                                                                                |
| 100  | 100.weatherTv                    | （开发-创建）天气：需要创建TextView                                                                                                                                                    |
| 101  | 101.temperatureTv                | （开发-创建）温度：需要创建TextView                                                                                                                                                    |
| 102  | 102.windTv                       | （开发-创建）风力：需要创建TextView                                                                                                                                                    |
| 103  | 103.humidityTv                   | （开发-创建）湿度：需要创建TextView                                                                                                                                                    |
| 104  | 104.reportTimeForecast           | （开发-创建）预报时间：需要创建TextView                                                                                                                                                |
| 105  | 105.forecastTv                   | （开发-创建）预报：需要创建TextView                                                                                                                                                    |
| 106  | 106.searchWeatherLiveOrForecast  | （开发-调用）搜索天气即报或预报                                                                                                                                                        |
| 107  | 107.urlView                      | （开发-创建）路线WebView：需要创建                                                                                                                                                     |
| 108  | 108.shareRoute                   | （开发-调用）分享路线：起点、终点                                                                                                                                                      |
| 109  | 109.sharePoi                     | （开发-调用）分享兴趣点：坐标、标题、详情                                                                                                                                               |
| 110  | 110.shareLocation                | （开发-调用）分享定位：坐标、标题、详情                                                                                                                                                 |
| 111  | 111.shareNavi                    | （开发-调用）分享导航：起点、终点                                                                                                                                                      |
| 112  | 112.contentViewPage              | （开发-创建）内容视图页面：功能已实现，需要创建ViewPager                                                                                                                                |
| 113  | 113.textDownload                 | （开发-创建）离线下载动态：功能已实现，需要创建TextView                                                                                                                                 |
| 114  | 114.textDownloaded               | （开发-创建）离线已下载动态：功能已实现，需要创建TextView                                                                                                                               |
| 115  | 115.offlineStartInPause          | （开发-调用）暂停中开始离线下载：MapOfflineListAdapter、MapOfflineDownloadedAdapter、MapOfflinePagerAdapter、MapOfflineChild                                                            |
| 116  | 116.offlineCancelInPause         | （开发-调用）暂停中取消离线下载                                                                                                                                                        |
| 117  | 117.offlineStop                  | （开发-调用）停止离线下载                                                                                                                                                              |
| 118  | 118.offlineLog                   | （开发-调用）离线下载日志                                                                                                                                                              |
| 119  | 119.backImage                    | （开发-依赖）离线结束退出                                                                                                                                                              |
| 120  | 120.metrePerPixel                | （开发-调用）当前每像素地理距离（米）                                                                                                                                                  |
| 121  | 121.distance                     | （开发-调用）两点坐标距离                                                                                                                                                              |
| 122  | 122.markersList                  | （开发-调用）屏显地图所有Marker列表                                                                                                                                                    |
| 123  | 123.markersSize                  | （开发-调用）屏显地图所有Marker数量                                                                                                                                                    |
| 124  | 124.isContain                    | （开发-调用）指定多边形是否包含坐标                                                                                                                                                    |
| 125  | 125.isContain                    | （开发-调用）显示范围内是否包含坐标                                                                                                                                                    |
| 126  | 126.toPoint                      | （开发-调用）经纬度转点                                                                                                                                                               |
| 127  | 127.toLatLng                     | （开发-调用）点转经纬度                                                                                                                                                               |
| 128  | 128.types                        | （开发-调用）地图类型数组：百度、图吧、wgs84、图盟、搜搜、阿里云、谷歌                                                                                                                   |
| 129  | 129.Convert                      | （开发-调用）高德坐标转指定地图类型坐标                                                                                                                                                 |
| 130  | 130.startNavi                    | （开发-调用）导航到Marker坐标                                                                                                                                                         |
| 131  | 131.watchText                    | （开发-调用）AutoCompleteTextView输入文本监测                                                                                                                                          |
| 132  | 132.startMove                    | （开发-调用）按坐标列表移动                                                                                                                                                            |
| 133  | 133.register                     | （开发-调用）注册加速传感器和地磁传感器                                                                                                                                                 |
| 134  | 134.unRegister                   | （开发-调用）取消加速传感器和地磁传感器                                                                                                                                                 |
| 135  | 135.markerRotate                 | （开发-创建）转向Marker：需要创建                                                                                                                                                      |
| 136  | 136.onOrientationListener        | （开发-依赖）方向改变监听器：监听手机转向改变Marker方向                                                                                                                                 |
| 137  | 137.startTrace                   | （开发-调用）开始轨迹纠偏                                                                                                                                                              |
| 138  | 138.stopTrace                    | （开发-调用）停止轨迹纠偏                                                                                                                                                              |
| 139  | 139.distanceSum                  | （开发-调用）纠偏覆盖物总计距离：用户获取，而非赋值                                                                                                                                     |
| 140  | 140.timeWait                     | （开发-调用）纠偏覆盖物等待时间：用户获取，而非赋值                                                                                                                                     |
| 141  | 141.coordinateType               | （开发-调用）设置纠偏坐标类型                                                                                                                                                          |
| 142  | 142.traceGrasp                   | （开发-调用）纠偏控制                                                                                                                                                                 |
| 143  | 143.cleanFinishTrace             | （开发-调用）清除完成纠偏                                                                                                                                                              |
| 144  | 144.setMapFragment               | （开发-调用）MapFragment初始化：Activity中不可用                                                                                                                                       |
| 145  | 145.aMapLocationClientOption     | （开发-依赖）定位选项：可以重设                                                                                                                                                        |
| 146  | 146.locationMsg                  | （开发-调用）定位消息：用户获取，而非赋值，包含定位资料                                                                                                                                  |
| 147  | 147.locationStr                  | （开发-调用）定位资料：用户获取，而非赋值                                                                                                                                               |
| 148  | 148.errorStr                     | （开发-调用）定位错误：用户获取，而非赋值                                                                                                                                               |
| 149  | 149.alarmInterval                | （开发-依赖）定位警报间隔时间                                                                                                                                                          |
| 150  | 150.locationStart                | （开发-调用）开始定位                                                                                                                                                                 |
| 151  | 151.locationStop                 | （开发-调用）停止定位                                                                                                                                                                 |
| 152  | 152.assistantStart               | （开发-调用）开始H5辅助定位                                                                                                                                                            |
| 153  | 153.assistantStop                | （开发-调用）停止H5辅助定位                                                                                                                                                            |
| 154  | 154.locationLast                 | （开发-调用）最近定位                                                                                                                                                                 |
| 155  | 155.locationDestroy              | （开发-调用）销毁定位                                                                                                                                                                 |
| 156  | 156.isAvailable                  | （开发-调用）DPoint可用与否                                                                                                                                                           |
| 157  | 157.Convert                      | （开发-调用）DPoint转指定地图类型DPoint                                                                                                                                                |
| 158  | 158.addCenterMarker              | （开发-调用）添加指定坐标可拖动中心Marker                                                                                                                                              |
| 159  | 159.addPolygonMarker             | （开发-调用）添加指定坐标可拖动多边Marker                                                                                                                                              |
| 160  | 160.locationInfo                 | （开发-调用）定位信息                                                                                                                                                                 |
| 161  | 161.toDPoint                     | （开发-调用）经纬度转DPoint                                                                                                                                                           |
| 162  | 162.customId                     | （开发-依赖）地理围栏自定义ID                                                                                                                                                          |
| 163  | 163.addPolygonFence              | （开发-调用）添加多边形地理围栏                                                                                                                                                        |
| 164  | 164.keyword                      | （开发-依赖）地理围栏关键词                                                                                                                                                            |
| 165  | 165.addDistrictFence             | （开发-调用）添加行政区划地理围栏                                                                                                                                                      |
| 166  | 166.centerLatLng                 | （开发-依赖）地理围栏坐标                                                                                                                                                              |
| 167  | 167.radiusStr                    | （开发-调用）地理围栏半径：转浮点数                                                                                                                                                    |
| 168  | 168.addRoundFence                | （开发-调用）添加周边地理围栏                                                                                                                                                          |
| 169  | 169.poiType                      | （开发-依赖）地理围栏兴趣点类型                                                                                                                                                        |
| 170  | 170.sizeStr                      | （开发-依赖）地理围栏尺寸                                                                                                                                                              |
| 171  | 171.addNearbyFence               | （开发-调用）添加附近地理围栏                                                                                                                                                          |
| 172  | 172.city                         | （开发-依赖）地理围栏城市                                                                                                                                                              |
| 173  | 173.addKeywordFence              | （开发-调用）添加城市关键词地理围栏                                                                                                                                                    |
| 174  | 174.clearGeoFence                | （开发-调用）清除地理围栏                                                                                                                                                              |
| 175  | 175.NoScrollGridView             | 地图依赖控件                                                                                                                                                                          |
| 176  | 176.MapCommon                    | 地图依赖工具                                                                                                                                                                          |
| 177  | 177.MapErrorToast                | 地图依赖错误                                                                                                                                                                          |
| 178  | 178.MapRouteCalculateActivity    | （开发-独立）路线规划：MapRouteSearchActivity、MapTipListAdapter                                                                                                                       |
| 179  | 179.MapRouteActivity             | （开发-独立）路线规划：MapRouteBusDetailActivity、MapRouteDriveDetailActivity、MapRouteRideDetailActivity、MapRouteWalkDetailActivity                                                  |
| 180  | 180.MapRouteBusResultListAdapter | （开发-独立）路线规划：MapRouteBusSegmentListAdapter、MapRouteDriveSegmentListAdapter、MapRouteRideSegmentListAdapter、MapRouteWalkSegmentListAdapter                                  |
| 181  | 181.MapRouteOverlay              | （开发-独立）路线规划：MapRouteBusOverlay、MapRouteDriveOverlay、MapRouteRideOverlay、MapRouteWalkOverlay                                                                              |
| 182  | 182.MapNaviActivity              | （开发-独立）路线导航：MapNaviDriveActivity、MapNaviRideActivity、MapNaviWalkActivity、MapNaviComponentActivity、TtsControllerAMap、TtsController、TtsSystem、TtsIFly、Tts、TtsCallBack |

>1. [Oracle](https://www.oracle.com/cn/index.html)
>2. [Android](https://developer.android.google.cn/index.html)
>3. [JetBrains](https://www.jetbrains.com/)
>4. [MySQL](https://www.mysql.com/)
>5. [Git](https://git-scm.com/)
>6. [Gradle](https://gradle.org/)
>7. [Axure](https://www.axure.com/)
>8. [XMind](https://www.xmind.cn/)
>9. [GitHub](https://github.com/)
>10. [Gitee](https://gitee.com/)
>11. [阿里云](https://www.aliyun.com/)
>12. [腾讯云](https://www.qcloud.com/)
>13. [百度云](https://cloud.baidu.com/)
>14. [高德地图](http://lbs.amap.com/)
>15. [腾讯地图](http://lbs.qq.com/index.html)
>16. [百度地图](http://lbsyun.baidu.com/)
>17. [阿里支付](https://open.alipay.com/platform/home.htm)
>18. [腾讯支付](https://open.weixin.qq.com/)
>19. [银联支付](https://open.unionpay.com/tjweb/index)
>20. [讯飞语音](https://www.xfyun.cn/)
>21. [爪哇示例](http://www.javased.com/)
>22. [在线工具](http://tool.lu/)
>23. [JitPack](https://jitpack.io/)
>24. [ProcessOn](https://www.processon.com/)
>25. [墨刀](https://modao.cc/)
>26. [Kotlin](https://www.kotlincn.net/)
>27. [安卓教程](http://hukai.me/android-training-course-in-chinese/index.html)
>28. [Spring](https://spring.io/)
>29. [菜鸟教程](http://www.runoob.com/)
>30. [黑马教程](http://yun.itheima.com/)
>31. [下载JavaSE](https://www.oracle.com/java/technologies/javase-downloads.html)
>32. [下载AndroidStudio](https://developer.android.google.cn/studio#downloads)
>33. [东软开源镜像](https://mirrors.neusoft.edu.cn/)
>34. [下载IDEA](https://www.jetbrains.com/idea/download/#section=windows)
>35. [下载MySQL](https://dev.mysql.com/downloads/installer/)
>36. [下载Git](https://npm.taobao.org/mirrors/git-for-windows/)
>37. [下载Gradle](https://gradle.org/releases/)
>38. [下载Axure](https://axure.cachefly.net/AxureRP-Setup.exe)
>39. [下载Axure汉化包](https://www.pmyes.com/thread-35068.htm)
>40. [下载XMind](https://www.xmind.cn/download/)

