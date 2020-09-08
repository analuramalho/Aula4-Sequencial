fun main(){
/*3. Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que
calcule seu peso ideal, utilizando as seguintes fórmulas:
Para homens: (72.7 * h) - 58
Para mulheres: (62.1 * h) - 44.7*/

    println("Calcula Peso Ideal")
    print("Infome a sua altura: ")
    var h: Double = readLine()!!.toDouble()
    var pesoM=(62.1 * h) - 44.7
    var pesoH=(72.7 * h) - 58
    println("Para homens: " + "%.2f".format(pesoH))
    println("Para mulheres: " + "%.2f".format(pesoM))
}