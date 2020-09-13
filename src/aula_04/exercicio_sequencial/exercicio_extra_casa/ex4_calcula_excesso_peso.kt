package aula_04.exercicio_sequencial.exercicio_extra_casa
/*4. João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o
rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixes maior que o
estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar
uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que
leia a variável peso (peso de peixes) e calcule o excesso. Gravar na variável excesso a
quantidade de quilos além do limite e na variável multa o valor da multa que João deverá
pagar. Imprima os dados do programa com as mensagens adequadas*/

fun main(){
    println("Calcula Excesso de Peso  ")
    print("Digite o peso dos peixes ")
    var peso: Double = readLine()!!.toDouble()
    var pesoideal:Double = 50.00

    var excesso: Double =peso - pesoideal
    if(excesso<0)excesso=0.00
    var multa: Double =excesso * 4

    println("Excedeu $excesso Kg")
    print("O valor a ser pago é de R$ $multa")


}