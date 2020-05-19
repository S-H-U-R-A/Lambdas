//Recordar que un data class es muy parecido a tener un modelo para un objeto
data class Auto(val color:String, val llantas: Int, val puertas: Int){}

fun main(args: Array<String>) {

    val miAuto = Auto("Rojo", 4, 4)

    //Let es una lambda que permite ejecutar codigo siempre y cuando
    //Se cumpla la condicion que sea que lo este precediendo
    //En este caso es el operador Null representado con ?
    //Seria parecido a usar un if sin bloque else es decir que se cumpla una condicion
    //Ahora bien el recordar que el terminno it en este caso hace referencia al mismo
    //Objeto
    miAuto?.let {
        //With lo que hace es recibir un objeto y permitirnos trabajar con sus valores
        //Para este caso let valida que no sea null y luego with()
        //Nos permite manipular ese objeto con la confianza de que no va a ser null
        with(it){
            puertas
            llantas
            color
        }
    }




    val resultado: Int = sum(4,7)
    println(resultado)

    val resultadoMinCuatro = minCuatro("Hola")
    println(resultadoMinCuatro)

}

//Variable sum va ser de tipo función (Esto es una lambda)
//Lo que va en la parte izquierda de la flecha son los parametros
//Y el la parte derecha las operaciones
val sum:(Int, Int) -> Int = {
    x,y -> x+y
}

//Los parentesis  indican que es variable de tipo funcion / Lambda
//It hace referencia al string que se va a recibir
val minCuatro:(String) -> Boolean = {
    it.length > 4
}