fun main(){

    /*2. Faça um Programa que pergunte quanto você ganha por hora e o número de horas
    trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.*/

    println("Calcula Salario")
    print("Quanto vale sua hora? ")
    val valorH: Double = readLine()!!.toDouble()
    print("Quantas horas você trabalhou?")
    val horas: Double = readLine()!!.toDouble()

    val salario: Double = valorH * horas

    print("Você receberá R$ $salario")
}