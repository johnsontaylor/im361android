package com.tjmediadesign.chopchop

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text_view)
        textView.text = "Fizz Fizz Buzz Buzz ${fizzBuzz()}"
    }

    private fun fizzBuzz() {
        for (i in 1..100) {
            if (i % 3 == 0) print("SheLookedSurprised ")
            if (i % 5 == 0) print("IToldMyWifeSheWasDrawing ")
            if (i % 3 != 0 && i % 5 !=0 ) print("HerEyebrowsTooHigh")
        }
        }



}
