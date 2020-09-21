package aula_10.exercicio_03

fun main(){
    var estoque=Estoque("estoque1",-50,-50)

    estoque.mostrar()
    estoque.mudarNome("Estoque2")
    estoque.mudarQtdMinima(30)
    estoque.mostrar()
    estoque.repor(50)
    estoque.mostrar()
    estoque.darBaixa(10)
    estoque.mostrar()
    println(estoque.precisaRepor())

}