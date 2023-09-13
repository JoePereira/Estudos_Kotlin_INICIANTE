package Condicionais.When

fun main(){
    do{
        println("Informe uma cor em português: ")
        val corIngles = when(val corInput = readln()){
            "vermelho" -> "A cor $corInput em ingles é Red"
            "azul" -> "A cor $corInput em ingles é Blue"
            "laranja" -> "A cor $corInput em ingles é orange"
            "marrom" -> "A cor $corInput em ingles é Brown"
            "preto" -> "A cor $corInput em ingles é Black"
            "branco" -> "A cor $corInput em ingles é white"
            else -> "A cor $corInput ainda não tem tradução em nosso programa"
        }
        println(corIngles)
        println("Deseja continuar? (s/n)")
        val continuar = readln()
        val sair = when(continuar){
            "s" -> false
            "n" -> true
            else -> true
        }
    }while (!sair)
    println("Obrigado por utilizar nosso programa!")
}
