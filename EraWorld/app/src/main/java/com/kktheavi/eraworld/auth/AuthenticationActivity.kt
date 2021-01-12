package com.kktheavi.eraworld.auth

import android.content.Intent
import android.os.Bundle
import com.kktheavi.eraworld.EraWorldApplication
import com.kktheavi.eraworld.R
import com.kktheavi.eraworld.base.BaseActivity
import com.kktheavi.eraworld.landing.LandingActivity
import dagger.android.AndroidInjection

class AuthenticationActivity : BaseActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)
//        AndroidInjection.inject(this)
    }

    fun moveToLanding() {
        startActivity(Intent(this, LandingActivity::class.java))
    }


}