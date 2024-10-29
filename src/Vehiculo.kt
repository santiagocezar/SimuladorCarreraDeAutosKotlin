abstract class Vehiculo(
    val nombre: String,
    val velocidadMaxima: Int,
    var combustibleActual: Int,
    var combustibleMaximo: Int,
    val aceleracion: Int,
    val frenado: Int,
) {
    // region Properties
    var velocidadActual: Int = 0
    var distanciaRecorrida: Int = 0
    // endregion

    // region Abstract function
    abstract fun acelerar()
    abstract fun frenar()
    abstract fun avanzar()
    // endregion

    override fun toString(): String {
        return "Velocidad: $velocidadActual km/h | Combustible/Tanque: $combustibleActual/$combustibleMaximo | Distancia: $distanciaRecorrida m"
    }
}