package com.alura.orgs

import android.app.Activity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : Activity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

//        val nome = findViewById<TextView>(R.id.nome)
//        val descricao = findViewById<TextView>(R.id.descricao)
//        val valor = findViewById<TextView>(R.id.valor)
//
//        nome.text = "Cesta de frutas"
//        descricao.text = "Manga"
//        valor.text = "4,88"


        Toast.makeText(this, "Oi bb :D", Toast.LENGTH_SHORT).show()
    }
}