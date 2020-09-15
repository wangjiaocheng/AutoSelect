# ***库文档***
| 序号 | 类库                                                                                                                                                                                                                                             | 功能 |
|:-----|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----|
| 101  | ### *00.Divider(32)*                                                                                                                                                                                                                            | 分隔 |
| 102  | ### *01.Title(203)*                                                                                                                                                                                                                             | 标题 |
| 103  | ### *02.PopupViewManager：PopupView、BackgroundConstructor、Coordinates、CoordinatesFinder(528)*                                                                                                                                                 | 弹框 |
| 104  | ### *03.ProgressBar(258)*                                                                                                                                                                                                                       | 进度 |
| 105  | ### *04.ProgressRound(165)*                                                                                                                                                                                                                     | 弧度 |
| 106  | ### *05.RunTextView(12)*                                                                                                                                                                                                                        | 跑马 |
| 107  | ### *06.TextAutoZoom(210)*                                                                                                                                                                                                                      | 字调 |
| 108  | ### *07.TextViewVertical(100)*                                                                                                                                                                                                                   | 单滚 |
| 109  | ### *08.TextViewVerticalMore(40)*                                                                                                                                                                                                               | 多滚 |
| 110  | ### *09.AutoImageView(35)*                                                                                                                                                                                                                      | 平滚 |
| 111  | ### *10.PinView：ScaleImageView、ImageSource、ImageViewState、DecoderFactory、ImageDecoder、RegionDecoder(34+2108)*                                                                                                                              | 图调 |
| 112  | ### *11.Captcha(117)*                                                                                                                                                                                                                           | 验证 |
| 113  | ### *12.SwipeCaptcha(392)*                                                                                                                                                                                                                      | 滑块 |
| 114  | ### *13.ScratchCard(48)*                                                                                                                                                                                                                        | 刮刮 |
| 115  | ### *14.CardStackView：AdapterAnimator、AdapterAllMoveDownAnimator、AdapterUpDownAnimator、AdapterUpDownStackAnimator、ViewDataObserver、AdapterDataObservable、ViewHolder、Adapter、AdapterStack、DelegateScrollStack、DelegateScroll(861+36+7)* | 卡组 |
| 116  | ### *15.CobwebView：RotateInfo(411)*                                                                                                                                                                                                            | 蛛网 |
| 117  | ### *16.NetSpeedView(155)*                                                                                                                                                                                                                      | 网速 |
| 118  | ### *17.SeatAirplane(892)*                                                                                                                                                                                                                      | 机座 |
| 119  | ### *18.SeatMovie(717)*                                                                                                                                                                                                                         | 影座 |
| 120  | ### *19.RulerWheelView(464)*                                                                                                                                                                                                                    | 刻度 |
| 121  | ### *20.ShoppingView(362)*                                                                                                                                                                                                                      | 商品 |
| 122  | ### *21.ShineView：ShineButton、PorterShapeImageView、PorterImageView、ShineAnimator、EasingInterpolator、EasingProvider、Ease(699)*                                                                                                             | 点赞 |
| 123  | ### *22.HeartLayout：FloatAnimation、PathAnimator、HeartView(238)*                                                                                                                                                                               | 爱心 |
| 124  | ### *23.Banner：BannerHelper、TypeBannerTrans、BeanPage、PageListener、RecyclerViewHolder、RecyclerBaseAdapter、TypeTrans、Transformer、TransformerCard、TransformerDepthPage、TransformerMz、TransformerZoomOutPage、BeanCircle、BeanRect、TypeIndicatorCircle、IndicatorCircle、IndicatorRect、IndicatorText(1060)*| 横幅 |
| 125  | ### *24.LayoutTab、LayoutLabel：LayoutScroll、LayoutFlow、AttrsHelper、AdapterTab、AdapterLabel、AdapterTemplate、AdapterFlow、FlowListener、FlowListenerAdapter、ActionRect、ActionTri、ActionRound、ActionColor、ActionRes、ActionBase、TextViewTabColor、BeanTab、BeanLabel、TabValue、TabTypeEvaluator、ConstantsFlow、ViewPagerHelper(2052)*| 流式 |
## **控件库widgeter**
>xml资源
>>1. attrs.xml
>>2. colors.xml
>>3. dimens.xml
>>4. integers.xml
### *00.分隔Divider(32)*
>implementation "com.google.android.material:material:1.2.1"
### *01.标题Title(203)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. rootLayout                                     |功能
02 |2. leftLL                                         |功能
03 |3. leftIV                                         |功能
04 |4. leftTV                                         |功能
05 |5. rightLL                                        |功能
06 |6. rightIV                                        |功能
07 |7. rightTV                                        |功能
08 |8. textAutoZoom                                   |功能
09 |9. leftIcon                                       |功能
10 |10. isLeftIconVisibility                          |功能
11 |11. leftText                                      |功能
12 |12. leftTextColor                                 |功能
13 |13. leftTextSize                                  |功能
14 |14. isLeftTextVisibility                          |功能
15 |15. rightIcon                                     |功能
16 |16. isRightIconVisibility                         |功能
17 |17. rightText                                     |功能
18 |18. rightTextColor                                |功能
19 |19. rightTextSize                                 |功能
20 |20. isRightTextVisibility                         |功能
21 |21. title                                         |功能
22 |22. titleColor                                    |功能
23 |23. titleSize                                     |功能
24 |24. isTitleVisibility                             |功能
25 |25. setLeftFinish                                 |功能
26 |26. setLeftListener                               |功能
27 |27. setLeftIconListener                           |功能
28 |28. setLeftTextListener                           |功能
29 |29. setRightListener                              |功能
30 |30. setRightIconListener                          |功能
31 |31. setRightTextListener                          |功能
>- include_helper_title.xml
>- mipmap资源
>>1. previous_icon.png
>>2. set.png
### *02.弹框PopupViewManager：PopupView、BackgroundConstructor、Coordinates、CoordinatesFinder(528)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. TipListener                                    |功能
02 |2. animationDuration                              |功能
03 |3. show                                           |功能
04 |4. clearTipsMap                                   |功能
05 |5. findAndDismiss                                 |功能
06 |6. find                                           |功能
07 |7. dismiss                                        |功能
08 |8. isVisible                                      |功能
09 |#### BackgroundConstructor                        |功能
10 |1. setBackground                                  |功能
11 |#### Coordinates                                  |功能
12 |1. left                                           |功能
13 |2. top                                            |功能
14 |3. right                                          |功能
15 |4. bottom                                         |功能
16 |#### CoordinatesFinder                            |功能
17 |1. getCoordinates                                 |功能
18 |#### PopupView                                    |功能
19 |1. context                                        |功能
20 |2. anchorView                                     |功能
21 |3. rootView                                       |功能
22 |4. message                                        |功能
23 |5. spannableMessage                               |功能
24 |6. isShowArrow                                    |功能
25 |7. backgroundColor                                |功能
26 |8. textColor                                      |功能
27 |9. textSize                                       |功能
28 |10. elevation                                     |功能
29 |11. offsetX                                       |功能
30 |12. offsetY                                       |功能
31 |13. textGravityTemp                               |功能
32 |14. textGravity                                   |功能
33 |15. align                                         |功能
34 |16. position                                      |功能
35 |17. isHideArrow                                   |功能
36 |18. isTextGravityCenter                           |功能
37 |19. isTextGravityLeft                             |功能
38 |20. isTextGravityRight                            |功能
39 |21. isAlignedCenter                               |功能
40 |22. isAlignedLeft                                 |功能
41 |23. isAlignedRight                                |功能
42 |24. isPositionedAbove                             |功能
43 |25. isPositionedBelow                             |功能
44 |26. isPositionedLeftTo                            |功能
45 |27. isPositionedRightTo                           |功能
46 |##### BuilderPopupView                            |功能
47 |1. mContext                                       |功能
48 |2. mAnchorView                                    |功能
49 |3. mRootView                                      |功能
50 |4. mMessage                                       |功能
51 |5. mSpannableMessage                              |功能
52 |6. mIsShowArrow                                   |功能
53 |7. mBackgroundColor                               |功能
54 |8. mTextColor                                     |功能
55 |9. mTextSize                                      |功能
56 |10. mElevation                                    |功能
57 |11. mOffsetX                                      |功能
58 |12. mOffsetY                                      |功能
59 |13. mTextGravity                                  |功能
60 |14. mAlign                                        |功能
61 |15. mPosition                                     |功能
62 |16. BuilderPopupView                              |功能
63 |17. buildPopupView                                |功能
### *03.进度ProgressBar(258)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. isStop                                         |功能
02 |2. isFinish                                       |功能
03 |3. finishLoad                                     |功能
04 |4. progress                                       |功能
05 |5. resetProgress                                  |功能
06 |6. toggle                                         |功能
07 |7. setStop                                        |功能
>flicker.png
### *04.弧度ProgressRound(165)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. circleColor                                    |功能
02 |2. circleProgressColor                            |功能
03 |3. textColor                                      |功能
04 |4. textSize                                       |功能
05 |5. roundWidth                                     |功能
06 |6. max                                            |功能
07 |7. STROKE                                         |功能
08 |8. FILL                                           |功能
09 |9. progress                                       |功能
### *05.跑马RunTextView(12)*
### *06.字调TextAutoZoom(210)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. setNormalization                               |功能
02 |2. minTextSize                                    |功能
03 |3. enableSizeCache                                |功能
>Title
### *07.单滚TextViewVertical(100)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. mTextSize                                      |功能
02 |2. mTextColor                                     |功能
03 |3. mPadding                                       |功能
04 |4. mOnItemClickListener                           |功能
05 |5. titles                                         |功能
06 |6. autoScrollStart                                |功能
07 |7. autoScrollStop                                 |功能
08 |8. setTimeTextStill                               |功能
09 |9. setTimeAnim                                    |功能
### *08.多滚TextViewVerticalMore(40)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. interval                                       |功能
02 |2. animDuration                                   |功能
03 |3. isSetAnimDuration                              |功能
04 |4. onItemClickListener                            |功能
05 |5. setViews                                       |功能
>anim资源
>>1. anim_marquee_in.xml
>>2. anim_marquee_out.xml
### *09.平滚AutoImageView(35)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. imageView                                      |功能
>1. anim_translate.xml
>2. layout_auto_imageview.xml
### *10.图调PinView：ScaleImageView、ImageSource、ImageViewState、DecoderFactory、ImageDecoder、RegionDecoder(34+2108)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. scaleMax                                       |功能
02 |2. scaleDoubleTapDpiZoom                          |功能
03 |3. setOnLongClickListener                         |功能
04 |4. isEnabledZoom                                  |功能
05 |5. scale                                          |功能
06 |6. isReady                                        |功能
07 |7. isEnabledPan                                   |功能
08 |8. onImageEventListener                           |功能
09 |9. isDebug                                        |功能
10 |10. parallelLoadingEnabled                        |功能
11 |11. BuilderAnim                                   |功能
12 |12. animateScale                                  |功能
13 |13. animateCenter                                 |功能
14 |14. animateScaleAndCenter                         |功能
15 |15. isEnabledQuickScale                           |功能
16 |16. viewToSourceCoord                             |功能
17 |17. requiredRotation                              |功能
18 |18. sWidth                                        |功能
19 |19. sHeight                                       |功能
20 |20. minScaleType                                  |功能
21 |21. panLimit                                      |功能
22 |22. minScaleDpi                                   |功能
23 |23. doubleTapZoomStyle                            |功能
24 |24. doubleTapZoomDuration                         |功能
25 |25. setScaleAndCenter                             |功能
26 |26. resetScaleAndCenter                           |功能
27 |27. setTileBackgroundColor                        |功能
28 |28. maxTileWidth                                  |功能
29 |29. maxTileHeight                                 |功能
30 |30. imageDecoder                                  |功能
31 |31. regionDecoder                                 |功能
32 |32. setImage                                      |功能
33 |33. hasImage                                      |功能
34 |34. isImageLoaded                                 |功能
35 |35. orientation                                   |功能
36 |36. state                                         |功能
37 |37. center                                        |功能
38 |38. onStateChangedListener                        |功能
39 |39. sourceToViewCoord                             |功能
40 |40. recycle                                       |功能
41 |41. minTileDpi                                    |功能
42 |42. ORIENTATION_0                                 |功能
43 |43. ORIENTATION_90                                |功能
44 |44. ORIENTATION_180                               |功能
45 |45. ORIENTATION_270                               |功能
46 |46. ORIENTATION_USE_EXIF                          |功能
47 |47. ZOOM_FOCUS_FIXED                              |功能
48 |48. ZOOM_FOCUS_CENTER                             |功能
49 |49. ZOOM_FOCUS_CENTER_IMMEDIATE                   |功能
50 |50. EASE_OUT_QUAD                                 |功能
51 |51. EASE_IN_OUT_QUAD                              |功能
52 |52. PAN_LIMIT_INSIDE                              |功能
53 |53. PAN_LIMIT_OUTSIDE                             |功能
54 |54. PAN_LIMIT_CENTER                              |功能
55 |55. SCALE_TYPE_CENTER_INSIDE                      |功能
56 |56. SCALE_TYPE_CENTER_CROP                        |功能
57 |57. SCALE_TYPE_CUSTOM                             |功能
58 |58. ORIGIN_ANIM                                   |功能
59 |59. ORIGIN_TOUCH                                  |功能
60 |60. ORIGIN_FLING                                  |功能
61 |61. ORIGIN_DOUBLE_TAP_ZOOM                        |功能
62 |62. tileSizeAuto                                  |功能
63 |#### PinView                                      |功能
64 |1. pinS                                           |功能
>mipmap资源
>>1. pushpin_blue.png
>>2. tooltip_arrow_down.9.png
>>3. tooltip_arrow_down_left.9.png
>>4. tooltip_arrow_down_right.9.png
>>5. tooltip_arrow_left.9.png
>>6. tooltip_arrow_right.9.png
>>7. tooltip_arrow_up.9.png
>>8. tooltip_arrow_up_left.9.png
>>9. tooltip_arrow_up_right.9.png
>>10. tooltip_no_arrow.9.png
### *11.验证Captcha(117)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. build                                          |功能
02 |2. mType                                          |功能
03 |3. codeLength                                     |功能
04 |4. makeCode                                       |功能
05 |5. width                                          |功能
06 |6. height                                         |功能
07 |7. color                                          |功能
08 |8. fontSize                                       |功能
09 |9. code                                           |功能
10 |10. lineNumber                                    |功能
11 |11. makeBitmap                                    |功能
12 |12. into                                          |功能
### *12.滑块SwipeCaptcha(392)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. maxSwipeValue                                  |功能
02 |2. onCaptchaMatchCallback                         |功能
03 |3. createCaptcha                                  |功能
04 |4. matchCaptcha                                   |功能
05 |5. resetCaptcha                                   |功能
06 |6. setCurrentSwipeValue                           |功能
### *13.刮刮ScratchCard(48)*
>img_loading.png
### *14.卡组CardStackView：AdapterAnimator、AdapterAllMoveDownAnimator、AdapterUpDownAnimator、AdapterUpDownStackAnimator、ViewDataObserver、AdapterDataObservable、ViewHolder、Adapter、AdapterStack、DelegateScrollStack、DelegateScroll(861+36+7)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. overlapGaps                                    |功能
02 |2. overlapGapsCollapse                            |功能
03 |3. duration                                       |功能
04 |4. numBottomShow                                  |功能
05 |5. itemExpendListener                             |功能
06 |6. selectPosition                                 |功能
07 |7. isExpending                                    |功能
08 |8. clearSelectPosition                            |功能
09 |9. updateSelectPosition                           |功能
10 |10. showHeight                                    |功能
11 |11. clearScrollYAndTranslation                    |功能
12 |12. delegateScroll                                |功能
13 |13. adapterAnimator                               |功能
14 |14. setAnimationType                              |功能
15 |15. scrollEnable                                  |功能
16 |16. totalLength                                   |功能
17 |17. viewScrollX                                   |功能
18 |18. viewScrollY                                   |功能
19 |19. scrollOffset                                  |功能
20 |20. fling                                         |功能
21 |21. getViewHolder                                 |功能
22 |22. performItemClick                              |功能
23 |23. adapterStack                                  |功能
24 |24. cardNext                                      |功能
25 |25. cardPrevious                                  |功能
26 |#### AdapterDataObservable                        |功能
27 |1. notifyChanged                                  |功能
28 |2. hasObservers                                   |功能
29 |#### ViewHolder                                   |功能
30 |1. context                                        |功能
31 |2. itemViewType                                   |功能
32 |3. position                                       |功能
33 |4. onAnimationStateChange                         |功能
34 |5. onItemExpand                                   |功能
35 |#### Adapter                                      |功能
36 |1. itemCount                                      |功能
37 |2. notifyDataSetChanged                           |功能
38 |3. registerObserver                               |功能
39 |4. createView                                     |功能
40 |5. onCreateView                                   |功能
41 |6. bindViewHolder                                 |功能
42 |7. onBindViewHolder                               |功能
43 |8. getItemViewType                                |功能
44 |#### AdapterStack                                 |功能
45 |1. layoutInflater                                 |功能
46 |2. dataList                                       |功能
47 |3. itemCount                                      |功能
48 |4. onBindViewHolder                               |功能
49 |5. getItem                                        |功能
50 |6. bindView                                       |功能
### *15.蛛网CobwebView：RotateInfo(411)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. spiderNameSize                                 |功能
02 |2. spiderMaxLevel                                 |功能
03 |3. spiderColor                                    |功能
04 |4. spiderRadiusColor                              |功能
05 |5. spiderLevelColor                               |功能
06 |6. spiderLevelStrokeColor                         |功能
07 |7. spiderLevelStrokeWidth                         |功能
08 |8. isSpiderLevelStroke                            |功能
09 |9. isSpiderRotate                                 |功能
10 |10. ModelSpider                                   |功能
11 |11. spiderList                                    |功能
12 |#### RotateInfo                                   |功能
13 |1. getAngleRotate                                 |功能
14 |2. getQuadrant                                    |功能
15 |3. getAngle                                       |功能
16 |4. CIRCLE_ANGLE                                   |功能
17 |5. getAngleNormalized                             |功能
### *16.网速NetSpeedView(155)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. isMulti                                        |功能
02 |2. timeInterval                                   |功能
03 |3. updateViewData                                 |功能
04 |4. setTextColor                                   |功能
05 |5. setTextSize                                    |功能
>netspeed_view.xml
### *17.机座SeatAirplane(892)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. setEmptySelecting                              |功能
02 |2. maxSelectStates                                |功能
03 |3. setSeatSelected                                |功能
04 |4. bitmapSeatNormal                               |功能
05 |5. bitmapSeatSelected                             |功能
06 |6. bitmapSeatSelecting                            |功能
07 |7. getFontLength                                  |功能
08 |8. getFontHeight                                  |功能
09 |9. setBitmap                                      |功能
10 |10. goCabinPosition                               |功能
>mipmap资源（Seat共用）
>>1. seat_gray.png
>>2. seat_green.png
>>3. seat_sold.png
### *18.影座SeatMovie(717)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. numRow                                         |功能
02 |2. numColumn                                      |功能
03 |3. lineNumbers                                    |功能
04 |4. setData                                        |功能
05 |5. selectedSeat                                   |功能
06 |6. seatChecker                                    |功能
07 |7. getRowNumber                                   |功能
08 |8. getColumnNumber                                |功能
09 |9. isDrawOverview                                 |功能
10 |10. isRenewOverview                               |功能
11 |11. isDebug                                       |功能
12 |12. screenName                                    |功能
13 |13. isNeedDrawSeatBitmap                          |功能
14 |14. maxSelected                                   |功能
### *19.刻度RulerWheelView(464)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. markAdditionCenter                             |功能
02 |2. selectedPosition                               |功能
03 |3. items                                          |功能
04 |4. OnWheelItemSelectedListener                    |功能
05 |5. minSelectableIndex                             |功能
06 |6. maxSelectableIndex                             |功能
07 |7. smoothSelectIndex                              |功能
08 |8. fling                                          |功能
### *20.商品ShoppingView(362)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. onShoppingClickListener                        |功能
02 |2. setTextNum                                     |功能
### *21.点赞ShineView：ShineButton、PorterShapeImageView、PorterImageView、ShineAnimator、EasingInterpolator、EasingProvider、Ease(699)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. clickValue                                     |功能
02 |2. colorRandom                                    |功能
03 |3. enableFlashing                                 |功能
04 |4. allowRandomColor                               |功能
05 |5. shineColorBig                                  |功能
06 |6. shineColorSmall                                |功能
07 |7. shineSize                                      |功能
08 |8. shineCount                                     |功能
09 |9. animDuration                                   |功能
10 |10. animDurationClick                             |功能
11 |11. shineTurnAngle                                |功能
12 |12. smallShineOffsetAngle                         |功能
13 |13. shineDistanceMultiple                         |功能
14 |14. showAnimation                                 |功能
### *22.爱心HeartLayout：FloatAnimation、PathAnimator、HeartView(238)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. addHeart                                       |功能
>mipmap
>>1. anim_heart.png
>>2. anim_heart_border.png
### *23.横幅Banner：BannerHelper、TypeBannerTrans、BeanPage、PageListener、RecyclerViewHolder、RecyclerBaseAdapter、TypeTrans、Transformer、TransformerCard、TransformerDepthPage、TransformerMz、TransformerZoomOutPage、BeanCircle、BeanRect、TypeIndicatorCircle、IndicatorCircle、IndicatorRect、IndicatorText(1060)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. viewPager2                                     |功能
02 |2. setCurrentPosition                             |功能
03 |3. addIndicator                                   |功能
04 |4. addPageBean                                    |功能
05 |5. isOutVisibleWindow                             |功能
06 |6. stopAnim                                       |功能
07 |7. startAnim                                      |功能
08 |8. setPageListener                                |功能
09 |9. addPagerData                                   |Indicator
10 |10. addRectBean                                   |Indicator
### *24.流式LayoutTab、LayoutLabel：LayoutScroll、LayoutFlow、AttrsHelper、AdapterTab、AdapterLabel、AdapterTemplate、AdapterFlow、FlowListener、FlowListenerAdapter、ActionRect、ActionTri、ActionRound、ActionColor、ActionRes、ActionBase、TextViewTabColor、BeanTab、BeanLabel、TabValue、TabTypeEvaluator、ConstantsFlow、ViewPagerHelper(2052)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. isLabelFlow                                    |LayoutFlowTab
02 |2. setItemAnim                                    |LayoutFlowTab
03 |3. isItemClick                                    |LayoutFlowTab
04 |4. setSelectedColor                               |LayoutFlowTab
05 |5. setItemClickByOutSet                           |LayoutFlowTab
06 |6. setDefaultPosition                             |LayoutFlowTab
07 |7. setTextId                                      |LayoutFlowTab
08 |8. setCusAction                                   |LayoutFlowTab
09 |9. mAdapter                                       |LayoutFlowTab
10 |10.setTabBean                                     |LayoutFlowTab
11 |11.isTabAutoScroll                                |LayoutFlowTab
12 |12.setUnSelectedColor                             |LayoutFlowTab
13 |13.setViewPager                                   |LayoutFlowTab
14 |14.mMaxSelectCount                                |LayoutFlowLabel
15 |15.isAutoScroll                                   |LayoutFlowLabel
16 |16.isLabelAutoScroll                              |LayoutFlowLabel
17 |17.setLabelBean                                   |LayoutFlowLabel
18 |18.setSelects                                     |LayoutFlowLabel
19 |19.setAdapter                                     |LayoutFlowLabel
>implementation "androidx.constraintlayout:constraintlayout:2.0.1"