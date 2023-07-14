package com.example.mvvmpratice_android.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmpratice_android.MainApplication
import com.example.mvvmpratice_android.repositories.RenameRepository

@Suppress("UNCHECKED_CAST")
class ViewModelFactory : ViewModelProvider.Factory {

    companion object{
        private var instance : ViewModelFactory? = null
        fun getInstance() = instance ?: ViewModelFactory().also {
            instance = it
        }

    }

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(MainActivityViewModel::class.java)){
            return MainActivityViewModel(RenameRepository.getInstance(), MainApplication.instanceApplication) as T
        }

        throw IllegalArgumentException("ViewModelFactory에 할당되지 않은 ViewModel class 입니다.")
    }
}