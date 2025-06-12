package profile

class Person (

    private val name: String,
    var lastName:String,
    private val height: Int,
    private val weight: Int
){
    var age: Int = 0

        set(value) {
            if (value > field){
                field = value
            }else {
                println("The new age must be bigger than the old one ")
            }
        }
        get() {
            println("It is indecent to ask a person his age")
            return field
        }

    val fullName: String
        get() = "$name $lastName"

    /*
    constructor(name: String,age: Int,height: Int, weight: Int){
        this.name = name
        this.age = age
        this.height = height
        this.weight = weight
    }

     */
    /*
    fun init(name: String,age: Int,height: Int, weight: Int){
        this.name = name
        this.age = age
        this.height = height
        this.weight = weight
    }

     */

    fun printInfo(){
        println("Name: $name Age: $age Height: $height Weight: $weight")
    }

    fun sayHello(){
        println("Hello! My name is $name")
    }

    fun run(){
        repeat(10){
            println("Estoy corriendo")
        }
    }


}