package com.autoselect.helper

import com.autoselect.helper.PathHelper.getPathInternalAppDb
import com.autoselect.helper.PathHelper.pathExternal
import org.jetbrains.anko.AnkoLogger
import org.jetbrains.anko.error
import org.jetbrains.anko.info
import java.io.FileInputStream
import java.io.FileOutputStream
import java.io.IOException

object DbHelper : AnkoLogger {
    @JvmOverloads
    fun exportDb2SdCard(
        realDbName: String, exportDbName: String = "backup$realDbName", path: String = pathExternal
    ) = try {
        FileInputStream(getPathInternalAppDb(realDbName)).use { fileInputStream ->
            FileOutputStream("$path$exportDbName").use { fileOutputStream ->
                ByteArray(1024).let { bytes ->
                    while (true) {
                        if (fileInputStream.read(bytes) != -1) fileOutputStream.write(bytes) else break
                    }
                    fileOutputStream.flush()
                    info("$loggerTag->导出成功！")
                }
            }
        }
    } catch (e: IOException) {
        e.printStackTrace()
        error("$loggerTag->导出失败！")
    }
}