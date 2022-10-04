package com.example.a03aug

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class third : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        val nextPage=findViewById<Button>(R.id.nextPage)
//        val t11=findViewById<TextView>(R.id.t11)
        nextPage.setOnClickListener(View.OnClickListener {
            val i=Intent(this,forth::class.java)
            startActivity(i)
            var str:String="Saurav"
            var str1:String="Rahul"
//        t11.setText("hello ${str.length}")
            println("String Function ")
            println(str.length)
            println(str.get(3))
            println(str.uppercase())
            println(str.lowercase())
            println(str[1])
            println(str.indexOf("u"))
            println(str.startsWith("S"))
            println(str.endsWith("a"))
            println(str.subSequence(2,5))
            println(str.plus(str1))
            println(str.equals(str1))
            println(str.split("a"))
            println(str.replace("a","o"))
            println(str.compareTo(str1))

        })





    }
}