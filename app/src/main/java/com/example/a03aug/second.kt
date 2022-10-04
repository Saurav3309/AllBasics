package com.example.a03aug

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class second : AppCompatActivity() {
    val arr = intArrayOf(8, 3, 5, 6)
    val b = arrayOf("RED", "YELLOW", "BROWN", "BLACK", "ORANGE")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val button = findViewById<Button>(R.id.button)
        val t1 = findViewById<TextView>(R.id.t1)
        val t = findViewById<TextView>(R.id.t)
        val button2 = findViewById<Button>(R.id.button2)
        val thirdPage = findViewById<Button>(R.id.thirdPage)
        button2.setOnClickListener(View.OnClickListener {
//            for (x in arr.indices){
//                t.append(arr[x].toString()+"\n")
            var s = ""              //second method
            for (i in arr.indices) {

                s = s + "\n" + arr[i]
                t.setText(s)
//                t.setText("\n")
            }


        })
        button.setOnClickListener(View.OnClickListener {

            for (x in b.indices) {
                println(b[x])

                t1.append(b[x])
                t1.append("\n")

            }


//            for(number in 0 until 50 step 5){
//                println(number)
//            }
//            for(numbers in 50 downTo 0 step 5 ){
//                t1.append(numbers.toString()+"\n")
//            }


        })
        thirdPage.setOnClickListener(View.OnClickListener {
            val i = Intent(this, third::class.java)
            startActivity(i)
            main()
//            add()

        })


    }

    fun add() {
        var i = 10
        var j = 20
        var k = i + j
        println(k)


    }

    class student {
        var name: String?=null
        var rollNo: Int = 0

        fun data(n: String, r: Int) {
            name = n
            rollNo = r
            println("Name :$name ")
            println("Roll No: $rollNo ")

        }

        companion object {
            var age: Int = 10
            fun fees() {
                println("fees is very high")
            }
        }


    }

    data class Profile(
        val fname: String,
        val qualification: String
    )

    fun arraylist(){
        val list= ArrayList<String>()
        list.add("samsung")
        list.add("iphone")
        list.add("oppo")
        list.add("vivo")
        list.add("redmi")
        list.add("realme")
        println("1st phone :${list.get(0)}")
    }

    fun main() {
        var obj = student()
        var obj1 = student()
        obj.data("saran", 1929395)
        obj1.data("rahul", 9999)

        println("companion object")
        student.fees()
        println("age:${student.age}")

        println("data class")
        val profile1 = Profile("manish", "graduate")
        val profile2 = Profile("manish", "graduate")
        println(profile1)
        println(profile2)
        println("${profile1.equals(profile2)}")
        println(profile1.component1())
        println(profile1.component2())

        println("Immutable List")
        val alphabet= listOf<String>("a","b","c")
        println(alphabet[0])
        for(x in alphabet){
            println(x)
        }

        println("mutable List")
        val count= mutableListOf<Int>(1)
        count.add(2)
        count.add(3)
        println(count[2])
        for(a in count){
            println(a)
        }
    }


}



