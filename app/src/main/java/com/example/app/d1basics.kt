package com.example.app

fun main() {
    //println("Hello World")
    //immutable
    // val age = 10
    // mutable
    // var name = "kritagya"
   //  name = "khadka"
    // in java
    // String name = "kritagya"
//
//    var name : String = "kritagya"
//    var age : Int = 6
//    println("Hello I am ${name.uppercase()} and i am $age years old")
//    var age = arrayOf(10,20,30)
//    println(age[3])
//    age[3]= 50
    var male = arrayListOf<String>("rm","ss")  //can initialize here
    //var female = ArrayList<String>()//("Ff","gg") //cannot initialize here
    var female = ArrayList<Any>()
    female.add("sita")
    female.add(1)
    female.add("gita")
    male.add("haro")
    male.removeAt(0)

}
