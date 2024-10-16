open class VehiculoParasigmas (
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int,
): Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado) {
    override fun acelerar() {
        if (combustible!=0){
            while ((velocidadActual<=velocidadMaxima) and (combustible>0)){
                velocidadActual+=aceleracion
                combustible-=1
            }
        }
        else{
            println("Ups, ¡no hay combustible!")
        }
    }

    override fun frenar() {
        if(velocidadActual>=frenado){
            velocidadActual-=frenado
        }
        if (velocidadActual<frenado){
            velocidadActual=0
        }
        println("Nueva velocidadActual luego de frenar: $velocidadActual")
    }

    override fun avanzar() {
        distanciaRecorrida += velocidadActual
    }


    override fun toString(): String {
        return "$nombre: " +
        "recorrió: ${distanciaRecorrida}km, " +
        "velocidad actual: ${velocidadActual}km/h, " +
        "velocidad máx.: ${velocidadMaxima}km/h, " +
        "combustible: ${combustible}L, " +
        "aceleracion: ${aceleracion}km/h², " +
        "intensidad frenado: ${frenado}km/h²"
    }
}
