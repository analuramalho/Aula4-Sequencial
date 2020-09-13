package aula_06.exercicios_array.nivel_1

/*1. Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.*/

fun  main (){
    val numeros= ArrayList<Int>()

//while
    // var i = 1
    /*  while(i<6){
          print("Digite um numero")
          val numero: Int = readLine()!!.toInt()

          numeros.add(numero)
          i++
      } */
//for
    for(i in 1..5){
        print("Digite um numero")
        val numero: Int = readLine()!!.toInt()
        numeros.add(numero)
    }
}