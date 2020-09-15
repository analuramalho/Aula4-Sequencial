package aula_07.ex02

class SessaoDeTreinamento {
    var experiencia:Int = 1

    fun treinarA(jogador:JogadorDeFutebol){
        jogador.correr()
        jogador.fazerGol()
        jogador.correr()

        println("Experiencia anterior: ${jogador.experiencia}")
        jogador.experiencia+=experiencia
        println("Experiencia atual: ${jogador.experiencia}")
    }
}