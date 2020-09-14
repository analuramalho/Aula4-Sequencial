package aula_05.exercicios_repeticao.nivel_2

//1. Faça um programa que calcule e mostre a média aritmética de N notas.

fun main() {
    print("Digite a quantidade de notas: ")
    val qtdNotas:Int = readLine()!!.toInt()

    var somaNotas = 0
    var notaEntrada = 0
    for(i:Int  in 1..qtdNotas) {
        print("Digite a $i ª nota: ")
        notaEntrada = readLine()!!.toInt()

        somaNotas += notaEntrada
    }

    val media = somaNotas / qtdNotas

    println("A média é: $media")
}