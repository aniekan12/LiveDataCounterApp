package com.example.livedatacounterapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.livedatacounterapp.databinding.ActivityMainBinding
import com.example.livedatacounterapp.view_models.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    lateinit var  binding: ActivityMainBinding
    lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        viewModel = ViewModelProvider(this)[MainActivityViewModel::class.java]

        binding.lifecycleOwner = this
        binding.viewModel = viewModel
    }
}