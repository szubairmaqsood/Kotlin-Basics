/*
By scope there are two kinds of variables
1. Local
2. Global

By option to change values there are also two
1. val key word is used for constants (only can given value in their life cycle)
2. var is used for variables
*/
fun localAndVal(){
    val number1:Int = 1;
    val number2 = 2;        // its data type will be inferred
    val number3:Int;       //Here data type need to be told as there are not given any value
    number3 = 3;          // defered assignment

    println("This is a local varaible with val named number 1 with value $number1");
    println("This is a local varaible with val named number 2 with value $number2");
    println("This is a local varaible with val named number 2 with value $number3");
}

fun localAndVar(){
    var x =3;
    x = 4;
    println("This is local variable  with var named x with value $x ")
}

/*
Following are global varaibles
 */

var pi= 3.14;
fun global(){
    println("This is a global varable pi with value $pi ");
}