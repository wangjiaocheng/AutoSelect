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

## **控件库widgeter**

| 序号 | 类库                                                                      | 类别           |
|:-----|:-------------------------------------------------------------------------|:---------------|
| 001  | *001.LayoutTab(LayoutLabel)*                                             | Layouts行列格面 |
| 002  | *002.BaseAdapterBinder(BaseAdapterQuick)*                                | Containers条目  |
| 003  | *003.Banner、CardStackView*                                              | Containers页目  |
| 004  | *004.Title、Side*                                                        | Containers栏目  |
| 005  | *005.无*                                                                 | Helpers助手     |
| 006  | *006.Cobweb、NetSpeedView、SeatAirplane、SeatMovie*                      | Widgets通用     |
| 007  | *007.PinView、Captcha、SwipeCaptcha、AutoImage、ScratchCard、HeartLayout* | Widgets图片    |
| 008  | *008.Seek、RulerWheel、Wave、ProgressRound、ProgressView、Divider*        | Widgets条框    |
| 009  | *009.ShoppingView、ShineView*                                            | Buttons执行     |
| 010  | *010.无*                                                                 | Buttons选择     |
| 011  | *011.TextAutoZoom、RunText、TextVertical、TextVerticalMore*              | Text显示        |
| 012  | *012.无*                                                                 | Text输入        |
| 013  | *013.NoticeHelper*                                                       | Remind强烈      |
| 014  | *014.PopupImply、PopupSingle、PopupViewManager*                          | Remind安静      |

| 序号 | 类库                                                                                                                                                                                                                                                                                                                                                   | 功能 |
|:-----|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:-----|
| 001  | *001.LayoutTab、LayoutLabel：LayoutScroll、LayoutFlow、AttrsHelper、AdapterTab、AdapterLabel、AdapterTemplate、AdapterFlow、FlowListener、FlowListenerAdapter、ActionRect、ActionTri、ActionRound、ActionColor、ActionRes、ActionBase、ActionDot、TextViewTabColor、BeanTab、BeanLabel、TabValue、TabTypeEvaluator、ConstantsFlow、ViewPagerHelper(2120)* | 流式 |
| 002  | *002.BaseAdapterQuick、BaseAdapterBinder、BaseAdapterMultiDelegate、BaseAdapterMultiProvider(BaseAdapterNode)、BaseAdapterMultiQuick(BaseAdapterSectionQuick)、ViewHolderBase、LoadMoreModuleBase、UpFetchModuleBase、DraggableModuleBase：......(2963)*                                                                                                | 回收 |
| 003  | *003.Banner：BannerHelper、TypeBannerTrans、BeanPage、PageListener、RecyclerViewHolder、RecyclerBaseAdapter、TypeTrans、Transformer、TransformerCard、TransformerDepthPage、TransformerMz、TransformerZoomOutPage、BeanCircle、BeanRect、TypeIndicatorCircle、IndicatorCircle、IndicatorRect、IndicatorText(1060)*                                       | 横幅 |
| 004  | *004.CardStackView：AdapterAnimator、AdapterAllMoveDownAnimator、AdapterUpDownAnimator、AdapterUpDownStackAnimator、ViewDataObserver、AdapterDataObservable、ViewHolder、Adapter、AdapterStack、DelegateScrollStack、DelegateScroll(861+36+7)*                                                                                                          | 卡组 |
| 005  | *005.Title(203)*                                                                                                                                                                                                                                                                                                                                      | 标题 |
| 006  | *006.Side(240)*                                                                                                                                                                                                                                                                                                                                       | 侧边 |
| 007  | *007.Cobweb：RotateInfo(411)*                                                                                                                                                                                                                                                                                                                         | 蛛网 |
| 008  | *008.NetSpeedView(155)*                                                                                                                                                                                                                                                                                                                               | 网速 |
| 009  | *009.SeatAirplane(890)*                                                                                                                                                                                                                                                                                                                               | 机座 |
| 010  | *010.SeatMovie(717)*                                                                                                                                                                                                                                                                                                                                  | 影座 |
| 011  | *011.PinView：ScaleImageView、ImageSource、ImageViewState、DecoderFactory、ImageDecoder、RegionDecoder(34+2115)*                                                                                                                                                                                                                                       | 图调 |
| 012  | *012.Captcha(117)*                                                                                                                                                                                                                                                                                                                                    | 验证 |
| 013  | *013.SwipeCaptcha(393)*                                                                                                                                                                                                                                                                                                                               | 滑块 |
| 014  | *014.AutoImage(35)*                                                                                                                                                                                                                                                                                                                                   | 平滚 |
| 015  | *015.ScratchCard(48)*                                                                                                                                                                                                                                                                                                                                 | 刮刮 |
| 016  | *016.HeartLayout：FloatAnimation、PathAnimator、HeartView(241)*                                                                                                                                                                                                                                                                                        | 爱心 |
| 017  | *017.Seek(755)*                                                                                                                                                                                                                                                                                                                                       | 拖动 |
| 018  | *018.RulerWheel(464)*                                                                                                                                                                                                                                                                                                                                 | 刻度 |
| 019  | *019.Wave(231)*                                                                                                                                                                                                                                                                                                                                       | 水波 |
| 020  | *020.ProgressRound(165)*                                                                                                                                                                                                                                                                                                                              | 弧度 |
| 021  | *021.ProgressView(258)*                                                                                                                                                                                                                                                                                                                               | 进度 |
| 022  | *022.Divider(32)*                                                                                                                                                                                                                                                                                                                                     | 分隔 |
| 023  | *023.ShoppingView(362)*                                                                                                                                                                                                                                                                                                                               | 商品 |
| 024  | *024.ShineView：ShineButton、PorterShapeImageView、PorterImageView、ShineAnimator、EasingInterpolator、EasingProvider、Ease(699)*                                                                                                                                                                                                                      | 点赞 |
| 025  | *025.TextAutoZoom(210)*                                                                                                                                                                                                                                                                                                                               | 字调 |
| 026  | *026.RunText(12)*                                                                                                                                                                                                                                                                                                                                     | 跑马 |
| 027  | *027.TextVertical(100)*                                                                                                                                                                                                                                                                                                                               | 单滚 |
| 028  | *028.TextVerticalMore(40)*                                                                                                                                                                                                                                                                                                                            | 多滚 |
| 029  | *029.NoticeHelper：NoticeBase、NoticeBigPic、NoticeBigText、NoticeMailbox、NoticeProgress、NoticeCustomView(473)*                                                                                                                                                                                                                                      | 通知 |
| 030  | *030.PopupImply(31)*                                                                                                                                                                                                                                                                                                                                  | 说明 |
| 031  | *031.PopupSingle(111)*                                                                                                                                                                                                                                                                                                                                | 弹表 |
| 032  | *032.PopupViewManager：PopupView、BackgroundConstructor、Coordinates、CoordinatesFinder(533)*                                                                                                                                                                                                                                                          | 弹框 |

>- values
>
>>1. [attrs.xml](../../../../res/values/attrs.xml)
>>2. [colors.xml](../../../../res/values/colors.xml)
>>3. [dimens.xml](../../../../res/values/dimens.xml)
>>4. [integers.xml](../../../../res/values/integers.xml)

### *001.流式LayoutTab、LayoutLabel：LayoutScroll、LayoutFlow、AttrsHelper、AdapterTab、AdapterLabel、AdapterTemplate、AdapterFlow、FlowListener、FlowListenerAdapter、ActionRect、ActionTri、ActionRound、ActionColor、ActionRes、ActionBase、ActionDot、TextViewTabColor、BeanTab、BeanLabel、TabValue、TabTypeEvaluator、ConstantsFlow、ViewPagerHelper(2120)*

| 序号 | 方法                     | 功能                                                             |
|:-----|:-------------------------|:----------------------------------------------------------------|
| 01   | 01. setTabBean           | LayoutTab设置BeanTab，覆盖xml默认                                |
| 02   | 02. setViewPager         | LayoutTab设置ViewPager                                           |
| 03   | 03. setDefaultPosition   | LayoutTab设置默认位置                                            |
| 04   | 04. setTextId            | LayoutTab不设置颜色选择不起作用                                   |
| 05   | 05. setSelectedColor     | LayoutTab设置选中颜色，在TabTextColorView不起作用                 |
| 06   | 06. setUnSelectedColor   | LayoutTab设置默认颜色，在TabTextColorView不起作用                 |
| 07   | 07. mAdapter             | LayoutTab设置AdapterTab                                          |
| 08   | 08. isItemClick          | LayoutTab是否item被点击                                          |
| 09   | 09. setItemClickByOutSet | LayoutTab由外部设置位置，为不是自身点击，常用于recyclerview联动效果 |
| 10   | 10. setCusAction         | LayoutTab设置自定义ActionBase，替代库内Action                     |
| 11   | 11. setItemAnim          | LayoutTab设置某个item动画                                        |
| 12   | 01. mMaxSelectCount      | LayoutLabel多选最大个数                                          |
| 13   | 02. isAutoScroll         | LayoutLabel是否自动滚动                                          |
| 14   | 03. setLabelBean         | LayoutLabel设置BeanLabel                                         |
| 15   | 04. setSelects           | LayoutLabel设置选中标签                                          |
| 16   | 05. setAdapter           | LayoutLabel设置AdapterLabel                                      |
| 17   | 01. LOOP_COUNT           | ViewPagerHelper循环计数                                          |
| 18   | 02. LOOP_TAIL_MODE       | ViewPagerHelper循环跟踪模式                                      |
| 19   | 03. LOOP_MODE            | ViewPagerHelper循环模式                                          |
| 20   | 04. GLIDE_MODE           | ViewPagerHelper“Glide”模式                                       |
| 21   | 05. VIEWPAGER_DATA_URL   | ViewPagerHelper数据类型URL                                       |
| 22   | 06. VIEWPAGER_DATA_RES   | ViewPagerHelper数据类型res                                       |
| 23   | 07. VIEWPAGER_DATA_VIEW  | ViewPagerHelper数据类型View                                      |
| 24   | 08. getViewPageClickItem | ViewPagerHelper获取当前点击item                                  |
| 25   | 09. initSwitchTime       | ViewPagerHelper重设切换时间                                      |
| 26   | 10. tabColors            | RandomColor随机颜色列表                                          |
| 27   | 11. randomTagColor       | RandomColor获取随机颜色                                          |
| 28   | 12. getColorDrawable     | RandomColor获取随机颜色GradientDrawable                          |

```kotlin
class TabActivity : AppCompatActivity() {
    private val mTitle: MutableList<String?> =
        ArrayList(listOf(*"0 1 2 3 4 5 6 7 8 9 ".split(" ".toRegex()).toTypedArray()))
    private val mFragments: MutableList<Fragment> = mutableListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        for (s in mTitle) {
            mFragments.add(TabFragment.newInStance(s))
        }
        tab_viewpager.adapter = TabViewPagerAdapter(supportFragmentManager)
        tab_viewpager.offscreenPageLimit = 3
        resFlow
    }

    private val resFlow = {
        res_flow//setCusAction(ActionDot())
            .setViewPager(tab_viewpager)?.setTextId(R.id.flow_color_text)?.setDefaultPosition(2)
            ?.setSelectedColor(Color.WHITE)?.setUnSelectedColor(resources.getColor(R.color.white))
            ?.setTabBean(BeanTab().apply {
                tabType = ConstantsFlow.RES
                tabItemRes = R.drawable.flow_item_shape_round
                tabClickAnimTime = 300
                tabMarginLeft = 5
                tabMarginTop = 12
                tabMarginRight = 5
                tabMarginBottom = 10
                autoScale = true
                scaleFactor = 1.2f
            })?.mAdapter = object : AdapterTab<String?>(R.layout.flow_color_textview, mTitle) {
            override fun bindView(view: View?, data: Any?, position: Int) {
                setText(view, R.id.flow_color_text, data as String)?.setTextColor(
                    view, R.id.flow_color_text, resources.getColor(R.color.white)
                )
                if (position == 0) setVisible(view, R.id.flow_color_msg, true)
                addChildrenClick(view, R.id.flow_color_text, position)
                addChildrenLongClick(view, R.id.flow_color_text, position)
            }

            override fun onItemSelectState(view: View?, isSelected: Boolean) {
                super.onItemSelectState(view, isSelected)
                when {
                    isSelected -> setTextColor(view, R.id.flow_color_text, Color.WHITE)
                    else -> setTextColor(
                        view, R.id.flow_color_text, resources.getColor(R.color.white)
                    )
                }
            }

            override fun onItemClick(view: View?, data: Any?, position: Int) {
                super.onItemClick(view, data, position)
                tab_viewpager.currentItem = position
            }
        }
    }

    internal inner class TabViewPagerAdapter(fm: FragmentManager) :
        FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
        override fun getItem(position: Int): Fragment = mFragments[position]
        override fun getCount(): Int = mFragments.size
    }
}

class TabFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? = TextView(activity).apply {
        text = arguments?.getString(ARGUMENT) ?: "nothing here"
        textSize = 30f
        gravity = Gravity.CENTER
        setTextColor(Color.WHITE)
    }

    companion object {
        val ARGUMENT: String? = "argument"
        fun newInStance(key: String?): TabFragment = TabFragment().apply {
            arguments = Bundle().apply { putString(ARGUMENT, key) }
        }
    }
}
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#506E7A"
    android:orientation="vertical"
    tools:context=".TabActivity">

    <com.autoselect.widgeter.flow.LayoutTab
        android:id="@+id/res_flow"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginTop="5dp"
        android:background="#6D8FB0" />

    <androidx.viewpager.widget.ViewPager
        android:id="@+id/tab_viewpager"
        android:layout_width="match_parent"
        android:layout_height="100dp"
        android:layout_margin="10dp"
        android:background="#15323232" />
</LinearLayout>
```

```kotlin
class TabVerticalActivity : AppCompatActivity() {
    private val menuList: MutableList<BeanMenu?> = mutableListOf()
    private var linearManager: LinearLayoutManager? = null
    private var curPosition = 0
    private var isNeedScroll = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        linearManager = LinearLayoutManager(this)
        detail_recycler.layoutManager = linearManager
        handleData(menuList)
    }

    private fun handleData(menuList: MutableList<BeanMenu?>?) {
        tab_flow.mAdapter = object : AdapterTab<BeanMenu?>(R.layout.flow_menu_textview, menuList) {
            override fun bindView(view: View?, data: Any?, position: Int) {
                setText(view, R.id.flow_menu_text, (data as BeanMenu).menu)
                setTextColor(
                    view, R.id.flow_menu_text, resources.getColor(R.color.grey_800)
                )
            }

            override fun onItemSelectState(view: View?, isSelected: Boolean) {
                super.onItemSelectState(view, isSelected)
                when {
                    isSelected -> setTextColor(
                        view, R.id.flow_menu_text, resources.getColor(R.color.colorPrimary)
                    )
                    else -> setTextColor(
                        view, R.id.flow_menu_text, resources.getColor(R.color.grey_800)
                    )
                }
            }

            override fun onItemClick(view: View?, data: Any?, position: Int) {
                super.onItemClick(view, data, position)
                val firstPosition = linearManager?.findFirstVisibleItemPosition() ?: 0
                val lastPosition = linearManager?.findLastVisibleItemPosition() ?: 0
                curPosition = position
                detail_recycler.apply {
                    when {
                        position <= firstPosition -> {
                            smoothScrollToPosition(position)
                            requestLayout()//防止不刷新视图
                        }//目标在可见视图上面
                        position <= lastPosition -> {
                            val top = getChildAt(position - firstPosition)?.top ?: 0
                            if (top > 0) smoothScrollBy(0, top)
                        }//目标在first和last中间；往下点且position在中间，但lastPosition数据也能看到所以把它置顶
                        else -> {
                            scrollToPosition(position)//滚动到可视界面
                            isNeedScroll = true//此时recycler的item还未滚动到顶端，重新再让它滚动改一下
                        }//目标在可视视图下面
                    }
                }
            }
        }
        detail_recycler.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                super.onScrollStateChanged(recyclerView, newState)
                if (newState == RecyclerView.SCROLL_STATE_IDLE) tab_flow.apply {
                    isItemClick = when {
                        isItemClick -> false
                        else -> {
                            setItemClickByOutSet(linearManager?.findFirstVisibleItemPosition() ?: 0)
                            true
                        }
                    }//如果上次为点击事件，则先还原，下次滑动时，监听即可
                }
            }

            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                if (isNeedScroll) {
                    isNeedScroll = false
                    val index = curPosition - (linearManager?.findFirstVisibleItemPosition() ?: 0)
                    detail_recycler.apply {
                        if (index in 0 until childCount) smoothScrollBy(0, getChildAt(index).top)
                    }
                }
            }
        })
        detail_recycler.adapter = RecyclerAdapter(R.layout.flow_detail_textview, menuList)
    }

    internal inner class RecyclerAdapter(layoutResId: Int, data: MutableList<BeanMenu?>?) :
        BaseAdapterQuick<BeanMenu?, ViewHolderBase>(layoutResId, data) {
        override fun convert(holder: ViewHolderBase, item: BeanMenu?) {
            holder.setText(R.id.flow_detail_text, item?.menu)
            holder.getView<LayoutLabel>(R.id.label_flow)
                .setAdapter(LabelAdapter(R.layout.flow_item_textview, item?.details))
        }
    }

    internal inner class LabelAdapter(layoutId: Int, data: MutableList<BeanDetail?>?) :
        AdapterLabel<BeanDetail?>(layoutId, data) {
        override fun bindView(view: View?, data: Any?, position: Int) {
            setText(view, R.id.flow_menu_text, (data as BeanDetail).detail)
                ?.setTextColor(view, R.id.flow_menu_text, Color.WHITE)
            view?.background = RandomColor.getColorDrawable(10)
        }
    }
}
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".TabVerticalActivity">

    <com.autoselect.widgeter.flow.LayoutTab
        android:id="@+id/tab_flow"
        android:layout_width="wrap_content"
        android:layout_height="0dp"
        android:background="@color/grey_500"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent"
        app:tab_action_orientation="left"
        app:tab_color="@color/colorPrimary"
        app:tab_height="20dp"
        app:tab_orientation="vertical"
        app:tab_type="rect"
        app:tab_width="2dp" />

    <androidx.recyclerview.widget.RecyclerView
        android:id="@+id/detail_recycler"
        android:layout_width="0dp"
        android:layout_height="0dp"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toEndOf="@id/tab_flow"
        app:layout_constraintTop_toTopOf="parent" />
</ConstraintLayout>
```

```kotlin
class LabelActivity : AppCompatActivity() {
    private val titleOld: MutableList<String?>? =
        ArrayList(listOf("零", "一", "二", "三", "四", "五", "六", "七", "八", "九"))
    private val titleNew: MutableList<String?>? =
        ArrayList(listOf(*"0 1 2 3 4 5 6 7 8 9 ".split(" ".toRegex()).toTypedArray()))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        singleFlow
        searchFlow
        multiFlow
        longFlow
    }

    private val singleFlow = {
        val adapter: AdapterLabel<*>?
        single_flow.setAdapter(object :
            AdapterLabel<String?>(R.layout.flow_item_textview, titleOld) {
            override fun bindView(view: View?, data: Any?, position: Int) {
                setText(view, R.id.flow_item_text, data as String)?.setTextColor(
                    view, R.id.flow_item_text, resources.getColor(R.color.grey_500)
                )
            }

            override fun onItemSelectState(view: View?, isSelected: Boolean) {
                super.onItemSelectState(view, isSelected)
                when {
                    isSelected -> setTextColor(view, R.id.flow_item_text, Color.BLACK)
                    else -> setTextColor(
                        view, R.id.flow_item_text, resources.getColor(R.color.grey_500)
                    )
                }
            }
        }.also { adapter = it })
        update.setOnClickListener {
            titleOld?.clear()
            titleNew?.let { titleOld?.addAll(it) }
            adapter?.notifyDataChanged
        }
    }

    private val searchFlow = {
        search_flow.setAdapter(object :
            AdapterLabel<String?>(R.layout.flow_item_textview, titleOld) {
            override fun bindView(view: View?, data: Any?, position: Int) {
                setText(view, R.id.flow_item_text, data as String)
                    ?.setTextColor(view, R.id.flow_item_text, Color.WHITE)
                view?.background = RandomColor.getColorDrawable(10)
            }
        })
    }

    private val multiFlow = {
        multi_flow.apply {
            mMaxSelectCount = (3)
            setSelects(2, 3, 5)
        }.setAdapter(object : AdapterLabel<String?>(R.layout.flow_item_textview, titleNew) {
            override fun bindView(view: View?, data: Any?, position: Int) {
                setText(view, R.id.flow_item_text, data as String)
            }

            override fun onReachMaxCount(ids: MutableList<Int?>, count: Int) {
                super.onReachMaxCount(ids, count)
            }
        })
    }

    private val longFlow = {
        long_flow.setAdapter(object :
            AdapterLabel<String?>(R.layout.flow_label_select, titleNew) {
            override fun bindView(view: View?, data: Any?, position: Int) {
                setText(view, R.id.search_msg_tv, data as String)
                    ?.addChildrenClick(view, R.id.search_delete_iv, position)
            }

            override fun onItemSelectState(view: View?, isSelected: Boolean) {
                super.onItemSelectState(view, isSelected)
                if (!isSelected) {
                    view?.setBackgroundResource(R.drawable.flow_item_shape_unselect)
                    setVisible(view, R.id.search_delete_iv, false)
                }
            }

            override fun onItemClick(view: View?, data: Any?, position: Int) {
                super.onItemClick(view, data, position)
            }

            override fun onItemChildClick(childView: View?, position: Int) {
                super.onItemChildClick(childView, position)
                if (childView?.id == R.id.search_delete_iv) {
                    titleNew?.removeAt(position)
                    notifyDataChanged
                }
            }

            override fun onItemLongClick(view: View?, position: Int): Boolean {
                resetStatus
                view?.setBackgroundResource(R.drawable.flow_item_shape_select)
                setVisible(view, R.id.search_delete_iv, true)
                return super.onItemLongClick(view, position)
            }
        })
    }
}
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<ScrollView xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="#506E7A"
    android:orientation="vertical"
    tools:context=".LabelActivity">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:orientation="vertical">

        <TextView
            android:id="@+id/single"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="10dp"
            android:text="单选"
            android:textColor="@color/white"
            android:textSize="14sp" />

        <com.autoselect.widgeter.flow.LayoutLabel
            android:id="@+id/single_flow"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="10dp"
            android:layout_marginTop="4dp" />

        <Button
            android:id="@+id/update"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="更新数据" />

        <TextView
            android:id="@+id/search_tab"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="热搜"
            android:textColor="@color/white"
            android:textSize="16sp" />

        <com.autoselect.widgeter.flow.LayoutLabel
            android:id="@+id/search_flow"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="10dp"
            android:layout_marginTop="5dp"
            android:layout_marginBottom="5dp" />

        <TextView
            android:id="@+id/multi"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:text="多选"
            android:textColor="@color/white"
            android:textSize="16sp" />

        <com.autoselect.widgeter.flow.LayoutLabel
            android:id="@+id/multi_flow"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="10dp"
            android:layout_marginTop="5dp"
            android:layout_marginBottom="5dp" />

        <TextView
            android:id="@+id/search"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="5dp"
            android:text="长按"
            android:textColor="@color/white"
            android:textSize="16sp" />

        <com.autoselect.widgeter.flow.LayoutLabel
            android:id="@+id/long_flow"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginStart="10dp"
            android:layout_marginTop="5dp"
            android:layout_marginBottom="10dp"
            app:label_maxSelectCount="3" />
    </LinearLayout>
</ScrollView>
```

```kotlin
class LabelShowMoreActivity : AppCompatActivity() {
    private val showMore: MutableList<String?>? =
        ArrayList(listOf(*"0 1 2 3 4 5 6 7 8 9 ".split(" ".toRegex()).toTypedArray()))

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        more_flow.setLabelBean(BeanLabel().apply {
            maxSelectCount = 3
            isAutoScroll = true
            showLines = 3
            showMoreLayoutId = R.layout.flow_label_show
            showMoreColor = Color.WHITE
            handUpLayoutId = R.layout.flow_label_handup
        })
        more_flow.setSelects(0, 1, 2)
        more_flow.setAdapter(object :
            AdapterLabel<String?>(R.layout.flow_item_textview, showMore) {
            override fun bindView(view: View?, data: Any?, position: Int) {
                setText(view, R.id.flow_item_text, data as String)
                    ?.setTextColor(view, R.id.flow_item_text, Color.BLACK)
            }

            override fun onItemSelectState(view: View?, isSelected: Boolean) {
                super.onItemSelectState(view, isSelected)
                when {
                    isSelected -> setTextColor(
                        view, R.id.flow_item_text, resources.getColor(R.color.colorPrimary)
                    )
                    else -> setTextColor(view, R.id.flow_item_text, Color.BLACK)
                }
            }

            override fun onShowMoreClick(view: View?) {
                super.onShowMoreClick(view)
            }

            override fun onHandUpClick(view: View?) {
                super.onHandUpClick(view)
            }
        })
    }
}
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white"
    tools:context=".LabelShowMoreActivity">

    <com.autoselect.widgeter.flow.LayoutLabel
        android:id="@+id/more_flow"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_marginStart="10dp"
        android:layout_marginTop="10dp"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent" />
</ConstraintLayout>
```

>- implementation "androidx.constraintlayout:constraintlayout:2.0.2"
>- drawable备用
>
>>1. [flow_item_shape_red.xml](../../../../res/drawable/flow_item_shape_red.xml)
>>2. [flow_item_shape_round.xml](../../../../res/drawable/flow_item_shape_round.xml)
>>3. [flow_item_shape_unselect.xml](../../../../res/drawable/flow_item_shape_unselect.xml)
>>4. [flow_item_shape_select.xml](../../../../res/drawable/flow_item_shape_select.xml)
>>5. [flow_item_selector_tag.xml](../../../../res/drawable/flow_item_selector_tag.xml)
>>6. [flow_item_selector_color.xml](../../../../res/drawable/flow_item_selector_color.xml)
>
>- layout备用
>
>>1. [flow_color_textview.xml](../../../../res/layout/flow_color_textview.xml)
>>2. [flow_item_textview.xml](../../../../res/layout/flow_item_textview.xml)
>>3. [flow_menu_textview.xml](../../../../res/layout/flow_menu_textview.xml)
>>4. [flow_detail_textview.xml](../../../../res/layout/flow_detail_textview.xml)
>>5. [flow_label_select.xml](../../../../res/layout/flow_label_select.xml)
>>6. [flow_label_show.xml](../../../../res/layout/flow_label_show.xml)
>>7. [flow_label_handup.xml](../../../../res/layout/flow_label_handup.xml)
>
>- mipmap备用
>
>>1. ![flow_label_delete](../../../../res/mipmap/flow_label_delete.png)
>>2. ![flow_label_show](../../../../res/mipmap/flow_label_show.png)
>>3. ![flow_label_handup](../../../../res/mipmap/flow_label_handup.png)

### *002.回收BaseAdapterQuick、BaseAdapterBinder、BaseAdapterMultiDelegate、BaseAdapterMultiProvider(BaseAdapterNode)、BaseAdapterMultiQuick(BaseAdapterSectionQuick)、ViewHolderBase、LoadMoreModuleBase、UpFetchModuleBase、DraggableModuleBase：......(2963)*

| 序号 | 方法                                  | 功能（RecyclerView可嵌套：setHasFixedSize(true)、layoutManager、adapter、addItemDecoration）                                                                                                                                                              |
|:-----|:--------------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 001  | 01. data                              | BaseAdapterQuick需要适配的数据                                                                                                                                                                                                                           |
| 002  | 02. loadMoreModule                    | BaseAdapterQuick加载更多模块，需继承LoadMoreModule                                                                                                                                                                                                       |
| 003  | 03. upFetchModule                     | BaseAdapterQuick向上加载模块，需继承UpFetchModule                                                                                                                                                                                                        |
| 004  | 04. draggableModule                   | BaseAdapterQuick拖拽模块，需继承DraggableModule                                                                                                                                                                                                          |
| 005  | 05. convert                           | BaseAdapterQuick适配器必须实现，用Diff时必须实现带payloads方法                                                                                                                                                                                            |
| 006  | 06. onCreateDefViewHolder             | BaseAdapterQuick实现自定义VH                                                                                                                                                                                                                            |
| 007  | 07. headerLayoutCount                 | BaseAdapterQuick头布局计数                                                                                                                                                                                                                              |
| 008  | 08. getItem                           | BaseAdapterQuick获取data中数据项                                                                                                                                                                                                                        |
| 009  | 09. getItemOrNull                     | BaseAdapterQuick获取data中数据项，可为空                                                                                                                                                                                                                 |
| 010  | 10. getItemPosition                   | BaseAdapterQuick获取data中数据项位置                                                                                                                                                                                                                     |
| 011  | 11. animationEnable                   | BaseAdapterQuick动画设置启用                                                                                                                                                                                                                            |
| 012  | 12. adapterAnimation                  | BaseAdapterQuick动画自定义赋值                                                                                                                                                                                                                           |
| 013  | 13. setAnimationWithDefault           | BaseAdapterQuick动画设置默认类型                                                                                                                                                                                                                         |
| 014  | 14. isAnimationFirstOnly              | BaseAdapterQuick动画是否仅首次运行，改变后适配器notifyDataSetChanged()                                                                                                                                                                                    |
| 015  | 15. recyclerView                      | BaseAdapterQuick回收视图赋值                                                                                                                                                                                                                            |
| 016  | 16. context                           | BaseAdapterQuick回收视图上下文                                                                                                                                                                                                                           |
| 017  | 17. headerViewAsFlow                  | BaseAdapterQuick为true页眉排列方式与普通项目视图相同，仅GridLayoutManager时有效忽略跨距大小                                                                                                                                                                |
| 018  | 18. footerViewAsFlow                  | BaseAdapterQuick为true页脚排列方式与普通项目视图相同，仅GridLayoutManager时有效忽略跨距大小                                                                                                                                                                |
| 019  | 19. isUseEmpty                        | BaseAdapterQuick是否使用空布局                                                                                                                                                                                                                           |
| 020  | 20. hasEmptyView                      | BaseAdapterQuick是否存在空布局                                                                                                                                                                                                                           |
| 021  | 21. headerWithEmptyEnable             | BaseAdapterQuick当显示空布局时，是否显示Header                                                                                                                                                                                                           |
| 022  | 22. footerWithEmptyEnable             | BaseAdapterQuick当显示空布局时，是否显示Foot                                                                                                                                                                                                             |
| 023  | 23. hasHeaderLayout                   | BaseAdapterQuick是否存在头布局                                                                                                                                                                                                                           |
| 024  | 24. hasFooterLayout                   | BaseAdapterQuick是否存在脚布局                                                                                                                                                                                                                           |
| 025  | 25. footerLayoutCount                 | BaseAdapterQuick脚布局计数                                                                                                                                                                                                                              |
| 026  | 26. getItemCount                      | BaseAdapterQuick获取项计数                                                                                                                                                                                                                              |
| 027  | 27. getDefItemCount                   | BaseAdapterQuick获取自定义项计数                                                                                                                                                                                                                         |
| 028  | 28. getItemId                         | BaseAdapterQuick获取项ID                                                                                                                                                                                                                                |
| 029  | 29. getItemViewType                   | BaseAdapterQuick获取项视图类型                                                                                                                                                                                                                           |
| 030  | 30. getDefItemViewType                | BaseAdapterQuick获取自定义项视图类型                                                                                                                                                                                                                     |
| 031  | 31. setGridSpanSizeLookup             | BaseAdapterQuick设置网格大小                                                                                                                                                                                                                            |
| 032  | 32. onItemClickListener               | BaseAdapterQuick控件点击监听器                                                                                                                                                                                                                           |
| 033  | 33. setOnItemClickListener            | BaseAdapterQuick控件点击监听器设置                                                                                                                                                                                                                       |
| 034  | 34. onItemLongClickListener           | BaseAdapterQuick控件长按监听器                                                                                                                                                                                                                           |
| 035  | 35. setOnItemLongClickListener        | BaseAdapterQuick控件长按监听器设置                                                                                                                                                                                                                       |
| 036  | 36. onItemChildClickListener          | BaseAdapterQuick子控件点击监听器                                                                                                                                                                                                                         |
| 037  | 37. setOnItemChildClickListener       | BaseAdapterQuick子控件点击监听器设置                                                                                                                                                                                                                     |
| 038  | 38. onItemChildLongClickListener      | BaseAdapterQuick子控件长按监听器                                                                                                                                                                                                                         |
| 039  | 39. setOnItemChildLongClickListener   | BaseAdapterQuick子控件长按监听器设置                                                                                                                                                                                                                     |
| 040  | 40. childClickViewIds                 | BaseAdapterQuick可点击子控件ID列表                                                                                                                                                                                                                       |
| 041  | 41. addChildClickViewIds              | BaseAdapterQuick必须先添加可点击子控件ID                                                                                                                                                                                                                 |
| 042  | 42. childLongClickViewIds             | BaseAdapterQuick可长按子控件ID列表                                                                                                                                                                                                                       |
| 043  | 43. addChildLongClickViewIds          | BaseAdapterQuick必须先添加可长按子控件ID                                                                                                                                                                                                                 |
| 044  | 44. headerLayout                      | BaseAdapterQuick获取头布局                                                                                                                                                                                                                              |
| 045  | 45. setHeaderView                     | BaseAdapterQuick设置空布局layoutInflater.inflate(R.layout.empty_view, recyclerView, false)                                                                                                                                                              |
| 046  | 46. headerViewPosition                | BaseAdapterQuick头布局位置                                                                                                                                                                                                                              |
| 047  | 47. addHeaderView                     | BaseAdapterQuick添加头布局layoutInflater.inflate(R.layout.head_view, recyclerView, false)                                                                                                                                                               |
| 048  | 48. removeHeaderView                  | BaseAdapterQuick移除头布局                                                                                                                                                                                                                              |
| 049  | 49. removeAllHeaderView               | BaseAdapterQuick移除所有头布局                                                                                                                                                                                                                           |
| 050  | 50. footerLayout                      | BaseAdapterQuick获取脚布局                                                                                                                                                                                                                              |
| 051  | 51. setFooterView                     | BaseAdapterQuick设置脚布局                                                                                                                                                                                                                              |
| 052  | 52. footerViewPosition                | BaseAdapterQuick脚布局位置                                                                                                                                                                                                                              |
| 053  | 53. addFooterView                     | BaseAdapterQuick添加脚布局layoutInflater.inflate(R.layout.footer_view, recyclerView, false)                                                                                                                                                             |
| 054  | 54. removeFooterView                  | BaseAdapterQuick移除脚布局                                                                                                                                                                                                                              |
| 055  | 55. removeAllFooterView               | BaseAdapterQuick移除所有脚布局                                                                                                                                                                                                                           |
| 056  | 56. emptyLayout                       | BaseAdapterQuick获取空布局                                                                                                                                                                                                                              |
| 057  | 57. setEmptyView                      | BaseAdapterQuick设置空布局                                                                                                                                                                                                                              |
| 058  | 58. removeEmptyView                   | BaseAdapterQuick移除空布局                                                                                                                                                                                                                              |
| 059  | 59. setDiffCallback                   | BaseAdapterQuick设置Diff回调生成Diff配置，setDiffNewData之前使用                                                                                                                                                                                         |
| 060  | 60. differ                            | BaseAdapterQuick获取Diff                                                                                                                                                                                                                                |
| 061  | 61. setDiffConfig                     | BaseAdapterQuick设置Diff配置，setDiffNewData之前使用                                                                                                                                                                                                     |
| 062  | 62. setDiffNewData                    | BaseAdapterQuick设置新实例用Diff或DiffResult（差异更新），先setDiffCallback或setDiffConfig，可设置提交完成执行线程                                                                                                                                          |
| 063  | 63. setNewInstance                    | BaseAdapterQuick设置新实例                                                                                                                                                                                                                              |
| 064  | 64. setList                           | BaseAdapterQuick设置新data数据                                                                                                                                                                                                                          |
| 065  | 65. setData                           | BaseAdapterQuick改变指定位置data数据                                                                                                                                                                                                                     |
| 066  | 66. addData                           | BaseAdapterQuick添加指定或不指定位置单条或批量data数据                                                                                                                                                                                                    |
| 067  | 67. removeAt                          | BaseAdapterQuick删除data数据根据指定位置                                                                                                                                                                                                                 |
| 068  | 68. remove                            | BaseAdapterQuick删除data数据根据指定数据                                                                                                                                                                                                                 |
| 069  | 01. getItemBinder                     | BaseAdapterBinder获取已添加Binder，无则异常                                                                                                                                                                                                              |
| 070  | 02. addItemBinder                     | BaseAdapterBinder添加Binder可附加DiffUtil.ItemCallback实现convert：ItemBinderBase实现onCreateViewHolder、ItemBinderQuick实现getLayoutId、ItemBinderView实现onCreateViewBinding、ItemBinderData实现onCreateDataBinding（convert内executePendingBindings()） |
| 071  | 03. getItemBinderOrNull               | BaseAdapterBinder获取已添加Binder，无则null                                                                                                                                                                                                              |
| 072  | 01. typeMultiDelegate                 | BaseAdapterMultiDelegate实现BaseTypeMultiDelegate赋值：getItemType指定位置对应指定项类型列表项类型，addItemType添加指定项类型和对应布局；convert内根据指定项类型匹配VH的itemViewType，自动选择布局，设置布局内控件数据，实现EntityMultiItem包含项类型和控件数据   |
| 073  | 01. getItemType                       | BaseAdapterMultiProvider根据位置指定不同项类型，数据类包含各种项类型                                                                                                                                                                                       |
| 074  | 02. getItemProvider                   | BaseAdapterMultiProvider获取已添加BaseProviderItem                                                                                                                                                                                                      |
| 075  | 03. addItemProvider                   | BaseAdapterMultiProvider添加自定义BaseProviderItem：layoutId设置布局；itemViewType设置项类型；convert适配器必须实现，用Diff时必须实现带payloads方法                                                                                                         |
| 076  | 01. addFooterNodeProvider             | BaseAdapterNode添加铺满一行或一列脚部NodeProvider                                                                                                                                                                                                        |
| 077  | 02. addFullSpanNodeProvider           | BaseAdapterNode添加需要铺满NodeProvider                                                                                                                                                                                                                 |
| 078  | 03. addNodeProvider                   | BaseAdapterNode添加NodeProvider                                                                                                                                                                                                                         |
| 079  | 04. addItemProvider                   | BaseAdapterNode添加自定义BaseProviderItem                                                                                                                                                                                                               |
| 080  | 05. setDiffNewData                    | BaseAdapterNode一级节点设置新实例用Diff或DiffResult（差异更新），先setDiffCallback或setDiffConfig，可设置提交完成执行线程                                                                                                                                   |
| 081  | 06. setNewInstance                    | BaseAdapterNode一级节点设置新实例                                                                                                                                                                                                                        |
| 082  | 07. setList                           | BaseAdapterNode一级节点设置新data数据                                                                                                                                                                                                                    |
| 083  | 08. addData                           | BaseAdapterNode一级节点添加指定或不指定位置单条或批量data数据                                                                                                                                                                                              |
| 084  | 09. setData                           | BaseAdapterNode一级节点改变指定位置data数据                                                                                                                                                                                                              |
| 085  | 10. removeAt                          | BaseAdapterNode一级节点删除data数据根据指定位置                                                                                                                                                                                                           |
| 086  | 11. nodeAddData                       | BaseAdapterNode添加父节点下子节点或子节点集合，可指定位置                                                                                                                                                                                                  |
| 087  | 12. nodeRemoveData                    | BaseAdapterNode移除父节点下子节点，可指定位置                                                                                                                                                                                                             |
| 088  | 13. nodeSetData                       | BaseAdapterNode替换父节点下指定位置子节点数据                                                                                                                                                                                                             |
| 089  | 14. nodeReplaceChildData              | BaseAdapterNode替换父节点下子节点集合                                                                                                                                                                                                                    |
| 090  | 15. collapse                          | BaseAdapterNode收起本节点                                                                                                                                                                                                                               |
| 091  | 16. expand                            | BaseAdapterNode展开本节点                                                                                                                                                                                                                               |
| 092  | 17. expandOrCollapse                  | BaseAdapterNode切换收起展开本节点                                                                                                                                                                                                                        |
| 093  | 18. collapseAndChild                  | BaseAdapterNode收起本节点和子节点                                                                                                                                                                                                                        |
| 094  | 19. expandAndChild                    | BaseAdapterNode展开本节点和子节点                                                                                                                                                                                                                        |
| 095  | 20. expandAndCollapseOther            | BaseAdapterNode切换收起展开本节点和子节点                                                                                                                                                                                                                |
| 096  | 21. findParentNode                    | BaseAdapterNode查找父节点                                                                                                                                                                                                                               |
| 097  | 01. addItemType                       | BaseAdapterMultiQuick添加指定类型和对应布局，直接添加无需Delegate添加也无需Binder添加                                                                                                                                                                      |
| 098  | 01. setNormalLayout                   | BaseAdapterSectionQuick如果item不是多布局，此方法快速设置item layout；如果需要多布局item用addItemType                                                                                                                                                      |
| 099  | 02. convertHeader                     | BaseAdapterSectionQuick数据项实现EntitySection，convertHeader和convert共用，根据isHeader配置不同数据                                                                                                                                                      |
| 100  | 01. getView                           | ViewHolderBase根据ID从数组获取控件，LoadMoreViewBase需用，LayoutInflater.from(parent.context).inflate(R.layout.view_load_more, parent, false)                                                                                                            |
| 101  | 02. getViewOrNull                     | ViewHolderBase根据ID从数组获取控件，无则放入数组                                                                                                                                                                                                          |
| 102  | 03. findView                          | ViewHolderBase根据ID获取控件                                                                                                                                                                                                                            |
| 103  | 04. setText                           | ViewHolderBase设置控件文本                                                                                                                                                                                                                              |
| 104  | 05. setTextRes                        | ViewHolderBase设置控件文本资源                                                                                                                                                                                                                           |
| 105  | 06. setTextColor                      | ViewHolderBase设置控件颜色                                                                                                                                                                                                                              |
| 106  | 07. setTextColorRes                   | ViewHolderBase设置控件颜色资源                                                                                                                                                                                                                           |
| 107  | 08. setImageResource                  | ViewHolderBase设置控件资源                                                                                                                                                                                                                              |
| 108  | 09. setImageDrawable                  | ViewHolderBase设置控件Drawable                                                                                                                                                                                                                          |
| 109  | 10. setImageBitmap                    | ViewHolderBase设置控件Bitmap                                                                                                                                                                                                                            |
| 110  | 11. setBackgroundColor                | ViewHolderBase设置控件背景颜色                                                                                                                                                                                                                           |
| 111  | 12. setBackgroundResource             | ViewHolderBase设置控件背景资源                                                                                                                                                                                                                           |
| 112  | 13. setVisible                        | ViewHolderBase设置控件可见性，INVISIBLE占位不可见                                                                                                                                                                                                        |
| 113  | 14. setGone                           | ViewHolderBase设置控件隐藏性，GONE隐藏不可见                                                                                                                                                                                                             |
| 114  | 15. setEnabled                        | ViewHolderBase设置控件可用性                                                                                                                                                                                                                             |
| 115  | 01. loadMoreView                      | LoadMoreModuleBase重设加载更多视图                                                                                                                                                                                                                       |
| 116  | 02. loadMoreStatus                    | LoadMoreModuleBase加载更多状态：正在加载、完成、失败、结束                                                                                                                                                                                                |
| 117  | 03. isLoading                         | LoadMoreModuleBase获取是否正在加载                                                                                                                                                                                                                       |
| 118  | 04. isEnableLoadMore                  | LoadMoreModuleBase是否能够加载更多，临时false防止下拉刷新同时上拉加载                                                                                                                                                                                      |
| 119  | 05. isLoadEndMoreGone                 | LoadMoreModuleBase加载更多是否隐藏                                                                                                                                                                                                                       |
| 120  | 06. hasLoadMoreView                   | LoadMoreModuleBase是否存在加载更多视图                                                                                                                                                                                                                   |
| 121  | 07. setOnLoadMoreListener             | LoadMoreModuleBase设置加载更多监听器                                                                                                                                                                                                                     |
| 122  | 08. enableLoadMoreEndClick            | LoadMoreModuleBase是否启用加载更多结束点击                                                                                                                                                                                                               |
| 123  | 09. isAutoLoadMore                    | LoadMoreModuleBase是否自动加载更多                                                                                                                                                                                                                       |
| 124  | 10. preLoadNumber                     | LoadMoreModuleBase预加载数量                                                                                                                                                                                                                            |
| 125  | 11. isEnableLoadMoreIfNotFullPage     | LoadMoreModuleBase数据不满一屏是否继续自动加载更多                                                                                                                                                                                                        |
| 126  | 12. checkDisableLoadMoreIfNotFullPage | LoadMoreModuleBase如果不能满页，取消加载更多                                                                                                                                                                                                             |
| 127  | 13. loadMoreFail                      | LoadMoreModuleBase加载更多失败处理                                                                                                                                                                                                                       |
| 128  | 14. loadMoreComplete                  | LoadMoreModuleBase加载更多完成处理                                                                                                                                                                                                                       |
| 129  | 15. loadMoreEnd                       | LoadMoreModuleBase加载更多结束处理，最后一页                                                                                                                                                                                                             |
| 130  | 01. setOnUpFetchListener              | UpFetchModuleBase设置向上加载监听器                                                                                                                                                                                                                      |
| 131  | 02. isUpFetchEnable                   | UpFetchModuleBase是否能够向上加载                                                                                                                                                                                                                        |
| 132  | 03. isUpFetching                      | UpFetchModuleBase是否正在向上加载                                                                                                                                                                                                                        |
| 133  | 04. startUpFetchPosition              | UpFetchModuleBase开始向上加载位置                                                                                                                                                                                                                        |
| 134  | 01. toggleViewId                      | DraggableModuleBase切换视图ID                                                                                                                                                                                                                           |
| 135  | 02. hasToggleView                     | DraggableModuleBase是否具有切换视图                                                                                                                                                                                                                      |
| 136  | 03. isDragEnabled                     | DraggableModuleBase设置是否可拖拽                                                                                                                                                                                                                        |
| 137  | 04. isDragOnLongPressEnabled          | DraggableModuleBase切换长按拖拽状态                                                                                                                                                                                                                      |
| 138  | 05. setOnItemDragListener             | DraggableModuleBase设置条目拖拽监听器                                                                                                                                                                                                                    |
| 139  | 06. isSwipeEnabled                    | DraggableModuleBase设置是否可侧滑                                                                                                                                                                                                                        |
| 140  | 07. setOnItemSwipeListener            | DraggableModuleBase设置条目侧滑监听器                                                                                                                                                                                                                    |

| 序号 | 类库                           | 功能                                                                                                                                                                                                                                                                                                                      |
|:-----|:-------------------------------|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 001  | *001.BaseAdapterQuick*         | 基本适配器，BaseAdapterBinder、BaseAdapterMultiDelegate、BaseAdapterMultiProvider(BaseAdapterNode)、BaseAdapterMultiQuick(BaseAdapterSectionQuick) 继承自它。                                                                                                                                                              |
| 002  | *002.BaseAdapterBinder*        | 用Binder实现adapter可实现单多布局，数据实体类不存继承问题。多种条目时，避免convert()中太多业务逻辑，逻辑放在对应BaseItemBinder中。适用于：实体类不方便扩展，此Adapter数据类型可任意类型，默认不需实现getItemType；item类型较多，convert()中管理复杂。ViewHolder由ItemBinderBase实现，每个可拥有自己类型的ViewHolder类型。数据类型为Any。 |
| 003  | *003.BaseAdapterMultiDelegate* | 多类型布局通过代理类方式，返回布局id和item类型，适用于:1、实体类不方便扩展，此Adapter数据类型可任意类型，只需BaseTypeDelegateMulti.getItemType返回对应类型；2、item类型较少，类型较多，为隔离各类型业务逻辑用BaseAdapterBinder。                                                                                                    |
| 004  | *004.BaseAdapterMultiProvider* | 多种条目时，避免convert()中太多业务逻辑，逻辑放在对应ItemProvider中。适用于：实体类不方便扩展，此Adapter数据类型可任意类型，只需getItemType中返回对应类型；item类型较多，convert()中管理复杂。ViewHolder由BaseProviderItem实现，每个可拥有自己类型的ViewHolder类型。                                                                 |
| 005  | *005.BaseAdapterNode*          | 多级节点多类型布局，继承自BaseAdapterMultiProvider                                                                                                                                                                                                                                                                         |
| 006  | *006.BaseAdapterMultiQuick*    | 多类型布局适用：类型较少，业务不复杂场景，data<T>必须实现EntityMultiItem，无法实现用BaseAdapterMultiDelegate；类型较多，分离各类型业务逻辑用BaseAdapterMultiProvider                                                                                                                                                           |
| 007  | *007.BaseAdapterSectionQuick*  | 快速实现带头部Adapter，本质属于多布局继承自BaseAdapterMultiQuick                                                                                                                                                                                                                                                           |
| 008  | *001.ViewHolderBase*           | 基本视图持有器                                                                                                                                                                                                                                                                                                            |
| 009  | *001.LoadMoreModuleBase*       | 加载更多模块                                                                                                                                                                                                                                                                                                              |
| 010  | *002.UpFetchModuleBase*        | 向上加载模块                                                                                                                                                                                                                                                                                                              |
| 011  | *003.DraggableModuleBase*      | 拖拽侧滑模块                                                                                                                                                                                                                                                                                                              |

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

    when {
        node.isExpanded -> when {
            isAnimate -> ViewCompat.animate(imageView).setDuration(200).setInterpolator(DecelerateInterpolator()).rotation(0f).start()
            else -> imageView.rotation = 0f
        }
        else -> when {
            isAnimate -> ViewCompat.animate(imageView).setDuration(200).setInterpolator(DecelerateInterpolator()).rotation(90f).start()
            else -> imageView.rotation = 90f
        }
    }//Node展开收起箭头方向动画改变
```

>- layout:[recycler_load_more.xml](../../../../res/layout/recycler_load_more.xml)
>- drawable:[recycler_loading_progress.xml](../../../../res/drawable/recycler_loading_progress.xml)
>- drawable备用
>
>>1. [recycler_bg_selector.xml](../../../../res/drawable/recycler_bg_selector.xml)
>>2. [recycler_bg_selector_else.xml](../../../../res/drawable/recycler_bg_selector_else.xml)
>>3. [recycler_bg_shape_duration.xml](../../../../res/drawable/recycler_bg_shape_duration.xml)
>>4. [recycler_bottom_line_selector.xml](../../../../res/drawable/recycler_bottom_line_selector.xml)
>>5. [recycler_bottom_line_shape_dark.xml](../../../../res/drawable/recycler_bottom_line_shape_dark.xml)
>>6. [recycler_bottom_line_shape_theme.xml](../../../../res/drawable/recycler_bottom_line_shape_theme.xml)
>>7. [recycler_circle_selector_remove.xml](../../../../res/drawable/recycler_circle_selector_remove.xml)
>>8. [recycler_circle_shape_press.xml](../../../../res/drawable/recycler_circle_shape_press.xml)
>>9. [recycler_circle_shape_remove.xml](../../../../res/drawable/recycler_circle_shape_remove.xml)
>>10. [recycler_circle_shape_theme.xml](../../../../res/drawable/recycler_circle_shape_theme.xml)
>>11. [recycler_tip_audio.xml](../../../../res/drawable/recycler_tip_audio.xml)
>>12. [recycler_tip_audio_cover.xml](../../../../res/drawable/recycler_tip_audio_cover.xml)
>>13. [recycler_tip_edit.xml](../../../../res/drawable/recycler_tip_edit.xml)
>>14. [recycler_tip_image.xml](../../../../res/drawable/recycler_tip_image.xml)
>>15. [recycler_tip_remove.xml](../../../../res/drawable/recycler_tip_remove.xml)
>>16. [recycler_tip_video.xml](../../../../res/drawable/recycler_tip_video.xml)
>>17. [recycler_tip_video_cover.xml](../../../../res/drawable/recycler_tip_video_cover.xml)
>
>- mipmap:![recycler_loading](../../../../res/mipmap/recycler_loading.png)
>- mipmap备用
>
>>1. ![icon_add](../../../../res/mipmap/icon_add.png)
>>2. ![icon_rm](../../../../res/mipmap/icon_rm.png)
>>3. ![icon_reset](../../../../res/mipmap/icon_reset.png)
>>4. ![icon_back](../../../../res/mipmap/icon_back.png)
>>5. ![icon_arrow_r](../../../../res/mipmap/icon_arrow_r.png)
>>6. ![icon_arrow_b](../../../../res/mipmap/icon_arrow_b.png)
>
>- values:[ids.xml](../../../../res/values/ids.xml)
>- strings
>
>>1. 默认[strings.xml](../../../../res/values/strings.xml)
>>2. CN:[strings.xml](../../../../res/values-zh-rCN/strings.xml)
>>3. HK:[strings.xml](../../../../res/values-zh-rHK/strings.xml)

### *003.横幅Banner：BannerHelper、TypeBannerTrans、BeanPage、PageListener、RecyclerViewHolder、RecyclerBaseAdapter、TypeTrans、Transformer、TransformerCard、TransformerDepthPage、TransformerMz、TransformerZoomOutPage、BeanCircle、BeanRect、TypeIndicatorCircle、IndicatorCircle、IndicatorRect、IndicatorText(1060)*

| 序号 | 方法                   | 功能                                                                                      |
|:-----|:-----------------------|:-----------------------------------------------------------------------------------------|
| 01   | 01. viewPager2         | 暴露给addPagerData添加，无需创建                                                           |
| 02   | 02. setCurrentPosition | 设置当前页目                                                                              |
| 03   | 03. addIndicator       | 添加指示器IndicatorCircle、IndicatorRect、IndicatorText                                   |
| 04   | 04. addPageBean        | 添加页面设置BeanPage                                                                      |
| 05   | 05. isOutVisibleWindow | 判断是否超出屏幕                                                                          |
| 06   | 06. stopAnim           | 停止翻页动画                                                                              |
| 07   | 07. startAnim          | 开始翻页动画                                                                              |
| 08   | 08. setPageListener    | 设置页面监听                                                                              |
| 09   | 01. addPagerData       | IndicatorCircle、IndicatorRect、IndicatorText暴露给Banner添加页面数量和viewPager2，无需添加 |
| 10   | 02. addCircleBean      | IndicatorCircle添加BeanCircle                                                             |
| 11   | 03. addRectBean        | IndicatorRect添加BeanRect                                                                 |

```kotlin
class GuideActivity : AppCompatActivity() {
    private data class Guide(var title: String? = null, var image: Int = 0)

    private val images: IntArray = intArrayOf(R.mipmap.guide1, R.mipmap.guide2, R.mipmap.guide3)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        banner.setCurrentPosition(1).addIndicator(indicator.apply {
            addCircleBean(BeanCircle().apply {
                normalColor = Color.GRAY
                selectedColor = Color.WHITE
                horizonMargin = 40
                circleSize = 20
                scaleFactor = 1.5f
                typeIndicatorCircle = TypeIndicatorCircle.CIR_TO_RECT
            })
        }).addPageBean(BeanPage().apply {
            isAutoLoop = true
            smoothScrollTime = 400
            loopTime = 5000
            typeBannerTrans = TypeBannerTrans.DEPTH
        }).setPageListener(R.layout.banner_loop, mutableListOf<Guide?>().apply {
            for ((index, guideTitle) in getStringArrayById(R.array.titles).withIndex()) {
                Guide().apply {
                    title = guideTitle
                    image = images[index]
                }.let { add(it) }
            }
        }, object : PageListener<Guide?>() {
            override fun bindView(view: View?, data: Any?, position: Int) {
                view?.let {
                    (data as Guide).run {
                        setText(view, R.id.loop_text, title)
                        setImageView(view, R.id.loop_icon, image)
                    }
                }
            }
        })
        enter.setOnClickListener {
            ActivityHelper.startActivity(MainActivity::class.java)
            finish()
        }
    }
}
```

```xml
<?xml version="1.0" encoding="utf-8"?>
<androidx.constraintlayout.widget.ConstraintLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    tools:context=".GuideActivity">

    <FrameLayout
        android:id="@+id/guide"
        android:layout_width="409dp"
        android:layout_height="601dp"
        app:layout_constraintBottom_toTopOf="@+id/enter"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent"
        app:layout_constraintTop_toTopOf="parent">

        <com.autoselect.widgeter.banner.Banner
            android:id="@+id/banner"
            android:layout_width="match_parent"
            android:layout_height="match_parent" />

        <com.autoselect.widgeter.banner.indicat.IndicatorCircle
            android:id="@+id/indicator"
            android:layout_width="wrap_content"
            android:layout_height="30dp"
            android:layout_gravity="end|bottom"
            android:layout_marginEnd="20dp" />
    </FrameLayout>

    <Button
        android:id="@+id/enter"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="@string/enter"
        app:layout_constraintBottom_toBottomOf="parent"
        app:layout_constraintEnd_toEndOf="parent"
        app:layout_constraintStart_toStartOf="parent" />
</androidx.constraintlayout.widget.ConstraintLayout>
```

>- layout备用:[banner_loop.xml](../../../../res/layout/banner_loop.xml)

### *004.卡组CardStackView：AdapterAnimator、AdapterAllMoveDownAnimator、AdapterUpDownAnimator、AdapterUpDownStackAnimator、ViewDataObserver、AdapterDataObservable、ViewHolder、Adapter、AdapterStack、DelegateScrollStack、DelegateScroll(861+36+7)*

| 序号 | 方法                           | 功能 |
|:-----|:-------------------------------|:----|
| 01   | 01. overlapGaps                | 功能 |
| 02   | 02. overlapGapsCollapse        | 功能 |
| 03   | 03. duration                   | 功能 |
| 04   | 04. numBottomShow              | 功能 |
| 05   | 05. itemExpendListener         | 功能 |
| 06   | 06. selectPosition             | 功能 |
| 07   | 07. isExpending                | 功能 |
| 08   | 08. clearSelectPosition        | 功能 |
| 09   | 09. updateSelectPosition       | 功能 |
| 10   | 10. showHeight                 | 功能 |
| 11   | 11. clearScrollYAndTranslation | 功能 |
| 12   | 12. delegateScroll             | 功能 |
| 13   | 13. adapterAnimator            | 功能 |
| 14   | 14. setAnimationType           | 功能 |
| 15   | 15. scrollEnable               | 功能 |
| 16   | 16. totalLength                | 功能 |
| 17   | 17. viewScrollX                | 功能 |
| 18   | 18. viewScrollY                | 功能 |
| 19   | 19. scrollOffset               | 功能 |
| 20   | 20. fling                      | 功能 |
| 21   | 21. getViewHolder              | 功能 |
| 22   | 22. performItemClick           | 功能 |
| 23   | 23. adapterStack               | 功能 |
| 24   | 24. cardNext                   | 功能 |
| 25   | 25. cardPrevious               | 功能 |
| 26   | #### AdapterDataObservable     | 功能 |
| 27   | 01. notifyChanged              | 功能 |
| 28   | 02. hasObservers               | 功能 |
| 29   | #### ViewHolder                | 功能 |
| 30   | 01. context                    | 功能 |
| 31   | 02. itemViewType               | 功能 |
| 32   | 03. position                   | 功能 |
| 33   | 04. onAnimationStateChange     | 功能 |
| 34   | 05. onItemExpand               | 功能 |
| 35   | #### Adapter                   | 功能 |
| 36   | 01. itemCount                  | 功能 |
| 37   | 02. notifyDataSetChanged       | 功能 |
| 38   | 03. registerObserver           | 功能 |
| 39   | 04. createView                 | 功能 |
| 40   | 05. onCreateView               | 功能 |
| 41   | 06. bindViewHolder             | 功能 |
| 42   | 07. onBindViewHolder           | 功能 |
| 43   | 08. getItemViewType            | 功能 |
| 44   | #### AdapterStack              | 功能 |
| 45   | 01. layoutInflater             | 功能 |
| 46   | 02. dataList                   | 功能 |
| 47   | 03. itemCount                  | 功能 |
| 48   | 04. onBindViewHolder           | 功能 |
| 49   | 05. getItem                    | 功能 |
| 50   | 06. bindView                   | 功能 |

### *005.标题Title(203)*

| 序号 | 方法                      | 功能 |
|:-----|:--------------------------|:----|
| 01   | 01. rootLayout            | 功能 |
| 02   | 02. leftLL                | 功能 |
| 03   | 03. leftIV                | 功能 |
| 04   | 04. leftTV                | 功能 |
| 05   | 05. rightLL               | 功能 |
| 06   | 06. rightIV               | 功能 |
| 07   | 07. rightTV               | 功能 |
| 08   | 08. textAutoZoom          | 功能 |
| 09   | 09. leftIcon              | 功能 |
| 10   | 10. isLeftIconVisibility  | 功能 |
| 11   | 11. leftText              | 功能 |
| 12   | 12. leftTextColor         | 功能 |
| 13   | 13. leftTextSize          | 功能 |
| 14   | 14. isLeftTextVisibility  | 功能 |
| 15   | 15. rightIcon             | 功能 |
| 16   | 16. isRightIconVisibility | 功能 |
| 17   | 17. rightText             | 功能 |
| 18   | 18. rightTextColor        | 功能 |
| 19   | 19. rightTextSize         | 功能 |
| 20   | 20. isRightTextVisibility | 功能 |
| 21   | 21. title                 | 功能 |
| 22   | 22. titleColor            | 功能 |
| 23   | 23. titleSize             | 功能 |
| 24   | 24. isTitleVisibility     | 功能 |
| 25   | 25. setLeftFinish         | 功能 |
| 26   | 26. setLeftListener       | 功能 |
| 27   | 27. setLeftIconListener   | 功能 |
| 28   | 28. setLeftTextListener   | 功能 |
| 29   | 29. setRightListener      | 功能 |
| 30   | 30. setRightIconListener  | 功能 |
| 31   | 31. setRightTextListener  | 功能 |

>- layout:[title_view.xml](../../../../res/layout/title_view.xml)
>- mipmap
>
>>1. ![icon_previous](../../../../res/mipmap/icon_previous.png)
>>2. ![icon_set](../../../../res/mipmap/icon_set.png)与PopupSingle共用

### *006.侧边Side(240)*

| 序号 | 方法                          | 功能 |
|:-----|:------------------------------|:----|
| 01   | 01. lazyRespond               | 功能 |
| 02   | 02. textColor                 | 功能 |
| 03   | 03. textSize                  | 功能 |
| 04   | 04. maxOffset                 | 功能 |
| 05   | 05. sideBarPosition           | 功能 |
| 06   | 06. sideTextAlignment         | 功能 |
| 07   | 07. indexItems                | 功能 |
| 08   | 08. onSelectIndexItemListener | 功能 |

### *007.蛛网Cobweb：RotateInfo(411)*

| 序号 | 方法                       | 功能 |
|:-----|:---------------------------|:----|
| 01   | 01. spiderNameSize         | 功能 |
| 02   | 02. spiderMaxLevel         | 功能 |
| 03   | 03. spiderColor            | 功能 |
| 04   | 04. spiderRadiusColor      | 功能 |
| 05   | 05. spiderLevelColor       | 功能 |
| 06   | 06. spiderLevelStrokeColor | 功能 |
| 07   | 07. spiderLevelStrokeWidth | 功能 |
| 08   | 08. isSpiderLevelStroke    | 功能 |
| 09   | 09. isSpiderRotate         | 功能 |
| 10   | 10. ModelSpider            | 功能 |
| 11   | 11. spiderList             | 功能 |
| 12   | #### RotateInfo            | 功能 |
| 13   | 01. getAngleRotate         | 功能 |
| 14   | 02. getQuadrant            | 功能 |
| 15   | 03. getAngle               | 功能 |
| 16   | 04. CIRCLE_ANGLE           | 功能 |
| 17   | 05. getAngleNormalized     | 功能 |

### *008.网速NetSpeedView(155)*

| 序号 | 方法               | 功能 |
|:-----|:-------------------|:----|
| 01   | 01. isMulti        | 功能 |
| 02   | 02. timeInterval   | 功能 |
| 03   | 03. updateViewData | 功能 |
| 04   | 04. setTextColor   | 功能 |
| 05   | 05. setTextSize    | 功能 |

>- layout:[netspeed_view.xml](../../../../res/layout/netspeed_view.xml)

### *009.机座SeatAirplane(890)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. setEmptySelecting   | 功能 |
| 02   | 02. maxSelectStates     | 功能 |
| 03   | 03. setSeatSelected     | 功能 |
| 04   | 04. bitmapSeatNormal    | 功能 |
| 05   | 05. bitmapSeatSelected  | 功能 |
| 06   | 06. bitmapSeatSelecting | 功能 |
| 07   | 07. getFontLength       | 功能 |
| 08   | 08. getFontHeight       | 功能 |
| 09   | 09. setBitmap           | 功能 |
| 10   | 10. goCabinPosition     | 功能 |

>- mipmap（SeatMovie共用）
>
>>1. ![seat_gray](../../../../res/mipmap/seat_gray.png)
>>2. ![seat_green](../../../../res/mipmap/seat_green.png)
>>3. ![seat_sold](../../../../res/mipmap/seat_sold.png)

### *010.影座SeatMovie(717)*

| 序号 | 方法                     | 功能 |
|:-----|:-------------------------|:----|
| 01   | 01. numRow               | 功能 |
| 02   | 02. numColumn            | 功能 |
| 03   | 03. lineNumbers          | 功能 |
| 04   | 04. setData              | 功能 |
| 05   | 05. selectedSeat         | 功能 |
| 06   | 06. seatChecker          | 功能 |
| 07   | 07. getRowNumber         | 功能 |
| 08   | 08. getColumnNumber      | 功能 |
| 09   | 09. isDrawOverview       | 功能 |
| 10   | 10. isRenewOverview      | 功能 |
| 11   | 11. isDebug              | 功能 |
| 12   | 12. screenName           | 功能 |
| 13   | 13. isNeedDrawSeatBitmap | 功能 |
| 14   | 14. maxSelected          | 功能 |

### *011.图调PinView：ScaleImageView、ImageSource、ImageViewState、DecoderFactory、ImageDecoder、RegionDecoder(34+2115)*

| 序号 | 方法                            | 功能 |
|:-----|:--------------------------------|:----|
| 01   | 01. scaleMax                    | 功能 |
| 02   | 02. scaleDoubleTapDpiZoom       | 功能 |
| 03   | 03. setOnLongClickListener      | 功能 |
| 04   | 04. isEnabledZoom               | 功能 |
| 05   | 05. scale                       | 功能 |
| 06   | 06. isReady                     | 功能 |
| 07   | 07. isEnabledPan                | 功能 |
| 08   | 08. onImageEventListener        | 功能 |
| 09   | 09. isDebug                     | 功能 |
| 10   | 10. parallelLoadingEnabled      | 功能 |
| 11   | 11. BuilderAnim                 | 功能 |
| 12   | 12. animateScale                | 功能 |
| 13   | 13. animateCenter               | 功能 |
| 14   | 14. animateScaleAndCenter       | 功能 |
| 15   | 15. isEnabledQuickScale         | 功能 |
| 16   | 16. viewToSourceCoord           | 功能 |
| 17   | 17. requiredRotation            | 功能 |
| 18   | 18. sWidth                      | 功能 |
| 19   | 19. sHeight                     | 功能 |
| 20   | 20. minScaleType                | 功能 |
| 21   | 21. panLimit                    | 功能 |
| 22   | 22. minScaleDpi                 | 功能 |
| 23   | 23. doubleTapZoomStyle          | 功能 |
| 24   | 24. doubleTapZoomDuration       | 功能 |
| 25   | 25. setScaleAndCenter           | 功能 |
| 26   | 26. resetScaleAndCenter         | 功能 |
| 27   | 27. setTileBackgroundColor      | 功能 |
| 28   | 28. maxTileWidth                | 功能 |
| 29   | 29. maxTileHeight               | 功能 |
| 30   | 30. imageDecoder                | 功能 |
| 31   | 31. regionDecoder               | 功能 |
| 32   | 32. setImage                    | 功能 |
| 33   | 33. hasImage                    | 功能 |
| 34   | 34. isImageLoaded               | 功能 |
| 35   | 35. orientation                 | 功能 |
| 36   | 36. state                       | 功能 |
| 37   | 37. center                      | 功能 |
| 38   | 38. onStateChangedListener      | 功能 |
| 39   | 39. sourceToViewCoord           | 功能 |
| 40   | 40. recycle                     | 功能 |
| 41   | 41. minTileDpi                  | 功能 |
| 42   | 42. ORIENTATION_0               | 功能 |
| 43   | 43. ORIENTATION_90              | 功能 |
| 44   | 44. ORIENTATION_180             | 功能 |
| 45   | 45. ORIENTATION_270             | 功能 |
| 46   | 46. ORIENTATION_USE_EXIF        | 功能 |
| 47   | 47. ZOOM_FOCUS_FIXED            | 功能 |
| 48   | 48. ZOOM_FOCUS_CENTER           | 功能 |
| 49   | 49. ZOOM_FOCUS_CENTER_IMMEDIATE | 功能 |
| 50   | 50. EASE_OUT_QUAD               | 功能 |
| 51   | 51. EASE_IN_OUT_QUAD            | 功能 |
| 52   | 52. PAN_LIMIT_INSIDE            | 功能 |
| 53   | 53. PAN_LIMIT_OUTSIDE           | 功能 |
| 54   | 54. PAN_LIMIT_CENTER            | 功能 |
| 55   | 55. SCALE_TYPE_CENTER_INSIDE    | 功能 |
| 56   | 56. SCALE_TYPE_CENTER_CROP      | 功能 |
| 57   | 57. SCALE_TYPE_CUSTOM           | 功能 |
| 58   | 58. ORIGIN_ANIM                 | 功能 |
| 59   | 59. ORIGIN_TOUCH                | 功能 |
| 60   | 60. ORIGIN_FLING                | 功能 |
| 61   | 61. ORIGIN_DOUBLE_TAP_ZOOM      | 功能 |
| 62   | 62. tileSizeAuto                | 功能 |
| 63   | #### PinView                    | 功能 |
| 64   | 01. pinS                        | 功能 |

>- mipmap
>
>>1. ![pushpin_blue](../../../../res/mipmap/pushpin_blue.png)
>>2. ![tooltip_arrow_down.9](../../../../res/mipmap/tooltip_arrow_down.9.png)
>>3. ![tooltip_arrow_down_left.9](../../../../res/mipmap/tooltip_arrow_down_left.9.png)
>>4. ![tooltip_arrow_down_right.9](../../../../res/mipmap/tooltip_arrow_down_right.9.png)
>>5. ![tooltip_arrow_left.9](../../../../res/mipmap/tooltip_arrow_left.9.png)
>>6. ![tooltip_arrow_right.9](../../../../res/mipmap/tooltip_arrow_right.9.png)
>>7. ![tooltip_arrow_up.9](../../../../res/mipmap/tooltip_arrow_up.9.png)
>>8. ![tooltip_arrow_up_left.9](../../../../res/mipmap/tooltip_arrow_up_left.9.png)
>>9. ![tooltip_arrow_up_right.9](../../../../res/mipmap/tooltip_arrow_up_right.9.png)
>>10. ![tooltip_no_arrow.9](../../../../res/mipmap/tooltip_no_arrow.9.png)

### *012.验证Captcha(117)*

| 序号 | 方法           | 功能 |
|:-----|:---------------|:----|
| 01   | 01. build      | 功能 |
| 02   | 02. mType      | 功能 |
| 03   | 03. codeLength | 功能 |
| 04   | 04. makeCode   | 功能 |
| 05   | 05. width      | 功能 |
| 06   | 06. height     | 功能 |
| 07   | 07. color      | 功能 |
| 08   | 08. fontSize   | 功能 |
| 09   | 09. code       | 功能 |
| 10   | 10. lineNumber | 功能 |
| 11   | 11. makeBitmap | 功能 |
| 12   | 12. into       | 功能 |

### *013.滑块SwipeCaptcha(393)*

| 序号 | 方法                       | 功能 |
|:-----|:---------------------------|:----|
| 01   | 01. maxSwipeValue          | 功能 |
| 02   | 02. onCaptchaMatchCallback | 功能 |
| 03   | 03. createCaptcha          | 功能 |
| 04   | 04. matchCaptcha           | 功能 |
| 05   | 05. resetCaptcha           | 功能 |
| 06   | 06. setCurrentSwipeValue   | 功能 |

### *014.平滚AutoImage(35)*

| 序号 | 方法          | 功能 |
|:-----|:--------------|:----|
| 01   | 01. imageView | 功能 |

>1. anim:[anim_translate.xml](../../../../res/anim/anim_translate.xml)
>2. layout:[autoimage_view.xml](../../../../res/layout/autoimage_view.xml)

### *015.刮刮ScratchCard(48)*

>- mipmap:![img_loading](../../../../res/mipmap/img_loading.png)

### *016.爱心HeartLayout：FloatAnimation、PathAnimator、HeartView(241)*

| 序号 | 方法         | 功能 |
|:-----|:-------------|:----|
| 01   | 01. addHeart | 功能 |

>- mipmap
>
>>1. ![anim_heart](../../../../res/mipmap/anim_heart.png)
>>2. ![anim_heart_border](../../../../res/mipmap/anim_heart_border.png)

### *017.拖动Seek(755)*

| 序号 | 方法                            | 功能         |
|:-----|:--------------------------------|:------------|
| 01   | 01. min                         | 获取最小值   |
| 02   | 02. max                         | 获取最大值   |
| 03   | 03. isHintHolder                | 是否显示提示 |
| 04   | 04. setLeftProgressDescription  | 设置左边描述 |
| 05   | 05. setRightProgressDescription | 设置右边描述 |
| 06   | 06. setProgressDescription      | 设置进度描述 |
| 07   | 07. setRange                    | 设置区间    |
| 08   | 08. setRules                    | 设置刻度    |
| 09   | 09. currentRange                | 获取当前区间 |
| 10   | 10. setEnabled                  | 设置是否启用 |
| 11   | 11. onRangeChangedListener      | 区间改变监听 |
| 12   | 12. setValue                    | 设置值      |

>- mipmap
>
>>1. ![seek_thumb](../../../../res/mipmap/seek_thumb.png)
>>2. ![seek_hint.9](../../../../res/mipmap/seek_hint.9.png)

### *018.刻度RulerWheel(464)*

| 序号 | 方法                            | 功能 |
|:-----|:--------------------------------|:----|
| 01   | 01. markAdditionCenter          | 功能 |
| 02   | 02. selectedPosition            | 功能 |
| 03   | 03. items                       | 功能 |
| 04   | 04. OnWheelItemSelectedListener | 功能 |
| 05   | 05. minSelectableIndex          | 功能 |
| 06   | 06. maxSelectableIndex          | 功能 |
| 07   | 07. smoothSelectIndex           | 功能 |
| 08   | 08. fling                       | 功能 |

### *019.水波Wave(231)*

| 序号 | 方法                | 功能 |
|:-----|:--------------------|:----|
| 01   | 01. shapeType       | 功能 |
| 02   | 02. frontWaveColor  | 功能 |
| 03   | 03. borderWidth     | 功能 |
| 04   | 04. behindWaveColor | 功能 |
| 05   | 05. borderColor     | 功能 |
| 06   | 06. start           | 功能 |
| 07   | 07. cancel          | 功能 |
| 08   | 08. setWaveColor    | 功能 |
| 09   | 09. setBorder       | 功能 |
| 10   | 10. isShowWave      | 功能 |
| 11   | 11. waveLengthRatio | 功能 |
| 12   | 12. amplitudeRatio  | 功能 |
| 13   | 13. waveShiftRatio  | 功能 |
| 14   | 14. waterLevelRatio | 功能 |

### *020.弧度ProgressRound(165)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. circleColor         | 功能 |
| 02   | 02. circleProgressColor | 功能 |
| 03   | 03. textColor           | 功能 |
| 04   | 04. textSize            | 功能 |
| 05   | 05. roundWidth          | 功能 |
| 06   | 06. max                 | 功能 |
| 07   | 07. STROKE              | 功能 |
| 08   | 08. FILL                | 功能 |
| 09   | 09. progress            | 功能 |

### *021.进度ProgressView(258)*

| 序号 | 方法              | 功能 |
|:-----|:------------------|:----|
| 01   | 01. isStop        | 功能 |
| 02   | 02. isFinish      | 功能 |
| 03   | 03. finishLoad    | 功能 |
| 04   | 04. progress      | 功能 |
| 05   | 05. resetProgress | 功能 |
| 06   | 06. toggle        | 功能 |
| 07   | 07. setStop       | 功能 |

>- ![flicker](../../../../res/mipmap/flicker.png)

### *022.分隔Divider(32)*

>- implementation "com.google.android.material:material:1.2.1"

### *023.商品ShoppingView(362)*

| 序号 | 方法                        | 功能 |
|:-----|:----------------------------|:----|
| 01   | 01. onShoppingClickListener | 功能 |
| 02   | 02. setTextNum              | 功能 |

### *024.点赞ShineView：ShineButton、PorterShapeImageView、PorterImageView、ShineAnimator、EasingInterpolator、EasingProvider、Ease(699)*

| 序号 | 方法                      | 功能 |
|:-----|:--------------------------|:----|
| 01   | 01. clickValue            | 功能 |
| 02   | 02. colorRandom           | 功能 |
| 03   | 03. enableFlashing        | 功能 |
| 04   | 04. allowRandomColor      | 功能 |
| 05   | 05. shineColorBig         | 功能 |
| 06   | 06. shineColorSmall       | 功能 |
| 07   | 07. shineSize             | 功能 |
| 08   | 08. shineCount            | 功能 |
| 09   | 09. animDuration          | 功能 |
| 10   | 10. animDurationClick     | 功能 |
| 11   | 11. shineTurnAngle        | 功能 |
| 12   | 12. smallShineOffsetAngle | 功能 |
| 13   | 13. shineDistanceMultiple | 功能 |
| 14   | 14. showAnimation         | 功能 |

### *025.字调TextAutoZoom(210)*

| 序号 | 方法                 | 功能 |
|:-----|:---------------------|:----|
| 01   | 01. setNormalization | 功能 |
| 02   | 02. minTextSize      | 功能 |
| 03   | 03. enableSizeCache  | 功能 |

>- [Title.kt](Title.kt)

### *026.跑马RunText(12)*

### *027.单滚TextVertical(100)*

| 序号 | 方法                     | 功能 |
|:-----|:-------------------------|:----|
| 01   | 01. mTextSize            | 功能 |
| 02   | 02. mTextColor           | 功能 |
| 03   | 03. mPadding             | 功能 |
| 04   | 04. mOnItemClickListener | 功能 |
| 05   | 05. titles               | 功能 |
| 06   | 06. autoScrollStart      | 功能 |
| 07   | 07. autoScrollStop       | 功能 |
| 08   | 08. setTimeTextStill     | 功能 |
| 09   | 09. setTimeAnim          | 功能 |

### *028.多滚TextVerticalMore(40)*

| 序号 | 方法                    | 功能 |
|:-----|:------------------------|:----|
| 01   | 01. interval            | 功能 |
| 02   | 02. animDuration        | 功能 |
| 03   | 03. isSetAnimDuration   | 功能 |
| 04   | 04. onItemClickListener | 功能 |
| 05   | 05. setViews            | 功能 |

>- anim
>
>>1. [anim_marquee_in.xml](../../../../res/anim/anim_marquee_in.xml)
>>2. [anim_marquee_out.xml](../../../../res/anim/anim_marquee_out.xml)

### *029.通知NoticeHelper：NoticeBase、NoticeBigPic、NoticeBigText、NoticeMailbox、NoticeProgress、NoticeCustomView(473)*

| 序号 | 方法                            | 功能                         |
|:-----|:--------------------------------|:-----------------------------|
| 01   | 01. buildSimple                 | 构建简单通知                 |
| 02   | 02. buildBigPic                 | 构建带图片通知                |
| 03   | 03. buildBigText                | 构建多文本通知                |
| 04   | 04. buildMailBox                | 构建带多条消息合并的消息盒通知 |
| 05   | 05. buildProgress               | 构建带进度条通知，可无精确进度 |
| 06   | 06. buildCustomView             | 构建自定义通知                |
| 07   | 07. isNotifyPermissionOpen      | 通知栏权限是否获取            |
| 08   | 08. openNotifyPermissionSetting | 打开通知栏权限设置页面        |
| 09   | 09. getManager                  | 获取通知管理器                |
| 10   | 10. notify                      | 通知                         |
| 11   | 11. cancel                      | 取消通知                     |
| 12   | 12. cancelAll                   | 取消所有通知                 |

### *030.说明PopupImply(31)*

| 序号 | 方法     | 功能     |
|:-----|:---------|:--------|
| 01   | 01. show | 显示说明 |

>- layout:[popup_imply.xml](../../../../res/layout/popup_imply.xml)
>- mipmap:![popup_imply.9](../../../../res/mipmap/popup_imply.9.png)

### *031.弹表PopupSingle(111)*

| 序号 | 方法                    | 功能           |
|:-----|:------------------------|:--------------|
| 01   | 01. itemOnClickListener | 表项点击监听器 |
| 02   | 02. cleanAction         | 清空表项      |
| 03   | 03. addAction           | 添加表项      |
| 04   | 04. getAction           | 获取表项      |
| 05   | 05. colorItemText       | 弹表文本颜色   |
| 06   | 06. show                | 显示可选弹表   |

>- mipmap:![icon_set](../../../../res/mipmap/icon_set.png)与Title共用
>- layout
>
>>1. [popup_list_layout.xml](../../../../res/layout/popup_list_layout.xml)
>>2. [popup_list_item.xml](../../../../res/layout/popup_list_item.xml)

### *032.弹框PopupViewManager：PopupView、BackgroundConstructor、Coordinates、CoordinatesFinder(533)*

| 序号 | 方法                       | 功能 |
|:-----|:---------------------------|:----|
| 01   | 01. TipListener            | 功能 |
| 02   | 02. animationDuration      | 功能 |
| 03   | 03. show                   | 功能 |
| 04   | 04. clearTipsMap           | 功能 |
| 05   | 05. findAndDismiss         | 功能 |
| 06   | 06. find                   | 功能 |
| 07   | 07. dismiss                | 功能 |
| 08   | 08. isVisible              | 功能 |
| 09   | #### BackgroundConstructor | 功能 |
| 10   | 01. setBackground          | 功能 |
| 11   | #### Coordinates           | 功能 |
| 12   | 01. left                   | 功能 |
| 13   | 02. top                    | 功能 |
| 14   | 03. right                  | 功能 |
| 15   | 04. bottom                 | 功能 |
| 16   | #### CoordinatesFinder     | 功能 |
| 17   | 01. getCoordinates         | 功能 |
| 18   | #### PopupView             | 功能 |
| 19   | 01. context                | 功能 |
| 20   | 02. anchorView             | 功能 |
| 21   | 03. rootView               | 功能 |
| 22   | 04. message                | 功能 |
| 23   | 05. spannableMessage       | 功能 |
| 24   | 06. isShowArrow            | 功能 |
| 25   | 07. backgroundColor        | 功能 |
| 26   | 08. textColor              | 功能 |
| 27   | 09. textSize               | 功能 |
| 28   | 10. elevation              | 功能 |
| 29   | 11. offsetX                | 功能 |
| 30   | 12. offsetY                | 功能 |
| 31   | 13. textGravityTemp        | 功能 |
| 32   | 14. textGravity            | 功能 |
| 33   | 15. align                  | 功能 |
| 34   | 16. position               | 功能 |
| 35   | 17. isHideArrow            | 功能 |
| 36   | 18. isTextGravityCenter    | 功能 |
| 37   | 19. isTextGravityLeft      | 功能 |
| 38   | 20. isTextGravityRight     | 功能 |
| 39   | 21. isAlignedCenter        | 功能 |
| 40   | 22. isAlignedLeft          | 功能 |
| 41   | 23. isAlignedRight         | 功能 |
| 42   | 24. isPositionedAbove      | 功能 |
| 43   | 25. isPositionedBelow      | 功能 |
| 44   | 26. isPositionedLeftTo     | 功能 |
| 45   | 27. isPositionedRightTo    | 功能 |
| 46   | ##### BuilderPopupView     | 功能 |
| 47   | 01. mContext               | 功能 |
| 48   | 02. mAnchorView            | 功能 |
| 49   | 03. mRootView              | 功能 |
| 50   | 04. mMessage               | 功能 |
| 51   | 05. mSpannableMessage      | 功能 |
| 52   | 06. mIsShowArrow           | 功能 |
| 53   | 07. mBackgroundColor       | 功能 |
| 54   | 08. mTextColor             | 功能 |
| 55   | 09. mTextSize              | 功能 |
| 56   | 10. mElevation             | 功能 |
| 57   | 11. mOffsetX               | 功能 |
| 58   | 12. mOffsetY               | 功能 |
| 59   | 13. mTextGravity           | 功能 |
| 60   | 14. mAlign                 | 功能 |
| 61   | 15. mPosition              | 功能 |
| 62   | 16. BuilderPopupView       | 功能 |
| 63   | 17. buildPopupView         | 功能 |

## **附01.原生Layouts布局（行、列、格、面）**

| 序号 | 布局                                     | 功能                              |
|:-----|:-----------------------------------------|:----------------------------------|
| 001  | *001.ConstraintLayout*                   | 约束布局                          |
| 002  | *002.LinearLayout(horizontal、vertical)* | 线性布局（水平、垂直）             |
| 003  | *003.TableLayout(TableRow)*              | 表格布局（LayoutTab和LayoutLabel） |
| 005  | *005.Space*                              | 空白                              |
| 006  | *006.~~RelativeLayout~~*                 | ~~相对布局（遗留）~~               |
| 007  | *007.~~CoordinatorLayout~~*              | ~~协调布局（增强型帧布局）~~       |
| 008  | *008.~~GridLayout~~*                     | ~~网格布局（遗留）~~               |
| 009  | *009.~~AbsoluteLayout~~*                 | ~~绝对布局~~                      |

## **附02.原生Containers容器（条目、栏目、页目）**

| 序号 | 容器                                                                            | 功能                                                                                          |
|:-----|:-------------------------------------------------------------------------------|:----------------------------------------------------------------------------------------------|
| 001  | *001.Spinner*                                                                  | 下拉列表                                                                                      |
| 002  | *002.RecyclerView*                                                             | 回收视图（BaseAdapterBinder）                                                                  |
| 003  | *003.ScrollView、HorizontalScrollView、NestedScrollView*                       | 滚动视图、水平滚动视图、嵌套滚动视图                                                             |
| 004  | *004.ViewPager2*                                                               | 视图切换器（Banner）                                                                           |
| 005  | *005.CardView*                                                                 | 卡牌视图（CardStackView）                                                                      |
| 006  | *006.AppBarLayout、BottomAppBar、NavigationView、BottomNavigationView、Toolbar* | 程序条布局（垂直线性布局支持滚动手势）、底部程序条、工具条（Title）、导航视图（Side）、底部导航视图 |
| 007  | *007.TabLayout(TabItem)、NavHostFragment*                                      | 标签布局（标签项）、导航主机片段                                                                |
| 008  | *008.ViewStub、\<include\>、\<fragment\>、\<view\>、\<requestFocus\>*           | 占位视图、引用布局、引用片段、引用视图、引用焦点视图                                             |
| 009  | *009.~~ListView、ExpandableListView、GridView~~*                               | ~~列表视图（遗留）、可展开列表视图、网格视图（遗留）~~                                            |
| 010  | *010.~~ActionBar、Tabs、TabHost~~*                                             | ~~操作条、标签组、标签主机（遗留）~~                                                            |
| 011  | *011.~~StackView~~*                                                            | ~~堆叠视图~~                                                                                  |
| 012  | *012.~~ViewAnimator~~*                                                         | ~~视图动画~~                                                                                  |
| 013  | *013.~~TextSwitcher、ImageSwitcher、ViewSwitcher~~*                            | ~~文本切换器、图片切换器、视图切换器~~                                                          |
| 014  | *014.~~ViewFlipper、AdapterViewFlipper~~*                                      | ~~视图翻转器、适配器视图翻转器~~                                                                |

## **附03.原生Helpers助手（隐藏功能）**

| 序号 | 助手                                     | 功能                      |
|:-----|:-----------------------------------------|:-------------------------|
| 001  | *001.MockView*                           | 模拟视图                 |
| 002  | *002.ImageFilterView、ImageFilterButton* | 图片过滤视图、图片过滤按钮 |
| 003  | *003.Guideline(Horizontal、Vertical)*    | 引导线（水平、垂直）      |
| 004  | *004.Barrier(Horizontal、Vertical)*      | 屏障（水平、垂直）        |
| 005  | *005.Group*                              | 组                       |
| 006  | *006.Flow*                               | 流                       |
| 007  | *007.Layer*                              | 层                       |

## **附04.原生Widgets组件（通用、图片、条框）**

| 序号 | 组件                                                                                          | 功能                                                                                                                |
|:-----|:---------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------------------------------|
| 001  | *001.View、WebView、VideoView、CalendarView*                                                 | 视图、网页视图、视频视图、日历视图（Cobweb、NetSpeedView、SeatAirplane、SeatMovie）                                     |
| 002  | *002.ImageView*                                                                              | 图片视图（PinView、Captcha、SwipeCaptcha、AutoImage、ScratchCard、HeartLayout）                                       |
| 003  | *003.ProgressBar、ProgressBar(Horizontal)、SeekBar、SeekBar(Discrete)、RatingBar、SearchView* | 拖动条（Seek）、分离拖动条（RulerWheel）、进度条（Wave、ProgressRound）、水平进度条（ProgressView）、星级评分条、搜索视图 |
| 004  | *004.TextureView、SurfaceView*                                                               | 结构视图、表面视图                                                                                                    |
| 005  | *005.Divider(Horizontal、Vertical)*                                                          | 分隔条（水平、垂直、Divider）                                                                                         |
| 006  | *006.~~AnalogClock、TextClock、Chronometer~~*                                                | ~~模拟时钟、文本时钟、计时器~~                                                                                         |
| 007  | *007.~~TimePicker、DatePicker、NumberPicker~~*                                               | ~~时间选择器、日期选择器、数字选择器~~                                                                                 |
| 008  | *008.~~ZoomButton、ZoomControls~~*                                                           | ~~缩放按钮、缩放控制~~                                                                                                |
| 009  | *009.~~QuickContactBadge~~*                                                                  | ~~快捷联系人标识~~                                                                                                   |
| 010  | *010.~~AdView、MapView、MapFragment~~*                                                       | ~~广告视图、地图视图、地图片段~~                                                                                       |

## **附05.原生Buttons按钮（执行、选择）**

| 序号 | 按钮                                                     | 功能                                                     |
|:-----|:--------------------------------------------------------|:---------------------------------------------------------|
| 001  | *001.Button、ImageButton、FloatingActionButton*          | 按钮、图片按钮（ShoppingView、ShineView）、浮动操作按钮    |
| 002  | *002.ChipGroup(Chip)、RadioGroup(RadioButton)、CheckBox* | 流式布局标签组（流式布局标签）、单选框组（单选按钮）、复选框 |
| 003  | *003.ToggleButton、Switch*                               | 切换按钮、开关                                           |

## **附06.原生Text文本（显示、输入）**

| 序号 | 文本                                                                                                                                         | 功能                                                                                                              |
|:-----|:--------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------------|
| 001  | *001.TextView*                                                                                                                              | 文本视图（TextAutoZoom、RunText、TextVertical、TextVerticalMore）                                                   |
| 002  | *002.PlainText、Password、Password(Numeric)、Email、Phone、PostalAddress、MultilineText、Time、Date、Number、Number(Signed)、Number(Decimal)* | 输入普通文本、任意字符密码、数字密码、邮箱地址、电话号码、邮政地址、多行文本、时间、日期、数字、带正负号数字、带小数点数字 |
| 003  | *003.AutoCompleteTextView、MultiAutoCompleteTextView、CheckedTextView、TextInputLayout*                                                      | 单选自动完成文本框、多选自动完成文本框、文本复选框、文本输入布局（包含EditView默认生成浮动Label）                       |

## **附07.原生Remind提醒（强烈、安静）**

| 序号 | 提醒                                                                          | 功能                                                       |
|:-----|:-----------------------------------------------------------------------------|:-----------------------------------------------------------|
| 001  | *001.Notification、RemoteViews*                                              | 通知（NoticeHelper）、桌面控件                              |
| 002  | *002.Menu、PopupWindow*                                                      | 菜单、弹窗（PopupImply、PopupSingle、PopupViewManager）     |
| 003  | *003.Dialog、DatePickerDialog、TimePickerDialog、ProgressDialog、AlertDialog* | 对话框、日期选择对话框、时间选择对话框、进度对话框、警告对话框 |
| 004  | *004.Toast、Snackbar*                                                        | 吐司（工具ToastHelper）、快餐（工具SnackHelper）             |

## **附08.UI趋势建议**

| 序号 | 类别                   | 控件（严控有限空间Activity跳转、杜绝扩展空间Fragment切换、优先无限空间RecyclerView滑动）共35个常用                                                                                                                                                                          |
|:-----|:----------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 001  | *001.Layouts行列格面4* | 独立活动根布局ConstraintLayout、回收视图子布局LinearLayout、TableLayout、FrameLayout、~~Space~~                                                                                                                                                                          |
| 002  | *001.Containers条目2* | 容器RecyclerView、适配器BaseAdapterBinder、~~Spinner、ScrollView、HorizontalScrollView、NestedScrollView~~                                                                                                                                                               |
| 003  | *002.Containers页目2* | 引导轮播Banner、轮播内容CardView、~~ViewPager2、CardStackView~~                                                                                                                                                                                                          |
| 004  | *003.Containers栏目3* | 回收视图子布局直达LayoutTab、回收视图条目直达Toolbar、回收视图子布局头部Title、~~AppBarLayout、BottomAppBar、NavigationView、BottomNavigationView、Side、TabLayout(TabItem)、NavHostFragment、LayoutLabel、ViewStub、\<include\>、\<fragment\>、\<view\>、\<requestFocus\>~~ |
| 005  | *001.Helpers助手0*    | ~~MockView、ImageFilterView、ImageFilterButton、Guideline(Horizontal、Vertical)、Barrier(Horizontal、Vertical)、Group、Flow、Layer~~                                                                                                                                     |
| 006  | *001.Widgets通用2*    | 月度任务标记CalendarView、综合评分展示Cobweb、~~View、WebView、VideoView、NetSpeedView、SeatAirplane、SeatMovie~~                                                                                                                                                         |
| 007  | *002.Widgets图片4*    | 图片显示ImageView、指定位置固定可缩放图片PinView、输码验证Captcha、滑动验证SwipeCaptcha、~~AutoImage、ScratchCard、HeartLayout~~                                                                                                                                            |
| 008  | *003.Widgets条框6*    | 任务进度ProgressBar、进度动效Wave、设置起止值Seek、设置精确值RulerWheel、任务评分RatingBar、搜索SearchView、~~ProgressBar(Horizontal)、SeekBar、SeekBar(Discrete)、ProgressRound、ProgressView、TextureView、SurfaceView、Divider(Horizontal、Vertical)、Divider~~           |
| 009  | *001.Buttons执行1*    | 执行任务ImageButton、~~Button、FloatingActionButton、ShoppingView、ShineView~~                                                                                                                                                                                           |
| 010  | *002.Buttons选择1*    | 开关状态ChipGroup(Chip)、~~RadioGroup(RadioButton)、CheckBox、ToggleButton、Switch~~                                                                                                                                                                                     |
| 011  | *001.Text显示2*       | 文本显示TextView、文本自动缩放TextAutoZoom、~~RunText、TextVertical、TextVerticalMore~~                                                                                                                                                                                   |
| 012  | *002.Text输入3*       | 文本输入PlainText、输入建议MultiAutoCompleteTextView、输入提示TextInputLayout、~~Password、Password(Numeric)、Email、Phone、PostalAddress、MultilineText、Time、Date、Number、Number(Signed)、Number(Decimal)、AutoCompleteTextView、CheckedTextView~~                     |
| 013  | *001.Remind强烈3*     | 弹出提示PopupImply、弹出操作PopupSingle、弹出对话PopupViewManager、~~Menu、PopupWindow、Dialog、DatePickerDialog、TimePickerDialog、ProgressDialog、AlertDialog、Notification、RemoteViews~~                                                                               |
| 014  | *002.Remind安静2*     | 显示提示SnackHelper、发送通知NoticeHelper、~~Toast、Snackbar、ToastHelper~~                                                                                                                                                                                              |

## **附09.回收视图可用单项及其成员**

| 序号 | 类别                  | 单项22个及其成员8个共30个                                     |
|:-----|:---------------------|:-------------------------------------------------------------|
| 001  | *001.布局------成员3* | LinearLayout、TableLayout、FrameLayout、~~ConstraintLayout~~ |
| 002  | *001.容器-条目-单项1* | RecyclerView、~~BaseAdapterBinder~~                          |
| 003  | *002.容器-页目-单项2* | Banner、CardView                                             |
| 004  | *003.容器-栏目-单项2* | Toolbar、Title、~~LayoutTab~~                                |
| 005  | *001.组件-通用-单项2* | CalendarView、Cobweb                                         |
| 006  | *002.组件-图片-单项2* | ImageView、PinView、~~Captcha、SwipeCaptcha~~                |
| 007  | *003.组件-条框-单项6* | Seek、RulerWheel、Wave、ProgressBar、RatingBar、SearchView   |
| 008  | *001.按钮-执行-单项1* | ImageButton                                                  |
| 009  | *002.按钮-选择-单项1* | ChipGroup(Chip)                                              |
| 010  | *001.文本-显示-单项2* | TextView、TextAutoZoom                                       |
| 011  | *002.文本-输入-单项3* | PlainText、MultiAutoCompleteTextView、TextInputLayout        |
| 012  | *001.提醒-强烈-成员4* | PopupImply、PopupSingle、PopupViewManager、NoticeHelper      |
| 013  | *002.提醒-安静-成员1* | SnackHelper                                                  |

## **附10.回收视图可备单项控件**

| 序号 | 单项布局xml                | 单项布局Binder     | 单项布局Bean      |
|:-----|:--------------------------|:-------------------|:-----------------|
| 001  | *001.binder_recycler*     | RecyclerBinder     | RecyclerBean     |
| 002  | ~~*002.binder_banner*~~   | ~~BannerBinder~~   | ~~BannerBean~~   |
| 003  | ~~*003.binder_card*~~     | ~~CardBinder~~     | ~~CardBean~~     |
| 004  | ~~*004.binder_toolbar*~~  | ~~ToolbarBinder~~  | ~~ToolbarBean~~  |
| 005  | ~~*005.binder_title*~~    | ~~TitleBinder~~    | ~~TitleBean~~    |
| 006  | ~~*006.binder_calendar*~~ | ~~CalendarBinder~~ | ~~CalendarBean~~ |
| 007  | ~~*007.binder_cobweb*~~   | ~~CobwebBinder~~   | ~~CobwebBean~~   |
| 008  | ~~*008.binder_image*~~    | ~~ImageBinder~~    | ~~ImageBean~~    |
| 009  | ~~*009.binder_pin*~~      | ~~PinBinder~~      | ~~PinBean~~      |
| 010  | ~~*010.binder_progress*~~ | ~~ProgressBinder~~ | ~~ProgressBean~~ |
| 011  | *011.binder_seek*         | SeekBinder         | SeekBean         |
| 012  | *012.binder_ruler*        | RulerBinder        | RulerBean        |
| 013  | ~~*013.binder_wave*~~     | ~~WaveBinder~~     | ~~WaveBean~~     |
| 014  | ~~*014.binder_rating*~~   | ~~RatingBinder~~   | ~~RatingBean~~   |
| 015  | *015.binder_search*       | SearchBinder       | SearchBean       |
| 016  | *016.binder_button*       | ButtonBinder       | ButtonBean       |
| 017  | *017.binder_chip*         | ChipBinder         | ChipBean         |
| 018  | *018.binder_text*         | TextBinder         | TextBean         |
| 019  | ~~*019.binder_zoom*~~     | ~~ZoomBinder~~     | ~~ZoomBean~~     |
| 020  | *020.binder_plain*        | PlainBinder        | PlainBean        |
| 021  | ~~*021.binder_complete*~~ | ~~CompleteBinder~~ | ~~CompleteBean~~ |
| 022  | ~~*022.binder_input*~~    | ~~InputBinder~~    | ~~InputBean~~    |

## **附11.回收视图常用单项控件**

| 序号 | 单项布局xml            | 单项布局Binder | 单项布局Bean  |
|:-----|:----------------------|:---------------|:-------------|
| 001  | *001.binder_recycler* | RecyclerBinder | RecyclerBean |
| 002  | *002.binder_seek*     | SeekBinder     | SeekBean     |
| 003  | *003.binder_ruler*    | RulerBinder    | RulerBean    |
| 004  | *004.binder_search*   | SearchBinder   | SearchBean   |
| 005  | *005.binder_button*   | ButtonBinder   | ButtonBean   |
| 006  | *006.binder_chip*     | ChipBinder     | ChipBean     |
| 007  | *007.binder_text*     | TextBinder     | TextBean     |
| 008  | *008.binder_plain*    | PlainBinder    | PlainBean    |

## **附12.原生使用扼要**

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
        }//SwipeRefreshLayout
```

