package com.example.app
//list
fun displayList(){
    val numbers : List<String> = listOf("one", "two", "three", "four" )
    println("no. of elements : ${numbers.size}")
    println("Third element: ${numbers.get(2)}")
    println("fourth element: ${numbers[3]}")
    println("index of element \"two\" ${numbers.indexOf("two")}")

}
fun main(){
    //immutable list
    val lst = listOf("one","two","three")
    println("mutable list")
    for(i in lst.indices){
        println(lst[i])
    }
    println()
    //mutable list
    val mutableLst = mutableListOf("one","two","three")
    mutableLst.add("four")
    println("immutable list")
    for(i in mutableLst.indices){
        println(mutableLst[i])
    }
}

//set
fun set(){
    val numbers = setOf(1,2,3,4)
    for (elements in numbers){
        println(elements)
    }

}



