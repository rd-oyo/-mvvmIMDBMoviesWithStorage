package com.example.likecountmvvmimdbmovies

import android.app.Application
import com.example.likecountmvvmimdbmovies.di.Injection

class MovieApplication:Application() {

    override fun onCreate() {
        super.onCreate()
        Injection.setup(this)
    }
}