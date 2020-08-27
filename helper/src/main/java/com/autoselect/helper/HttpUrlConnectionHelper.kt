package com.autoselect.helper

import java.io.BufferedReader
import java.io.ByteArrayOutputStream
import java.io.InputStreamReader
import java.io.PrintWriter
import java.net.HttpURLConnection
import java.net.URL

object HttpUrlConnectionHelper {
    interface CallBack {
        fun onRequestComplete(result: String?)
    }

    fun doGetAsyn(urlStr: String, callBack: CallBack?) = object : Thread() {
        override fun run() {
            try {
                callBack?.onRequestComplete(doGet(urlStr))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }.start()

    private const val TIMEOUT_IN_MILLIONS = 5000
    fun doGet(urlStr: String): String? = (URL(urlStr).openConnection() as HttpURLConnection).apply {
        connectTimeout = TIMEOUT_IN_MILLIONS
        readTimeout = TIMEOUT_IN_MILLIONS
        requestMethod = "GET"
        setRequestProperty("accept", "*/*")
        setRequestProperty("connection", "Keep-Alive")
    }.run {
        try {
            when (responseCode) {
                200 -> inputStream.use {
                    ByteArrayOutputStream().use { byteArrayOutputStream ->
                        ByteArray(128).let { bytes ->
                            while (true) {
                                if (it.read(bytes) != -1) byteArrayOutputStream.write(bytes) else break
                            }
                        }
                        byteArrayOutputStream.flush().toString()
                    }
                }
                else -> throw RuntimeException(" responseCode is not 200 ... ")
            }
        } catch (e: Exception) {
            e.printStackTrace()
            null
        } finally {
            disconnect()
        }
    }

    fun doPostAsyn(urlStr: String, params: String, callBack: CallBack?) = object : Thread() {
        override fun run() {
            try {
                callBack?.onRequestComplete(doPost(urlStr, params))
            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
    }.start()

    fun doPost(urlStr: String, param: String?): String =
        (URL(urlStr).openConnection() as HttpURLConnection).apply {
            connectTimeout = TIMEOUT_IN_MILLIONS
            readTimeout = TIMEOUT_IN_MILLIONS
            requestMethod = "POST"
            doOutput = true//POST必须
            doInput = true//POST必须，默认true
            useCaches = false
            setRequestProperty("accept", "*/*")
            setRequestProperty("connection", "Keep-Alive")
            setRequestProperty("charset", "utf-8")
            setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        }.run {
            try {
                param?.let { param ->
                    if (param.trim { it <= ' ' } != "") outputStream.use {
                        PrintWriter(it).use { printWriter ->
                            printWriter.run {
                                print(param)
                                flush()
                            }
                        }
                    }
                }
                inputStream.use {
                    InputStreamReader(it).use { inputStreamReader ->
                        BufferedReader(inputStreamReader).use { bufferedReader ->
                            var result = ""
                            while (true) {
                                bufferedReader.readLine()?.let { line -> result += line } ?: break
                            }
                            result
                        }
                    }
                }
            } catch (e: Exception) {
                e.printStackTrace()
                ""
            } finally {
                disconnect()
            }
        }
}