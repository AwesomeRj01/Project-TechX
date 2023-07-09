package com.example.project1

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class SecondaryActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary)
        val webButton = findViewById<CardView>(R.id.cardWeb)
        val appButton = findViewById<CardView>(R.id.cardApp)
        val aiButton = findViewById<CardView>(R.id.cardAi)
        val mlButton = findViewById<CardView>(R.id.cardMl)
        val cloudButton = findViewById<CardView>(R.id.cardCloud)
        val networkButton = findViewById<CardView>(R.id.cardNetwork)

        webButton.setOnClickListener {
            intent = Intent(applicationContext,WebActivity::class.java)
            startActivity(intent)
        }
        appButton.setOnClickListener {
            intent = Intent(applicationContext,AppActivity::class.java)
            startActivity(intent)
        }
        aiButton.setOnClickListener {
            intent =Intent(applicationContext,AiActivity::class.java)
            startActivity(intent)
        }
        mlButton.setOnClickListener {
            intent =Intent(applicationContext,BlockChainActivity::class.java)
            startActivity(intent)
        }
        cloudButton.setOnClickListener {
            intent =Intent(applicationContext,CloudActivity::class.java)
            startActivity(intent)
        }
        networkButton.setOnClickListener {
            intent =Intent(applicationContext,NetworkActivity::class.java)
            startActivity(intent)
        }
    }
}