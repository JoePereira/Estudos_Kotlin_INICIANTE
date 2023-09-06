package Arrays.ArrayMutavel

fun main(){
    //Criando uma lista mútavel de numeros inteiros vazia
    val numeros = mutableListOf<Int>()

    var contNumeros = 1

    do{
        // o .add adiciona valores a variável
        numeros.add(contNumeros)
        contNumeros++
    }while(contNumeros < 6)
    println("Lista de números: $numeros")

    // o .removeAt remove o valor da variável no indice escolhido
    numeros.removeAt(2)
    println(println("Lista de números após remoção: $numeros"))
}