fun main() {

    var temperature = readln().toInt()
    var airConditionalIsOn = false

    if (temperature > 25){
        airConditionalIsOn = true
    }else if (temperature < 20){
        airConditionalIsOn = false
    }
    if(airConditionalIsOn){
        temperature -= 5
    } else {
        temperature += 5
    }
    println("Air conditional is on: $airConditionalIsOn")
    println("current temperature: $temperature")

    if (temperature > 25){
        airConditionalIsOn = true
    }else if(temperature < 20){
        airConditionalIsOn = false
    }
    if(airConditionalIsOn){
        temperature -= 5
    } else {
        temperature += 5
    }
    println("Air conditional is on: $airConditionalIsOn")
    println("current temperature: $temperature")
}