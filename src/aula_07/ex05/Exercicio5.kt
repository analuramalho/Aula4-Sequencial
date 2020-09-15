package aula_07.ex05

fun main() {
    val carro = Veiculo("Gipe", "Renegueite", 2030, "Preto",10.0)
    val carro2 = Veiculo("Gol", "Bolinha", 2000, "Preto",10.0)

    val cliente = Cliente("Lulu", "Santos", "lulusantos@email.com")
    val concessionaria= Concessionaria()

    concessionaria.registrarVenda(carro, cliente, 20000.00)
    concessionaria.registrarVenda(carro2, cliente, 20000.00)

    concessionaria.vendasRealizadas.forEach{ venda ->
        println("Cliente: ${venda.cliente.nome} ${venda.cliente.sobrenome}.")
        println("Veículo: ${venda.veiculo.marca} - ${venda.veiculo.modelo}")
        println("Valor da venda: R$ " + "%.2f".format(venda.valorVenda))

        println("----------")
    }

}