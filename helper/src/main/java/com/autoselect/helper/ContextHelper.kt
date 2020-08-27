package com.autoselect.helper

import android.content.Context

object ContextHelper {
    var applicationContext: Context? = null
        get() = field ?: throw NullPointerException("u should initApplication first")
        set(context) {
            field = context?.applicationContext
        }
}