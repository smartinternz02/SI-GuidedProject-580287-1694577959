package com.example.foodapp


import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class icecreams : AppCompatActivity(), View.OnClickListener {

    private val selectedItems = ArrayList<String>()
    private lateinit var c1: CardView
    private lateinit var c2: CardView
    private lateinit var c3: CardView
    private lateinit var c4: CardView
    private lateinit var addtocartc: Button
    private lateinit var addtocarts: Button
    private lateinit var addtocartv: Button
    private lateinit var addtocartbc: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_icecreams)

        addtocartc = findViewById(R.id.addtocartbutton3)
        addtocarts = findViewById(R.id.addtocartbutton2)
        addtocartv = findViewById(R.id.addtocartbutton)
        addtocartbc = findViewById(R.id.addtocartbutton4)

        c1 = findViewById(R.id.cardview1)
        c2 = findViewById(R.id.cardview2)
        c3 = findViewById(R.id.cardview3)
        c4 = findViewById(R.id.cardview4)

        addtocartc.setOnClickListener {
            val iceCream = "Chocolate   price: 80"
            selectedItems.add(iceCream)
            openCartActivity()
        }

        addtocarts.setOnClickListener {
            val iceCream = "Strawberry  price: 100"
            selectedItems.add(iceCream)
            openCartActivity()
        }

        addtocartv.setOnClickListener {
            val iceCream = "vanilla   price: 60"
            selectedItems.add(iceCream)
            openCartActivity()
        }

        addtocartbc.setOnClickListener {
            val iceCream = "Butter coach    price: 60"
            selectedItems.add(iceCream)
            openCartActivity()
        }
    }

    private fun openCartActivity() {
        val intent = Intent(this@icecreams, cart::class.java)
        intent.putStringArrayListExtra("SelectedItems", selectedItems)
        startActivity(intent)
    }

    override fun onClick(v: View?) {
        // Handle click events here if needed
    }
}
