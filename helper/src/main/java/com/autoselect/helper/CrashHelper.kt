package com.autoselect.helper

import android.Manifest.permission.WRITE_EXTERNAL_STORAGE
import android.os.Build
import android.os.Looper
import android.os.Process
import androidx.annotation.RequiresPermission
import com.autoselect.helper.AHelper.app
import com.autoselect.helper.ActivityHelper.finishAllActivities
import com.autoselect.helper.ApplicationHelper.appVersionCode
import com.autoselect.helper.ApplicationHelper.appVersionName
import com.autoselect.helper.DateHelper.sdfDateByFullFileName
import com.autoselect.helper.FileHelper.createFileNone
import com.autoselect.helper.FileHelper.pathAppCache
import com.autoselect.helper.FileHelper.pathRootData
import com.autoselect.helper.FileIoHelper.writeFileFromString
import com.autoselect.helper.StringHelper.isSpace
import com.autoselect.helper.ThreadHelper.poolSingle
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.debug
import org.jetbrains.anko.error
import org.jetbrains.anko.toast
import java.io.File
import java.io.PrintWriter
import java.io.StringWriter
import java.util.*
import kotlin.system.exitProcess

object CrashHelper : AnkoLogger {
    @RequiresPermission(WRITE_EXTERNAL_STORAGE)
    @JvmOverloads
    fun init(crashDir: File, onCrashListener: OnCrashListener? = null) =
        init(crashDir.absolutePath, onCrashListener)

    private var customDir: String? = null
    private var defaultDir: String? = null

    interface OnCrashListener {
        fun onCrash(crashInfo: String, throwable: Throwable?)
    }

    private var crashListener: OnCrashListener? = null
    private val uncaughtHandler: Thread.UncaughtExceptionHandler =
        Thread.UncaughtExceptionHandler { thread, throwable ->
            handleException(throwable)
            Thread.getDefaultUncaughtExceptionHandler()?.uncaughtException(thread, throwable)
                ?: run {
                    try {
                        Thread.sleep(3000)
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                        error("$loggerTag->$e")
                    }
                    finishAllActivities()
                    Process.killProcess(Process.myPid())
                    exitProcess(1)
                }
        }
    var crashTip = "很抱歉，程序出现异常，即将退出！"
    private fun handleException(throwable: Throwable?): Boolean = throwable?.let {
        object : Thread() {
            override fun run() {
                Looper.prepare()
                it.printStackTrace()
                app.toast(crashTip)
                Looper.loop()
            }
        }.start()
        collectDeviceInfo()
        saveCrashInfo2File(it)
        true
    } ?: false

    private val infoMap: MutableMap<String, String> = mutableMapOf()
    private fun collectDeviceInfo() {
        infoMap["versionName"] = appVersionName
        infoMap["versionCode"] = "$appVersionCode"
        for (field in Build::class.java.declaredFields) {
            try {
                field.apply { isAccessible = true }.run {
                    infoMap[name] = get(null)?.toString() ?: "null"
                    debug("$loggerTag->$name : ${get(null)}")
                }
            } catch (e: Exception) {
                error("$loggerTag->an error occured when collect crash info")
            }
        }
    }

    private fun saveCrashInfo2File(throwable: Throwable): String? = StringBuffer().apply {
        for ((key, value) in infoMap) {
            append("$key=$value\r\n")
        }
        StringWriter().use { stringWriter ->
            PrintWriter(stringWriter).use { printWriter ->
                throwable.printStackTrace(printWriter)
                var cause: Throwable? = throwable.cause
                while (cause != null) {
                    cause.printStackTrace(printWriter)
                    cause = cause.cause
                }
                printWriter.flush()
            }
            append(stringWriter.toString())
        }
    }.toString().let { crashInfo ->
        crashListener?.onCrash(crashInfo, throwable)
        try {
            "${customDir ?: defaultDir}${sdfDateByFullFileName.format(Date())}.txt".apply {
                debug("path=$this")
                when {
                    createFileNone(this) ->
                        poolSingle?.execute { writeFileFromString(this, crashInfo) }
                    else -> error("$loggerTag->create $this failed!")
                }
            }
        } catch (e: Exception) {
            error("$loggerTag->an error occured while writing file...")
            null
        }
    }

    @RequiresPermission(WRITE_EXTERNAL_STORAGE)
    @JvmOverloads
    fun init(crashDirPath: String = "", onCrashListener: OnCrashListener? = null) {
        customDir = when {
            isSpace(crashDirPath) -> null
            else -> if (crashDirPath.endsWith(File.separator)) crashDirPath else "$crashDirPath${File.separator}"
        }
        defaultDir = app.run {
            "crash${File.separator}".let { crash ->
                try {
                    "${pathRootData}${resources.getString(
                        packageManager.getPackageInfo(packageName, 0).applicationInfo.labelRes
                    )}${File.separator}$crash"
                } catch (e: Exception) {
                    "$pathAppCache$crash"
                }
            }
        }
        crashListener = onCrashListener
        Thread.setDefaultUncaughtExceptionHandler(uncaughtHandler)
    }
}