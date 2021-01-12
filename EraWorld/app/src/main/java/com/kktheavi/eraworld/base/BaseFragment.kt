package com.kktheavi.eraworld.base

import android.app.Activity
import androidx.fragment.app.Fragment
import com.kktheavi.eraworld.landing.LandingActivity

open class BaseFragment : Fragment() {

    fun setTitle(activity: BaseActivity, title: String) {
        activity.getSupportActionBar().let {
            it!!.setTitle(title);
        }
    }
}