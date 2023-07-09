package com.example.project1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class WebActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_web)

        val htmlBtn = findViewById<CardView>(R.id.btnHtml)
        val cssBtn = findViewById<CardView>(R.id.btnCss)
        val jsBtn = findViewById<CardView>(R.id.btnJS)
        val mongoBtn = findViewById<CardView>(R.id.btnMongo)

        htmlBtn.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/html/")
            startActivity(intent)
        }

        cssBtn.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/css/")
            startActivity(intent)
        }

        jsBtn.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("w3schools.com/js/")
            startActivity(intent)
        }

        mongoBtn.setOnClickListener {
            val intent =Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.w3schools.com/mongodb/")
            startActivity(intent)
        }
    }
}