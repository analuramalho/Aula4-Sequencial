package aula_11.exercicios_exception.exercicio_03

import java.lang.ArithmeticException

fun main(){
    var calculo=CalculoMatematico()

    try {
        print(calculo.divisao(4,0))
    }catch (ex:ArithmeticException){
        print(ex.message)
    }
}