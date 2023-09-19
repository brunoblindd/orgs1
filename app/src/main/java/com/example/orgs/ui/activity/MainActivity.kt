package com.example.orgs.ui.activity

import android.app.Activity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.orgs.R
import com.example.orgs.model.Produto
import com.example.orgs.ui.recyclerview.adapter.ListaprodutosAdapter
import java.math.BigDecimal

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //      val nome = findViewById<TextView>(R.id.nome) nome.text = "Cestas de Frutas"
        //      val descricao = findViewById<TextView>(R.id.descricao)
        //      descricao.text = "laranja, maçã, banana"
        //      val valor = findViewById<TextView>(R.id.valor)
        //      valor.text = "19.9"
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.adapter = ListaprodutosAdapter(
            context = this, produtos = listOf(
                Produto(
                    nome = "teste",
                    descricao = "teste descr",
                    BigDecimal.valueOf(20.99)
                ),
                Produto(
                    nome = "teste2",
                    descricao = "teste descr2",
                    BigDecimal.valueOf(25.99)
                ),
                Produto(
                    nome = "teste 3",
                    descricao = "teste descr 3",
                    BigDecimal.valueOf(25.99)
                )
            )
        )
        recyclerview.layoutManager = LinearLayoutManager(this)
    }


}