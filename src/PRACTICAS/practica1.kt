package PRACTICAS

import kotlin.system.measureTimeMillis

fun main() {
    println("Buenas , como te llamas?")
    var nombreUsuario: String = readln()
    println("Y cuantos anos tienes?")
    var edadActual = readln().toInt()
    var edadFutura: Int = edadActual + 5
    println("Espere un momento... ")
    Thread.sleep( 2000L )

    println("Dentro de 5 anos, $nombreUsuario ,tendras : $edadFutura anos")

}