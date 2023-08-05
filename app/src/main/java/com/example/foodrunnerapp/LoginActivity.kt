package com.example.foodrunnerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.foodrunnerapp.R

class LoginActivity : AppCompatActivity() {
    private lateinit var forgotPasswordTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        lateinit var loginButton: Button

        var registrationTextView: TextView = findViewById(R.id.registrationTextView)
        // Set onClickListener for the "Register" and "Forgot Password" texts.
        // Handle the navigation to the respective pages.
        // Set onClickListener for the "Register" text.
        registrationTextView.setOnClickListener {
            val intent = Intent(this, RegistrationActivity::class.java)
            startActivity(intent)
        }

        // Set onClickListener for the "Forgot Password" text.
        forgotPasswordTextView = findViewById(R.id.forgotPasswordTextView)
        forgotPasswordTextView.setOnClickListener {
            val intent = Intent(this, ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        // Set onClickListener for the login button (handle login logic).
        loginButton = findViewById(R.id.loginButton)
        loginButton.setOnClickListener {
            // Implement your login logic here.
            // For example, check if the user's credentials are correct and proceed to the FoodsActivity.
            val intent = Intent(this, FoodsActivity::class.java)
            startActivity(intent)
        }
    }
}
