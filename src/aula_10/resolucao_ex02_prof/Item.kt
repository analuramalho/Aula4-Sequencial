package aula_10.resolucao_ex02_prof

class Item(val numero:Int,
           val descricao:String,
           var quantidade:Int,
           var precoUnitario:Double){
    init {
        quantidade=Math.max(0,quantidade)
        precoUnitario=Math.max(0.0,precoUnitario)
    }
}