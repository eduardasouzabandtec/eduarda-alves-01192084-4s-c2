package com.example.appdacontinuada

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.sax.StartElementListener
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var preferencias: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        preferencias = getSharedPreferences("autenticacao", MODE_PRIVATE)
    }


    fun criarDog(view: View) {
        val etId1:EditText = findViewById(R.id.et_idDog1)
        val etId2:EditText = findViewById(R.id.et_idDog2)
        val telaSu = Intent(this, Sucesso::class.java)
        telaSu.putExtra("id1",calcCompra((etId1.text.toString()).toInt(), (etId2.text.toString()).toInt()))
        telaSu.putExtra("id2",etId1.text.toString())
        telaSu.putExtra("id3",etId2.text.toString())
        startActivity(telaSu)
//        val telaEr = Intent(this, Erro::class.java)
//        telaEr.putExtra("id1",etId1.text.toString())
//        startActivity(telaEr)
    }
    fun calcCompra(p:Int, p2:Int): Int {
        val total = p + p2
        return total
    }
}