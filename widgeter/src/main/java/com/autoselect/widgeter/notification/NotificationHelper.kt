package com.autoselect.widgeter.notification

import android.app.Activity
import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import androidx.core.app.NotificationManagerCompat
import com.autoselect.helper.AHelper

object NotificationHelper {
    private var mNotificationManager: NotificationManager? = null
    fun buildSimple(
        id: Int, smallIcon: Int, contentTitle: CharSequence?,
        contentText: CharSequence?, contentIntent: PendingIntent?
    ): NotificationBase? = NotificationBase().setId<NotificationBase?>(id)
        ?.setBaseInfo<NotificationBase?>(smallIcon, contentTitle, contentText)
        ?.setContentIntent(contentIntent)

    fun buildBigPic(
        id: Int, smallIcon: Int, contentTitle: CharSequence?, summaryText: CharSequence?
    ): NotificationBigPic? = NotificationBigPic().setId<NotificationBase?>(id)
        ?.setSmallIcon<NotificationBase?>(smallIcon)
        ?.setContentTitle<NotificationBase?>(contentTitle)?.setSummaryText(summaryText)

    fun buildBigText(
        id: Int, smallIcon: Int, contentTitle: CharSequence?, contentText: CharSequence?
    ): NotificationBigText? = NotificationBigText().setId<NotificationBase?>(id)
        ?.setBaseInfo(smallIcon, contentTitle, contentText)

    fun buildMailBox(id: Int, smallIcon: Int, contentTitle: CharSequence?): NotificationMailbox? =
        NotificationMailbox().setId<NotificationBase?>(id)
            ?.setSmallIcon<NotificationBase?>(smallIcon)?.setContentTitle(contentTitle)

    fun buildProgress(
        id: Int, smallIcon: Int, contentTitle: CharSequence?, max: Int, progress: Int
    ): NotificationProgress? = NotificationProgress().setProgress(max, progress)
        ?.setId<NotificationBase?>(id)
        ?.setSmallIcon<NotificationBase?>(smallIcon)?.setContentTitle(contentTitle)

    fun buildProgress(id: Int, smallIcon: Int, contentTitle: CharSequence?): NotificationProgress? =
        NotificationProgress().setIndeterminate(true)?.setId<NotificationBase?>(id)
            ?.setSmallIcon<NotificationBase?>(smallIcon)?.setContentTitle(contentTitle)

    fun buildCustomView(
        id: Int, smallIcon: Int, contentTitle: CharSequence?, packageName: String?, layoutId: Int
    ): NotificationCustomView? = NotificationCustomView(packageName, layoutId)
        .setId<NotificationBase?>(id)
        ?.setSmallIcon<NotificationBase?>(smallIcon)?.setContentTitle(contentTitle)

    fun isNotifyPermissionOpen(context: Context): Boolean = when {
        Build.VERSION.SDK_INT >= Build.VERSION_CODES.O ->
            NotificationManagerCompat.from(context).importance != NotificationManager.IMPORTANCE_NONE
        else -> NotificationManagerCompat.from(context).areNotificationsEnabled()
    }

    fun openNotifyPermissionSetting(context: Context) = try {
        val intent = Intent().apply { addFlags(Intent.FLAG_ACTIVITY_NEW_TASK) }
        when {
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.O -> intent.apply {
                action = Settings.ACTION_APP_NOTIFICATION_SETTINGS
                putExtra(Settings.EXTRA_APP_PACKAGE, context.packageName)
                putExtra(Settings.EXTRA_CHANNEL_ID, context.applicationInfo.uid)
            }.let { context.startActivity(it) }
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP -> intent.apply {
                action = "android.settings.APP_NOTIFICATION_SETTINGS"
                putExtra("app_package", context.packageName)
                putExtra("app_uid", context.applicationInfo.uid)
            }.let { context.startActivity(it) }
            Build.VERSION.SDK_INT == Build.VERSION_CODES.KITKAT -> intent.apply {
                action = Settings.ACTION_APPLICATION_DETAILS_SETTINGS
                addCategory(Intent.CATEGORY_DEFAULT)
                data = Uri.parse("package:${context.packageName}")
            }.let { context.startActivity(it) }
            Build.VERSION.SDK_INT >= Build.VERSION_CODES.GINGERBREAD -> intent.apply {
                action = "android.settings.APPLICATION_DETAILS_SETTINGS"
                data = Uri.fromParts("package", context.packageName, null)
            }.let { context.startActivity(intent) }//4.4以下没有从app跳转到应用通知设置页面的Action，可考虑跳转到应用详情页面
            else -> intent.apply {
                action = Intent.ACTION_VIEW
                setClassName("com.android.settings", "com.android.setting.InstalledAppDetails")
                putExtra("com.android.settings.ApplicationPkgName", context.packageName)
            }.let { context.startActivity(it) }
        }//直接跳转到应用通知设置
    } catch (e: Exception) {
        e.printStackTrace()
    }

    private val notificationManager: NotificationManager? =
        AHelper.app.getSystemService(Activity.NOTIFICATION_SERVICE) as NotificationManager

    fun getManager(): NotificationManager? {
        if (mNotificationManager == null) mNotificationManager = notificationManager
        return mNotificationManager
    }

    fun notify(id: Int, notification: Notification?) {
        if (mNotificationManager == null) mNotificationManager = notificationManager
        mNotificationManager?.notify(id, notification)
    }

    fun cancel(id: Int) {
        if (mNotificationManager == null) mNotificationManager = notificationManager
        mNotificationManager?.cancel(id)
    }

    val cancelAll = {
        if (mNotificationManager == null) mNotificationManager = notificationManager
        mNotificationManager?.cancelAll()
    }
}