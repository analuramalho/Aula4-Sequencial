package aula_05.exercicios_decisao.nivel_2
/*
2. Faça um Programa para um caixa eletrônico. O programa deverá perguntar ao
usuário a valor do saque e depois informar quantas notas de cada valor serão
fornecidas. As notas disponíveis serão as de 1, 5, 10, 50 e 100 reais. O valor
mínimo é de 10 reais e o máximo de 600 reais. O programa não deve se preocupar
com a quantidade de notas existentes na máquina.
Exemplo 1: Para sacar a quantia de 256 reais, o programa fornece duas notas de
100, uma nota de 50, uma nota de 5 e uma nota de 1;
Exemplo 2: Para sacar a quantia de 399 reais, o programa fornece três notas de
100, uma nota de 50, quatro notas de 10, uma nota de 5 e quatro notas de 1.
Quanto você quer sacar? 425
4 notas de 100
2 notas de 10
1 notas de 5
*/


fun main(){
    var valor: Int
    do{
        print("Digite o valor que será sacado : ")
        valor = readLine()!!.toInt()

        if(valor in 10..600){
            break
        }
        print("Valor invalido! Saque é permitido apartir de R$10,00 ate R$600,00")
    }while(true)

    var nota100=valor/100
    valor = valor%100

    var nota50=valor/50
    valor = valor%50

    var nota10=valor/10
    valor = valor%10

    var nota5=valor/5
    valor = valor%5
    if(nota100>0){
        println("$nota100 notas de R$100 ")
    }
    if(nota50>0){
        println("$nota50 notas de R$50 ")
    }
    if(nota10>0){
        println("$nota10 notas de R$10 ")
    }
    if(nota5>0){
        println("$nota5 notas de R$5 ")
    }
    if(valor>0){
        println("$valor notas de R$1")
    }

}