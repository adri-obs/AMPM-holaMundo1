package PRACTICAS

fun main() {
    val notas = DoubleArray(5)
    var suma = 0.0
    for(i in notas.indices){
        println("Introduce la siguiente nota nº ${i + 1} ")
        notas[i]= readln().toDouble()
        suma += notas[i]
    }
    val promedio : Double = suma/notas.size
    Thread.sleep( 500L )
    println("Cargando datos...\n")
    Thread.sleep( 2000L )
    println("RESUMEN")
    println("=======")
    print(" Notas introducidas: ${notas.contentToString()} \n Suma: $suma \n Promedio: $promedio \n Nota maxima: ${notas.max()}" )
}