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
        val txt: TextView = findViewById<TextView>(R.id.txtNumber)
        var count = 0
        txt.text = count.toString()
        btn.setOnClickListener {
            //count = count+1
            count = (Math.random()*6 + 1).toInt()
            txt.text = count.toString()
            Toast.makeText(this, "Updated text to $count", Toast.LENGTH_SHORT).show()
        }
    }
}