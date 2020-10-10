package com.autoselect.helper

import android.Manifest
import android.content.Intent
import androidx.annotation.RequiresPermission
import com.autoselect.helper.AHelper.app
import com.autoselect.helper.ShellHelper.execCmd

object RebootHelper {
    @RequiresPermission(Manifest.permission.REBOOT)
    fun reboot(reason: String) = app.powerManager.reboot(reason)
    val reboot
        get() = run {
            execCmd("reboot", true)
            app.sendBroadcast(Intent().apply {
                action = Intent.ACTION_REBOOT
                putExtra("nowait", 1)
                putExtra("interval", 1)
                putExtra("window", 0)
            })
        }
    val reboot2Recovery: ShellHelper.CommandResult
        get() = execCmd("reboot recovery", true)
    val reboot2Bootloader: ShellHelper.CommandResult
        get() = execCmd("reboot bootloader", true)
    val shutdown
        get() = run {
            execCmd("reboot -p", true)
            app.startActivity(Intent().apply {
                action = "android.intent.action.ACTION_REQUEST_SHUTDOWN"
                flags = Intent.FLAG_ACTIVITY_NEW_TASK
                putExtra("android.intent.extra.KEY_CONFIRM", false)
            })
        }
}