import kotlin.random.Random

fun main() {

    //val correctNumber = 37
    val correctNumber = Random.nextInt(100)
    var win = false

    while (!win){
        println("Input number from 0 to 100: ")
        val number = readln().toInt()

        if (number < correctNumber){
            println("Your number is lower")
        }else if (number > correctNumber){
            println("Your number is higher")
        }else{
            win = true
            println("Your number is correct!!!")
        }
    }

}