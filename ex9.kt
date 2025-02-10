fun main(){
    println("Digite uma distância em metros: ")
    val distancia = readln().toInt()
    val cm = distancia * 100
    val mm = distancia * 1000

    println("$distancia metros em cm: $cm cm")
    println("$distancia metros em mm: $mm mm")
}