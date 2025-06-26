package corporation

import kotlin.random.Random

data class Consultant(
    override val id: Int,
    override val name: String,
    override val age: Int,
    override val salary: Int
): Worker(id = id, name = name, age = age, salary, WorkerType.CONSULTANT), Cleaner {

    override fun copy(salary: Int, age: Int): Consultant {
        return Consultant(this.id, this.name, age, salary)
    }

    override fun clean() {
        println("My position is Consultant. I'm cleaning workplace...")
    }

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