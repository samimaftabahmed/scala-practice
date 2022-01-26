package com.sam.scalaprac
package lectures.part1.basics

object FunctionCall extends App {

    def callByValue(x: Long): Unit = {
        println("by value: " + x)
        println("by value: " + x)
    }

    def callByName(x: => Long): Unit = {
        println("by Name: " + x)
        println("by Name: " + x)
    }

    callByValue(System.nanoTime())
    callByName(System.nanoTime())


    def infinite(): Int = 1 + infinite()

    def printFirst(x: Int, y: => Int): Unit = println(x)

    def printSecond(x: Int, y: => Int): Unit = println(x, y)

    //    printFirst(infinite(), 34) // StackOverflowError
    printFirst(34, infinite()) // since 'y' is not used in printFirst(),
    // so infinite() is not evaluated. This is lazy evaluation

    //    printSecond(34, infinite()) // StackOverflowError since 'y' is evaluated now

    def additionRunner(): Unit = {

    }

    def additionTest(x: => Int): Unit = {
        //        x = (x + 1) // Not possible as all parameters are 'vals' not 'vars'
    }

    def defaultArgsFunction(format: String = "jpg", width: Int = 1920, height: Int = 1080): Unit = {
        println("picture")
    }

    defaultArgsFunction("jpg", 1920, 1080)
    defaultArgsFunction("bmp")
    //    defaultArgsFunction(800) // Not possible as compiler cannot figure out which parameter is supplied
    defaultArgsFunction(width = 1600)
    defaultArgsFunction(height = 1200)
    defaultArgsFunction(height = 1200, format = "png")

}
