package aula_05.exercicios_repeticao.nivel_2

/*2. Faça um programa que calcule o valor total investido por um colecionador em sua
coleção de CDs e o valor médio gasto em cada um deles. O usuário deverá informar
a quantidade de CDs e o valor para em cada um.
*/

fun main(){
    println("Calcula valor total investido em CDs")
    print("Informe a quantidade de CDs: ")
    val qtdCDs: Int = readLine()!!.toInt()

    var valorTotal = 0.0
    var valorEntrada = 0.0
    for(i:Int in 1..qtdCDs) {
        print("Digite o valor do $i º CD: ")
        valorEntrada = readLine()!!.toDouble()

        valorTotal += valorEntrada
    }

    val valorMedio: Double = valorTotal / qtdCDs

    println("Total investido: R$ $valorTotal")
    println("O valor médio é: R$ " + "%.2f".format(valorMedio))



}