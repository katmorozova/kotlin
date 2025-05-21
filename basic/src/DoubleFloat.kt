fun main() {
    val countOfApples: Double = 10.0
    val countOfPeople: Float = 4.0f

    val result = countOfApples / countOfPeople
    println(result)


//HOMEWORK
    println("Input age first person:")
    val firstPerson = readln().toDouble()
    println("Input age second person:")
    val secondPerson = readln().toDouble()
    println("Input age third person:")
    val thirdPerson = readln().toDouble()

    val resultAges = (firstPerson + secondPerson + thirdPerson) / 3
    println(resultAges)

//HOMEWORK

    println("Input number: ")
    val firstNumber = readln().toDouble()
    println("Input symbol(+, -, * , /):")
    val symbol = readln()
    println("Input number: ")
    val secondNumber = readln().toDouble()
    if (symbol == "+"){
        val resultSum = firstNumber + secondNumber
        println(resultSum)
    } else if (symbol == "-"){
        val resultRest = firstNumber - secondNumber
        println(resultRest)
    } else if (symbol == "*"){
        val resultMultiple = firstNumber * secondNumber
        println(resultMultiple)
    } else if (symbol == "/"){
        val resultDiv = firstNumber / secondNumber
        println(resultDiv)
    }
}