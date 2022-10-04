package com.example.a03aug

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.core.util.PatternsCompat.EMAIL_ADDRESS
import androidx.core.view.get
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.util.regex.Pattern

class fifth : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        val fName = findViewById<TextInputEditText>(R.id.fName)
        val lName = findViewById<TextInputEditText>(R.id.lName)
        val editEmail = findViewById<TextInputEditText>(R.id.editEmail)
        val editAddress = findViewById<TextInputEditText>(R.id.editAddress)
        val editCountrycode = findViewById<TextInputEditText>(R.id.editCountrycode)
        val editMobile = findViewById<TextInputEditText>(R.id.editMobile)
        val editPass = findViewById<TextInputEditText>(R.id.editPass)
        val editConPass = findViewById<TextInputEditText>(R.id.editConPass)
        val nextPage = findViewById<Button>(R.id.nextPage)

        nextPage.setOnClickListener(View.OnClickListener {


            val i = Intent(this, sixth::class.java)
            val fname = fName.text.toString()
            val lname = lName.text.toString()
            val mail = editEmail.text.toString()
            val address = editAddress.text.toString()
            val code = editCountrycode.text.toString()
            val mobile = editMobile.text.toString()
            val pass = editPass.text.toString()
            val conPass = editConPass.text.toString()
            var right = true

            if (fname.isNullOrEmpty()) {
                fName.setError("first name is empty")
                right = false
            }

            if (lname.isNullOrEmpty()) {
                lName.setError("last name is empty")
                right = false
            }
            if (mail.isNullOrEmpty()) {
                editEmail.setError("Email is required")
                right = false
            } else if (!Patterns.EMAIL_ADDRESS.matcher(mail).matches()) {
                editEmail.setError("Invalid Email Format")
                right = false
            }
            if (address.isNullOrEmpty()) {
                editAddress.setError("Address is required")
                right = false
            }
            if (code.isNullOrEmpty()) {
                editCountrycode.setError("Country code is required")
                right = false
            } else if (code.length < 3) {
                editCountrycode.setError("minimum digit should be 3")
                right = false

            }
            if (mobile.isNullOrEmpty()) {
                editMobile.setError("Mobile Number is required")
                right = false
            } else if (mobile.length < 10) {
                editMobile.setError("Mobile Number should be 10 digit")
                right = false
            }
            if (pass.isNullOrEmpty()) {
                editPass.setError("Password is empty")
                right = false
            }
            if (conPass.isNullOrEmpty()) {
                editConPass.setError("Password is empty")
                right = false
            } else if (!conPass.equals(pass)) {
                editConPass.setError("Password is Mismatched")
                right = false
            }

            if (right) {

                i.putExtra("fName", fname)
                i.putExtra("lName", lname)
                i.putExtra("gMail", mail)
                i.putExtra("gAddress", address)
                i.putExtra("gCode", code)
                i.putExtra("gMobile", mobile)
                startActivity(i)
            }


        })
    }
}
