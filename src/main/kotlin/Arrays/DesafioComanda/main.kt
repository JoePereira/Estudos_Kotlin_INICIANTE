package Arrays.DesafioComanda

fun main(){
    // variaveis para controle de preço e quantidade de produtos
    var price = 0.0
    var productsQTD = 0
    val products = arrayOf("Coxinha", "Cerveja")

    // variaveis com os preços dos produtos
    val coxinha = 5.00
    val cerveja = 15.00

    var qtdCoxinhas = 0
    var qtdCervejas = 0

    do{
        println("Você gostaria de pedir coxinha ou cerveja? ")
        val productInput = readln()


        println("Informe a quantidade de ${productInput}s")
        val productsQTDInput = readln().toInt()

        when(productInput){
            "coxinha" -> qtdCoxinhas += productsQTDInput
            "cerveja" -> qtdCervejas += productsQTDInput
            else -> println("Produto invalido")
        }

        println("Gostaria de pedir algo mais? (s/n)")
        val continuar = readln()
        val sair = when(continuar){
            "s" -> false
            "n" -> true
            else -> false
        }
    }while(!sair)

    productsQTD += qtdCervejas + qtdCoxinhas
    val priceCoxinhas = qtdCoxinhas * coxinha
    val priceCervejas = qtdCervejas * cerveja
    price += priceCoxinhas + priceCervejas
    val taxa = price * 0.1

    println("-----------------------------")
    println("$qtdCoxinhas ${products[0]}s      R$ $priceCoxinhas")
    println("$qtdCoxinhas ${products[1]}s      R$ $priceCervejas")
    println("Somatória       R$ $price")
    println("Taxa 10%        R$ $taxa")
    println("-----------------------------")
    println("Conta Final     R$ ${price + taxa}")

}