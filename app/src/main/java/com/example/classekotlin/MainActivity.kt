package com.example.classekotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.classekotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var edtLogin: EditText
    private lateinit var edtPassword: EditText
    private lateinit var btnOk: Button
    private lateinit var a: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        a= ActivityMainBinding.inflate(layoutInflater)
        setContentView(a.root)

        edtLogin = findViewById<EditText>(R.id.edtLogin)
        edtPassword = findViewById<EditText>(R.id.edtPassword)
        btnOk = findViewById<Button>(R.id.btnOk)

        a.btnOk.setOnClickListener(View.OnClickListener {
            if (edtLogin.text.toString().equals("rodrigo") && edtPassword.text.toString().equals("33")) {
                val i = Intent(applicationContext, ActivityFormulario::class.java)
                startActivity(i)
            }
            else {
                val contexto = applicationContext
                val texto = "Usuário ou senha errada, tente novamente."
                val duracao = Toast.LENGTH_SHORT

                val toast = Toast.makeText(contexto, texto, duracao)
                toast.show()
            }
        })
    }
}