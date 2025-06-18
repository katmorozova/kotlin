package corporation

class Director (
    id: Int,
    name: String,
    age: Int,
    salary: Int
): Worker(id = id, name = name, age = age, salary, WorkerType.DIRECTOR), Supplier {

    override fun copy(salary: Int, age: Int): Director {
        return Director(this.id, this.name, age, salary)
    }

    override fun buyThings() {
        println("My position is ${WorkerType.DIRECTOR}. I'm buying things...")
    }

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