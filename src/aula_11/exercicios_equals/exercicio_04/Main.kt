package aula_11.exercicios_equals.exercicio_04

fun main(){
        var ListaFuncionarios=ArrayList<Funcionario>()
        val funcionario1= Funcionario("Ana",123)
        val funcionario2= Funcionario("Luiza",456)
        val funcionario3= Funcionario("Maria",789)
        val funcionario4= Funcionario("Luiz",555)

        ListaFuncionarios.add(funcionario1)
        ListaFuncionarios.add(funcionario2)
        ListaFuncionarios.add(funcionario3)
        ListaFuncionarios.add(funcionario4)

        val funcionario5= Funcionario("Luiz",555)

        print(ListaFuncionarios.contains(funcionario5))
}