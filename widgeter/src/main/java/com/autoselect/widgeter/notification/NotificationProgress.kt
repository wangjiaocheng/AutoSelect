package com.autoselect.widgeter.notification

import androidx.core.app.NotificationCompat

class NotificationProgress : NotificationBase() {
    companion object {
        private const val DEFAULT_FORMAT: String = "进度:%d/%d"
    }

    private var mFormat = DEFAULT_FORMAT//模版
    fun setFormat(format: String): NotificationProgress? = apply { mFormat = format }
    private var mMax = 0//最大进度
    fun setMaxProgress(max: Int): NotificationProgress? = apply { mMax = max }
    private var mProgress = 0//进度条
    fun setProgress(max: Int, progress: Int): NotificationProgress? = apply {
        mMax = max
        mProgress = progress
        setContentText<NotificationBase?>(String.format(DEFAULT_FORMAT, mProgress, mMax))
    }

    private var mIndeterminate = false//是否无进度条
    fun setIndeterminate(indeterminate: Boolean): NotificationProgress? = apply {
        mIndeterminate = indeterminate
        if (mIndeterminate) {
            mMax = 0
            mProgress = 0
            setContentText<NotificationBase?>(null)
        }
    }

    fun updateProgress(progress: Int, format: String, vararg args: Any?) {
        mProgress = progress
        mFormat = format
        setContentText<NotificationBase?>(String.format(mFormat, *args))
    }

    fun updateProgress(progress: Int) {
        mProgress = progress
        setContentText<NotificationBase?>(String.format(DEFAULT_FORMAT, mProgress, mMax))
    }

    private val updateProgress = builder?.setProgress(mMax, mProgress, mIndeterminate)
    override fun afterBuild() {
        updateProgress
        builder?.setDefaults(0)
        builder?.priority = NotificationCompat.PRIORITY_LOW
    }
}