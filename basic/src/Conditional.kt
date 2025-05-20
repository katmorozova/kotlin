fun main() {
    val temperature = readln().toInt()

    val hot = temperature > 25 // true
    val cold = temperature < 20 // true
    //if(temperature >= 25){
    if(hot){
        println("The AC in On")
    //}else if (temperature <= 20){
    }else if (cold){
        println("The AC in Off")
    }else{
        println("The AC is idle")
    }



}