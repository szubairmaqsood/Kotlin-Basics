fun range():Unit{
//range usage
    val x =9;
    val y = 10;
    if(x in 1..y+1){
        println("fit in range");
    }
    // step size 2 upwards
    for (x in 1..10 step 2) {
        print(x)
    }
    println()

    //Down wards with step size
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    val list = listOf("a", "b", "c")
    println();
    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }
}