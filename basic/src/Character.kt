fun main() {

    var a: Char = 'A'
    a++
    println(a)

    val letters = 'A' .. 'Z'
    for (letter in letters){
        println(letter)
    }

    print("Enter password: ")
    val password = readln().toCharArray()
    var conteinsLetter = false
    var conteinsDigit = false
    var conteinsSpecialSymbol = false
    for (symbol in password){
        if(symbol.isLetter()){
            conteinsLetter = true
        }
        if (symbol.isDigit()){
            conteinsDigit = true
        }
        if (!symbol.isLetterOrDigit()){
            conteinsSpecialSymbol = true
        }
    }
    if (conteinsLetter && conteinsDigit && conteinsSpecialSymbol && password.size >= 8){
        println("Password is valid")
    }else{
        println("Your password is too simple")
    }

}