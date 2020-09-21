package aula_10.resolucao_ex01_prof

abstract class Pessoa(val nome:String, val registro:String ) {
    open val podeDarAula get() = false
    open val fazerChamada get() = false
    open val podeAssistirAula get() = false
    open val fazerLicaoDeCasa get() = false
}