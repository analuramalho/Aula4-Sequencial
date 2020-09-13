package aula_06.exercicios_funcao

/*2. Faça um programa, com uma função que necessite de um argumento. A função
retorna o valor de caractere ‘P’, se seu argumento for positivo, e ‘N’, se seu
argumento for zero ou negativo.*/

fun main(){
    var resultado= positivo_negativo(1)
    print(resultado)
}

fun positivo_negativo(numero: Int)= if(numero>0) "P" else "N"


