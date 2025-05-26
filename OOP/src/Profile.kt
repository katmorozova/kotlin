fun main() {
    val first: Person = Person()
    val second: Person = Person()

    println("Input 1st name")
    val firstName = readln()

    println("Input 2nd name")
    val secondName = readln()

    println("Input 1st age")
    val firstAge = readln().toInt()

    println("Input 2nd age")
    val secondAge = readln().toInt()

    println("Input 1st height")
    val firstHeight = readln().toInt()

    println("Input 2nd height")
    val secondHeight = readln().toInt()

    println("Input 1st weight")
    val firstWeight = readln().toInt()

    println("Input 2nd weight")
    val secondWeight = readln().toInt()

    first.init(name = firstName, age = firstAge, height = firstHeight, weight = firstWeight)
    first.init(name = secondName, age = secondAge, height = secondHeight, weight = secondWeight)

    //print("Name: $name\nAge: $age")
    print("Name: ${first.name}\nAge: ${first.age} \nAlture: ${first.height} \nWeight: ${first.weight}")
    print("Name: ${second.name}\nAge: ${second.age} \nAlture: ${second.height} \nWeight: ${second.weight}")

    first.printInfo()
    second.printInfo()

    first.sayHello()
    second.sayHello()

    //second.sayHello()
    //first.run()



}