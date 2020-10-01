package aula_12.exercicio_03

class Prova {
    fun somaTotal(conjuntoDeInteiros: MutableSet<Int>){
        var soma:Int = 0
        for (i in conjuntoDeInteiros){
            soma += i
        }
        println(soma)
    }
}