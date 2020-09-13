package aula_04.exercicio_sequencial.nivel_1

fun main(){
    // 2. Faça um Programa que peça dois números e imprima a soma.
    print(" informe o 1º número: ")
    var numero1= readLine()!!.toDouble()
    print("informe o 2º número: ")
    var numero2= readLine()!!.toDouble()
    var soma = numero1+numero2
    print(" $numero1 + $numero2 = $soma")
}