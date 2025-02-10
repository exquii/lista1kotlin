fun main(){
    println("A: ")
    val a = readln().toFloat()

    println("B: ")
    val b = readln().toFloat()

    println("C: ")
    val c = readln().toFloat()

    var bb = b * b
    var delta = bb - (4 * a * c)

    print("O delta da expressão é $delta")
}