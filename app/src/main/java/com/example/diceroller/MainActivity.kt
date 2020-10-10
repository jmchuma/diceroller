package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
        val diceValue = (1..6).random()
        resultText.text = diceValue.toString()

        val diceImage: ImageView = findViewById(R.id.dice_image)

        when(diceValue) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            else -> diceImage.setImageResource(R.drawable.dice_6)
        }
    }

    private fun countUp() {
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val resultText: TextView = findViewById(R.id.result_text)

        when(resultText.text.toString()) {
            "Hello World!" -> {
                resultText.text = "1"
                diceImage.setImageResource(R.drawable.dice_1)
            }
            "1" -> {
                resultText.text = "2"
                diceImage.setImageResource(R.drawable.dice_2)
            }
            "2" -> {
                resultText.text = "3"
                diceImage.setImageResource(R.drawable.dice_3)
            }
            "3" -> {
                resultText.text = "4"
                diceImage.setImageResource(R.drawable.dice_4)
            }
            "4" -> {
                resultText.text = "5"
                diceImage.setImageResource(R.drawable.dice_5)
            }
            "5" -> {
                resultText.text = "6"
                diceImage.setImageResource(R.drawable.dice_6)
            }
            else -> {}
        }
    }
}