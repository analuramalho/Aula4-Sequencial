package aula_05.exercicios_decisao.nivel_2

/*Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. Asperguntas são:"Telefonou para a vítima?"
"Esteve no local do crime?""Mora perto da vítima?""Devia para a vítima?""Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoano crime.
Se a pessoa responder positivamente a 2 questões ela deve serclassificada como "Suspeita", entre 3 e 4 como "Cúmplice" e
 5 como "Assassino".Caso contrário, ele será classificado como "Inocente".Use “S” para sim e “N” para não.*/

fun main(){
    var contador: Int = 0
    println(" Responda as perguntas sobre o crime: ")
    print(" 1) Telefonou para a vítima?(S/N)")
    var primeira: String= readLine()!!.toString().toUpperCase()
    print(" 2) Esteve no local do crime? (S/N)")
    var segunda: String= readLine()!!.toString().toUpperCase()
    print(" 3) Mora perto da vítima?(S/N)")
    var terceira: String= readLine()!!.toString().toUpperCase()
    print(" 4) Devia para a vítima? (S/N)")
    var quarta: String= readLine()!!.toString().toUpperCase()
    print(" 5) Já trabalhou com a vítima?(S/N)")
    var quinta: String= readLine()!!.toString().toUpperCase()

    if(primeira=="S") contador++
    if(segunda=="S") contador++
    if(terceira=="S") contador++
    if(quarta=="S") contador++
    if(quinta=="S") contador++

    when(contador ){
        1,2 -> print("Suspeita")
        3,4 -> print("Cúmplice")
        5 -> print("Assassino")
        else -> print("Inocente")
    }

}