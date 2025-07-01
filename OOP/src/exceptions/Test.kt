package exceptions

fun main() {
    try{
        val a = readln().toInt()
        val b = readln().toInt()
        println(a / b)
    }catch (exception: ArithmeticException){
        println("You can't divide by zero")
    }catch (exception: NumberFormatException){
        println("Wrong input")
    }catch (exception: Throwable){
        println("Common error")
    }

    try {
        val numbers = listOf(0, 1, 2, 3, 4)
        println(numbers[5])
    } catch (exception: ArrayIndexOutOfBoundsException){
        println("Wrong index")
    }

}