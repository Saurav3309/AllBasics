package com.example.a03aug

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.FrameLayout
import android.widget.Toast
import android.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.constraintlayout.widget.ConstraintSet
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.coroutines.handleCoroutineException

class bottomNavigation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)
        val bottomNavigation=findViewById<BottomNavigationView>(R.id.bottomNavigation)
        val frameLayout = findViewById<FrameLayout>(R.id.frameLayout)
        val col = findViewById<ConstraintLayout>(R.id.col)
        supportFragmentManager.beginTransaction().replace(R.id.frameLayout,Homefragment()).commit()

        bottomNavigation.setOnItemSelectedListener() {
            when (it.itemId) {
                 R.id.bthome -> {
                    Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout,Homefragment()).commit()


                }

                R.id.btContact -> {
                    Toast.makeText(this, "Contact clicked", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout,Contactfragment()).commit()

                }
                R.id.btSetting -> {
                    Toast.makeText(this, "Setting clicked", Toast.LENGTH_SHORT).show()
                    supportFragmentManager.beginTransaction().replace(R.id.frameLayout,Settingfragment()).commit()
                }


            }

            true
        }

    }
}


