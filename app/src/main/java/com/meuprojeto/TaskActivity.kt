package com.meuprojeto

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TaskActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        val botaoSalvar = findViewById<Button>(R.id.botaoSalvar)
        val textViewMensagem = findViewById<TextView>(R.id.textViewMensagem)

        botaoSalvar.setOnClickListener {
            textViewMensagem.text = "Tarefa salva com sucesso!"
        }
    }
}
