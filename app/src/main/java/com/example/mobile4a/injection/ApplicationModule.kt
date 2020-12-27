package com.example.mobile4a.injection

import com.example.mobile4a.MainViewModel
import org.koin.dsl.module

val presentationModule = module {
    factory { MainViewModel() }
}