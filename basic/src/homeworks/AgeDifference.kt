package homeworks

fun main(){

    println("How old is Person1 ?")
    val person1: Int = readln().toInt()
    println("How old is Person2 ?")
    val person2: Int = readln().toInt()

    val rest = person1 - person2
    println("Diference of ages is: $rest")
}