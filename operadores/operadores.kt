fun main() {
    
    val b = 5; // inmutable
    val a = 10; // inmutable 
    var c = 0; // mutable

    println("Operadores");

    //suma
    //c = a + b;
    c = a.plus(b);
    println("$c =  $a + $b ");
    
    //resta
    //c = a - b
    c = a.minus(b);
    println("$c =  $a - $b ");

    //división 
    c = a.div(b);
    println("$c =  $a / $b ");

    //comparaciones
    println(b.compareTo(a)>0);
    println("b > a: ");
    println(a.compareTo(b)>0);

    println("b < a: ");
    println(b.compareTo(a)<0);
    println("a < b: ");
    println(a.compareTo(b)<0);


    //Equals
    println("a ! = b: ");
    println(!(a.equals(b)));

    //extructura de control
    

    
}