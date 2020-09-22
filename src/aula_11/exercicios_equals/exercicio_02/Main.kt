package aula_11.exercicios_equals.exercicio_02

fun main(){
    val coca1=Coca(2,5.00)
    val coca2=Coca(2,5.30)

    println(coca1==coca2)

    /*Usando equals, comparar se a primeira Coca criada é igual à segunda
    * resultado= False */

    /*Sobrescrever o equals da classe Coca para que compare apenas o tamanho.
    * resultado= True*/
}