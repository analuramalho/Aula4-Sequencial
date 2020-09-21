package aula_10.resolucao_ex01_prof

class Aluno(nome:String, registro:String, val sobrenome:String):Pessoa(nome, registro){

    override val podeAssistirAula get() = true
    override val fazerLicaoDeCasa get() = true
}