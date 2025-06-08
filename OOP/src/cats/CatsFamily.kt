package cats

open class CatsFamily (
    val legsCount: Int = 4
){

    open fun eat(){
        print("Estoy comiendo ")
    }

}