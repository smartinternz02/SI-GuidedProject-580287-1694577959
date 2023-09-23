package com.example.foodapp



import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.ArrayList

class cart : AppCompatActivity() {

    private lateinit var cartitems: TextView
    private lateinit var clear: Button
    private lateinit var payment: Button

    companion object {
        private const val PREFS_NAME = "MyPrefsFile"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        payment = findViewById(R.id.pay)
        clear = findViewById(R.id.clear)
        cartitems = findViewById(R.id.listofitemsincart)

        val preferences: SharedPreferences = getSharedPreferences(PREFS_NAME, MODE_PRIVATE)
        val savedItems: String? = preferences.getString("SelectedItems", "")

        if (!savedItems.isNullOrEmpty()) {
            cartitems.text = savedItems
        } else {
            cartitems.text = "No items in cart."
        }

        clear.setOnClickListener {
            cartitems.text = "No items in cart."
            val editor: SharedPreferences.Editor = preferences.edit()
            editor.putString("SelectedItems", "")
            editor.apply()
        }

        val intent: Intent = intent
        val selectedItems: ArrayList<String>? = intent.getStringArrayListExtra("SelectedItems")

        val selectedText: StringBuilder = StringBuilder(savedItems.orEmpty())
        selectedItems?.forEach { item ->
            selectedText.append(item).append("\n")
        }

        val editor: SharedPreferences.Editor = preferences.edit()
        editor.putString("SelectedItems", selectedText.toString())
        editor.apply()

        payment.setOnClickListener {

        }
    }
}
