package com.autoselect.widgeter.notification

import androidx.core.app.NotificationCompat

class NotificationBigText : NotificationBase() {
    override fun beforeBuild() {
        NotificationCompat.BigTextStyle().setBigContentTitle(mContentTitle).bigText(mContentText)
            .setSummaryText(mSummaryText).let { setStyle<NotificationBase?>(it) }
    }
}