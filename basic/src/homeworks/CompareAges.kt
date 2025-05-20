package homeworks

fun main() {
    val inputFirstPerson = "Input age first person"
    println(inputFirstPerson)
    val firstPerson = readln()
    val inputSecondPerson = "Input age first person"
    println(inputSecondPerson)
    val secondPerson = readln()

    if(firstPerson > secondPerson){
        println("Age of first person is big then second")
    }else if(firstPerson < secondPerson){
        println("Age of second person is big then first")
    } else{
        println("Ages the same")
    }
}