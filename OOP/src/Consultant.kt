class Consultant(
    val name: String,
    val age: Int = 23
) {

    fun sayHello(){
        if(age == 0){
            println("Hello! My name is $name.")
        }else{
            println("Hello! My name is $name. I´m $age years old.")
        }

    }
}