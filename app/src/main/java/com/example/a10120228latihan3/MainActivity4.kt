package com.example.a10120228latihan3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//Tanggal : 25 April 2023
//NIM     : 10120228
//Nama    : Muhammad Hasbi Ar-Rasid
//Kelas   : IF 6

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

        val beres = findViewById<TextView>(R.id.beres)
        val panggilan = intent.getStringExtra("EXTRA_PANGGILAN")

        val beresData = "Beres! Sekarang $panggilan udah bisa ngecek penggunaan HP mu tiap hari buat bantu kamu ngatur waktu :)"

        beres.text = beresData

    }
}