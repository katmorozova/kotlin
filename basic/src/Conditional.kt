fun main() {
    val temperature = readln().toInt()
    if(temperature >= 25){
        println("The AC in On")
    }else if (temperature <= 20){
        println("The AC in Off")
    }else{
        println("The AC is idle")
    }
}