fun main() {
    var nombre: String? = null; // variable tipo nullable
    println("Imprimiendo el valor de nombre: ");
    println(nombre);
    nombre = "alex";
    //println(nombre!!.length);

    var longitud = nombre?.length ?: 0;
    println("Longitud de nombre:  " + longitud);
}