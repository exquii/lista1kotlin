fun main(){
    println("Dinheiro na carteira (em R$): ")
    val saldo = readln().toFloat()
    val dols = saldo / 5.81

    println("Conversão para dólares: US$${"%.2f".format(dols)}. Cotação: R$5.81")
}