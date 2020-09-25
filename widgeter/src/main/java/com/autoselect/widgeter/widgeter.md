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
| 125  | ### *24.LayoutTab、LayoutLabel：LayoutScroll、LayoutFlow、AttrsHelper、AdapterTab、AdapterLabel、AdapterTemplate、AdapterFlow、FlowListener、FlowListenerAdapter、ActionRect、ActionTri、ActionRound、ActionColor、ActionRes、ActionBase、ActionDot、TextViewTabColor、BeanTab、BeanLabel、TabValue、TabTypeEvaluator、ConstantsFlow、ViewPagerHelper(2080)*| 流式 |
| 126  | ### *25.BaseAdapterQuick、BaseAdapterBinder、BaseAdapterMultiDelegate、BaseAdapterMultiProvider(BaseAdapterNode)、BaseAdapterMultiQuick(BaseAdapterSectionQuick)、ViewHolderBase：......(2732)*                                                  | 回收 |
## **控件库widgeter**
>- xml资源
>>1. attrs.xml
>>2. colors.xml
>>3. dimens.xml
>>4. integers.xml
### *00.分隔Divider(32)*
>- implementation "com.google.android.material:material:1.2.1"
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
>- flicker.png
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
>- Title
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
>- anim资源
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
>- mipmap资源
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
>- img_loading.png
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
>- netspeed_view.xml
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
>- mipmap资源（Seat共用）
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
>- mipmap
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
### *24.流式LayoutTab、LayoutLabel：LayoutScroll、LayoutFlow、AttrsHelper、AdapterTab、AdapterLabel、AdapterTemplate、AdapterFlow、FlowListener、FlowListenerAdapter、ActionRect、ActionTri、ActionRound、ActionColor、ActionRes、ActionBase、ActionDot、TextViewTabColor、BeanTab、BeanLabel、TabValue、TabTypeEvaluator、ConstantsFlow、ViewPagerHelper(2080)*
序号|方法|功能
---|--------------------------------------------------|---
01 |1. isLabelFlow                                    |LayoutTab
02 |2. setItemAnim                                    |LayoutTab
03 |3. isItemClick                                    |LayoutTab
04 |4. setSelectedColor                               |LayoutTab
05 |5. setItemClickByOutSet                           |LayoutTab
06 |6. setDefaultPosition                             |LayoutTab
07 |7. setTextId                                      |LayoutTab
08 |8. setCusAction                                   |LayoutTab
09 |9. mAdapter                                       |LayoutTab
10 |10.setTabBean                                     |LayoutTab
11 |11.isTabAutoScroll                                |LayoutTab
12 |12.setUnSelectedColor                             |LayoutTab
13 |13.setViewPager                                   |LayoutTab
14 |1 .mMaxSelectCount                                |LayoutLabel
15 |2. isAutoScroll                                   |LayoutLabel
16 |3. isLabelAutoScroll                              |LayoutLabel
17 |4. setLabelBean                                   |LayoutLabel
18 |5. setSelects                                     |LayoutLabel
19 |6. setAdapter                                     |LayoutLabel
>- implementation "androidx.constraintlayout:constraintlayout:2.0.1"
### *25.回收BaseAdapterQuick、BaseAdapterBinder、BaseAdapterMultiDelegate、BaseAdapterMultiProvider(BaseAdapterNode)、BaseAdapterMultiQuick(BaseAdapterSectionQuick)、ViewHolderBase：......(2732)*
序号|方法|功能（RecyclerView可嵌套：setHasFixedSize(true)、layoutManager、adapter）
---|--------------------------------------------------|---
01 |1. data                                           |BaseAdapterQuick需要适配的数据
02 |2. loadMoreModule                                 |BaseAdapterQuick加载更多模块，需继承LoadMoreModule
03 |3. upFetchModule                                  |BaseAdapterQuick向上加载模块，需继承UpFetchModule
04 |4. draggableModule                                |BaseAdapterQuick拖拽模块，需继承DraggableModule
05 |5. convert                                        |BaseAdapterQuick适配器必须实现，用Diff时必须实现带payloads方法
06 |6. onCreateDefViewHolder                          |BaseAdapterQuick
07 |7. headerLayoutCount                              |BaseAdapterQuick
08 |8. getItem                                        |BaseAdapterQuick获取data中数据项
09 |9. getItemOrNull                                  |BaseAdapterQuick
10 |10.getItemPosition                                |BaseAdapterQuick
11 |11.animationEnable                                |BaseAdapterQuick动画设置启用
12 |12.adapterAnimation                               |BaseAdapterQuick动画自定义赋值
13 |13.setAnimationWithDefault                        |BaseAdapterQuick动画设置默认类型
14 |14.isAnimationFirstOnly                           |BaseAdapterQuick动画是否仅首次运行，改变后适配器notifyDataSetChanged()
15 |15.recyclerView                                   |BaseAdapterQuick
16 |16.headerViewAsFlow                               |BaseAdapterQuick
17 |17.footerViewAsFlow                               |BaseAdapterQuick
18 |18.isUseEmpty                                     |BaseAdapterQuick
19 |19.hasEmptyView                                   |BaseAdapterQuick
20 |20.headerWithEmptyEnable                          |BaseAdapterQuick
21 |21.footerWithEmptyEnable                          |BaseAdapterQuick
22 |22.hasHeaderLayout                                |BaseAdapterQuick
23 |23.hasFooterLayout                                |BaseAdapterQuick
24 |24.footerLayoutCount                              |BaseAdapterQuick
25 |25.getItemCount                                   |BaseAdapterQuick
26 |26.getDefItemCount                                |BaseAdapterQuick
27 |27.getItemId                                      |BaseAdapterQuick
28 |28.getItemViewType                                |BaseAdapterQuick
29 |29.getDefItemViewType                             |BaseAdapterQuick
30 |30.setGridSpanSizeLookup                          |BaseAdapterQuick
31 |31.onItemClickListener                            |BaseAdapterQuick控件点击监听器
32 |32.setOnItemClickListener                         |BaseAdapterQuick控件点击监听器设置
33 |33.onItemLongClickListener                        |BaseAdapterQuick控件长按监听器
34 |34.setOnItemLongClickListener                     |BaseAdapterQuick控件长按监听器设置
35 |35.onItemChildClickListener                       |BaseAdapterQuick子控件点击监听器
36 |36.setOnItemChildClickListener                    |BaseAdapterQuick子控件点击监听器设置
37 |37.onItemChildLongClickListener                   |BaseAdapterQuick子控件长按监听器
38 |38.setOnItemChildLongClickListener                |BaseAdapterQuick子控件长按监听器设置
39 |39.childClickViewIds                              |BaseAdapterQuick可点击子控件ID列表
40 |40.addChildClickViewIds                           |BaseAdapterQuick必须先添加可点击子控件ID
41 |41.childLongClickViewIds                          |BaseAdapterQuick可长按子控件ID列表
42 |42.addChildLongClickViewIds                       |BaseAdapterQuick必须先添加可长按子控件ID
43 |43.headerLayout                                   |BaseAdapterQuick
44 |44.setHeaderView                                  |BaseAdapterQuick设置空布局layoutInflater.inflate(R.layout.empty_view, recyclerView, false)
45 |45.headerViewPosition                             |BaseAdapterQuick
46 |46.addHeaderView                                  |BaseAdapterQuick添加头布局layoutInflater.inflate(R.layout.head_view, recyclerView, false)
47 |47.removeHeaderView                               |BaseAdapterQuick移除头布局
48 |48.removeAllHeaderView                            |BaseAdapterQuick
49 |49.footerLayout                                   |BaseAdapterQuick
50 |50.setFooterView                                  |BaseAdapterQuick
51 |51.footerViewPosition                             |BaseAdapterQuick
52 |52.addFooterView                                  |BaseAdapterQuick添加脚布局layoutInflater.inflate(R.layout.footer_view, recyclerView, false)
53 |53.removeFooterView                               |BaseAdapterQuick移除脚布局
54 |54.removeAllFooterView                            |BaseAdapterQuick
55 |55.emptyLayout                                    |BaseAdapterQuick
56 |56.setEmptyView                                   |BaseAdapterQuick
57 |57.removeEmptyView                                |BaseAdapterQuick
58 |58.setDiffCallback                                |BaseAdapterQuick设置Diff回调生成Diff配置，setDiffNewData之前使用
59 |59.differ                                         |BaseAdapterQuick获取Diff
60 |60.setDiffConfig                                  |BaseAdapterQuick设置Diff配置，setDiffNewData之前使用
61 |61.setDiffNewData                                 |BaseAdapterQuick设置新实例用Diff或DiffResult（差异更新），先setDiffCallback或setDiffConfig
62 |62.setNewInstance                                 |BaseAdapterQuick设置新实例
63 |63.setList                                        |BaseAdapterQuick设置新data数据
64 |64.setData                                        |BaseAdapterQuick改变指定位置data数据
65 |65.addData                                        |BaseAdapterQuick添加指定或不指定位置单条或批量data数据
66 |66.removeAt                                       |BaseAdapterQuick删除data数据根据指定位置
67 |67.remove                                         |BaseAdapterQuick删除data数据根据指定数据
68 |1. getItemBinder                                  |BaseAdapterBinder
69 |2. addItemBinder                                  |BaseAdapterBinder
70 |3. convert                                        |BaseAdapterBinder
71 |4. getItemBinderOrNull                            |BaseAdapterBinder
72 |1. multiTypeDelegate                              |BaseAdapterMultiDelegate
73 |1. getItemType                                    |BaseAdapterMultiProvider
74 |2. getItemProvider                                |BaseAdapterMultiProvider
75 |3. addItemProvider                                |BaseAdapterMultiProvider
76 |1. addFooterNodeProvider                          |BaseAdapterNode
77 |2. addFullSpanNodeProvider                        |BaseAdapterNode
78 |3. addNodeProvider                                |BaseAdapterNode
79 |4. addItemProvider                                |BaseAdapterNode
80 |5. setDiffNewData                                 |BaseAdapterNode
81 |6. setNewInstance                                 |BaseAdapterNode
82 |7. setList                                        |BaseAdapterNode
83 |8. addData                                        |BaseAdapterNode
84 |9. setData                                        |BaseAdapterNode
85 |10.removeAt                                       |BaseAdapterNode
86 |11.nodeAddData                                    |BaseAdapterNode
87 |12.nodeRemoveData                                 |BaseAdapterNode
88 |13.nodeSetData                                    |BaseAdapterNode
89 |14.nodeReplaceChildData                           |BaseAdapterNode
90 |15.collapse                                       |BaseAdapterNode
91 |16.expand                                         |BaseAdapterNode
92 |17.expandOrCollapse                               |BaseAdapterNode
93 |18.collapseAndChild                               |BaseAdapterNode
94 |19.expandAndChild                                 |BaseAdapterNode
95 |20.expandAndCollapseOther                         |BaseAdapterNode
96 |21.findParentNode                                 |BaseAdapterNode
97 |1. addItemType                                    |BaseAdapterMultiQuick
98 |1. setNormalLayout                                |BaseAdapterSectionQuick
99 |2. convertHeader                                  |BaseAdapterSectionQuick
100|1. getView                                        |ViewHolderBase根据ID从数组获取控件，LoadMoreViewBase需用，LayoutInflater.from(parent.context).inflate(R.layout.view_load_more, parent, false)
101|2. getViewOrNull                                  |ViewHolderBase根据ID从数组获取控件，无则放入数组
102|3. findView                                       |ViewHolderBase根据ID获取控件
103|4. setText                                        |ViewHolderBase设置控件文本
104|5. setTextRes                                     |ViewHolderBase设置控件文本资源
105|6. setTextColor                                   |ViewHolderBase设置控件颜色
106|7. setTextColorRes                                |ViewHolderBase设置控件颜色资源
107|8. setImageResource                               |ViewHolderBase设置控件资源
108|9. setImageDrawable                               |ViewHolderBase设置控件Drawable
109|10.setImageBitmap                                 |ViewHolderBase设置控件Bitmap
110|11.setBackgroundColor                             |ViewHolderBase设置控件背景颜色
111|12.setBackgroundResource                          |ViewHolderBase设置控件背景资源
112|13.setVisible                                     |ViewHolderBase设置控件可见性，INVISIBLE占位不可见
113|14.setGone                                        |ViewHolderBase设置控件隐藏性，GONE隐藏不可见
114|15.setEnabled                                     |ViewHolderBase设置控件可用性
115|1. loadMoreView                                   |LoadMoreModuleBase重设加载更多视图
116|2. loadMoreStatus                                 |LoadMoreModuleBase加载更多状态：正在加载、完成、失败、结束
117|3. isLoading                                      |LoadMoreModuleBase获取是否正在加载
118|4. isEnableLoadMore                               |LoadMoreModuleBase是否能够加载更多，临时false防止下拉刷新同时上拉加载
119|5. isLoadEndMoreGone                              |LoadMoreModuleBase加载更多是否隐藏
120|6. hasLoadMoreView                                |LoadMoreModuleBase是否存在加载更多视图
121|7. setOnLoadMoreListener                          |LoadMoreModuleBase设置加载更多监听器
122|8. enableLoadMoreEndClick                         |LoadMoreModuleBase是否启用加载更多结束点击
123|9. isAutoLoadMore                                 |LoadMoreModuleBase是否自动加载更多
124|10.preLoadNumber                                  |LoadMoreModuleBase预加载数量
125|11.isEnableLoadMoreIfNotFullPage                  |LoadMoreModuleBase数据不满一屏是否继续自动加载更多
126|12.checkDisableLoadMoreIfNotFullPage              |LoadMoreModuleBase如果不能满页，取消加载更多
127|13.loadMoreFail                                   |LoadMoreModuleBase加载更多失败处理
128|14.loadMoreComplete                               |LoadMoreModuleBase加载更多完成处理
129|15.loadMoreEnd                                    |LoadMoreModuleBase加载更多结束处理，最后一页
130|1. setOnUpFetchListener                           |UpFetchModuleBase设置向上加载监听器
131|2. isUpFetchEnable                                |UpFetchModuleBase是否能够向上加载
132|3. isUpFetching                                   |UpFetchModuleBase是否正在向上加载
133|4. startUpFetchPosition                           |UpFetchModuleBase开始向上加载位置
134|1. toggleViewId                                   |DraggableModuleBase切换视图ID
135|2. hasToggleView                                  |DraggableModuleBase是否具有切换视图
136|3. isDragEnabled                                  |DraggableModuleBase设置是否可拖拽
137|4. isDragOnLongPressEnabled                       |DraggableModuleBase切换长按拖拽状态
138|5. setOnItemDragListener                          |DraggableModuleBase设置条目拖拽监听器
139|6. isSwipeEnabled                                 |DraggableModuleBase设置是否可侧滑
140|7. setOnItemSwipeListener                         |DraggableModuleBase设置条目侧滑监听器
```xml
    <data>
        <variable
            name="name"
            type="com.autoselect.widgeter.Name" />
    </data><!--DataBindingHolderBase-->
```
```kotlin
    val bottomDataPosition: Int
        get() = (upFetchAdapter?.headerLayoutCount ?: 0) + (upFetchAdapter?.data?.size ?: 0) - 1//底部数据位置
    (recyclerView?.layoutManager as LinearLayoutManager?)?.scrollToPositionWithOffset(bottomDataPosition, 0)//滚动到底部不带动画
    recyclerView?.post { recyclerView?.smoothScrollToPosition(bottomDataPosition) }//滚动到底部带动画
    fun requestUpFetch(data: List<E>) {
        count++//记录加载次数
        upFetchAdapter?.apply {
            upFetchModule.isUpFetching = true//设置正在加载
            recyclerView.postDelayed({
                addData(0, data)//向上加载数据
                upFetchModule.isUpFetching = false//设置未正加载
                if (count > countMax) upFetchModule.isUpFetchEnable = false//全部加载后禁止向上加载
            }, 300)
        }
    }//向上加载监听器内加载实现

    override fun onItemDragStart(viewHolder: RecyclerView.ViewHolder?, pos: Int) {
        val startColor = Color.WHITE
        val endColor = Color.rgb(245, 245, 245)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            ValueAnimator.ofArgb(startColor, endColor).apply {
                addUpdateListener { (viewHolder as ViewHolderBase?)?.itemView?.setBackgroundColor(it.animatedValue as Int) }
                duration = 300
            }.start()
    }//拖拽监听器方法内动画实现
    override fun onItemDragEnd(viewHolder: RecyclerView.ViewHolder?, pos: Int) {
        val startColor = Color.rgb(245, 245, 245)
        val endColor = Color.WHITE
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
            ValueAnimator.ofArgb(startColor, endColor).apply {
                addUpdateListener { (viewHolder as ViewHolderBase?)?.itemView?.setBackgroundColor(it.animatedValue as Int) }
                duration = 300
            }.start()
    }//拖拽监听器方法内动画实现
    override fun onItemSwipeMoving(canvas: Canvas?, viewHolder: RecyclerView.ViewHolder?, dX: Float, dY: Float, isCurrentlyActive: Boolean) {
        canvas?.drawColor(Color.parseColor("#00DDB6"))
    }//侧滑监听器方法内变色实现
    dragAndSwipeAdapter?.draggableModule?.itemTouchHelperCallback?.setDragMoveFlags(
            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT or
                    ItemTouchHelper.UP or ItemTouchHelper.DOWN)//设置拖拽监听器后设置
    dragAndSwipeAdapter?.draggableModule?.itemTouchHelperCallback
            ?.setSwipeMoveFlags(ItemTouchHelper.START or ItemTouchHelper.END)//设置侧滑监听器后设置
```
>- drawable
>>1. recycler_loading_progress.xml
>>2. recycler_loading.png
>- layout:recycler_load_more.xml
>- values:ids.xml
>>1. strings:CN
>>2. strings:HK
### *附*
```kotlin
        setSupportActionBar(toolbar)//先设置才能使用
        supportActionBar?.apply {
            setHomeButtonEnabled(false)//不可点左上角图标
            setDisplayHomeAsUpEnabled(false)//不显示左上角返回图标
            setDisplayShowHomeEnabled(false)//不显示左上角程序图标
            setDisplayShowTitleEnabled(false)//不显示标题
            setDisplayShowCustomEnabled(false)//不显示普通View
        }//Toolbar
        swipeRefreshLayout?.apply {
            isRefreshing = true//可刷新
            setColorSchemeColors()//刷新进度条颜色
            setColorSchemeResources()//刷新进度条颜色资源
            setOnRefreshListener { refresh() }//刷新监听
        }//SwipeRefreshLayout、FloatingActionButton
```