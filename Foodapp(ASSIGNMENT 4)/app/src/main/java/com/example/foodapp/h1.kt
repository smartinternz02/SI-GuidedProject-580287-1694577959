package com.example.foodapp



import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class h1 : AppCompatActivity(), View.OnClickListener {
    private val selectedItems = ArrayList<String>()
    private lateinit var c1: CardView
    private lateinit var c2: CardView
    private lateinit var c3: CardView

    private lateinit var addtocartcb: Button
    private lateinit var addtocartcripsyb: Button
    private lateinit var addtocartvB: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_h1)

        addtocartcb = findViewById(R.id.addtocartbutton3)
        addtocartcripsyb = findViewById(R.id.addtocartbutton2)
        addtocartvB = findViewById(R.id.addtocartbutton)

        c1 = findViewById(R.id.cardviewburger1)
        c2 = findViewById(R.id.cardviewburger2)
        c3 = findViewById(R.id.cardviewburger3)

        addtocartcb.setOnClickListener {
            val biryaniType = "chicken Burger Price:150"
            selectedItems.add(biryaniType)

            val intent = Intent(this@h1, cart::class.java)
            intent.putStringArrayListExtra("SelectedItems", selectedItems)
            startActivity(intent)
        }

        addtocartcripsyb.setOnClickListener {
            val biryaniType = "crispy burger price:200"
            selectedItems.add(biryaniType)

            val intent = Intent(this@h1, cart::class.java)
            intent.putStringArrayListExtra("SelectedItems", selectedItems)
            startActivity(intent)
        }

        addtocartvB.setOnClickListener {
            val biryaniType = "veg burger price:130"
            selectedItems.add(biryaniType)

            val intent = Intent(this@h1, cart::class.java)
            intent.putStringArrayListExtra("SelectedItems", selectedItems)
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {
        // Handle click events here if needed
    }
}
