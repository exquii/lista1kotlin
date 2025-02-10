fun main(){
    println("Quilômetros percorridos: ")
    val km = readln().toFloat()

    println("Dias alugados: ")
    val dia = readln().toInt()

    val valor = (dia * 90) + (km * 0.2)

    println("Valor total a ser pago é de R$$valor")
}