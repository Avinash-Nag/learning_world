package com.kktheavi.eraworld.di

import com.kktheavi.eraworld.auth.AuthenticationActivity
import com.kktheavi.eraworld.di.module.ActivityModule
import com.kktheavi.eraworld.di.module.NetworkModule
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AndroidInjectionModule::class, NetworkModule::class, ActivityModule::class])
interface ApplicationComponent {
    fun inject(activity: AuthenticationActivity)
}