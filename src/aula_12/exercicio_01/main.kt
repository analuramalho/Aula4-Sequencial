package aula_12.exercicio_01

fun main(){

    val loteriaSonhos= mapOf<Int,String>(
            0 to "Ovos",1 to "Água",
            2 to "Escopeta",3 to "Cavalo",
            4 to "Dentista",5 to "Fogo")

    val apelidosAmigos=mapOf(
            "João" to listOf<String>("Juan", "Fissura", "Maromba"),
            "Miguel" to listOf<String>("Night Watch", "Bruce Wayne", "Tampinha"),
            "Maria" to listOf<String>("Wonder Woman", "Mary", "Marilene"),
            "Lucas" to listOf<String>("Lukinha", "Jorge", "George")
    )

    loteriaSonhos.forEach{
        println("${it.key} -> ${it.value}")
    }

    apelidosAmigos.forEach{
        println("${it.key} -> ${it.value}")
    }


}