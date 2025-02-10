fun main(){
    println("Dias trabalhados: ")
    val dias = readln().toInt()

    val salario = (8 * 25) * dias

    println("Salário do funcionário neste mês, considerando $dias dias trabalhados é de R$$salario")
}