package profile

fun main() {
    val person1 = Person("John", "Smith",174, 56)
    val person2 = Person("John", "Smith",174, 56)
    val person3 = person1.copy("Nick")

    val people = setOf(person1,person2,person3)

    for (person in people){
        println(person)
    }
/*
    println("Input 1st name")
    val firstName = readln()

    println("Input 2nd name")
    val secondName = readln()

    println("Input 1st lastname")
    val firstLastName = readln()
    println("Input 2nd lastname")
    val secondLastName = readln()

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

    val first: Person = Person(name = firstName, lastName = firstLastName, height = firstHeight, weight = firstWeight)
    val second: Person = Person(name = secondName, lastName = secondLastName, height = secondHeight, weight = secondWeight)
    println(first.fullName)
    println(second.fullName)

    first.age = firstAge
    second.age = secondAge

    second.lastName = firstLastName
    println(first.fullName)
    println(second.fullName)



    //first.init(name = firstName, age = firstAge, height = firstHeight, weight = firstWeight)
    //first.init(name = secondName, age = secondAge, height = secondHeight, weight = secondWeight)

    //print("Name: $name\nAge: $age")
    //print("Name: ${first.name}\nAge: ${first.age} \nAlture: ${first.height} \nWeight: ${first.weight}")
    //print("Name: ${second.name}\nAge: ${second.age} \nAlture: ${second.height} \nWeight: ${second.weight}")

    first.printInfo()
    second.printInfo()

    first.age = 0
    second.age = 0

    first.sayHello()
    second.sayHello()

    //second.sayHello()
    //first.run()
*/


}