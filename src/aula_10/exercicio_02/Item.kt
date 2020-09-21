package aula_10.exercicio_02

class Item(val numeroItem:Int,val descricao:String,var quantidade:Int=0,var precoUnitario:Double){
    init {
        if(quantidade<0) quantidade=0
        if(precoUnitario<0) precoUnitario=0.00
    }
}