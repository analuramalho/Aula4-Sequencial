package aula_10.resolucao_ex02_prof

class Fatura {
    var itens = ArrayList<Item>()

    fun getTotalFatura():Double{
        var total=0.0
        itens.forEach{
            total+= it.quantidade * it.precoUnitario
        }
        return total
    }

    /*fun adicionarItem( numero:Int, descricao:String, quantidade:Int, precoUnitario:Double){

        val item=Item(numero,descricao,quantidade,precoUnitario)
        itens.add(item)
        println("Item adicionado a Fatura")
        println(item.numero)
        println(item.descricao)
        println(item.quantidade)
        println( item.precoUnitario)


    }*/

}