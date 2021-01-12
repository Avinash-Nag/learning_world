package com.kktheavi.eraworld.landing.fragments

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kktheavi.eraworld.R
import com.kktheavi.eraworld.base.BaseFragment
import com.kktheavi.eraworld.landing.LandingActivity
import com.kktheavi.eraworld.landing.adapters.FeedAdapter
import com.kktheavi.eraworld.utils.click
import com.mds.wcea.utils.Utils
import kotlinx.android.synthetic.main.fragment_feeds.*


class FeedsFragment : BaseFragment() {

    lateinit var adapter: FeedAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_feeds, container, false)
        return view

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTitle(context as LandingActivity, "Feed")
        adapter = FeedAdapter(ArrayList())
        id_recycler_view.layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
        id_recycler_view.adapter = adapter
        id_banner_one.click {
        Utils.openUrlOnBrowser(context as LandingActivity,"http://eraworld.in/")

        }
        id_banner_second.click {
            Utils.openUrlOnBrowser(context as LandingActivity,"http://eraworld.in/")
        }


        /*view.findViewById<View>(R.id.login_button).setOnClickListener {
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