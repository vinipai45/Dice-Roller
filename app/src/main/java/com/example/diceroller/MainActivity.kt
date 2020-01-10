package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button : Button = findViewById(R.id.button)
//        val textView : TextView = findViewById(R.id.textView)

        button.setOnClickListener {
            rollDice()
        }





    }

    private fun rollDice() {

//        val textView: TextView=findViewById(R.id.textView)

        val randomNumber = Random().nextInt(6)+1;
        val imageView : ImageView = findViewById(R.id.imageView);
        val imageResource = when (randomNumber){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6
        }

        imageView.setImageResource(imageResource);
//        textView.text=randomNumber.toString();


    }
}
