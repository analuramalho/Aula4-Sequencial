package aula_04.exercicio_sequencial.nivel_1

fun main(){
    // 3. Faça um Programa que converta metros para centímetros.
    println("Convertendo Metros em Centimetros")
    print("Informe a Metros: ")
    var metros= readLine()!!.toDouble()
    var cm = metros*100
    print("$metros m = $cm  cm")
}