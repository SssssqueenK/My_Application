package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import kotlinx.android.synthetic.main.login.*

class Register : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.zhuce)
        btn_register.setOnClickListener()
        {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}
