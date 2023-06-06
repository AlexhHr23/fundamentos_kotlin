fun main() {

    val ladas: Map<Int, String> = mapOf(
        1 to "USA",
        34 to "España",
        52 to "Mexico",
        233 to "Ghana",

    );

    //Imprimiendo mapas el conjunto de pares clave-valor
    println(ladas);

    //Imprimiendo con for
    for ((key, value) in ladas) {
        println("La clave lada de $value es $key");
    }

    //Imprimiendo mapas usando lambda
    ladas.forEach{ (k, v) -> println("$k - $v") };
    
    //recuperar un sólo elemento del mapa
    println(ladas.get( 52 ));
    println(ladas[52]);

    //Recuperar el tamaño del mapa
    println("Tamaño del mapa: ${ladas.size}");
    //Recuerar solo las claves
    println("Claves del mapa: ${ladas.keys}");
    //Recuperar solo los valores
    println("Valores del mapa: ${ladas.values}");
    //Recuperar las entradas
    println("Entradas del mapa: ${ladas.entries}");
    //Recuperar un valor si esxiste, sino, envia el deafult
    println("Valor de la lada 48: ${ladas.getOrDefault(1, "País desconocido")}");
    //Comprobar si el mapa esta vacio
    println("Mapa vacio: ${ladas.isEmpty()}");
    //Comprobar si esxiste una llave espifica en el mapa
    println("Existe la clave lada 86: ${ 89 in ladas }");
    //Comprobar si existe un valor en el mapa
    println("Existe el valor Mexico en el mapa: ${"Mexico" in ladas.values}" );


    //Mapa mutable
    var nums = mutableMapOf(
        "one" to 1,
        "two" to 2,
        "three" to 3,
        "four" to 4,
    );

    println("Mapa de numeros: $nums");
    
    //Eliminar valores de mapas
    nums.remove("Two");
    println("Mapa de numeros: $nums");

    var sortedNums = nums.toSortedMap();
    println("Mapa ordenando: $sortedNums");
    //Agregando par al mapa
    nums["six"] = 6;
    println("Mapa nuevo de numeros: $nums");

    //reto:
    //Crear un diccionario español - ingles usando un mapa
    //1. Funcion para crear o cargar el diccionario
    //2. Funcion para consulta, reciba un palabra en español y regrese su traducción
    //3. Imprimir todo el diccionario


}