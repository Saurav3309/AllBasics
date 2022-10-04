package com.example.a03aug

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class forth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forth)
        val nextPage=findViewById<Button>(R.id.nextPage)
        nextPage.setOnClickListener(View.OnClickListener {
            val i = Intent(this, fifth::class.java)
            startActivity(i)
        })
    }
}