fun main() {
    val family = listOf<String>("John", "Nick", "Marta")
    val john = family[0]
    println(john)

//HOMEWORK
    val names = listOf<String>("Lucia Hernandez", "Oscar Wald", "Violeta Rodriguez", "Nando Pando", "Paco Hormigon")
    val name = names[4]
    println(name)

//HOMEWORK

    val daysOfMonths = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    println("Input number of month")
    val index = readln().toInt()
    var dayOfMonth = daysOfMonths[index-1]

    if(index < 1 || index > 12){
        println("This number not exist!!!")
    }else{
        println(dayOfMonth)
    }
    /*
    var number = 0
    val numberOfMonth = readln().toInt()
    if (numberOfMonth == 1){
        number = numbers[0]
    }else if(numberOfMonth == 2){
        number = numbers[1]
    }else if(numberOfMonth == 3){
        number = numbers[2]
    }else if(numberOfMonth == 4){
        number = numbers[3]
    }else if(numberOfMonth == 5){
        number = numbers[4]
    }else if(numberOfMonth == 6){
        number = numbers[5]
    }else if(numberOfMonth == 7){
        number = numbers[6]
    }else if(numberOfMonth == 8){
        number = numbers[7]
    }else if(numberOfMonth == 9){
        number = numbers[8]
    }else if(numberOfMonth == 10){
        number = numbers[9]
    }else if(numberOfMonth == 11){
        number = numbers[10]
    }else if(numberOfMonth == 12){
        number = numbers[11]
    }else{
        println("This number not exist!!!")
    }
    println(number)

     */
}
