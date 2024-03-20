package com.example.classekotlin

class Pessoa {
    private var nome : String
    private var telefone : Int
    private var idade: Int

    init {
        this.nome = ""
        this.telefone = 0
        this.idade = 0
    }

    fun getNome(): String {
        return this.nome
    }

    fun setNome(nome : String){
        this.nome = nome
    }

    fun getTelefone(): Int {
        return this.telefone
    }

    fun setTelefone(telefone : Int){
        this.telefone = telefone
    }

    fun getIdade(): Int {
        return this.idade
    }

    fun setIdade(idade : Int){
        this.idade = idade
    }
}