package com.example.project1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class AppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_app)
        val kotlin = findViewById<CardView>(R.id.btnKotlin)
        val swift = findViewById<CardView>(R.id.btnSwift)
        val flutter = findViewById<CardView>(R.id.btnFlutter)
        val xamarin = findViewById<CardView>(R.id.btnXamarin)

        kotlin.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.android.com/kotlin")
            startActivity(intent)
        }

        swift.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.apple.com/swift/")
            startActivity(intent)
        }

        flutter.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://flutter.dev/")
            startActivity(intent)
        }

        xamarin.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.tutorialspoint.com/xamarin/index.htm")
            startActivity(intent)
        }
    }
}