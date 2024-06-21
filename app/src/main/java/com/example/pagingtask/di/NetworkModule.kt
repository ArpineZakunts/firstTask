package com.example.pagingtask.di

import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import com.example.pagingtask.di.provider.RetrofitProvider.provideRetrofit
import com.example.pagingtask.di.provider.RetrofitProvider.provideApi

val networkModule = module {
    singleOf(::provideRetrofit)
    singleOf(::provideApi)
}