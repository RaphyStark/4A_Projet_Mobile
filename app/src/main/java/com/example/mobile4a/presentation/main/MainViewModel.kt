package com.example.mobile4a.presentation.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mobile4a.domain.entity.User
import com.example.mobile4a.domain.usercase.CreateUserUseCase
import kotlinx.coroutines.launch

class MainViewModel(
    private val createUserUseCase: CreateUserUseCase
    ): ViewModel() {

    val counter: MutableLiveData<Int> = MutableLiveData()

    init {
        counter.value = 0
    }

    fun onClickedIncrement(emailUser: String) {
        viewModelScope.launch {
            createUserUseCase.invoke(User(emailUser))
        }
    }
}