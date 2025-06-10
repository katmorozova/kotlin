package corporation

import kotlin.random.Random

class Consultant(
    id: Int,
    name: String,
    age: Int
): Worker(id = id, name = name, age = age, WorkerType.CONSULTANT), Cleaner {

    fun sayHello(){
        if(age == 0){
            println("Hello! My name is $name.")
        }else{
            println("Hello! My name is $name. I´m $age years old.")
        }
    }

    fun clientIsServed(): Int {
        val count = Random.Default.nextInt(0, 100)
        repeat(count){
            println("The customer is served")
        }
        return count
    }

    override fun work() {
        println("Estoy ayudando con una consulta a un cliente")
    }
}