fun main() {

    var temperature = readln().toInt()
    var airConditionalIsOn = false

    repeat(10){
        if (temperature > 25){
            airConditionalIsOn = true
        }else if (temperature < 20){
            airConditionalIsOn = false
        }
        if(airConditionalIsOn){
            temperature -= 1
        } else {
            temperature += 1
        }
        println("Air conditional is on: $airConditionalIsOn")
        println("current temperature: $temperature")
    }



}