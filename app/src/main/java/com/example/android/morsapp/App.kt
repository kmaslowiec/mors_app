package com.example.android.morsapp

import android.app.Application
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        //TODO complete adding the koin
        startKoin {  }
    }
}