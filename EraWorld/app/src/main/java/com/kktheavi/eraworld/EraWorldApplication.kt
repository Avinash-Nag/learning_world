package com.kktheavi.eraworld

import android.app.Application
import com.kktheavi.eraworld.di.DaggerApplicationComponent

class EraWorldApplication : Application() {
    val appComponent = DaggerApplicationComponent.create()

}