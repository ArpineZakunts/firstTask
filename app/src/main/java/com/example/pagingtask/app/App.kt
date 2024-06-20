package com.example.pagingtask.app

import android.app.Application
import com.example.pagingtask.di.apiModule
import com.example.pagingtask.di.dataModule.dataMapperModule
import com.example.pagingtask.di.dataModule.dataRepoModule
import com.example.pagingtask.di.domainModule
import com.example.pagingtask.di.networkModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        initKoin()
        super.onCreate()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@App)
            modules(dataMapperModule + dataRepoModule + apiModule + domainModule + networkModule)
        }
    }
}