package com.app.dice_roller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        val currentImage=findViewById<ImageView>(R.id.diceImage)
        val drawable= listOf(R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)
        val rollBtn= findViewById<Button>(R.id.rollBtn)
        rollBtn.setOnClickListener{
            val randomDice= drawable.random()
            val imageReplace=  currentImage.setImageResource(randomDice)
        }

    }
}