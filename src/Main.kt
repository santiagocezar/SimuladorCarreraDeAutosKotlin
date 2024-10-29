//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val pista = PistaCustomParasigmas(1000, "soleado")

    val vehiculos: ArrayList<VehiculoParasigmas> = arrayListOf()

    val moto = MotoParasigmas("Coky")
    vehiculos.add(moto)
    val camion = MotoParasigmas("Mateote")
    vehiculos.add(camion)
    val autoDepo = MotoParasigmas("Chanchi")
    vehiculos.add(autoDepo)

    var ganador: Vehiculo? = null
    var turnos = 0

    while (ganador == null) {
        turnos++

        println("----- Turno $turnos -----\n")

        // Cambiar clima en cada 3 turnos
        if (turnos % 3 == 0) {
            pista.cambiarClima()
        }

        // Simulación de la carrera
        vehiculos.forEach { vehiculo ->
            //TODO: Completar metodos
            vehiculo.acelerar()
            vehiculo.avanzar()

            pista.aplicarCondiciones(vehiculo)
            pista.aplicarEventoAleatorio(vehiculo)

            if (vehiculo.distanciaRecorrida >= pista.longitud) {
                ganador = vehiculo
            }
            println(vehiculo.toString())
        }

        println("----------------\n")
        // Pausa entre turnos
        Thread.sleep(1000)
    }

    println("🏁 ${ganador?.nombre} ha ganado la carrera en $turnos turnos!")
}
