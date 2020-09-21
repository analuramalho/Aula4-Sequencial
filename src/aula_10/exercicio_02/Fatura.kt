package aula_10.exercicio_02

class Fatura {
    private var listaItens = ArrayList<Item>()

    fun adicionarItem( numeroItem:Int, descricao:String, quantidade:Int, precoUnitario:Double){

        val item=Item(numeroItem,descricao,quantidade,precoUnitario)
        listaItens.add(item)
        println("Item adicionado a Fatura")
        println(item.numeroItem)
        println(item.descricao)
        println(item.quantidade)
        println( item.precoUnitario)


    }

}