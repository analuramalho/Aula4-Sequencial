package aula_11.exemplo_aula.equals

class Time(val nome:String,val quantidade:Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Time

        if (nome != other.nome) return false
        if (quantidade != other.quantidade) return false

        return true
    }

    override fun hashCode(): Int {
        var result = nome.hashCode()
        result = 31 * result + quantidade
        return result
    }

    override fun toString(): String {
        return "Time(nome='$nome', quantidade=$quantidade)"
    }

}
//ou tudo isso pode ser substituido por data class
//data class Time(val nome:String,val quantidade:Int)