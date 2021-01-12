package com.kktheavi.eraworld.di.module

import com.kktheavi.eraworld.networking.ApiInterface
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module
class NetworkModule {


    @Provides
    @Singleton
    fun provideApiInterface(
        retrofit: Retrofit
    ): ApiInterface = retrofit.create(ApiInterface::class.java)

}