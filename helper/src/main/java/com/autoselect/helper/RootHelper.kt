package com.autoselect.helper

import com.autoselect.helper.AHelper.app
import com.autoselect.helper.FileHelper.isExistsFile
import com.autoselect.helper.ShellHelper.execCmd
import java.io.DataOutputStream

object RootHelper {
    val isRoot: Boolean
        get() = execCmd("echo root", true, false).result == 0
    val isRooted: Boolean
        get() {
            for (location in arrayOf(
                "/sbin/", "/usr/bin/", "/vendor/bin/",
                "/system/bin/", "/system/bin/failsafe/",
                "/system/sbin/", "/system/xbin/", "/system/sd/xbin/",
                "/data/local/", "/data/local/bin/", "/data/local/xbin/"
            )) {
                if (isExistsFile("${location}su")) return true
            }
            return false
        }
    val rootPermission: Boolean
        get() = Runtime.getRuntime().exec("su").run {
            try {
                outputStream.use {
                    DataOutputStream(it).use { dataOutputStream ->
                        dataOutputStream.run {
                            writeBytes("chmod 777 ${app.packageCodePath}\n")
                            writeBytes("exit\n")
                            flush()
                        }
                    }
                }
                waitFor()
                true
            } catch (e: Exception) {
                false
            } finally {
                destroy()
            }
        }
}