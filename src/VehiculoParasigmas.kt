open class VehiculoParasigmas (
    nombre: String,
    velocidadMaxima: Int,
    combustibleInicial: Int,
    aceleracion: Int,
    frenado: Int,
): Vehiculo(nombre, velocidadMaxima, combustibleInicial, combustibleInicial, aceleracion, frenado) {
    override fun acelerar() {
        if (combustibleActual!=0){
            while ((velocidadActual<=velocidadMaxima) and (combustibleActual>0)){
                velocidadActual+=aceleracion
                combustibleActual -= 1
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
        "combustible: ${combustibleActual}/$combustibleMaximo, " +
        "aceleracion: ${aceleracion}km/h², " +
        "intensidad frenado: ${frenado}km/h²"
    }
}
