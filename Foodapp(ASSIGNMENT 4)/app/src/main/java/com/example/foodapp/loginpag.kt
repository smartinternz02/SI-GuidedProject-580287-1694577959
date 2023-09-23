package com.example.foodapp


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Loginpag : AppCompatActivity() {
    private lateinit var tv1: TextView
    private lateinit var tv2: TextView
    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var b1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginpage);
        tv1 = findViewById(R.id.textView2);

        et1 = findViewById(R.id.editTextTextEmailAddress);
        et2 = findViewById(R.id.editTextTextPassword2)
        b1 = findViewById(R.id.button1)


        b1.setOnClickListener {

            val intent = Intent(this@Loginpag,MainActivity::class.java);
            startActivity(intent)

        }


    }
}
