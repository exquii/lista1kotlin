fun main(){
    println("Salário do funcionário: ")
    val salario = readln().toFloat()

    val aumento = salario * 0.15 //15% = (15/100)
    val sal_aumento = salario + aumento

    println("O novo salário do funcionário após um aumento de 15% é de R$$sal_aumento")
}