package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    /* We could do
       var diceImage : ImageView? = null
       but that would mean having to check for null every time the
       field is accessed. Since we can guarantee that these fields
       won't be used before onCreate is called, we can use lateinit
       instead.
       Made it private because AndroidStudio said I could
    */
    lateinit private var resultText: TextView
    lateinit private var diceImage1: ImageView
    lateinit private var diceImage2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultText = findViewById(R.id.result_text)
        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)

        //val rollButton: Button = findViewById(R.id.roll_button)
        //rollButton.setOnClickListener(){rollDice()}
        findViewById<Button>(R.id.roll_button).setOnClickListener(){rollDice()}
        findViewById<Button>(R.id.countup_button).setOnClickListener(){countUp()}
    }

    private fun rollDice() {
        //Toast.makeText(this, "Button clicked", Toast.LENGTH_LONG).show()
        /*val diceValue = (1..6).random()
        resultText.text = diceValue.toString()

        when(diceValue) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            else -> diceImage.setImageResource(R.drawable.dice_6)
        }*/

        // TODO is this better?
        /*val drawableDice = when(diceValue) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableDice)*/

        diceImage1.setImageResource(getDrawableDice())
        diceImage2.setImageResource(getDrawableDice())
    }

    private fun getDrawableDice(): Int {
        return when((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun countUp() {
        /*when(resultText.text.toString()) {
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
        }*/
    }
}