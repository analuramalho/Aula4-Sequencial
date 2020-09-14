package aula_06.exercicio_extra_casa

import kotlin.math.max

/*1) Escrever o código que deve analisar três números inteiros e retornar o maior
deles.*/

fun maiorNumero(n1:Int,n2:Int,n3:Int) = max(max(n1,n2),n3)

fun main(){
    print(maiorNumero(5,1,50))
}