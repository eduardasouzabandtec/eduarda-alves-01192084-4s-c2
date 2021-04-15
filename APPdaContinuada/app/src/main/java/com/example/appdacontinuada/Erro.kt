package com.example.appdacontinuada

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Erro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_erro)
        val id1 = intent.getStringExtra("id1")
        val id2 = intent.getStringExtra("id2")
        val idDog1:TextView = findViewById(R.id.et_error)
        idDog1.text = "Deu ruim... Nenhum cachorro encontrado com os ids ${id1} e ${id2}"
    }
}