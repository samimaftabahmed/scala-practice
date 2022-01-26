package com.sam.scalaprac
package lectures.part1.basics

import scala.annotation.tailrec

object Recursion extends App {

    /**
     * Normal Factorial of number
     *
     * @param n - number
     * @return
     */
    def factorial(n: Long): Long = {
        if (n <= 1) 1
        else {
            println("Factorial of " + n + " we need factorial of " + (n - 1))
            val result = n * factorial(n - 1)
            println("Computed factorial of " + n + "=" + result)
            result
        }
    }

    println(factorial(5)) // Calling here

    /**
     * Factorial of a number using tail recursive
     *
     * @param n - number
     * @return
     */
    def anotherFactorial(n: BigInt): BigInt = {
        @tailrec
        def factorialHelper(x: BigInt, accumulator: BigInt): BigInt = {
            if (x <= 1) accumulator
            else factorialHelper(x - 1, x * accumulator)
        }

        factorialHelper(n, 1)
    }

    println(anotherFactorial(20000))

    /**
     * String concatenation using tail recursion
     *
     * @param str - the String
     * @param n   - number of times to be concatenated
     * @param accumulator
     * @return
     */
    @tailrec
    def concatenateString(str: String, n: Int, accumulator: String): String = {
        if (n < 1) accumulator
        else concatenateString(str, n - 1, accumulator + str)
    }

    println(concatenateString("hello", 3, ""))

    /**
     * Find prime number usign tail recursion
     *
     * @param n - the number
     * @return
     */
    def isPrime(n: Int): Boolean = {
        @tailrec
        def isPrimeTailRec(t: Int, isStillPrime: Boolean): Boolean = {
            if (!isStillPrime) false
            else if (t <= 1) true
            else isPrimeTailRec(t - 1, n % t != 0)
        }

        isPrimeTailRec(n / 2, true)
    }

    println(isPrime(7))
    println(isPrime(19))
    println(isPrime(18))

    /**
     * Find fibonacci series using tail recursion
     *
     * @param n - the number
     * @return
     */
    def fibonacci(n: Int): Int = {
        @tailrec
        def fibTailRec(i: Int, last: Int, nextToLast: Int): Int = {
            if (i >= n) last
            else fibTailRec(i + 1, last + nextToLast, last)
        }

        if (n < 2) 1
        else fibTailRec(2, 1, 1) // 1,1,2,3,5,8,13,21
    }

    println(fibonacci(8))
}
