package corporation

class Director (name: String, age: Int): Worker(name = name, age = age) {

    fun takeCoffee(assistant: Assistant){
        val drink: String = assistant.bringCoffee()
        println("Thanks ${assistant.name}! The $drink is very tasty.")
    }


    fun getConsultantToWork(consultant: Consultant){
        val clients = consultant.clientIsServed()
        println("corporation.Consultant ${consultant.name} was served $clients")
    }

    override fun work(){
        println("I'm drink coffee.")
    }
}