package corporation

fun main() {
    /*
    val assistant: corporation.Assistant = corporation.Assistant()
    assistant.bringCoffee(5, "cafe con leche")

     */
/*
    println("Input name: ")
    val name = readln()
    println("Input brand: ")
    val brand = readln()
    println("Input size: ")
    val size = readln().toFloat()
    println("Input price: ")
    val price = readln().toInt()

 */

    //val productCard = corporation.ProductCard(brand = brand,name = name,size = size,price = price)
    //productCard.init(name,brand,size,price)
   // productCard.init(brand = brand,name = name,size = size,price = price)//cuando ponemos en orden diferente tenemos que recalcar que pertenece a mismo nombre de variable

    //productCard.printInfo()

    //val assistant = corporation.Assistant()
    //assistant.bringCoffee()
/*
    val consultant: Worker = Consultant("Max", 34)
    (consultant as Consultant).sayHello()

    val director: Worker = Director("Tony", 45)
    val assistant: Worker = Assistant("John")
    (assistant as Assistant).bringCoffee()
    (director as Director).takeCoffee(assistant as Assistant)
    consultant.clientIsServed()
    director.work(consultant)
 */

    //val director: Director = Director(0,"Tony", 45)
    //val consultant: Consultant = Consultant(3,"Max", 34)
    //val assistant: Assistant = Assistant(2, "John", 23)

   // val employees = listOf<Any>(director, consultant, assistant, "Hello")//todos los clases en Kotlin se heredan de clase Any
    /*
    val employees = listOf<Worker>(director, consultant, assistant, accountant)
    for(employee in employees){
        employee.work()
    }
     */

/*
    val shoes: Shoes = Shoes("bambas", "nike", 34f, 232)
    val food: Food = Food("platano", "canarias", 212f, 3)
    val appliances: Appliances = Appliances("secador", "dayson", 34.3f, 232 )
    shoes.printInfo()
    food.printInfo()
    appliances.printInfo()

 */
    //val repository = WorkersRepository
    //println("Creating accountant")
    val workers = WorkersRepository.employees
    for(worker in workers){
        worker.work()
    }

    //val accountant = Accountant(1, name = "Helen", 34, 60000)
    //println(accountant.toString())
    //accountant.work()
   /*
    val workers = accountant.loadAllWorkers()
    for (worker in workers){
        if (worker is Cleaner){
            worker.clean()
        }
        if(worker is Supplier){
            worker.buyThings()
        }
        //worker.work()
    }

    */
    //accountant.work()



}