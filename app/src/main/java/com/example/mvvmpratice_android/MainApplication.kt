package com.example.mvvmpratice_android

import android.app.Application

class MainApplication : Application() {

    companion object{
        @get: Synchronized
        lateinit var instanceApplication : MainApplication
        private set
    }

    override fun onCreate() {
        super.onCreate()

        instanceApplication = this
    }
}