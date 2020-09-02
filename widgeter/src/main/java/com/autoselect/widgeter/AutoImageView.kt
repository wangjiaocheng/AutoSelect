package com.autoselect.widgeter

import android.content.Context
import android.content.res.TypedArray
import android.os.Handler
import android.os.Looper
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.animation.AnimationUtils
import android.widget.FrameLayout
import android.widget.ImageView

class AutoImageView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0, defStyleRes: Int = 0
) : FrameLayout(context, attrs, defStyleAttr, defStyleRes) {
    var imageView: ImageView? = null

    init {
        LayoutInflater.from(context).inflate(R.layout.layout_auto_imageview, this)
        imageView = findViewById(R.id.img_backgroud)
        imageView?.apply {
            val typedArray: TypedArray =
                getContext().obtainStyledAttributes(attrs, R.styleable.AutoImageView)
            try {
                typedArray.getResourceId(R.styleable.AutoImageView_ImageSrc, 0)
            } finally {
                typedArray.recycle()
            }.let { if (it != 0) setImageResource(it) }
        }.run {
            Handler(Looper.getMainLooper()).postDelayed({
                startAnimation(AnimationUtils.loadAnimation(context, R.anim.anim_translate))
            }, 200)
        }
    }
}