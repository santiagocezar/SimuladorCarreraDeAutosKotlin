import com.sun.source.tree.WhileLoopTree

class VehiculoParasigmas (
    nombre: String,
    velocidadMaxima: Int,
    combustible: Int,
    aceleracion: Int,
    frenado: Int,
    var velocidad:Int = 0
): Vehiculo(nombre, velocidadMaxima, combustible, aceleracion, frenado) {

    override fun acelerar() {
        if (combustible!=0){
            while ((velocidad<=velocidadMaxima) and (combustible>0)){
                velocidad+=aceleracion
                combustible-=1
            }
        }
        else{
            println("Ups, ¡no hay combustible!")
        }
    }

    override fun frenar() {
        if(velocidad>=frenado){
            velocidad-=frenado
        }
        if (velocidad<frenado){
            velocidad=0
        }
        println("Nueva velocidad luego de frenar: $velocidad")
    }

    override fun avanzar() {

    }
}