package com.example.livedatapractice

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class Counter(lastValue:Int): ViewModel() {
    val counter = MutableLiveData<Int>(lastValue)

    fun addOne() {
        val cnt = counter.value ?: 0
        counter.value = cnt + 1
    }
    fun reset() {
        counter.value = 0
    }
}