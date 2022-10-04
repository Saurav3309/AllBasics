package com.example.a03aug

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val e1 = findViewById<EditText>(R.id.e1)
        val e2 = findViewById<EditText>(R.id.e2)
        val input1 = findViewById<TextView>(R.id.input1)
        val input2 = findViewById<TextView>(R.id.input2)
        val btn = findViewById<Button>(R.id.btn)
        val btn1 = findViewById<Button>(R.id.btn1)
        val NxtBtn = findViewById<Button>(R.id.NxtBtn)
        NxtBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, second::class.java)
            startActivity(intent)
        })

        btn.setOnClickListener(View.OnClickListener {
            val c = e1.text.toString()
            val d = e2.text.toString()
            if (c.equals("")) {
                e1.setError("Please enter first Number")
            } else if (d.equals("")) {
                e2.setError("Please enter second Number")
            } else {
                val a = e1.text.toString().toInt()
                val b = e2.text.toString().toInt()

                if (a > b) {
                    input1.setText("$a is greater ")
                } else if (a < b) {
                    input1.setText("$b is greater ")
                } else {
                    input1.setText("Same Number")
                }
            }
        })
        btn1.setOnClickListener(View.OnClickListener {
            val a = e1.text.toString().toInt()
            val b = e2.text.toString().toInt()
            when {
                a > b -> {
                    input2.setText("First No. is Greater ")
                }
                a < b -> {

                    input2.setText("Second No. is Greater")
                }
                else -> {
                    input2.setText("Same Number")
                }

            }

        })


    }

}
