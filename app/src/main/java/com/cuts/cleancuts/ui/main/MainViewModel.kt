package com.cuts.cleancuts.ui.main

import androidx.databinding.ObservableField
import base.BaseViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainViewModel : BaseViewModel() {
    val helloBinding: ObservableField<String> = ObservableField("hello All")

    fun startCount() {
        //JustTestCode
        uiScope.launch {
            for (x: Int in 1..100) {
                helloBinding.set(x.toString())
                delay(100)
            }
        }
    }
}
