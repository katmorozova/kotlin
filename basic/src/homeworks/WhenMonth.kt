package homeworks

fun main() {
    println("Input month")
    val month = readln()

    val season = when(month) {
        "December", "January", "February" -> "Winter"
        "March", "Abril", "May" -> "Spring"
        "Juny", "July", "Augost" -> "Summer"
        "September", "October", "November" -> "Autumn"
        else -> ""
    }
    if (season == ""){
        println("There is no season with such a month")
    }else{
        println("Season: $season")
    }

}