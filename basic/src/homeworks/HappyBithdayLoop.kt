package homeworks

fun main() {
    println("How old are you?")
    var age = readln().toInt()

    repeat(age){
        println("Happy birthday!")
    }
}
