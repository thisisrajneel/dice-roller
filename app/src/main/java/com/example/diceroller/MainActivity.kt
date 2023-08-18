package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    // lateinit
    lateinit var img: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById<Button>(R.id.btnRoll)
        img = findViewById(R.id.diceImg)
        btn.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice() {
        // Can't pass Views or anything by ref in kt
        //val img: ImageView = findViewById<ImageView>(R.id.diceImg)
        val randomImg = when (java.util.Random().nextInt(6)+1) {
            1 -> {R.drawable.dice_1}
            2 -> {R.drawable.dice_2}
            3 -> {R.drawable.dice_3}
            4 -> {R.drawable.dice_4}
            5 -> {R.drawable.dice_5}
            else -> {R.drawable.dice_6}
        }
        img.setImageResource(randomImg)
    }
}