package aula_06.exercicios_array.nivel_2

/*1. Uma empresa de pesquisas precisa tabular os resultados da seguinte enquete
feita a um grande quantidade de organizações:

Você foi contratado para desenvolver um programa que leia o resultado da enquete
e informe ao final o resultado da mesma. O programa deverá ler os valores até ser
informado o valor 0, que encerra a entrada dos dados. Não deverão ser aceitos
valores além dos válidos para o programa (0 a 6). Os valores referentes a cada uma
das opções devem ser armazenados num vetor. Após os dados terem sido
completamente informados, o programa deverá calcular a percentual de cada um
dos concorrentes e informar o vencedor da enquete. O formato da saída foi dado
pela empresa, e é o seguinte:
*/


fun main() {
    //crio o array para armazenar a votação
    var votacao = ArrayList<Int>(5)
    //enquanto o voto for diferente de zero(sair) continua perguntando
    do {
        //pergunta
        print(
            "Qual o melhor Sistema Operacional para uso em servidores?\n" +
                    "As possíveis respostas são:\n" +
                    "1- Windows Server\n" +
                    "2- Unix\n" +
                    "3- Linux\n" +
                    "4- Netware\n" +
                    "5- Mac OS\n" +
                    "6- Outro\n"
        )
        /*considerando cada numero da pergunta como cada posicao do array
        * posicao[0] = 1- Windows Server
        * posicao[1] = 2- Unix
        * posicao[2] = 3- Linux
        * posicao[3] = 4- Netware
        * posicao[4] = 5- Mac OS
        * posicao[5] = 6- Outro  */

        //recebe a resposta do usuario na variavel voto
        var voto: Int = readLine()!!.toInt()

        //gera itens no array votação com valor inicial zero
        while (votacao.size < 6) {
            votacao.add(0)
        }
        //se a entrada do usuario for menor que 0 e maior que 6 a opção é invalida
        if (voto < 0 || voto > 6) {
            println("Opção Invalida")
        }
        //se o voto for 1 ele alimenta a posição[0] do array e assim por diante
        else if (voto == 1) {
            votacao[0]++
        } else if (voto == 2) {
            votacao[1]++
        } else if (voto == 3) {
            votacao[2]++
        } else if (voto == 4) {
            votacao[3]++
        } else if (voto == 5) {
            votacao[4]++
        } else if (voto == 6) {
            votacao[5]++
        }
    } while (voto != 0)

    /* var windows=votacao[0]
     var unix=votacao[0]
     var windows=votacao[0]
     var windows=votacao[0]
     var windows=votacao[0]
     var windows=votacao[0]*/

    var total=votacao[0]+votacao[1]+votacao[2]+votacao[3]+votacao[4]+votacao[5]

    println("Sistema Operacional Votos %")
    println("------------------- ----- ---")
    println("Windows Server      $votacao[0]  0%")
    println("Unix                $votacao[1]  0%")
    println("Linux               $votacao[2]  0%")
    println("Netware             $votacao[3]  0%")
    println("Mac OS              $votacao[4]  0%")
    println("Outro               $votacao[5]  0%")
    println("-------------------   -----")
    println("Total               $total\n")
    print("O Sistema Operacional mais votado foi o 'mais votado', com 'n votos' votos,\n" +
            "correspondendo a '%' dos votos.")
}
