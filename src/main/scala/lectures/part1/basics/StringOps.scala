package com.sam.scalaprac
package lectures.part1.basics

object StringOps extends App {

    val str: String = "Hello, I am learning Scala"

    println(str.charAt(3))
    println(str.substring(2, 5))
    println(str.split(" ").toList)
    println(str.replace(" ", "-"))

    val aNumberString: String = "2"
    val aNumber: Int = aNumberString.toInt // parsing
    println('a' +: aNumberString :+ 'z') // prepending and appending operation not possible with Int variables
    println(aNumber + "sdas") // concatenation possible with anything

    println(str.reverse)
    println(str.take(2))
    println(str.toCharArray.toList)
    println(str.*(3))
    println(str.mkString("-"))

    val name: String = "John"
    val age: Int = 25
    val greeting: String = s"My name is $name and I am $age years old. Next year I will be ${age + 1}"
    println(greeting)

    val a = 7654647.23256
    val fInterpolatedStr: String = f"The number is $a%.6f"
    println(fInterpolatedStr)

    println("\n\n")
    val someStr: String = "1.I am good.\nThank you."
    println(raw"$someStr") // Doesn't unescape \n
    println("2.I am good.\nThank you.") // Doesn't unescape \n

    val someStr2: String = raw"3.I am good.\nThank you."
    println(someStr2) // Escapes \n
    println(raw"4.I am good.\n Thank you.") // Escapes \n


}
