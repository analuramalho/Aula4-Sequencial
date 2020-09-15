package aula_07.ex03

fun main(){
    var atleta1: Atleta = Atleta("Maria")
        atleta1.energia=50
        atleta1.nível=50

    var atleta2: Atleta = Atleta("Ana")
    atleta2.energia=10
    atleta2.nível=10

    var prova1: Prova = Prova(50,50)
    var prova2: Prova = Prova(75,75)
    var prova3: Prova = Prova(100,100)
    var prova4: Prova = Prova(25,25)
    var prova5: Prova = Prova(15,15)
    var prova6: Prova = Prova(10,10)

    println(atleta1.nome)
    println(prova1.podeRealizar(atleta1))
    println(prova2.podeRealizar(atleta1))
    println(prova3.podeRealizar(atleta1))

    println(atleta2.nome)
    println(prova4.podeRealizar(atleta2))
    println(prova5.podeRealizar(atleta2))
    println(prova6.podeRealizar(atleta2))






}