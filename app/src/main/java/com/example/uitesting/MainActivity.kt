package com.example.uitesting

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            setListener()

        }
    private fun setListener(){
        btnSignup.setOnClickListener {
              val signUp=Intent(this,SignUpActivity::class.java)
              signUp.putExtra("Activity Name","SignUp Activity")
              startActivity(signUp)


        }
    }

}