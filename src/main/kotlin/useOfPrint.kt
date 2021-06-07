/*
println print the content and add end line
on the other hand print function also prints but does not add new line
you can pass argument of any literal type to print functions
*/
fun basicUseOfPrintFunctions(){

    println("Hello World with end line");
    print("Hello World Allows next text to come on same line ");
    println("Hello World comes on pervious line");
    println(26);
    println("Above mentioned number shows use of number literal");
}

/*
 Using string literal and variable together
 in these regards use of $ and {} is important
 */
fun useOfStringsAndVariableInPrintStatement(number1:Int, number2:Int){

    println("Sum of $number1 and $number2 is ${number1 + number2}");

}
