package homeworks

fun main() {
    val numbers = listOf<Int>(1,34,43,23,56,65,78,86,2,42)

    for (number in numbers){
        if (number % 2 == 0){
            println(number)
        }
    }
}