package com.example.movieapp

import android.app.Application
import com.example.movieapp.di.appModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MovieApp : Application() {
    override fun onCreate() {
        super.onCreate()
        // ✅ Start Koin for Dependency Injection
        startKoin {
            androidContext(this@MovieApp)
            modules(appModule)  // ✅ Load the DI module
        }
    }
}
