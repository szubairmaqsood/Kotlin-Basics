/*
 this is a function names sum with two parameters of type int
 return type is also int
 */
fun sum(number1:Int,number2:Int):Int{
    return number1 + number2;
}

/*
function can be written in form of expression
and return type can be infered
 */

fun multiply(number1:Int,number2:Int) = number1 * number2;

/*
if a function returns nothing
return type will be written as Unit
we  can also make it infer with not writting it
 */
fun returnNothing():Unit{
    println("I am a function with prints nothing");
}