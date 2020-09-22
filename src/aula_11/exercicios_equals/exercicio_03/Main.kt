package aula_11.exercicios_equals.exercicio_03

fun main(){
    var Alunos=ArrayList<Aluno>()
    val aluno1=Aluno("Ana",123)
    val aluno2=Aluno("Luiza",456)
    val aluno3=Aluno("Maria",789)
    val aluno4=Aluno("Luiz",555)

    Alunos.add(aluno1)
    Alunos.add(aluno2)
    Alunos.add(aluno3)
    Alunos.add(aluno4)

    val aluno5=Aluno("Luiz",555)

    print(Alunos.contains(aluno5))
}