package aula_06.exercicios_funcao

/*1. Faça um programa, com uma função que necessite de três argumentos, e que
forneça a soma desses três argumentos*/

fun soma(n1: Int,n2: Int,n3: Int):Int{
    return  n1+n2+n3
}
fun main() {
    var resultado= soma(1,5,7)
    print(resultado)
}
