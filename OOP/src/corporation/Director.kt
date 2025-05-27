package corporation

class Director (
    val name: String,
    val age: Int = 0
) {

    fun takeCoffee(assistant: Assistant){
        val drink: String = assistant.bringCoffee()
        println("Thanks ${assistant.name}! The $drink is very tasty.")
    }


    fun work(consultant: Consultant){
        val clients = consultant.clientIsServed()
        println("corporation.Consultant ${consultant.name} was served $clients")
    }
}