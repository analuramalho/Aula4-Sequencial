package aula_07.ex01

class Conta(val numConta:Int, titular: Cliente) {
    var saldo: Double = 0.00


    fun depositar(qntDinheiro:Double){
        saldo += qntDinheiro
        return println("Deposito Realizado com sucesso! Saldo atual: R$ " + "%.2f".format(saldo))
    }

    fun sacar(qntDinheiro: Double){

        if(qntDinheiro>saldo){
            return println("Saldo insuficiente")
        }else{
            saldo -= qntDinheiro
            return println("Transação realizada com sucesso! Saldo atual: R$ " + "%.2f".format(saldo))
        }

    }
}