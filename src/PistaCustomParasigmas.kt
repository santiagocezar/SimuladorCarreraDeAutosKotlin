import kotlin.random.Random

class PistaCustomParasigmas (
    longitud: Int,
    clima: String
): Pista(longitud, clima) {
    private val climasDisponibles:ArrayList<String> = arrayListOf("sol", "lluvia", "niebla", "normal")
    private val eventosDisponibles:ArrayList<String> = arrayListOf("pinchazo", "fallo-mecanico", "buscar-combustible", "ninguno")

    override fun aplicarCondiciones(vehiculo: Vehiculo) {
        when (clima) {
            "lluvia" -> vehiculo.velocidadActual = (vehiculo.velocidadActual * .5).toInt()
            "niebla" -> vehiculo.velocidadActual = (vehiculo.velocidadActual * .2).toInt()
            "sol" -> vehiculo.combustibleActual = (vehiculo.combustibleMaximo * .95).toInt()
        }
    }
    override fun cambiarClima() {
        val climaIndex = Random.nextInt(0, 3)
        clima = climasDisponibles[climaIndex]
        println("Clima alterado, ahora hay $clima")
    }
    override fun aplicarEventoAleatorio(vehiculo: Vehiculo) {
        val eventoIndex = Random.nextInt(0, 3)
        val evento = eventosDisponibles[eventoIndex]

        when (evento) {
            "pinchazo" -> vehiculo.frenar()
            "fallo-mecanico" -> vehiculo.velocidadActual = 0
            "buscar-combustible" -> vehiculo.combustibleActual += (vehiculo.combustibleMaximo * .2).toInt()
        }

        println("${vehiculo.nombre} tuvo un $evento")
    }
}