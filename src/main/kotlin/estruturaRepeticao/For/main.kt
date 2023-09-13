package estruturaRepeticao.For

fun main(){
    val maxNum = 6
    // downTo -> modo decrescente
    for (i in maxNum downTo 1){
        println(i)
    }
    // step é utilizado para o "pulo" de um numeor para o proximo ou seja, no exemplo o nosso contader vai reduzzir de 2 em 2
    for (i in maxNum downTo 1 step 2){
        println(i)
    }

    // outra maneira de utilizar o loop for
    loop@ for (i in 1..100) {
        println("i $i")
        for (j in 1..100) {
            println("j $j")
            if (j == 5) break@loop
        }
    }
}