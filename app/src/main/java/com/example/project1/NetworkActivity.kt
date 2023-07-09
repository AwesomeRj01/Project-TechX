package com.example.project1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class NetworkActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_network)

        val buttonFirewall = findViewById<CardView>(R.id.btnFirewall)
        val buttonIds = findViewById<CardView>(R.id.btnIds)
        val buttonAntivirus = findViewById<CardView>(R.id.btnAntivirus)
        val buttonEncryption = findViewById<CardView>(R.id.btnEncryption)

        buttonFirewall.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.geeksforgeeks.org/introduction-of-firewall-in-computer-network/")
            startActivity(intent)
        }

        buttonIds.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.geeksforgeeks.org/intrusion-detection-system-ids/")
            startActivity(intent)
        }

        buttonAntivirus.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://intellipaat.com/blog/what-is-antivirus-software/")
            startActivity(intent)
        }

        buttonEncryption.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://cloud.google.com/learn/what-is-encryption")
            startActivity(intent)
        }

    }
}