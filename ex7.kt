fun main(){
    println("Digite um número: ")
    val num = readln().toInt()
    val ant = num - 1
    val suc = num + 1

    println("O antecessor de $num é $ant")
    println("O sucessor de $num é $suc")

}