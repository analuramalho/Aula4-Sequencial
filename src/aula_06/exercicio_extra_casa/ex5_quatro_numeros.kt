package aula_06.exercicio_extra_casa

/*5) Escrever um código que deve analisar quatro números inteiros e, caso numA
seja maior que numC e numD ou caso numB seja maior que numC e numD,
retornar true, caso contrário, retornar false.
*/
fun main(){
    print("Informe o numero(A): ")
    val numA = readLine()!!.toInt()
    print("Informe o numero(B): ")
    val numB = readLine()!!.toInt()
    print("Informe o numero(C): ")
    val numC = readLine()!!.toInt()
    print("Informe o numero(D): ")
    val numD = readLine()!!.toInt()

    if((numA>numC && numA>numD) || (numB>numC && numB>numD)) print(true)
    else print(false)
}
