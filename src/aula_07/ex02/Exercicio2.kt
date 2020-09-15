package aula_07.ex02

fun main(){
    var jogador1: JogadorDeFutebol = JogadorDeFutebol("Pedro")
        jogador1.energia=100
        jogador1.alegria=50
        jogador1.experiencia=100


    var jogador2: JogadorDeFutebol = JogadorDeFutebol("Fernando")
            jogador2.energia= 50
            jogador2.alegria= 10
            jogador2.experiencia= 200

   // println("${jogador1.nome}, ${jogador2.nome}")

    var treino1:SessaoDeTreinamento = SessaoDeTreinamento()
    var treino2:SessaoDeTreinamento = SessaoDeTreinamento()


    println("Jogador: ${jogador1.nome}")
    treino1.treinarA(jogador1)
    println("Saldo de Gols: ${jogador1.gols}")
    println("Alegria:  ${jogador1.alegria}")
    println("Energia: ${jogador1.energia}\n")


    println("Jogador: ${jogador2.nome}")
    treino2.treinarA(jogador2)
    println("Saldo de Gols: ${jogador2.gols}")
    println("Alegria:  ${jogador2.alegria}")
    println("Energia: ${jogador2.energia}\n")



}