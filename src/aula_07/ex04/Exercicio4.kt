package aula_07.ex04

fun main(){
    val carro1 = Carro(15.0)

    carro1.adicionarGasolina(400.0)
    carro1.andar(100)
    carro1.obterGasolina()


    val carro2 = Carro(15.0)

    carro2.adicionarGasolina(400.0)
    carro2.andar(10)
    carro2.obterGasolina()
}
