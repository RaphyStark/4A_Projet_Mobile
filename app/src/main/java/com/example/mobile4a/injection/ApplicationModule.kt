package com.example.mobile4a.injection

import com.example.mobile4a.data.repository.UserRepository
import com.example.mobile4a.domain.usercase.CreateUserUseCase
import com.example.mobile4a.presentation.main.MainViewModel
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel(get()) }
}

val domainModule = module {
    factory { CreateUserUseCase(get()) }
}

val dataModule = module {
    single {UserRepository()}
}