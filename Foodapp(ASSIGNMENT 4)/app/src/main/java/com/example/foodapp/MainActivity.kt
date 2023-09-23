package com.example.foodapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    private lateinit var kfc: CardView
    private lateinit var rb:  CardView
    private lateinit var ice: CardView
    private lateinit var ap: CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kfc=findViewById(R.id.cardview1);
        rb=findViewById(R.id.cardview2);
        ice=findViewById(R.id.cardview3);
        ap=findViewById(R.id.cardview4);

        kfc.setOnClickListener {

            val intent = Intent(this@MainActivity,h1::class.java);
            startActivity(intent)

        }
        rb.setOnClickListener {

            val intent = Intent(this@MainActivity,Rb::class.java);
            startActivity(intent)

        }
        ice.setOnClickListener {

            val intent = Intent(this@MainActivity,icecreams::class.java);
            startActivity(intent)

        }
        ap.setOnClickListener {

            val intent = Intent(this@MainActivity,an::class.java);
            startActivity(intent)

        }



    }
}