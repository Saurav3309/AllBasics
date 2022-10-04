package com.example.a03aug

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

val NUM_TABS = 3

class Vpadapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return NUM_TABS
    }

    override fun createFragment(position: Int): Fragment {
       return when (position) {
            0 -> Homefragment()
            1 ->Contactfragment()
            2->  Settingfragment()
            else-> Fragment()
        }

    }
}