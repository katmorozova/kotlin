fun main() {
    val names = listOf<String>("John", "Nick", "Olivia", "Helen", "Emma", "Alex")
    println("Enter name: ")
    val searchName = readln()
    var nameFound = false

    var index = 0
    while(index < names.size){
        println(names[index])
        if(searchName == names[index]){
            nameFound = true
            break
        }
        index++
    }
    println("Name found: $nameFound")
}