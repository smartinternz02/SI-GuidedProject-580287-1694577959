package com.example.foodapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class an : AppCompatActivity(), View.OnClickListener {

    private val selectedItems = ArrayList<String>()
    private lateinit var c1: CardView
    private lateinit var c2: CardView
    private lateinit var c3: CardView
    private lateinit var c4: CardView
    private lateinit var addtocartsm: Button
    private lateinit var addtocartm: Button
    private lateinit var addtocartcm: Button
    private lateinit var addtocartmm: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_an)

        addtocartsm = findViewById(R.id.addtocartbutton3)
        addtocartm = findViewById(R.id.addtocartbutton2)
        addtocartcm = findViewById(R.id.addtocartbutton)
        addtocartmm = findViewById(R.id.addtocartbutton4)

        c1 = findViewById(R.id.cardview1)
        c2 = findViewById(R.id.cardview2)
        c3 = findViewById(R.id.cardview3)
        c4 = findViewById(R.id.cardview4)

        addtocartsm.setOnClickListener {
            val mealType = "Special Meals Price: 120"
            selectedItems.add(mealType)

            val intent = Intent(this@an, cart::class.java)
            intent.putStringArrayListExtra("SelectedItems", selectedItems)
            startActivity(intent)
        }

        addtocartm.setOnClickListener {
            val meal = "Meals Price: 70"
            selectedItems.add(meal)

            val intent = Intent(this@an, cart::class.java)
            intent.putStringArrayListExtra("SelectedItems", selectedItems)
            startActivity(intent)
        }

        addtocartcm.setOnClickListener {
            val meal = "Chicken Meals Price: 180"
            selectedItems.add(meal)

            val intent = Intent(this@an, cart::class.java)
            intent.putStringArrayListExtra("SelectedItems", selectedItems)
            startActivity(intent)
        }

        addtocartmm.setOnClickListener {
            val meal = "Mutton Meals Price: 180"
            selectedItems.add(meal)

            val intent = Intent(this@an, cart::class.java)
            intent.putStringArrayListExtra("SelectedItems", selectedItems)
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {

    }
}
