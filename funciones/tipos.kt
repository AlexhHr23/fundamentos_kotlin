//usando funciones qie regresan valores

fun main() {

    val num1 = 12;
    val num2 = 15;

    borde("=", 12);
    var resultado = suma(num1, num2);
    println(resultado);
    borde("-*", 12);

    //Ejemplo función anonima
    val slogan = { resultado: Int -> println("Tu puedes con $resultado problemas y más") };

    //invocación forma  1
    slogan(resultado);



    val resta= {num1: Int, num2: Int ->  println(num1 - num2)}
    resta(4,2);

    val numero1 = 13;
    val numero2 = 15;
    val numero3 = 16;

    //Tarea
    //funcion que encuentre el valor de tres números
    //val max = {n1: Int, n2: Int, n3: Int -> 
    //    if(n1 > n2 && n1 > n2) {
    //        println(n1);
    //    } else if(n2 > n1 && n2 > n3) {
    //        println(n2);
    //    } else if( n3 > n1 && n3 > n2) {
    //        println(n2);
    //    } else {
    //        println("Todos los números son iguales")
    //    }
    //}
    
    val max = {n1: Int, n2: Int, n3: Int -> maxOf(n1,n2,n3)}

    max(numero1, numero2, numero3);

    //Funciones que encuentre el promedio de tres numeros
       //val promedio = { n1: Int, n2: Int, n3: Int -> 
       //    val suma = n1 + n2 + n3;
       //    val promedio = suma / 3;
       //    println(promedio);
       //}

      val promedio = { n1: Double, n2: Double, n3: Double -> 
         (n1 + n2 + n3).toDouble() / 3;
     }

    //promedio(numero1, numero2, numero3);
    
    var result = promedio(4.2, 5.6, 4.6);
    println(result);

}

fun borde(caracter: String, veces: Int) {
    for ( i in 1..veces ) {
        print(caracter);
    }
    println();

}

fun suma(n1: Int, n2: Int): Int {
    return  n1 + n2;
}