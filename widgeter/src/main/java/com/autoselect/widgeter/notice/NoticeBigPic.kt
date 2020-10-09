package com.autoselect.widgeter.notice

import android.graphics.Bitmap
import androidx.annotation.DrawableRes
import androidx.core.app.NotificationCompat
import com.autoselect.helper.ImageHelper

class NoticeBigPic : NoticeBase() {
    private var mBitmap: Bitmap? = null
    fun setBitmap(bitmap: Bitmap?): NoticeBigPic? = apply { mBitmap = bitmap }

    @DrawableRes
    private var mBigPicResId = 0
    fun setPicRes(@DrawableRes bigPicResId: Int): NoticeBigPic? =
        apply { mBigPicResId = bigPicResId }

    public override fun beforeBuild() {
        if (mBitmap?.isRecycled != false) mBitmap = ImageHelper.getBitmap(mBigPicResId)
        NotificationCompat.BigPictureStyle().bigPicture(mBitmap).setBigContentTitle(mContentTitle)
            .setSummaryText(mSummaryText).let { setStyle<NoticeBase?>(it) }
    }
}