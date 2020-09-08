fun main(){
/*    1. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e
      mostre a temperatura em graus Celsius.
      C = 5 * ((F-32) / 9)*/
    println("Convertendo Fahrenheit em Celsius")
    print("Informe a temperatura em Fahrenheit: ")
    var F= readLine()!!.toDouble()
    var C = 5 * ((F-32) / 9)
    print(" $F ºF = $C ºC ")
}