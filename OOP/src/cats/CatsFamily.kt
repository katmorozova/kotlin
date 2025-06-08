package cats

open abstract class CatsFamily (
    val legsCount: Int = 4
){

    /*
    open fun eat(){
        print("Estoy comiendo ")
    }
     */
    abstract fun eat()

}