package Arrays.PercorrendoArrays

fun main(){
    val arrayNumeros = intArrayOf(2, 4, 5, 8, 10, 9, 7)
    var contador = 1
    for(numero in arrayNumeros){
        println("O $contador º número é: $numero")
        contador++
    }
}