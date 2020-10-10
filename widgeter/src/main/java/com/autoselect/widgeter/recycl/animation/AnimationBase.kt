package com.autoselect.widgeter.recycl.animation

import android.animation.Animator
import android.view.View

interface AnimationBase {
    fun animators(view: View): Array<Animator>
}