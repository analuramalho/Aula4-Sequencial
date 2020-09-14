package aula_05.exercicios_repeticao.nivel_1

import kotlin.math.max
import kotlin.math.min

/*3. Faça um programa que receba dois números inteiros e gere os números inteiros
que estão no intervalo compreendido por eles.
*/
fun main(){
    fun main(){
        print("Informe o numero: ")
        val n1 = readLine()!!.toInt()
        print("Informe o numero: ")
        val n2 = readLine()!!.toInt()

        for(i in min(n1,n2)..max(n1,n2)){
            println(i)
        }

    }
}