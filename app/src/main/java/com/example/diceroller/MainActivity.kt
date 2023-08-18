package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.math.MathUtils
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn: Button = findViewById<Button>(R.id.btnRoll)
        btn.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice() {
        // Can't pass Views or anything by ref in kt
        val txt: TextView = findViewById<TextView>(R.id.txtNumber)
        val img: ImageView = findViewById<ImageView>(R.id.diceImg)
        txt.text = (Math.random()*6 + 1).toInt().toString()
        when (txt.text) {
            "1" -> {img.setImageResource(R.drawable.dice_1)}
            "2" -> {img.setImageResource(R.drawable.dice_2)}
            "3" -> {img.setImageResource(R.drawable.dice_3)}
            "4" -> {img.setImageResource(R.drawable.dice_4)}
            "5" -> {img.setImageResource(R.drawable.dice_5)}
            "6" -> {img.setImageResource(R.drawable.dice_6)}
        }
        Toast.makeText(this, "Updated text to ${txt.text}", Toast.LENGTH_SHORT).show()

    }
}