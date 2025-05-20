fun main() {
    val a = 10
    val b = 3
    val result1 = a / b
    val result2 = a % b

    println(result1)
    println(result2)

    val seconds = readln().toInt()
    val hours = seconds /60/60
    val secondsForMinuts = seconds % 3600 //%60%60
    val minuts = secondsForMinuts / 60
    val leftSeconds = secondsForMinuts % 60
    println("$hours : $minuts : $leftSeconds")


}