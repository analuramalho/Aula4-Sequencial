package aula_11.exercicios_equals.exercicio_01

fun main(){
    val pessoa1=Pessoa("Maria",123)
    val pessoa2=Pessoa("Maria",123)

    println(pessoa1==pessoa2)

    /*Usando equals, comparar se a primeira pessoa criada é igual à segunda.
      resultado: false*/

    /*Sobrescrever o equals da classe Pessoa para que compare apenas o
     número de RG
        resultado: true */




}