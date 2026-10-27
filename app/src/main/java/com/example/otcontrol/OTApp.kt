package com.example.otcontrol

import android.app.Application

class OTApp : Application() {
    override fun onCreate() {
        super.onCreate()
        AuthManager.init(this)
    }
}
