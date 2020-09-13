package aula_05.exercicios_repeticao.nivel_1
/*1. Faça um programa que leia 5 números e informe o maior número.*/
fun main(){
    var atual=0
    var i=1
    var num=0

    /*while
        (i <= 5){
        println("Digite um número: ")
        num = readLine()!!.toInt()

        if(num>atual){
           atual=num
        }
        i++
    }
    print("maior = $num ")

     */


//For
    for(i in 1..5){
        println("Digite um número: ")
        num = readLine()!!.toInt()

        if(num>atual){
            atual=num
        }
    }
    print("maior = $atual ")
}