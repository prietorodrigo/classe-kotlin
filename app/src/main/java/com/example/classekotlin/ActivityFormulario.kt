package com.example.classekotlin

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.classekotlin.databinding.ActivityFormularioBinding
import com.example.classekotlin.databinding.ActivityMainBinding

class ActivityFormulario : AppCompatActivity() {

    private lateinit var edtNome: EditText
    private lateinit var edtTelefone: EditText
    private lateinit var edtIdade: EditText
    private lateinit var btnEnviar: Button
    private lateinit var btnLimpar: Button
    private lateinit var btnImprimir: Button
    private lateinit var txtValores: TextView
    private lateinit var a: ActivityFormularioBinding
    var lista: ArrayList<Pessoa> = ArrayList()
    private var s: String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        a= ActivityFormularioBinding.inflate(layoutInflater)
        setContentView(a.root)

        edtNome = findViewById<EditText>(R.id.edtNome)
        edtTelefone = findViewById<EditText>(R.id.edtTelefone)
        edtIdade = findViewById<EditText>(R.id.edtIdade)
        btnEnviar = findViewById<Button>(R.id.btnEnviar)
        btnLimpar = findViewById<Button>(R.id.btnLimpar)
        btnImprimir = findViewById<Button>(R.id.btnImprimir)
        txtValores = findViewById<TextView>(R.id.txtValores)

        btnEnviar.setOnClickListener(View.OnClickListener {
            val pessoa = Pessoa()
            pessoa.setNome(edtNome.text.toString())
            pessoa.setTelefone(Integer.parseInt(edtTelefone.text.toString()))
            pessoa.setIdade(Integer.parseInt(edtIdade.text.toString()))
            lista.add(pessoa)
            val toast = Toast.makeText(applicationContext, "Cadastro feito com sucesso", Toast.LENGTH_SHORT).show()
            edtNome.text.clear()
            edtTelefone.text.clear()
            edtIdade.text.clear()
        })

        btnLimpar.setOnClickListener(View.OnClickListener {
            edtNome.text.clear()
            edtTelefone.text.clear()
            edtIdade.text.clear()
        })

        btnImprimir.setOnClickListener(View.OnClickListener {
            s = ""
            for (i in 0 until lista.size) {
                s += "Nome:\t${lista[i].getNome()}\n"
                s += "Telefone:\t${lista[i].getTelefone()}\n"
                s += "Idade:\t${lista[i].getIdade()}\n\n"
            }
            txtValores.setText(s)
        })
    }
}