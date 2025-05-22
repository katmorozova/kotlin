fun main() {
var count = readln().toInt()



    println("Hello")
    count--

    do {
        println("Hello")
        count--
    } while(count > 0);

//Split
    val daysOfWeekAsString = "Monday, Tusday, Wednesday, Thursday, Friday, Saturday, sunday"
    val daysOfWeek = daysOfWeekAsString.split(", ")
    for (day in daysOfWeek){
        println(day)
    }
}