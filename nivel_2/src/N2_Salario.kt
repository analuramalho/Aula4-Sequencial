
fun main(){
/*  2. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
    Calcule e mostre o total do seu salário no referido mês,
    sabendo-se que são descontados 11% para o Imposto de Renda, 8% para o INSS e
    5% para o sindicato, faça um programa que nos dê:
    salário bruto.
    quanto pagou ao INSS.
    quanto pagou ao sindicato.
    o salário líquido.
    calcule os descontos e o salário líquido, conforme a tabela abaixo:
    */

    print("Informe o número de horas trabalhadas: ")
    val horasTrabalhadas = readLine()!!.toDouble()
    print("Informe o salario por hora(valor/hora): ")
    val valorHora = readLine()!!.toDouble()


    val salarioBruto :Double = horasTrabalhadas*valorHora
    val descIR : Double = salarioBruto * 11/100
    val descINSS : Double = salarioBruto * 8/100
    val descSindicato : Double = salarioBruto * 5/100
    val salarioLiquido : Double = salarioBruto - descIR - descINSS - descSindicato

    println("+ Salário Bruto: R$ $salarioBruto")
    println("- IR (11%): R$ $descIR")
    println("- INSS (8%): R$ $descINSS")
    println("- Sindicato (5%) : R$ $descSindicato")
    println("= Salário Líquido: R$ $salarioLiquido")
}