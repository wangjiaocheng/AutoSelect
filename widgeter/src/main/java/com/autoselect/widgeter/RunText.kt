package com.autoselect.widgeter

import android.content.Context
import android.util.AttributeSet
import android.view.ViewDebug

class RunText @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyle: Int = 0
) : androidx.appcompat.widget.AppCompatTextView(context, attrs, defStyle) {
    @ViewDebug.ExportedProperty(category = "focus")
    override fun isFocused(): Boolean = true//当前并无焦点，只是欺骗Android系统
}