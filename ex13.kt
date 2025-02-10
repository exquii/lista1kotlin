fun main(){
    println("Preço do produto: ")
    val preco = readln().toFloat()

    val desconto = preco * 0.05 //5% = (5/100)
    val preco_desconto = preco - desconto

    println("O preço do produto após o desconto de 5% é R$$preco_desconto")
}