package aula_11.exemplo_aula.exception

fun main(){
    try{
      val numeros = listOf("um","dois","tres")
        println(numeros.get(3))
   }catch(ex:Exception){
        println(ex.message)//ex message mostra um erro mais amigavel
    }
    //ou catch(ArrayIndexOutOfBoundsException){ ArrayIndexOutOfBoundsException -> tratativa de erro especifica
    //        println(ex.message)
    //    }
}