package com.example.masaakikakimoto.kotlinsample

import android.content.Context
import android.databinding.BindingAdapter
import android.support.annotation.IdRes
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.bumptech.glide.Glide

/**
 * Created by masaakikakimoto on 2017/07/22.
 */

fun <T:View> View.bindView(@IdRes id: Int): Lazy<T> = lazy {
    findViewById(id) as T
}

fun Context.toast(message: String, duration: Int = Toast.LENGTH_SHORT) {
    Toast.makeText(this, message, duration).show()
}

@BindingAdapter("bind:imageUrl")
fun ImageView.loadImage(url: String) {
    Glide.with(context).load(url).into(this)
}
