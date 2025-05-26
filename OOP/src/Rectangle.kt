class Rectangle {

    val width: Int
    val height: Int

    constructor(width: Int, height: Int){
        this.width = width
        this.height = height
    }

    fun draw(width: Int, height: Int){
        repeat(height){
            repeat(width){
                print("* ")
            }
            print("\n")
        }
    }

}