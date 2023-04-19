package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LogeInActivity : AppCompatActivity() {

    private lateinit var btnSignOut : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loge_in)
        init()
        intent()
    }




    private fun init(){
        btnSignOut = findViewById(R.id.btnSignOut)
    }

    private fun intent(){
        btnSignOut.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}