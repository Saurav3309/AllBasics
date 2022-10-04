package com.example.a03aug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.a03aug.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

val tabpositon = arrayOf(
    "Home",
    "Contact",
    "Setting"
)

class tabLayout : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tab_layout)
        supportActionBar?.hide()
        val ViewPager = findViewById<ViewPager2>(R.id.ViewPager)
        val TabLayout = findViewById<TabLayout>(R.id.TabLayout)
        val adapter = Vpadapter(supportFragmentManager, lifecycle)

        ViewPager.adapter = adapter

        TabLayoutMediator(TabLayout, ViewPager) { tab, position ->
            tab.text = tabpositon[position]
        }.attach()
    }


}


//https://medium.com/busoft/how-to-use-viewpager2-with-tablayout-in-android-eaf5b810ef7c link


