package homeworks

fun main() {

    val numbers = 0 .. 1000 step 2
    println("Input number(0-1000):")
    val number = readln().toInt()
    val result = number in numbers
    println(result)



}
