package aula_10.resolucao_ex01_prof

class Curso(val nome:String,val profResponsavel:Professor){
    val aulas get() =ArrayList<Aula>()
    val alunos get() =ArrayList<Aluno>()
}