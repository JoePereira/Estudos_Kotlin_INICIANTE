package condicionais.If

fun main() {
    val nomes = arrayOf("Joao", "Maria", "Jesus", "Leticia")
    val nomeEscolhido = "Jesus"

    for(nome in nomes){
        if(nome == nomeEscolhido){
            println("O nome: $nome foi encontrado")
        }else{
            println("O nome $nome não é igual ao $nomeEscolhido")
        }

    }
}