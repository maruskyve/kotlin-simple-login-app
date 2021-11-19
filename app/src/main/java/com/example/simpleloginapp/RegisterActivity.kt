package com.example.simpleloginapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.google.android.material.button.MaterialButton

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        supportActionBar?.hide()

        val gotoLoginButton = findViewById<View>(R.id.goto_login) as MaterialButton

        gotoLoginButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}