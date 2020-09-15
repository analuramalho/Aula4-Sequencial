package aula_07.ex01

fun main(){
    var cliente1 : Cliente = Cliente("Ana","Ramalho")
    var cliente2 : Cliente = Cliente("Luiza","Santos")


    var conta1: Conta = Conta(1234,cliente1)
    conta1.saldo=50.00

    var conta2:Conta=Conta(5678,cliente2)
    conta2.saldo=0.02

    println("Titular: ${cliente1.nomeCompleto} \n Conta: ${conta1.numConta} \n Saldo:${conta1.saldo} ")
    println("Titular: ${cliente2.nomeCompleto} \n Conta: ${conta2.numConta}\n Saldo:${conta2.saldo} ")

    conta1.depositar(50.00)
    conta1.sacar(10.00)

    conta2.depositar(100.00)
    conta2.sacar(50.00)




}