package com.example.mainproject

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class WelcomeActiviy: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.welcome_screen)
    }

    fun registration(view: View){
        val registrationIntent = Intent(this, RegistrationActivity::class.java)
        startActivity(registrationIntent)
    }

    fun login(view: View){
        val loginIntent= Intent(this, LoginActivity::class.java)
        startActivity(loginIntent)
    }
}