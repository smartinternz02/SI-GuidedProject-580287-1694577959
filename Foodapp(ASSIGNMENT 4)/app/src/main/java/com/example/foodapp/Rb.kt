package com.example.foodapp



import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Rb : AppCompatActivity(), View.OnClickListener {

    private val selectedItems = ArrayList<String>()
    private lateinit var c1: CardView
    private lateinit var c2: CardView
    private lateinit var c3: CardView
    private lateinit var c4: CardView
    private lateinit var addtocartsp: Button
    private lateinit var addtocartdm: Button
    private lateinit var addtocartvg: Button
    private lateinit var addtocartmb: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rb)

        addtocartsp = findViewById(R.id.addtocartbutton3)
        addtocartdm = findViewById(R.id.addtocartbutton2)
        addtocartvg = findViewById(R.id.addtocartbutton)
        addtocartmb = findViewById(R.id.addtocartbutton4)
        c1 = findViewById(R.id.cardview1)
        c2 = findViewById(R.id.cardview2)
        c3 = findViewById(R.id.cardview3)
        c4 = findViewById(R.id.cardview4)

        addtocartsp.setOnClickListener {
            val biryaniType = "SPBiryani   price: 130"
            selectedItems.add(biryaniType)

            val intent = Intent(this@Rb, cart::class.java)
            intent.putStringArrayListExtra("SelectedItems", selectedItems)
            startActivity(intent)
        }

        addtocartdm.setOnClickListener {
            val biryaniType = "Dum Biryani price: 300"
            selectedItems.add(biryaniType)

            val intent = Intent(this@Rb, cart::class.java)
            intent.putStringArrayListExtra("SelectedItems", selectedItems)
            startActivity(intent)
        }

        addtocartvg.setOnClickListener {
            val biryaniType = "Veg Biryani price: 270"
            selectedItems.add(biryaniType)

            val intent = Intent(this@Rb, cart::class.java)
            intent.putStringArrayListExtra("SelectedItems", selectedItems)
            startActivity(intent)
        }

        addtocartmb.setOnClickListener {
            val biryaniType = "Mutton Biryani price:400"
            selectedItems.add(biryaniType)

            val intent = Intent(this@Rb, cart::class.java)
            intent.putStringArrayListExtra("SelectedItems", selectedItems)
            startActivity(intent)
        }
    }

    override fun onClick(v: View?) {
        // Handle click events here if needed
    }
}
