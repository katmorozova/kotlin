import org.example.profile.Condition
import kotlin.collections.set

fun main() {
    val contacts = mutableMapOf(
        "Hermes" to "699234234",
        "Gala" to "634234543",
        "Hermes" to "602385121"
    )

    println("Enter name or 0: ")
    val name = readln()
    println("Enter phone number: ")
    val phoneNumber = readln()
    contacts[name] = phoneNumber
    showContact(contacts)



}
fun showContact(contacts: Map<String, String>){
    while (true){
        println("Enter name or 0 to exit: ")
        val name = readln()
        if(name == "0")break
        println(contacts[name] ?: "Not found")
    }
}