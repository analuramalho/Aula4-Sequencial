package aula_10.exercicio_01

class Curso(val nome:String,val profResponsavel: Professor){
    val aulas get() =ArrayList<Aula>()
    val alunos get() =ArrayList<Aluno>()
}