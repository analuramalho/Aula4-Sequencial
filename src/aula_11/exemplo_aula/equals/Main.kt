package aula_11.exemplo_aula.equals

fun main() {
    val time1 = Time("Fidelização ao cliente", 6)
    val time2 = Time("Fidelização ao cliente", 6)
    //val time2 = Time("Renda fixa", 1)

    //println(time1==time2)
    //println(time1.hashCode())
    //println(time2.hashCode())
    println(time1.toString() + "\n" + time2.toString()  )
}