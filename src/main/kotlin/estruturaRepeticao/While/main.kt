package estruturaRepeticao.While

fun main(){
    var contador  = 0
    while (contador <= 6){
        println("O valor de contador é $contador")
        contador++
    }

    //Tambem podemos usar o do while
    var contador2  = 0
    do{
        println("O valor de contador é $contador2")
        contador2++
    }while (contador2 <= 6)
}