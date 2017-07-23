package com.example.masaakikakimoto.kotlinsample

import android.support.annotation.IdRes
import android.view.View

/**
 * Created by masaakikakimoto on 2017/07/22.
 */

fun <T:View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById(id) as T
}
