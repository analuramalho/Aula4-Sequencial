package aula_05.exercicios_decisao.nivel_1

/*3. Faça um programa para a leitura de duas notas parciais de um aluno. O
programa deve calcular a média alcançada por aluno e apresentar:
A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez.*/

fun media(){

    val NOTA_MAX: Double =10.00
    val NOTA_MED: Double =7.00

    println(" Media aluno ")
    print("digite a 1º nota ")
    val nota1 = readLine()!!.toDouble()

    print("digite a 2º nota ")
    val nota2 = readLine()!!.toDouble()

    val media: Double = (nota1 + nota2)/2
    if(media == NOTA_MAX){
        print("APROVADO COM DISTINÇÃO")
    }else if(media<NOTA_MED){
        print("REPROVADO")
    } else if(media>=NOTA_MED){
        print(" APROVADO")
    }
}