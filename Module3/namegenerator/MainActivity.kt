package com.example.namegenerator

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Switch

class MainActivity : ComponentActivity() {
    @SuppressLint("SetTextI18n", "UseSwitchCompatOrMaterialCode")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val gntButton = findViewById<Button>(R.id.gntButton)
        val resultsView = findViewById<TextView>(R.id.resultsView)
        val switchGender = findViewById<Switch>(R.id.switchGender)

//        This sets the click listener so that these functions are executed according to the status of the switch, displaying either a male name,
//        a female name, or an error message.
        gntButton.setOnClickListener {
            if (switchGender.isChecked) {
                resultsView.text = Reader.populate(0).toString()
            } else if (!switchGender.isChecked) {
                resultsView.text = Reader.populate(1).toString()
            } else {
                resultsView.text = Reader.populate(2).toString()
            }
        }
    }
}