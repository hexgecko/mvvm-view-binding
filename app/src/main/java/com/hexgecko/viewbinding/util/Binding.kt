package com.hexgecko.viewbinding.util

import android.view.View
import android.widget.TextView
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer

fun View.bindOnClick(callback: () -> Unit) = this.setOnClickListener { callback() }

fun TextView.bindText(owner: LifecycleOwner, text: LiveData<String>) {
    text.observe(owner, Observer { this.text = it })
}