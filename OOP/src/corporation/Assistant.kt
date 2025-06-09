package corporation

class Assistant(id: Int, name: String, age: Int): Cleaner(id = id, name = name, age = age, WorkerType.ASSISTANT) {

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