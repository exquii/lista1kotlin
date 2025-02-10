fun main(){
    println("Altura: ")
    val altura = readln().toFloat()

    println("Largura: ")
    val largura = readln().toFloat()

    val area = altura * largura
    val tinta = area / 2

    println("Área a ser pintada: $area metros quadrados")
    println("Litros de tinta necessários: $tinta litros")
}