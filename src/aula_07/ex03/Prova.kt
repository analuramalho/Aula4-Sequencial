package aula_07.ex03

class Prova(var dificuldade: Int,var energiaNecessaria:Int) {

    fun podeRealizar(atleta: Atleta) = atleta.nível >= dificuldade && atleta.energia>=energiaNecessaria
}