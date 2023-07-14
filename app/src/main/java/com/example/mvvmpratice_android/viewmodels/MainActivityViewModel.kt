package com.example.mvvmpratice_android.viewmodels

import androidx.lifecycle.AndroidViewModel
import com.example.mvvmpratice_android.MainApplication
import com.example.mvvmpratice_android.repositories.RenameRepository

class MainActivityViewModel(
    private val renameRepository: RenameRepository,
    mainApplication: MainApplication
) : AndroidViewModel(mainApplication) {

        fun getString() : String{
            return renameRepository.getString()
        }
}