package aula_12.exercicio_03

fun main(){
    val notasProva=Prova()
    val notas= mutableSetOf<Int>(1,2,3,4)
    print(notasProva.somaTotal(notas))

    notas.forEach{
        print("$it,")
    }

}