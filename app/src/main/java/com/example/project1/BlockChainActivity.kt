
package com.example.project1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class BlockChainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blockchain)
        val buttonIntro = findViewById<CardView>(R.id.btnIntro)
        val buttonAdvantages = findViewById<CardView>(R.id.btnAdvantages)
        val buttonApplications = findViewById<CardView>(R.id.btnApplication)
        val buttonControversies = findViewById<CardView>(R.id.btnControversies)

        buttonIntro.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.investopedia.com/terms/b/blockchain.asp")
            startActivity(intent)
        }

        buttonAdvantages.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.ibm.com/topics/benefits-of-blockchain#:~:text=Blockchain%20increases%20trust%2C%20security%2C%20transparency,cost%20savings%20with%20new%20efficiencies.&text=Blockchain%20for%20business%20uses%20a,accessed%20by%20members%20with%20permission.")
            startActivity(intent)
        }

        buttonApplications.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://www.upgrad.com/blog/top-blockchain-applications/")
            startActivity(intent)
        }

        buttonControversies.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW)
            intent.data = Uri.parse("https://bernardmarr.com/the-5-big-problems-with-blockchain-everyone-should-be-aware-of/")
            startActivity(intent)
        }
    }
}