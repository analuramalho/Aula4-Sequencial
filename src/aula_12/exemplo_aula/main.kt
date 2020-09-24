package aula_12.exemplo_aula

fun main(){
    //lista fixa
    val pessoas = listOf<String>("Ana","Luiza","Luiz")

   /* println("nº de elementos: ${pessoas.size}")
    println("segundo elemento: ${pessoas.get(2)}")
    println("busca elemento: ${pessoas.indexOf("Luiza")}")*/

    //permite adicionar mais elementos
    val pessoas1 = mutableListOf<String>("Ana","Luiza","Luiz")

    pessoas1.add("Paula")
    pessoas1.remove("Luiza")


    //cria lista de elementos unicos
    val animais= mutableSetOf<String>("Morcego","Baleia","Gato")

    animais.add("Gato")
    animais.add("Cachorro")

    println(animais.elementAt(2))

   /*
   val interator = animais.iterator()
    while(interator.hasNext()){
        println(interator.next())
    }*/

    /*
    for(i in  animais){
        println(i)
    }*/


    val pessoa= mutableMapOf<Int,String>(1 to "Felipe", 2 to "Ana", 3 to "Luiza")
    pessoa.put(4,"Maria")
    for((keys,values) in  pessoa){
        println(keys)
        println(values)
    }
    //ou

    pessoa.forEach{

    }
    if(!pessoa.containsKey(4)){
        pessoa.put(4,"Maria")
        //ou pessoa[4]="Maria"
    }
    println(pessoa[3])


}