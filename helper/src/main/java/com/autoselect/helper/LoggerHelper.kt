package com.autoselect.helper

import android.util.Log

interface LoggerHelper {
    val loggerTag: String
        get() = getTag(javaClass)
}

private fun getTag(clazz: Class<*>): String =
    clazz.simpleName.let { tag -> if (tag.length > 23) tag.substring(0, 23) else tag }

fun getLogger(tag: String): LoggerHelper = object : LoggerHelper {
    init {
        assert(tag.length <= 23) { "The maximum tag length is 23, got $tag" }
    }

    override val loggerTag = tag
}

fun getLogger(clazz: Class<*>): LoggerHelper = object : LoggerHelper {
    override val loggerTag = getTag(clazz)
}

inline fun <reified T : Any> getLogger(): LoggerHelper = getLogger(T::class.java)
private inline fun log(
    logger: LoggerHelper, message: Any?, thr: Throwable?, level: Int,
    f: (String, String) -> Unit, fThrowable: (String, String, Throwable) -> Unit
) {
    val tag = logger.loggerTag
    if (Log.isLoggable(tag, level)) thr?.let { fThrowable(tag, message?.toString() ?: "null", it) }
        ?: f(tag, message?.toString() ?: "null")
}

fun LoggerHelper.verbose(message: Any?, thr: Throwable? = null) =
    log(this, message, thr, Log.VERBOSE, { tag, msg -> Log.v(tag, msg) },
        { tag, msg, throwable -> Log.v(tag, msg, throwable) })

fun LoggerHelper.debug(message: Any?, thr: Throwable? = null) =
    log(this, message, thr, Log.DEBUG, { tag, msg -> Log.d(tag, msg) },
        { tag, msg, throwable -> Log.d(tag, msg, throwable) })

fun LoggerHelper.info(message: Any?, thr: Throwable? = null) =
    log(this, message, thr, Log.INFO, { tag, msg -> Log.i(tag, msg) },
        { tag, msg, throwable -> Log.i(tag, msg, throwable) })

fun LoggerHelper.warn(message: Any?, thr: Throwable? = null) =
    log(this, message, thr, Log.WARN, { tag, msg -> Log.w(tag, msg) },
        { tag, msg, throwable -> Log.w(tag, msg, throwable) })

fun LoggerHelper.error(message: Any?, thr: Throwable? = null) =
    log(this, message, thr, Log.ERROR, { tag, msg -> Log.e(tag, msg) },
        { tag, msg, throwable -> Log.e(tag, msg, throwable) })

fun LoggerHelper.wtf(message: Any?, thr: Throwable? = null) =
    thr?.let { Log.wtf(loggerTag, message?.toString() ?: "null", it) }
        ?: Log.wtf(loggerTag, message?.toString() ?: "null")

inline fun LoggerHelper.verbose(message: () -> Any?) {
    val tag = loggerTag
    if (Log.isLoggable(tag, Log.VERBOSE)) Log.v(tag, message()?.toString() ?: "null")
}

inline fun LoggerHelper.debug(message: () -> Any?) {
    val tag = loggerTag
    if (Log.isLoggable(tag, Log.DEBUG)) Log.d(tag, message()?.toString() ?: "null")
}

inline fun LoggerHelper.info(message: () -> Any?) {
    val tag = loggerTag
    if (Log.isLoggable(tag, Log.INFO)) Log.i(tag, message()?.toString() ?: "null")
}

inline fun LoggerHelper.warn(message: () -> Any?) {
    val tag = loggerTag
    if (Log.isLoggable(tag, Log.WARN)) Log.w(tag, message()?.toString() ?: "null")
}

inline fun LoggerHelper.error(message: () -> Any?) {
    val tag = loggerTag
    if (Log.isLoggable(tag, Log.ERROR)) Log.e(tag, message()?.toString() ?: "null")
}

inline fun Throwable.getStackTraceString(): String = Log.getStackTraceString(this)