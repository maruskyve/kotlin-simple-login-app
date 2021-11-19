package com.example.simpleloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.google.android.material.button.MaterialButton

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        supportActionBar?.hide()

        val loginButton = findViewById<View>(R.id.signup) as MaterialButton
//        val forgotPasswordButton = findViewById<View>(R.id.forgot_password) as TextView

//        forgotPasswordButton.setOnClickListener {
//            startActivity(Intent(this, RegisterActivity::class.java))
//        }
        loginButton.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }
}