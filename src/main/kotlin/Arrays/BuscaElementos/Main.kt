package Arrays.BuscaElementos

fun main(){
    val nomes = arrayOf("Alice", "Bob", "Charlie", "David", "Emma")
    val searchName = "Charlie"
    var found = false

    for(nome in nomes){
        if(nome == searchName){
            found = true
            break
        }
    }
    if(found){
        println("Parabéns, o nome foi encontrado!")
    }else{
        println("Ops! O nome não foi encontrado")
    }
}