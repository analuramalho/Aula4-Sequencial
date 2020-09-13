package aula_05

fun main(){
//pede numeros e para quando for impar
    println("Digite um número")
    var num = readLine()!!.toInt()
//while
    while(num%2==0){
        println("Ainda é par")
        println("Digite um número")
        num = readLine()!!.toInt()
    }

//do .. while
    do{
        println("Digite um número")
        var num = readLine()!!.toInt()

        var ehPar = num%2==0

        if(ehPar){
            println("Ainda é par")
        }

    }while(ehPar)
    println("Agora é impar")

//deixando menos verboso
    do{
        println("Digite um número: ")
        var num = readLine()!!.toInt()
        if(num % 2 == 0){
            break
        }
        println("Ainda é par")
    }while(true)
    println("Agora é impar")


    //programa para que ele aceita apenas entre 0 e 1000
    do{
        println("Digite um número: ")
        var num = readLine()!!.toInt()
        if(num in 1..999){ //if(num > 0 && num<1000)
            break
        }
        println("Ainda é par")
    }while(true)

}