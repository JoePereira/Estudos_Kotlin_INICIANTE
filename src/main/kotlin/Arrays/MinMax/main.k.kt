package Arrays.MinMax

fun main(){
    val numbers = intArrayOf(8, 3, 12, 6, 20, 33, 58, 2)
    var min = numbers[0]
    var max = numbers[0]

    for(number in numbers){
        if(number < min){
            min = number
        }
        if(number > max){
            max = number
        }
    }
    println("O menor valor é: $min")
    println("O maior valor é: $max")
}