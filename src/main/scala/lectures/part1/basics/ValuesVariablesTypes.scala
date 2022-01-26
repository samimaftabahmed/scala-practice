package com.sam.scalaprac
package lectures.part1.basics

object ValuesVariablesTypes extends App {

    val x = 42
    // val are values, immutable
    //  val x: Int = 42
    println(x)

    //  x=2 // Exception: reassignment to val. vals are immutable in scala
    // compilers can infer types

    val str: String = "hello"
    println(str)

    val bool: Boolean = false
    val myChar: Char = 's'
    val aShort: Short = 4
    val myLong: Long = 5465465431321564321L
    val aFloat: Float = 545654.0f
    val pie: Double = 3.14

    println(bool)
    println(myChar)
    println(aShort)
    println(myLong)
    println(aFloat)
    println(pie)
    var myStr: String = "sam" // var are variables, mutables
    myStr += " scala"
    println(myStr)

    val someCondition = true;
    val myCondition = if (someCondition) 5 else 3
    println(myCondition)

    val blockVal = {
        val kiba = 44
//        kiba
        45
    }
    println(blockVal)


}
