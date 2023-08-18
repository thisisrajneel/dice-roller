package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.core.math.MathUtils

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
        txt.text = (Math.random()*6 + 1).toInt().toString()
        Toast.makeText(this, "Updated text to ${txt.text.toString()}", Toast.LENGTH_SHORT).show()

    }
}