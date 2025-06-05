package corporation

class Director (id: Int, name: String, age: Int): Worker(id = id, name = name, age = age, WorkerType.DIRECTOR) {

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