package aula_05.exercicios_decisao.nivel_1

/*1. Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a
letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
*/

fun main(){
    println(" Feminino ou Masculino ")
    print("digite seu sexo(F/M)")
    val sexo = readLine()!!.toUpperCase()

    if(sexo.equals("F")){
        print(" F - Feminino")
    }else if(sexo.equals("M")){
        print("M - Masculino")
    } else{
        print("Sexo Inválido")
    }

}