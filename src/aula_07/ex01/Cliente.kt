package aula_07.ex01

class Cliente(val nome:String, val sobrenome:String) {
    var nomeCompleto:String

    init {
        nomeCompleto="$nome $sobrenome"
    }
}