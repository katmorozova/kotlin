package homeworks

fun main() {
    println("How much money do you have?")
    val money = readln().toInt()
    println("Are you hungry? true/false:")
    val hungry = readln().toBoolean()

    if(hungry && money > 50){
        println("Order to pizza")
    } else if(hungry &&  money < 50){
        println("Eat pasta")
    } else if(!hungry && money > 50){
        println("Go to the cinema")
    } else if(!hungry && money < 50){
        println("Go to walk")
    }
}