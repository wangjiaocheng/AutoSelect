package com.autoselect.helper

import android.Manifest.permission.VIBRATE
import android.os.Vibrator
import androidx.annotation.RequiresPermission
import com.autoselect.helper.AHelper.app

object VibrateHelper {
    private val vibrator: Vibrator = app.vibrator

    @RequiresPermission(VIBRATE)
    fun vibrateOnce(milliseconds: Int) = vibrator.vibrate(milliseconds.toLong())

    @RequiresPermission(VIBRATE)
    fun vibrateComplicated(pattern: LongArray, repeat: Int) = vibrator.vibrate(pattern, repeat)

    val vibrateStop
        @RequiresPermission(VIBRATE)
        get() = vibrator.cancel()
}//vibrateComplicated参数：等待间隔，间隔下标（剩余次数）、0一直、-1不重复