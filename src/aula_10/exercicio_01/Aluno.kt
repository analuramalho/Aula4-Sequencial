package aula_10.exercicio_01

class Aluno( RA:Int,nome:String, val sobrenome:String){

    val podeAssistirAula get() = true
    val fazerLicaoDeCasa get() = true
}