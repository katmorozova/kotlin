package corporation

data class Assistant(
    override val id: Int,
    override val name: String,
    override val age: Int,
    override val salary: Int): Worker(id = id, name = name, age = age,salary, WorkerType.ASSISTANT), Cleaner, Supplier {

    override fun copy(salary: Int, age: Int): Assistant {
        return Assistant(this.id, this.name, age, salary)
    }

    override fun clean() {
        println("My position is Assistant. I'm cleaning workplace...")
    }

    override fun buyThings() {
        println("My position is ${WorkerType.ASSISTANT}. I'm buying things...")
    }

    fun bringCoffee(count: Int = 1, drink: String = "Cafe con leche desoja"): String{
        repeat(count){
            println("Jefe ha pedido $drink")
            println("Tengo que levantar")
            println("Voy a buscar la maquina de cafe")
            println("Tengo que coger la taza")
            println("Tengo que poner la taza para cafe")
            println("No olvidar coger una capsula de cafe")
            println("Precionar boton de $drink")
            println("Coger pack de leche")
            println("Hechar leche en cafe")
            println("Llevar $drink a oficina de jefe")
        }
        return drink

    }

    override fun work() {
        println("Estoy seviendo cafe para jefe")
    }
}