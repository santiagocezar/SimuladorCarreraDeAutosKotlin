import com.sun.source.tree.WhileLoopTree

class VehiculoParasigmas (
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

    }
}