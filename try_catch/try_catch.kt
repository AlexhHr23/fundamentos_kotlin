fun main() {
    var nombre: String? = null; // variable tipo nullable
    println("Imprimiendo el valor de nombre: ");
    println(nombre);
    nombre = "alex";
    //println(nombre!!.length);

    // var longitud = nombre?.length ?: 0;
    // println("Longitud de nombre:  " + longitud);

    try {

        println("nombre: $nombre");

    }catch( err: NullPointerException) {
        println("Hay un error");
        println(err);
    }finally {
        println("Lo que este en finally, se ejucta siempre");
    }

    var longitud = -1;

    println("---------------try--------------");
    try{
         longitud = nombre.length;
    }catch( errr: NullPointerException) {
        //hubo un error, se pude obtener la longitud del nombre
         longitud = 0;
    }finally {
        println("Valor de longitud: $longitud");
    }

    println("Termina prueba de try");
}