package aula_08.exercicio_aula

class ContaPoupanca(conta:Int,saldo:Double,private var limiteCredito:Double):ContaBancaria(conta,saldo),iImprimivel {

    override fun sacar(valor: Double):Boolean {
        if(valor>(saldo + limiteCredito)){
            println("Saldo e limite insuficiente\n ")
            return false

        }else {
            saldo -= valor
            println("Valor sacado foi R$"+"%.2f".format(valor)+"\n")
            /*println("Deseja ver o seu saldo atual ?(S/N)")

            var resposta = readLine()!!.toString().toUpperCase()
            if (resposta == "S") println("Saldo atual: R$ $saldo ")*/
            return true
        }
    }

    override fun depositar(valor: Double): Boolean {
        saldo+=valor
        println("Depositado com Sucesso")
        /*println("Deseja ver o seu saldo atual ?(S/N)")

          var resposta = readLine()!!.toString().toUpperCase()
          if (resposta == "S") println("Saldo atual: R$ $saldo ")*/
        return true
    }
    override fun mostrarDados() {
        super.mostrarDados()
        println("Limite de Credito: R$"+"%.2f".format( limiteCredito)+"\n")

    }
}