fun main() {
    println("Input en expression: ")
    val expression = readln().split("")
    val symbol = expression[1]
    val firstNumber = expression[0].toDouble()
    val secondNumber = expression[2].toDouble()
    var result = 0.0

    if (symbol == "+"){
        result = firstNumber + secondNumber
    } else if (symbol == "-"){
        result = firstNumber - secondNumber
    } else if (symbol == "*"){
        result = firstNumber * secondNumber
    } else if (symbol == "/"){
        result = firstNumber / secondNumber
    }
    println("$firstNumber $symbol $secondNumber = $result")
}