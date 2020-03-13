package com.hexgecko.viewbinding.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel

class MainActivityModel: ViewModel() {

    private val mCounter = MutableLiveData<Int>().apply { value = 0 }

    val numberOfClickText = Transformations.map(mCounter) { "Clicked: ${it}" }

    fun onIncreaseCounter() {
        mCounter.value = mCounter.value?.plus(1)
    }
}
