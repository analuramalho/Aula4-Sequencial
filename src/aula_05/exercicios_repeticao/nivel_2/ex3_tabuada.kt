package aula_05.exercicios_repeticao.nivel_2

/*3. Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer
número inteiro entre 1 a 10. O usuário deve informar de qual número ele deseja ver
a tabuada. A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/
fun main(){
    print("digite o numero que deseja obter a tabuada: ")
    var num: Int = readLine()!!.toInt()


    for(i:Int in 1..10){
        var mult:Int = num*i
        println("$num x $i  = $mult")
    }


}