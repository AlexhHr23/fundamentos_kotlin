fun main() {
    //Lista inmutable
    val readOnly: List<String> = listOf(
        "Lunes",
        "Martes"
        ,"Miercoles"
        ,"Jueves",
        "Viernes",
        "Sabado", 
        "Domingo"
    );

    println(readOnly);
    println("Tamaño de la lista: ${readOnly.size}");
    println("Elemento en la posicion 3: ${readOnly.get(3)}");
    println("Elemento en la primera posición: ${readOnly.first()}");
    println("Elemento en la ultima posición: ${readOnly.last()}");
    //Mostrar los elementos de la lista usando for 
    //for ( e in readOnly) {
        // println(e);
        //}
    
    //Mostrar los elementos de la lista usando forEach
    println("Elementos de readOnly usando forEach: ");
    readOnly.forEach{ 
        println(it)
    }

    //Crear una lista mutable
    var mutableList: MutableList<String> = mutableListOf("Lunes","Martes");
    println("Lista mutable: $mutableList");
    mutableList.add("Miércoles");

    //Trabajando con listas mutables vacías
    var emptyList: MutableList<String> = mutableListOf();
    println(" ¿ La lista estas vacía?mutable: ${emptyList.none()}")
    println(" Primer elemento de la emptyList: ${emptyList.firstOrNull()}")
    println(" Ultimo elemento de la emptyList: ${emptyList.lastOrNull()}")
    println(" Elemento en la pocisión 2 de emptyList: ${emptyList.elementAtOrNull(2)}");

    //Agragando elementos a emptyList
    readOnly.forEach{
        emptyList.add(it);
    }

    println("La lista que estaba vacia: $emptyList");
    println(" Elemento en la pocisión 2 de emptyList: ${emptyList.elementAtOrNull(2)}");

    //Ordenar lista
    val numerosDeLoteria = listOf(11,2,3,5,56,1,3,66);
    println("Números de lotería: $numerosDeLoteria");
    val numerosOrdenados = numerosDeLoteria.sorted();
    println("Números ordenados: $numerosOrdenados");
    val numerosDecendentes = numerosDeLoteria.sortedDescending();
    println("Números desordenados: $numerosDecendentes");
    val numerosPares = numerosDeLoteria.filter{ num -> num % 2 == 0 };
    println("Numeros pares: $numerosPares");


}
