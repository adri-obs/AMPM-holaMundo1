package practicas.practica5

class CalculadoraNullable {

    fun sumar(a: Int?, b: Int?): Int {
        return (a ?:0) + (b ?:0)
    }
    fun restar(a: Int?, b: Int?): Int {
        return (a ?:0) - (b ?:0)
    }
    fun multiplicacion(a: Int?, b: Int?): Int {
        return (a ?:0) * (b ?:0)
    }
    fun dividir(a: Int?, b: Int?): Int {
        return (a ?:0) / (b ?:0)
    }
}
