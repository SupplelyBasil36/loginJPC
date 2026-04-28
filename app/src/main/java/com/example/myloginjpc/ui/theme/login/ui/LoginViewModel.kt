package com.example.myloginjpc.ui.theme.login.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LoginViewModel : ViewModel() {

    //creacion de LIVEDATA
    private val _email = MutableLiveData<String>()
    val email: LiveData<String> = _email

    fun onLoginChanged(email: String) {

    }
}