package com.kktheavi.eraworld.landing.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kktheavi.eraworld.R
import com.kktheavi.eraworld.auth.AuthenticationActivity
import com.kktheavi.eraworld.base.BaseFragment
import com.kktheavi.eraworld.landing.LandingActivity

class NewsFragment:BaseFragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_news, container, false)
        return view

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setTitle(context as LandingActivity, "NEWS")
       /* view.findViewById<View>(R.id.login_button).setOnClickListener {
            (activity as AuthenticationActivity).moveToLanding()
        }

        view.findViewById<View>(R.id.register_button).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.register_action)
        )

        view.findViewById<View>(R.id.id_forget_layout).setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.forget_action)
        )*/
    }
}