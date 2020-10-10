package com.autoselect.helper

import android.view.View
import androidx.annotation.IntRange

object AntiShakeHelper {
    private const val DEFAULT_DURATION: Long = 200
    private const val TAG_KEY = 0x7EFFFFFF

    @JvmOverloads
    fun isValid(view: View, @IntRange(from = 0) duration: Long = DEFAULT_DURATION): Boolean =
        System.currentTimeMillis().let {
            view.getTag(TAG_KEY).let { tag ->
                when {
                    tag is Long && it - tag <= duration -> false
                    else -> true.apply { view.setTag(TAG_KEY, it) }
                }
            }
        }
}