package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener(){rollDice()}

        //val rollButton: Button =
        findViewById<Button>(R.id.countup_button).setOnClickListener(){countUp()}
    }

    private fun rollDice() {
        //Toast.makeText(this, "Button clicked", Toast.LENGTH_LONG).show()
        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = (1..6).random().toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        resultText.text = when(resultText.text) {
            "Hello World!" -> "1"
            "6" -> "6"
            else -> (resultText.text.toString().toInt()+1).toString()
        }
    }
}