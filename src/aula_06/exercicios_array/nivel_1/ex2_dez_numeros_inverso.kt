package aula_06.exercicios_array.nivel_1

/*2. Faça um Programa que leia um vetor de 10 números e mostre-os na ordem
inversa.*/

fun  main (){
    val numeros= ArrayList<Int>()
//for
    for(i in 1..10){
        print("Digite um numero")
        val numero: Int = readLine()!!.toInt()
        numeros.add(numero)
    }
    numeros.reverse()
    println(numeros)
}