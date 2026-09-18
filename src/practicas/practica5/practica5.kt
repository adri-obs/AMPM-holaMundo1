package practicas.practica5

fun main() {
    val calculadora = CalculadoraNullable()
    println("CALCULADORA\n===========")
    println("Introduzca el primer numero: ")
    val a : Int = readln().toInt()
    println("Introduzca el segundo numero: ")
    val b : Int = readln().toInt()
    println("Cargando...")
    Thread.sleep( 1500L )
    println("\nRESULTADO\n=========")
    println(" Suma: ${calculadora.sumar(a,b)}\n Resta: ${calculadora.restar(a,b)}\n Multiplicar: ${calculadora.multiplicacion(a, b)}\n Dividir: ${calculadora.dividir(a, b)}")

}