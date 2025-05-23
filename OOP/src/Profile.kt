fun main() {
    val first: Person = Person()
    val second: Person = Person()
    print("Input 1st name")
    first.name = readln()

    print("Input 2nd name")
    second.name = readln()

    print("Input 1st age")
    first.age = readln().toInt()

    print("Input 2nd age")
    second.age = readln().toInt()

    //print("Name: $name\nAge: $age")
    print("Name: ${first.name}\nAge: ${first.age}")
    print("Name: ${second.name}\nAge: ${second.age}")

}