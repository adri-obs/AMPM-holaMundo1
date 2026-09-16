package PRACTICAS

fun main() {
    println("Introduce una cadena de texto:")
    val cadena = readlnOrNull() ?: ""

    if (cadena.isEmpty()) {
        println("Error: la cadena está vacía, no se puede analizar ninguna posición.")
        return
    }

    println("Introduce una posición entera dentro de la cadena (0 a ${cadena.length - 1}):")
    val entrada = readlnOrNull()
    val posicion = entrada?.toIntOrNull()

    if (posicion == null) {
        println("Error: '$entrada' no es un número entero válido.")
        return
    }

    if (posicion < 0 || posicion >= cadena.length) {
        println("Error: la posición $posicion está fuera de los límites de la cadena (0 a ${cadena.length - 1}).")
        return
    }

    val caracterActual = cadena[posicion]
    println("Carácter en la posición $posicion: '$caracterActual'")

    if (posicion > 0) {
        val caracterAnterior = cadena[posicion - 1]
        println("Carácter anterior: '$caracterAnterior'")
    } else {
        println("Carácter anterior: no existe (es la primera posición de la cadena).")
    }

    if (posicion < cadena.length - 1) {
        val caracterSiguiente = cadena[posicion + 1]
        println("Carácter siguiente: '$caracterSiguiente'")
    } else {
        println("Carácter siguiente: no existe (es la última posición de la cadena).")
    }
}