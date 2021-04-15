package com.example.appdacontinuada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Sucesso : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sucesso)
        val id1 = intent.getStringExtra("sucesso")
        val id2 = intent.getStringExtra("id2")
        val id3 = intent.getStringExtra("id3")
        val idDog1: TextView = findViewById(R.id.et_sucesso)
        idDog1.text = "Cachorro1: ${id2}Preco Total ${id1}"

    }
}