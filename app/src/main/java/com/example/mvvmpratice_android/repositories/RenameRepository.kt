package com.example.mvvmpratice_android.repositories

class RenameRepository {
    companion object {
        private var instance: RenameRepository? = null
        fun getInstance() = instance ?: RenameRepository().also {
            instance = it
        }
    }

    fun getString() : String{
        return "Temporary String"
    }
}