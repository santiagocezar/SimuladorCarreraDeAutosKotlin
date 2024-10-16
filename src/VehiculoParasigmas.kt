class VehiculoParasigmas (
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int,
): Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado) {

    override fun acelerar() {
        if (combustible!=0){

        }
    }

    override fun frenar() {
        TODO("Not yet implemented")
    }

    override fun avanzar() {
        TODO("Not yet implemented")
    }
}