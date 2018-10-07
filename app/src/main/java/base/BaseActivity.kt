package base

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders

abstract class BaseActivity<T :  BaseViewModel>: AppCompatActivity() {
    protected abstract val viewModelClass: Class<T>
    protected abstract val layoutResId: Int
    protected lateinit var viewBinding: ViewDataBinding
    protected abstract val bindingMap: Map<Int,  Any>
    lateinit var viewModel: T

    abstract fun provideViewModelFactor(): ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProviders.of(this, provideViewModelFactor()).get(viewModelClass)
        viewBinding = DataBindingUtil.setContentView(this, layoutResId)
        bindingMap.forEach{ viewBinding.setVariable(it.key, it.value) }
    }
}
