package com.example.a10120228latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

//Tanggal : 25 April 2023
//NIM     : 10120228
//Nama    : Muhammad Hasbi Ar-Rasid
//Kelas   : IF 6

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val etPanggilan = findViewById<EditText>(R.id.etPanggilan)
        val btnSelanjutnya = findViewById<Button>(R.id.btnSelanjutnya)

        btnSelanjutnya.setOnClickListener {
            val panggilan = etPanggilan.text.toString()

            Intent(this, MainActivity4::class.java).also {
                it.putExtra("EXTRA_PANGGILAN", panggilan)
                startActivity(it)
            }
        }

    }
}