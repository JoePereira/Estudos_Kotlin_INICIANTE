package Arrays.SomaDePareImpares

fun main(){
    val pares = intArrayOf(2, 4, 6, 8, 10)
    val impares = intArrayOf(1, 3, 5, 7, 9)
    val somas =  IntArray(5)
    var contador = 0
    do{
        somas[contador] = pares[contador] + impares[contador]
        println("A soma ente ${pares[contador]} e ${impares[contador]} é: ${somas[contador]}")
        contador++
    }while(contador < somas.size)
}