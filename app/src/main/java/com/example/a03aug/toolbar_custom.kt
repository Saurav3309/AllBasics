package com.example.a03aug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar

class toolbar_custom : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_toolbar_custom)
        val customToolbar = findViewById<Toolbar>(R.id.customToolbar)
        setSupportActionBar(customToolbar)
        customToolbar.setNavigationOnClickListener(View.OnClickListener {
            Toast.makeText(this, "back", Toast.LENGTH_SHORT).show()
            onBackPressed()
        })
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> Toast.makeText(this, "Home clicked", Toast.LENGTH_SHORT).show()
            R.id.contact -> Toast.makeText(this, "Contact clicked", Toast.LENGTH_SHORT).show()
            R.id.setting -> Toast.makeText(this, "Setting clicked", Toast.LENGTH_SHORT).show()
        }
        return super.onOptionsItemSelected(item)
    }
}