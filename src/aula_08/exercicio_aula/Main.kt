package aula_08.exercicio_aula

fun main() {
    val banco = Banco()

    println("Bem vindo!")
    menuPrincipal(banco)
}

fun menuPrincipal(banco: Banco) {
    println("--- Menu Principal---")
    do {
        println(
                "\n 1- Criar conta \n" +
                "2- Selecionar uma conta \n" +
                "3- Remover uma conta \n" +
                "4- Gerar relatório das suas contas \n" +
                "5- Finalizar aplicação \n"
        )

        mensagem()
        var respostaPrincipal: Int = readLine()!!.toInt()

        when (respostaPrincipal) {
            1 -> criarConta(banco)
            2 -> selecionarConta(banco)
            3 -> removerConta(banco)
            4 -> {
                val relatorio = Relatorio()
                relatorio.gerarRelatorio(banco)
            }
            5 -> {
                println("Sessão Finalizada!")
                break
            }
            else -> {
                println("Opção inválida!")
            }
        }

    } while (true)
}

fun menuConta(banco: Banco, conta: ContaBancaria) {
    do {
        println("--- Menu Operações Conta ---")

        println(
                "\n 1- Depositar \n" +
                "2- Sacar \n" +
                "3- Transferir \n" +
                "4- Mostrar dados da conta \n " +
                "5- Voltar ao menu inicial "
        )

        mensagem()
        var resposta = readLine()!!.toInt()
        when(resposta) {
            1 -> {
                print("Informe o valor a ser depositado: ")
                var valorDeposito = readLine()!!.toDouble()
                conta.depositar(valorDeposito)
            }
            2 -> {
                print("Informe o valor a ser sacado: ")
                var valorSaque = readLine()!!.toDouble()
                conta.sacar(valorSaque)
            }
            3 -> {
                do {
                    print("Informe o número da conta destino da transferência" +
                            "(ou digite zero para voltar ao menu ) : ")
                    val numContaTransf = readLine()!!.toInt()

                    if(numContaTransf == 0) break

                    val contaTransf = banco.procurarConta(numContaTransf)
                    if(contaTransf == null) {
                        println("Conta inexistente")
                    } else {
                        print("Informe o valor da transferência: ")
                        val valorTransf = readLine()!!.toDouble()

                        conta.transferir(valorTransf, contaTransf)
                    }
                } while (true)

            }
            4 -> {
                val relatorio = Relatorio()
                relatorio.gerarRelatorio(conta)
            }
            5 -> {
                break
            }
            else -> {
                println("Opção inválida!")
            }
        }

    } while (true)
}

fun criarConta(banco: Banco) {
    do {
        println("Que tipo de conta você deseja criar? \n" +
                "1- Conta corrente \n" +
                "2- Conta poupança \n" +
                "3- Voltar ao menu anterior")

        mensagem()
        var opConta = readLine()!!.toInt()

        when(opConta) {
            1, 2 -> {
                print("Informe o número da sua nova conta: ")
                var numConta = readLine()!!.toInt()

                if(numConta <= 0) {
                    println("O número da conta deve ser maior que zero!")
                    continue
                }

                var contaPesquisa = banco.procurarConta(numConta)
                if( contaPesquisa != null) {
                    println("Atenção! Ja existe uma conta bancária com este número!")
                    continue
                }

                if(opConta == 1) {
                    print("Informe a taxa de operação da conta: ")
                    var taxaOperacao = readLine()!!.toDouble()

                    var conta = ContaCorrente(numConta,saldo=0.0,taxaOperacao)
                    banco.inserirConta(conta)

                    println("Conta corrente criada com sucesso!")
                } else {
                    print("Digite o limite da conta: ")
                    var limiteCredito = readLine()!!.toDouble()

                    var conta = ContaPoupanca(numConta, saldo=0.0,limiteCredito)
                    banco.inserirConta(conta)

                    println("Conta poupança criada com sucesso!")
                }
                break
            }
            3 -> {
                break
            }
            else -> {
                println("Digite um valor válido!")
            }
        }
    } while (true)
}

fun selecionarConta(banco: Banco) {
    do {
        print("Informe o número da sua conta, ou digite 0(zero) para voltar ao menu anterior: ")
        var numConta = readLine()!!.toInt()

        if(numConta == 0) {
            break
        } else {
            var conta = banco.procurarConta(numConta)

            if (conta == null) {
                println("Conta inexistente! Verifique o numero da conta e tente novamente!")
            } else {
                menuConta(banco, conta)
                break
            }
        }
    } while(true)
}

fun removerConta(banco: Banco) {
    do {
        print("Informe o número da conta a ser removida " +
                "(ou digite 0 (ZERO) para voltar ao menu inicial) : ")
        val numConta = readLine()!!.toInt()

        if(numConta == 0) {
            break
        }

        val contaPesquisa = banco.procurarConta(numConta)
        if(contaPesquisa == null) {
            println("Conta inexistente! Verifique o numero da conta e tente novamente!")
        } else {
            banco.removerConta(contaPesquisa)
            println("Conta removida com sucesso!")

            break
        }
    } while(true)
}

fun mensagem() {
    print("Digite o número da ação que deseja realizar: ")
}