package com.autoselect.widgeter.notification

import android.graphics.Bitmap
import androidx.annotation.DrawableRes
import androidx.core.app.NotificationCompat
import com.autoselect.helper.ImageHelper

class NotificationBigPic : NotificationBase() {
    private var mBitmap: Bitmap? = null
    fun setBitmap(bitmap: Bitmap?): NotificationBigPic? = apply { mBitmap = bitmap }

    @DrawableRes
    private var mBigPicResId = 0
    fun setPicRes(@DrawableRes bigPicResId: Int): NotificationBigPic? =
        apply { mBigPicResId = bigPicResId }

    public override fun beforeBuild() {
        if (mBitmap?.isRecycled != false) mBitmap = ImageHelper.getBitmap(mBigPicResId)
        NotificationCompat.BigPictureStyle().bigPicture(mBitmap).setBigContentTitle(mContentTitle)
            .setSummaryText(mSummaryText).let { setStyle<NotificationBase?>(it) }
    }
}