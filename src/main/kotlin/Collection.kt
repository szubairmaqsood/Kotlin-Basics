fun collection(){
    val fruits = listOf("orange","banana", "avocado", "apple", "kiwifruit");
    for (fruit in fruits) {
        print(" $fruit ")
    }
    println();
    when {
        "orange" in fruits -> println("juicy")
        "apple" in fruits -> println("apple is fine too")
    }

    var fruits1 =  fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map{(it.uppercase())}
        //.forEach{ println(it)}


    

    for (fruit in fruits1) {
        print(" $fruit ")
    }

}