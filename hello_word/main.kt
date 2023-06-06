
//Primer programa en Kotlin
fun main() {
    //Un val es un valor inmutable:
    val veces = 35;
    val border = "+_";
    //
    //val veces = 35;

    
    printBorder(1, 30);
    println("Hola mundo Kotlin");
    printBorder(5, 40);
    println();
    println("En este programa, el caracter de borde es: ${border}");
    println("Y se imprime ${veces} veces");
}


// fun printBorder(numero: Int, caracter: String) {
//     repeat(numero){
//         print(caracter);
//     }
//     println();
// }

fun printBorder(tipoCaracter: Int, numero: Int) {
    when ( tipoCaracter ){
        1 ->
            repeat( numero ) {
                print("-")
            }
        2 ->
            repeat( numero ) {
                print("/")
            }
        3 ->
            repeat( numero ) {
                print("-")
            }
        4 ->
            repeat( numero ) {
                print("+")
            }
        5 ->
            repeat( numero ) {
                print("*")
            }
        6 ->
            repeat( numero ) {
                print("!")
            }
    }
    println();
}



