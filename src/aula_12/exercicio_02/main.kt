package aula_12.exercicio_02

fun main(){
    val listaNumeros=  mutableListOf<Int>()
    listaNumeros.add(1)
    listaNumeros.add(5)
    listaNumeros.add(5)
    listaNumeros.add(6)
    listaNumeros.add(7)
    listaNumeros.add(8)
    listaNumeros.add(8)
    listaNumeros.add(8)

    println("lista 1 ")
    listaNumeros.forEach{
        print("$it,")
    }

    val listaNumeros2= mutableSetOf<Int>()
    listaNumeros2.add(1)
    listaNumeros2.add(5)
    listaNumeros2.add(5)
    listaNumeros2.add(6)
    listaNumeros2.add(7)
    listaNumeros2.add(8)
    listaNumeros2.add(8)
    listaNumeros2.add(8)
    println("\nlista 2 ")
    listaNumeros2.forEach{
        print("$it,")
    }
}