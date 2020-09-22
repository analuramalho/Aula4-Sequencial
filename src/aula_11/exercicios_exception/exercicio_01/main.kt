package aula_11.exercicios_exception.exercicio_01

fun main(){
    var array=ArrayList<String>()
    array.add("Pato")
    array.add("Cachorro")
    array.add("Gato")
    try {
        print(array[3])
    }catch(ex:IndexOutOfBoundsException){
       ex.printStackTrace()
    }
}
