package aula_07.ex04

class Carro(val consumoCombustivel: Double){
    var quantidadeCombustivel:Double =0.0

    fun andar(distancia: Int){
        this.quantidadeCombustivel-= (this.consumoCombustivel*distancia)
        if(this.quantidadeCombustivel < 0) {
            println("A gasolina acabou!")
            this.quantidadeCombustivel=0.0
        }
    }

    fun obterGasolina(){
        return println("Quantidade gasolina atual: $quantidadeCombustivel")
    }
    fun adicionarGasolina(quantidade:Double){
        quantidadeCombustivel+=quantidade
    }
}