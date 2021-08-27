package com.example.weathercarddesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


            day()

    }
    fun day(){

        val dateTextView = findViewById<TextView>(R.id.dateTextView)
        val TextViewWeather = findViewById<TextView>(R.id.textViewWeather)
        val TextViewCity = findViewById<TextView>(R.id.citytextView)
        val TextViewDegree = findViewById<TextView>(R.id.textViewdegree)
        val Weatherimageview = findViewById<ImageView>(R.id.imageViewweather)
        val sdf = SimpleDateFormat("EE/LL/yyyy")
        val currentDate = sdf.format(Date())
        dateTextView.text = currentDate.toString()
        TextViewDegree.text="16°"
        TextViewWeather.text ="Sunny"
        TextViewCity.text ="ISTANBUL"
        dateTextView.textSize = 20f
        TextViewWeather.textSize = 20f
    }



}