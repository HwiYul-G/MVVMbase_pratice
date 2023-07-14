package com.example.mvvmpratice_android.views.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmpratice_android.R
import com.example.mvvmpratice_android.viewmodels.MainActivityViewModel
import com.example.mvvmpratice_android.viewmodels.ViewModelFactory

class MainActivity : AppCompatActivity() {

    lateinit var mainActivityViewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainActivityViewModel = ViewModelProvider(
            this,
            ViewModelFactory.getInstance()
        ).get(MainActivityViewModel::class.java)

    }
}