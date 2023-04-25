package com.example.a10120228latihan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

//Tanggal : 25 April 2023
//NIM     : 10120228
//Nama    : Muhammad Hasbi Ar-Rasid
//Kelas   : IF 6

class MainActivity2 : AppCompatActivity() {

    lateinit var etMasukanKode : EditText
    lateinit var btnMasuk : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        init()

        btnMasuk.setOnClickListener {
            if (etMasukanKode.text.toString().isEmpty()){
                Toast.makeText(this, "Kode tidak boleh kosong", Toast.LENGTH_SHORT).show()
            }
            else if (!etMasukanKode.text.toString().equals("A1B2C3")){
                Toast.makeText(this, "Kode Salah", Toast.LENGTH_SHORT).show()
            }
            else{
                val intent = Intent(this, MainActivity3::class.java).also {
                    startActivity(it)
                }
            }
        }
    }

    private fun init(){
        etMasukanKode = findViewById(R.id.etMasukanKode)
        btnMasuk = findViewById(R.id.btnMasuk)
    }
}