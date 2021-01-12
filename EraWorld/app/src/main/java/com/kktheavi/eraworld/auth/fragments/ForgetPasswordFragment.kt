package com.kktheavi.eraworld.auth.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.kktheavi.eraworld.R
import com.kktheavi.eraworld.base.BaseFragment

class ForgetPasswordFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_forget, container, false)
        return view
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.forget_button).setOnClickListener (
            Navigation.createNavigateOnClickListener(R.id.otp_action)
//            Toast.makeText(context, "OTP sent to your number", Toast.LENGTH_SHORT).show()
        )

    }
}