package com.example.project1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class CloudActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cloud)
        val buttonAws = findViewById<CardView>(R.id.btnAws)
        val buttonAzure= findViewById<CardView>(R.id.btnAzure)
        val buttonGcp = findViewById<CardView>(R.id.btnGcp)
        val buttonIbm = findViewById<CardView>(R.id.btnIbm)

        buttonAws.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://aws.amazon.com/training/")
            startActivity(intent)
        }

        buttonAzure.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://learn.microsoft.com/en-us/training/azure/")
            startActivity(intent)
        }

        buttonGcp.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://cloud.google.com/learn")
            startActivity(intent)
        }

        buttonIbm.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://www.ibm.com/cloud/learn/all")
            startActivity(intent)
        }
    }
}