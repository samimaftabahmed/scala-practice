package com.sam.scalaprac
package lectures.part1.basics

import scala.annotation.tailrec

object Functions extends App {

    def aFunctions(a: String, b: String, c: Int): String = {
        a + " " + b + " " + c
    }
    //    println(aFunctions("hello", "function", 6))

    def kiba() = aFunctions("hello", "def", 66)
    //    println(kiba())

    def repeatedFunction(aString: String, n: Int): String = {
        if (n == 1) aString + " 1"
        else aString + " " + n + "\n" + repeatedFunction(aString, n - 1)
    }

    println(repeatedFunction("Hello", 8))

    def aBigFunction(n: Int) = {
        def aSmallerFunction(a: Int, b: Int) = a + b

        aSmallerFunction(n, n - 1)
    }

    println(aBigFunction(9))

    def greeting(name: String, age: Int) = s"I am $name and $age years old"

    println(greeting("John", 26))

    def factorial(num: Int): Int = {
        if (num == 1) 1
        else num * factorial(num - 1)
    }

    println(factorial(5))

    //    def checkPrime(num:Int)={
    //
    //    }

    def fibonacci(num: Int): Int = {
        if (num <= 2) 1
        else fibonacci(num - 1) + fibonacci(num - 2)
    }

    println(fibonacci(6))


}
