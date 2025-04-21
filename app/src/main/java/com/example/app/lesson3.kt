package com.example.app

fun main(args: Array<String>){
    print("hello world");
    //mutable
    var age = 20;
    age = 25

    // immutable
    var roll = 22
    roll = 34

    //data types
    var a : Boolean  = true
    var b : Char = 'R'
    var c : Byte = 12
    var d : Short = -356
    var e : Int = 43543
    var f : Long = -53456453L
    var i : Float = 5.6451344F
    var h : Double = 7.23453432

    println(a)
    println(b)
    println(c)
    println(d)
    println(e)
    println(f)
    println(i)
    println(h)

    //data type conversion
    var x : Double = 132.32
    var y : Int = x.toInt()
    var z : Byte = y.toByte()

    println(x)
    println(y)
    println(z)

    var av : String = "Hello world"
    var iq: Int = av.length
    var xu : Boolean = av.equals("Hello world")
    var username : String = " softwarica "

    println(username.trim())
    println(av);
    println(iq)
    println(av.isEmpty())
    println(av.lowercase())
    println(av.uppercase())
    println(xu)
    val other = null
    print(av.plus(", Hoe are you?"));






}
