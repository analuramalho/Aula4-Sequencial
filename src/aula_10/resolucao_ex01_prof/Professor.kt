package aula_10.resolucao_ex01_prof

class Professor(nome:String, registro:String):Pessoa(nome,registro) {

    override val podeDarAula get() = true

    override val fazerChamada get() = true

}
