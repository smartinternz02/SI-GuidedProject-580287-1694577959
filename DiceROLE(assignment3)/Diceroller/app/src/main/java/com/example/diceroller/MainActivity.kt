package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


import android.view.View
import android.widget.ImageView

import java.util.Random

class MainActivity : AppCompatActivity() {
    private lateinit var imageViewDice: ImageView
    private val rng = Random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageViewDice = findViewById(R.id.image_view_dice)
        imageViewDice.setOnClickListener(View.OnClickListener {
            rollDice()
        })
    }

    private fun rollDice() {
        val randomNumber = rng.nextInt(6) + 1

        when (randomNumber) {
            1 -> imageViewDice.setImageResource(R.drawable.dice1)
            2 -> imageViewDice.setImageResource(R.drawable.dice2)
            3 -> imageViewDice.setImageResource(R.drawable.dice3)
            4 -> imageViewDice.setImageResource(R.drawable.dice4)
            5 -> imageViewDice.setImageResource(R.drawable.dice5)
            6 -> imageViewDice.setImageResource(R.drawable.dice6)
        }
    }
}
