package com.kktheavi.eraworld.di.module

import com.kktheavi.eraworld.auth.AuthenticationActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector()
    abstract fun contributeAuthActivity(): AuthenticationActivity



}