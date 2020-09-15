package aula_07.ex05

import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

class Concessionaria {
    val vendasRealizadas: MutableList<Venda> = mutableListOf<Venda>()

    fun registrarVenda(veiculo: Veiculo, cliente: Cliente, valor: Double) {
        var venda = Venda(cliente, veiculo, valor)
        this.vendasRealizadas.add(venda)
    }
}