package aula_05.exercicios_decisao.nivel_1

/*2. Faça um Programa que peça um número inteiro e determine se ele é par ou
ímpar. Dica: utilize o operador módulo (resto da divisão).
*/

fun main(){
    println(" Par ou Impar ")
    print("Digite um número inteiro: ")
    val numero = readLine()!!.toInt()

    if((numero%2)==0) {
        print(" O numero $numero é par ")
    }else{
        print("O numero $numero é impar")
    }

}