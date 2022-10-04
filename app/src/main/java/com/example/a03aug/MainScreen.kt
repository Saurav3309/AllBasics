package com.example.a03aug

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)
        val condition = findViewById<Button>(R.id.condition)
        val loop = findViewById<Button>(R.id.loop)
        val relative = findViewById<Button>(R.id.layout1)
        val constraint = findViewById<Button>(R.id.layout2)
        val linear = findViewById<Button>(R.id.layout3)
        val recycler = findViewById<Button>(R.id.recycler)
        val toolbar = findViewById<Button>(R.id.toolbar)
        val sideMenuu = findViewById<Button>(R.id.sideMenuu)
        val bottomMenu = findViewById<Button>(R.id.bottomMenu)
        val tabLayoutt = findViewById<Button>(R.id.tabLayout)

        condition.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        loop.setOnClickListener {
            val i = Intent(this, second::class.java)
            startActivity(i)
        }
        relative.setOnClickListener {
            val i = Intent(this, third::class.java)
            startActivity(i)
        }

        linear.setOnClickListener {
            val i = Intent(this, forth::class.java)
            startActivity(i)
        }
        constraint.setOnClickListener {
            val i = Intent(this, fifth::class.java)
            startActivity(i)
        }
        recycler.setOnClickListener {
            val i = Intent(this, seventh::class.java)
            startActivity(i)
        }
        toolbar.setOnClickListener {
            val i = Intent(this, toolbar_custom::class.java)
            startActivity(i)
        }
        sideMenuu.setOnClickListener {
            val i = Intent(this, sideMenu::class.java)
            startActivity(i)
        }
        bottomMenu.setOnClickListener {
            val i = Intent(this, bottomNavigation::class.java)
            startActivity(i)
        }
        tabLayoutt.setOnClickListener {
            val i = Intent(this, tabLayout::class.java)
            startActivity(i)
        }
    }
}