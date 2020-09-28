package com.autoselect.widgeter.notification

import android.app.PendingIntent
import android.graphics.Bitmap
import android.widget.RemoteViews

class NotificationCustomView(packageName: String? = null, layoutId: Int = 0) : NotificationBase() {
    private var mContentView: RemoteViews? = RemoteViews(packageName, layoutId)//自定义view
    fun setContentView(packageName: String?, layoutId: Int): NotificationCustomView? =
        apply { mContentView = RemoteViews(packageName, layoutId) }

    fun setContentView(contentView: RemoteViews?): NotificationCustomView? =
        apply { mContentView = contentView }

    private var mIsBigContentView = false//是否是高度最大的自定义view
    fun setIsBigContentView(isBigContentView: Boolean): NotificationCustomView? =
        apply { mIsBigContentView = isBigContentView }

    fun setTextViewText(viewId: Int, text: CharSequence?): NotificationCustomView? =
        apply { mContentView?.setTextViewText(viewId, text) }

    fun setImageViewResource(viewId: Int, srcId: Int): NotificationCustomView? =
        apply { mContentView?.setImageViewResource(viewId, srcId) }

    fun setImageViewBitmap(viewId: Int, bitmap: Bitmap?): NotificationCustomView? =
        apply { mContentView?.setImageViewBitmap(viewId, bitmap) }

    fun setOnClickPendingIntent(
        viewId: Int, pendingIntent: PendingIntent?
    ): NotificationCustomView? =
        apply { mContentView?.setOnClickPendingIntent(viewId, pendingIntent) }//设置按钮点击事件

    override fun afterBuild() {
        mContentView?.let {
            when {
                mIsBigContentView -> builder?.setCustomBigContentView(it)
                else -> builder?.setCustomContentView(it)
            }
        }
    }
}