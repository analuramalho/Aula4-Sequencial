package aula_08.exercicio_aula

abstract class ContaBancaria(val conta:Int, protected var saldo:Double): iImprimivel {

    abstract fun sacar(valor:Double): Boolean
    abstract fun depositar(valor:Double): Boolean


    override fun mostrarDados() {
        println("Conta: $conta \nSeu saldo atual R$"+"%.2f".format(saldo)+"\n")
    }

    fun transferir(valor: Double, destino: ContaBancaria) {
        val saldoContaOrigem = saldo
        if (!sacar(valor) || !destino.depositar(valor)) {
            saldo = saldoContaOrigem
            println("Não foi possivel realizar a transferencia")
        }else{
            println("Transferencia Realizada")
        }
    }

}