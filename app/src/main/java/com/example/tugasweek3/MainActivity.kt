package com.example.tugasweek3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etInputName = findViewById<EditText>(R.id.etInputName)
        val btnProcess = findViewById<Button>(R.id.btnProcess)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnProcess.setOnClickListener {
            val enteredText = etInputName.text.toString()

            if (enteredText.isNotEmpty()) {
                tvResult.text = "Hello, $enteredText"
            } else {
                tvResult.text = "Tolong masukkan teks terlebih dahulu!"
            }
        }
    }
}
