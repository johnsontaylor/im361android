package com.tjmediadesign.chopchop

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2

class MainActivity : FragmentActivity() {
    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)

        val adapter = MainActivityPAgerAdapter(this)
        viewPager.adapter = adapter

    }
    private abstract inner class MainActivityPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
        override fun getItemCount(): Int {
            return 3
        }
        override fun createFragment(position: Int): Fragment {
            return RestListFragment()
        }

    }
}

