package com.tjmediadesign.chopchop

import android.accounts.Account
import android.graphics.PorterDuff
import android.os.Bundle
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : FragmentActivity() {
    lateinit var viewPager: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.view_pager)

        val adapter = MainActivityPagerAdapter(this)
        viewPager.adapter = adapter

        val tabLayout = findViewById<TabLayout>(R.id.tab_layout)
        val whiteAccent = ContextCompat.getColor(this, R.color.whiteAccent)

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            if (position == 0) {
                tab.text = "Food Options"

                tab.setIcon(R.drawable.resticon)
            }
            if (position == 1) {
                tab.text = "My Plate"
                tab.setIcon(R.drawable.plateicon)
            }
            if (position == 2) {
                tab.text = "Account"
                tab.setIcon(R.drawable.accicon)
            }
            tab.icon?.setColorFilter(whiteAccent, PorterDuff.Mode.SRC_ATOP)
        }.attach()
    }

    override fun onBackPressed() {
        if (viewPager.currentItem > 0) {
            viewPager.currentItem -= 1
            return
        }

        super.onBackPressed()
    }

    private inner class MainActivityPagerAdapter(activity: FragmentActivity) : FragmentStateAdapter(activity) {
        override fun getItemCount(): Int {
            return 3
        }
        override fun createFragment(position: Int): Fragment {
            if (position == 0) {
                return RestListFragment()
            }
            if (position == 1) {
                return PlateListFragment()
            }

            return AccountListFragment()

        }

    }
}

