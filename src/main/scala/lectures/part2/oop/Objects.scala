package com.sam.scalaprac
package lectures.part2.oop

object Objects extends App {

    val john = Person

    println(Person.N_EYES)
    println(Person.N_EARS)
    val dave = Person
    val somePerson = Person.apply(new Person("ZAng", 55))

    println(john == dave)
    println(somePerson.age)

    // SCALA doesn't have static variable or method concept
    object Person {
        val N_EYES: Int = 2
        var N_EARS: Int = 2

        def apply(mother: Person): Person = new Person(mother.name, mother.age)
    }

}
