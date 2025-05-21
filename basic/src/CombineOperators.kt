fun main() {
    println("The weather is good? true/false: " )
    val isGoodWeather = readln().toBoolean()
    println("What time is it?")
    val time = readln().toInt()
    val isDay = time < 22 && time > 5//false
    val isNight = time >=22 || time <= 5

    if(!isNight && isGoodWeather){
        println("Go for  a wolk")
    }else if(isDay){
        println("Go to read book")
    }else{
        println("Go to sleep")
    }
}