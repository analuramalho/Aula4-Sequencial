package aula_08.exemplo_aula

open class Animal(val raca:String ){
    var idade=0
    open fun comer(){}
    open fun falar() {
        print("o animal esta se comunicando com vc ")
    }
}