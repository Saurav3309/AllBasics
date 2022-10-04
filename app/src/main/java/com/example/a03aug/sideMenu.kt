package com.example.a03aug

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView

class sideMenu : AppCompatActivity() {
    lateinit var toggle: ActionBarDrawerToggle
    lateinit var drawerLayout: DrawerLayout

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_side_menu)
        drawerLayout = findViewById(R.id.drawerLayout)
        val navView = findViewById<NavigationView>(R.id.navView)
        val headerView = navView.getHeaderView(0)
        val getName = headerView.findViewById<TextView>(R.id.getName)
        val getEmailAddress = headerView.findViewById<TextView>(R.id.getEmailAddress)
        val toolbar = findViewById<Toolbar>(R.id.customToolbar)

        toolbar.setTitle("Side Menu")
        setSupportActionBar(toolbar)
        toggle = ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)

        toggle.syncState()
        getName.setText("Saurav")
        getEmailAddress.setText("saurav@gmail.com")

        navView.setNavigationItemSelectedListener {
            drawerLayout.closeDrawer(GravityCompat.START)
            when (it.itemId) {
                R.id.home1 -> Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show()
                R.id.profile -> Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
                R.id.message -> Toast.makeText(this, "Message clicked", Toast.LENGTH_SHORT).show()
                R.id.sync -> Toast.makeText(this, "Sync clicked", Toast.LENGTH_SHORT).show()
                R.id.login -> Toast.makeText(this, "Login clicked", Toast.LENGTH_SHORT).show()
            }
            return@setNavigationItemSelectedListener true

        }
        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)
    }

    override fun onBackPressed() {
        if (drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}


