fun main() {
    val numbers1 = 0 .. 1000 //1000 entra en diapazon de vlaores
    val numbers2 = 0 until 1000 //1000 no entra en diapazon de vlaores
    val numbers3 = 0 until 1000 step 10//1000 no entra en diapazon de vlaores y muestra numeros de paso en 10

    for(number in numbers3){
        println(number)
    }

}