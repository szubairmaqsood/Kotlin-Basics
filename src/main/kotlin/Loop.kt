fun forLoop():Unit{
   /*
    Print every element in array
    */
    val items2 = listOf("apple", "banana", "kiwifruit");
    for (item in items2) {
        println(item)
    }
 /*
  Print every element of array with its index
  */
    val items = listOf("apple", "banana", "kiwifruit");
    // with each array a array of indexes is assosated
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }

    /*
     Use of while and size property
     */
    val items1 = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items1.size) {
        println("item at $index is ${items[index]}")
        index++
    }

}