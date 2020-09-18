package aula_08.exercicio_aula

class ContaCorrente(conta:Int,saldo:Double,private val taxaDeOperacao:Double): ContaBancaria(conta,saldo),iImprimivel{

    override fun sacar(valor: Double):Boolean {

        if(valor>(saldo-taxaDeOperacao)){
            print("saldo insuficiente\n")
            return false
        }else{
            saldo-=taxaDeOperacao+valor
            println("Valor sacado foi R$"+"%.2f".format(valor)+"\n")
            /*println("Deseja ver o seu saldo atual ?(S/N)")

            var resposta = readLine()!!.toString().toUpperCase()
            if (resposta == "S") println("Saldo atual: R$ $saldo ")*/

            return true

        }


    }

    override fun depositar(valor: Double):Boolean {
        saldo+=valor-taxaDeOperacao
        println("Depositado com Sucesso")
        /*println("Deseja ver o seu saldo atual ?(S/N)")
          var resposta = readLine()!!.toString().toUpperCase()

          if (resposta == "S") println("Saldo atual: R$ $saldo ")*/
        return true
    }

    override fun mostrarDados() {
        super.mostrarDados()
        println("Taxa(aplicada no saque e deposito): R$"+"%.2f".format(taxaDeOperacao)+"\n")
    }
}