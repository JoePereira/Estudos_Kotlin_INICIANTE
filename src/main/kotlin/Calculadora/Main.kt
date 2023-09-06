package Calculadora

fun calculadora(operacao: String, numero1: Float, numero2: Float){

    val resultado = when(operacao){
        "adição" -> "O resultado da soma de $numero1 + $numero2 é: ${numero1 + numero2}"
        "subtração" -> "O resultado da soma de $numero1 + $numero2 é: ${numero1 - numero2}"
        "multiplicação" -> "O valor da multiplicação entre $numero1 e $numero2 é: ${numero1 * numero2}"
        "divisão" -> {
            if(numero2 == 0f){
                "Não é possível dividir por 0"
            }else {
                "O valor da divisão entre $numero1 e $numero2 é: ${numero1 / numero2}"
            }
        }
        else -> "Informe uma operação válida"
    }
    println(resultado)
}

fun main(){

    do{
        println("Informe a operação a ser feita (adição, subtração, multiplicação, divisão): ")
        val operacao = readln()
        println("Informe o primeiro numero (caso o valor não seja informado o valor será 0): ")
        val numero1 = readln().toFloatOrNull() ?: 0f
        println("Informe o segundo numero (caso o valor não seja informado o valor será 0): ")
        val numero2 = readln().toFloatOrNull() ?: 0f
        calculadora(operacao, numero1, numero2)

        println("Deseja fazer outra operação? (s/n)")
        val continuar = readln()
        val sairDoPrograma = when(continuar) {
            "s" -> false
            "n" -> true
            else -> false
        }
    }while (!sairDoPrograma)
    println("Muito obrigado por utilizar nossa calculadora")
}