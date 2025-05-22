fun main() {


    val numbers = 0 .. 1_000_000_000L
    //var sum: Long = 0
    var sum = 0L

    for (number in numbers){
        sum += number
    }
    println(sum)
    //println(numbers.sum())

    var a: Byte = 127
    a ++
    print(a)

    var b: Short = 127
    b ++
    println(b)

    var c: Int = 127
    c ++
    println(c)

    var d: Long = 1_333_333_333
    d++
    println(d)

    val years = readln().toLong()
    val result = 365 * 60 *60 * years
    println(result)


}