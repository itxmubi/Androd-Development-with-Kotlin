package com.example.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.Random
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)
//        rollButton.text = "Lets Roll"
        rollButton.setOnClickListener {
//            Toast.makeText(this,  "Button is clicked",Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
        val randomText : TextView = findViewById(R.id.random_text)
        val randomNumber =  Random().nextInt(6) +1

//        randomText.text = "Dice Roll"
        randomText.text = randomNumber.toString()
    }

}