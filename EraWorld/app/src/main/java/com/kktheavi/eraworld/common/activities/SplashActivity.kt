package com.kktheavi.eraworld.common.activities

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.kktheavi.eraworld.R
import com.kktheavi.eraworld.auth.AuthenticationActivity
import com.kktheavi.eraworld.base.BaseActivity
import com.kktheavi.eraworld.landing.LandingActivity

class SplashActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler(mainLooper).postDelayed(Runnable {
            startActivity(Intent(this, AuthenticationActivity::class.java))
            finish()
        }, 5000)
    }
}