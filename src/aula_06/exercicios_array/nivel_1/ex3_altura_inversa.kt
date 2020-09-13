package aula_06.exercicios_array.nivel_1

/*3. Faça um Programa que peça a altura de 5 pessoas, armazene cada informação
num array. Imprima a altura na ordem inversa a ordem lida.*/

fun  main (){
    val alturas= ArrayList<Double>()
//for
    for(i in 1..5){
        print("Digite sua Altura: ")
        val altura: Double = readLine()!!.toDouble()
        alturas.add(altura)
    }
    alturas.reverse()
    println(alturas)
}