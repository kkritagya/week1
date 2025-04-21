package com.example.app

fun main(args: Array<String>){
    var age  = arrayOf(1,2,3)
    println(age)
    println("the first element of age is "+ age[0])
    println("the second element of age is "+ age[1])
    println("the third element of age is "+ age[2])
    println("********************")

    var name = arrayOf("ram", "hari", "fish")
    name[1]= "sands"
    println("the first element of name is "+ name[0])
    println("the second element of name is "+ name[1])
    println("the third element of name is "+ name[2])
    println(name.size)

    var age1 = ArrayList<Int>()
    age1.add(1)
    age1.add(1,20)
    age1.add(5)

    var age2 = arrayListOf<Int>(1,20,5)

    var name2 = arrayListOf<String>("kk", "ba", "nj")
    name2.add("pk")
    name2.add(4, "gk")
    name2.remove("ba")
    name2.removeAt(0)
    println(name2)

    var mixArrayList = arrayListOf<Any>("hello",5,3.3)
    println(mixArrayList[0]);
    println(mixArrayList[1]);
    println(mixArrayList[2]);

}