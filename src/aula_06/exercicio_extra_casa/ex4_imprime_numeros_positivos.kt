package aula_06.exercicio_extra_casa

/*4) Escrever um programa que imprima na tela os primeiros 100 números
inteiros positivos ímpares.
*/

fun imprimePositivos(){
    for(i in 1..100 step 2){
        println(i)
    }
}

fun main(){
    imprimePositivos()
}

