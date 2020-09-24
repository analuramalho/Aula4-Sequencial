package aula_12.exercicio


fun main(){
    val SP=  Estado("SP","São Paulo")
    val RJ = Estado("RJ","Rio de Janeiro")
    val MG = Estado("MG","Minas Gerais")

    val pessoa1 = Pessoa("Pessoa1",MG)
    val pessoa2 = Pessoa("Pessoa2",SP)
    val pessoa3 = Pessoa("Pessoa3",MG)
    val pessoa4 = Pessoa("Pessoa4",RJ)
    val pessoa5 = Pessoa("Pessoa5",SP)
    val pessoa6 = Pessoa("Pessoa6",MG)
    val pessoa7 = Pessoa("Pessoa7",RJ)



    val pessoas= listOf<Pessoa>(pessoa1,pessoa2,pessoa3,pessoa4,pessoa5,pessoa6,pessoa7)

   /* val pessoasPorEstado=mutableMapOf<String,MutableList<Pessoa>>()

    pessoas.forEach{
        if(!pessoasPorEstado.containsKey(it.estado.sigla)){
            pessoasPorEstado[it.estado.sigla]= arrayListOf()
        }
        pessoasPorEstado[it.estado.sigla]!!.add(it)
    }

    println(pessoasPorEstado)*/

    println(pessoas.groupBy{it.estado.sigla})

    val pessoasPorEstado = pessoas.groupByTo(mutableMapOf()) { it.estado.sigla }

}


