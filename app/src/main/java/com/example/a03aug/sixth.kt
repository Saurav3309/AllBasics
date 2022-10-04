package com.example.a03aug

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class sixth : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)
        val getName1 = findViewById<TextView>(R.id.getName1)
        val getEmail = findViewById<TextView>(R.id.getEmail)
        val getAddress = findViewById<TextView>(R.id.getAddress)
//        val getCountry = findViewById<TextView>(R.id.getCountry)
        val getMobile = findViewById<TextView>(R.id.getMobile)
        val sevenPage = findViewById<Button>(R.id.sevenPage)

        val intent = getIntent()
        val gname = intent.getStringExtra("fName")
        val lname = intent.getStringExtra("lName")
        val email = intent.getStringExtra("gMail")
        val address = intent.getStringExtra("gAddress")
        val code = intent.getStringExtra("gCode")
        val mobile = intent.getStringExtra("gMobile")
        getName1.setText("Name: ${gname.plus(" " + lname)}")
        getEmail.setText("Email: $email")
        getAddress.setText("Address: $address")
        getMobile.setText("Mobile: ${code.plus(" " + mobile)}")

        sevenPage.setOnClickListener(View.OnClickListener {
            val i = Intent(this, seventh::class.java)
            startActivity(i)
        })

    }
}



