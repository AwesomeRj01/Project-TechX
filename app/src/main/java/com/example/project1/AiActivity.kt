package com.example.project1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class AiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ai)
        val buttonDeep = findViewById<CardView>(R.id.btnDeep)
        val buttonAnn = findViewById<CardView>(R.id.btnAnn)
        val buttonCv = findViewById<CardView>(R.id.btnCv)
        val buttonAr = findViewById<CardView>(R.id.btnAr)

        buttonDeep.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.geeksforgeeks.org/introduction-deep-learning/")
            startActivity(intent)
        }

        buttonAnn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/artificial-neural-network")
            startActivity(intent)
        }

        buttonCv.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.javatpoint.com/computer-vision")
            startActivity(intent)
        }

        buttonAr.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.freecodecamp.org/news/augmented-reality-full-course/")
            startActivity(intent)
        }
    }
}