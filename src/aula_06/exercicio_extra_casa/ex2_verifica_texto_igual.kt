package aula_06.exercicio_extra_casa

/*2) Escrever o código que deve analisar duas cadeias de texto e, caso sejam
diferentes, retornar true, ou, caso sejam iguais, retornar false.
*/

fun comparaTexto(txt1:String,txt2:String) = (txt1!=txt2)

fun main(){
    print(comparaTexto("Ana","Luiza"))
}