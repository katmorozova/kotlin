package files

import java.io.File

fun main() {
//Creamor ejemplar de clase File:
    val file = File("test.txt")
    file.writeText("Hello!")//añadir texto-> reemplaza texto
    file.appendText("World!!")//añade texto -> no elemina texto
}