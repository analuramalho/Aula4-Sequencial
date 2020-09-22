package aula_11.exercicios_exception.exercicio_03

class CalculoMatematico {
    fun divisao(num1:Int, num2:Int): Int {
        if (num2==0){
            throw ArithmeticException("Não é possivel divisão por zero")
        }
        return num1/num2
    }
}