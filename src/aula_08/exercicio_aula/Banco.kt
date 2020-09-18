package aula_08.exercicio_aula

import aula_07.ex01.Conta

class Banco:iImprimivel{
    var  contas = ArrayList<ContaBancaria>()

    fun inserirConta(conta:ContaBancaria){
        contas.add(conta)
    }

    fun removerConta(conta:ContaBancaria){
        contas.remove(conta)
    }

    fun procurarConta(conta:Int):ContaBancaria?{
        return contas.find {conta == it.conta}
    }

    override fun mostrarDados() {
        for(i:ContaBancaria in contas){
            i.mostrarDados()
        }
    }
}