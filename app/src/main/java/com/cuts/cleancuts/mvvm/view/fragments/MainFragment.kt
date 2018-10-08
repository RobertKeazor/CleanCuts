package com.cuts.cleancuts.mvvm.view.fragments

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import com.cuts.cleancuts.databinding.MainFragmentBinding
import com.cuts.cleancuts.mvvm.viewmodel.MainViewModel

class MainFragment : Fragment() {
    lateinit var binding: MainFragmentBinding

    companion object { fun newInstance() = MainFragment() }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?) =
        MainFragmentBinding.inflate(inflater, container, false)
                .also { binding = it }.root

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.setLifecycleOwner(this@MainFragment)
        binding.viewModel = viewModel
    }
}
