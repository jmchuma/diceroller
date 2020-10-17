package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    /* We could do
       var diceImage : ImageView? = null
       but that would mean having to check for null every time the
       field is accessed. Since we can guarantee that these fields
       won't be used before onCreate is called, we can use lateinit
       instead.
       Made it private because AndroidStudio said I could
    */
    private lateinit var diceImage1: ImageView
    private lateinit var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage1.tag = 0

        diceImage2 = findViewById(R.id.dice_image2)
        diceImage2.tag = 0

        findViewById<Button>(R.id.roll_button).setOnClickListener {rollDice()}
        findViewById<Button>(R.id.countup_button).setOnClickListener {countUp()}
    }

    private fun rollDice() {
        var drawableID = getDrawableDice()
        diceImage1.setImageResource(drawableID)
        diceImage1.tag = drawableID

        drawableID = getDrawableDice()
        diceImage2.setImageResource(drawableID)
        diceImage2.tag = drawableID
    }

    private fun getDrawableDice(): Int = when((1..6).random()) {
        1 -> R.drawable.dice_1
        2 -> R.drawable.dice_2
        3 -> R.drawable.dice_3
        4 -> R.drawable.dice_4
        5 -> R.drawable.dice_5
        else -> R.drawable.dice_6
    }

    private fun countUp() {
        setDice(diceImage1)
        setDice(diceImage2)
    }

    private fun setDice(dice : ImageView) = when(dice.tag) {
        0 -> {
            dice.tag = R.drawable.dice_1
            dice.setImageResource(R.drawable.dice_1)
        }
        R.drawable.dice_1 -> {
            dice.tag = R.drawable.dice_2
            dice.setImageResource(R.drawable.dice_2)
        }
        R.drawable.dice_2 -> {
            dice.tag = R.drawable.dice_3
            dice.setImageResource(R.drawable.dice_3)
        }
        R.drawable.dice_3 -> {
            dice.tag = R.drawable.dice_4
            dice.setImageResource(R.drawable.dice_4)
        }
        R.drawable.dice_4 -> {
            dice.tag = R.drawable.dice_5
            dice.setImageResource(R.drawable.dice_5)
        }
        R.drawable.dice_5 -> {
            dice.tag = R.drawable.dice_6
            dice.setImageResource(R.drawable.dice_6)
        }
        else -> {}
    }
}