package com.cuts.cleancuts.mvvm.viewmodel

import androidx.databinding.ObservableField
import com.cuts.cleancuts.mvvm.base.BaseViewModel
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
