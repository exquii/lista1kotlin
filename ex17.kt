fun main(){
    println("Cigarros fumados por dia: ")
    val cigarros = readln().toInt()

    println("Fumou durante quantos anos? ")
    val anos = readln().toInt()

    val dias = anos * 365
    val cigarros_fumados = cigarros * dias
    val minutos_perdidos = 10 * cigarros_fumados
    val dias_perdidos = minutos_perdidos / 1440 //fórmula minutos para dias = minutos / 1440

    println("Você perdeu $dias_perdidos dias")
}