package homeworks

fun main() {

    println("Input your age:")
    val userAge = readln().toInt()
    val age = 18
    val result = age - userAge

    repeat(result){
        if(userAge < age){
            println("Wait one year more!")
        }
    }
    println("You can go to the cinema")




    println("Input your age:")
    var userAgeWhile = readln().toInt()

    while (userAgeWhile < age){
            println("Wait one year more!")
            userAgeWhile++
    }
    println("You can go to the cinema")

}