package gui

class Rectangle(
   var width: Int = 0,
   var height: Int = 0
) {

    val area: Int
        get() = width * height



    // val width: Int
    //val height: Int
/*
    constructor(){//constructor vacio, cuando no hace falta proporcinar parametros
        this.width = 0
        this.height = 0
    }

 */

    //constructor(): this(0)

    /*
    constructor(width: Int, height: Int){
        this.width = width
        this.height = height
    }

     */

    constructor(size: Int): this(size, size)

    fun draw(){
        repeat(height){
            repeat(width){
                print("* ")
            }
            print("\n")
        }
    }

}