package com.example.project1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val cardIntent = findViewById<CardView>(R.id.btnIntent)
        val credits = findViewById<TextView>(R.id.btnCredit)

        cardIntent.setOnClickListener {
            val intent = Intent(applicationContext,SecondaryActivity::class.java)
            startActivity(intent)
        }
        credits.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://linktr.ee/awesomeRj01")
            startActivity(intent)
        }
    }
}