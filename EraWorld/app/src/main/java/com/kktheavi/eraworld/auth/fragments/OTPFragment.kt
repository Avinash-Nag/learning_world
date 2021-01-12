package com.kktheavi.eraworld.auth.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kktheavi.eraworld.R
import com.kktheavi.eraworld.base.BaseFragment

class OTPFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_otp, container, false)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.submit_button).setOnClickListener (
//            Toast.makeText(
//                context,
//                "OTP verified, password sent to your registered number",
//                Toast.LENGTH_SHORT
//            ).show()
            Navigation.createNavigateOnClickListener(R.id.otp_login_action)
        )
    }
}