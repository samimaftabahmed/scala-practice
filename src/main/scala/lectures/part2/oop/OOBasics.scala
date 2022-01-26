package com.sam.scalaprac
package lectures.part2.oop

object OOBasics extends App {

    val person = new Person(age = 24)
    println(person.age)
    //    println(person.name) // Not possible

    val animal = new Animal("Dog", false)
    println(animal.x)
    println(animal.eat())
    println(animal.call("Jackie"))
    println(animal call "Jackie")
    println(~animal)
    println(animal.isHerbivorous)
    println((+animal).isHerbivorous)

    println("===============")
    val dataVO = new DataVO("AllData")
    println(dataVO.kiba("hello").kiba("John").kiba("Doe"))
    println(dataVO(1, "from apply"))
}

// class definition with a constructor
class Person(val name: String = "Samim", val age: Int)

class Animal(name: String, val isHerbivorous: Boolean) {

    val x = 5
    println(s"x=$x, name=$name, isHerbivorous=$isHerbivorous")

    def unary_~ : String = name.reverse

    def unary_+ : Animal = new Animal(name, !isHerbivorous)

    def eat(): String = {
        "Rice, Meat etc. "
    }

    def call(petName: String): String = {
        s"My ${this.name}'s pet-name is $petName"
    }
}

class DataVO(id: Int, data: String) {
    def kiba(n: String): DataVO = {
        new DataVO(n)
    }

    println(s"id=${this.id}, data=${this.data}")

    def this(data: String) = this((Math.random() * 100).toInt, data)

    // apply method is called when the bracket os used with the reference variable
    def apply(id: Int, data: String): DataVO = new DataVO(id, data)
}



