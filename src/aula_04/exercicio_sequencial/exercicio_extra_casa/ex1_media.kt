package aula_04.exercicio_sequencial.exercicio_extra_casa
//1. Faça um Programa que peça as 4 notas bimestrais e mostre a média

fun main(){
    println("Media de notas bimestrais")
    print("Digite a 1º nota: ")
    val nota1: Double = readLine()!!.toDouble()
    print("Digite a 2º nota: ")
    val nota2: Double = readLine()!!.toDouble()
    print("Digite a 3º nota: ")
    val nota3: Double = readLine()!!.toDouble()
    print("Digite a 4º nota: ")
    val nota4: Double = readLine()!!.toDouble()

    val media = (nota1 + nota2 + nota3 + nota4)/4

    print("A média das notas é $media")
}