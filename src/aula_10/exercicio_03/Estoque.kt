package aula_10.exercicio_03

import java.lang.Exception

class Estoque(var nome:String,var qtdAtual:Int,var qtdMinima:Int) {

    init {
        qtdAtual=Math.max(0,qtdAtual)
        qtdMinima=Math.max(0,qtdMinima)
    }
    fun mudarNome(nome:String) {
        this.nome=nome
    }

    fun mudarQtdMinima(qtdMinima: Int){
        this.qtdMinima=qtdMinima
    }

    fun repor(qtd: Int){
        qtdAtual+=qtd
    }

    fun darBaixa(qtd:Int){
        if(qtdAtual - qtd<0){
            throw Exception("Quantidade não pode ser negativa")
        }

        this.qtdAtual -= qtd
    }

    fun mostrar(): String {
        return println("nome:$nome\nquantidade atual: $qtdAtual\nquantidade minima: $qtdMinima\n").toString()
    }

    fun precisaRepor():Boolean{
        return qtdAtual<=qtdMinima
    }
}