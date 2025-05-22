fun main() {
    println("Input number(1-12): ")
    val number = readln().toInt()

    val month = when (number) {
        1 -> "January"
        2 -> "February"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "Juny"
        7 -> "July"
        8 -> "Augost"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> ""
    }
    val months = when (number) {
        1,2,3 -> "January"
        4 -> "April"
        5 -> "May"
        6 -> "Juny"
        7 -> "July"
        8 -> "Augost"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> ""
    }

    if (number in 1 .. 12){
        println("You entered number $number wich corresponds the month of $month")
    }else{
        println("You entered number $number. There is no month with such a number")
    }
}