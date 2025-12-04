/**
https://docs.scala-lang.org/scala3/reference/other-new-features/trait-parameters.html

If a class C extends a parameterized trait T, and its superclass does not, C must pass arguments to T.

If a class C extends a parameterized trait T, and its superclass does as well, C must not pass arguments to T.

Traits must never pass arguments to parent traits
**/

import scala.annotation.valhalla

@valhalla trait Animal(val cuteness: Int) extends Any:
  def speak: Unit

@valhalla trait Mammal(val furColour: Tuple) extends Any:
  this: Animal =>

@valhalla trait LandAnimal(val habitat: String) extends Any, Animal

class Pig(cuteness: Int, furColour: Tuple, habitat: String, val age: Int) extends Animal(cuteness) with LandAnimal(habitat) with Mammal(furColour):
  def speak = println(s"I'm a pig! I'm ${age} years old.")
  def grow: Pig = new Pig(cuteness, furColour, habitat, age + 1)

class Main {
  def main() = {
    val pig: Pig = new Pig(100, (10,10,10), "house", 1)
    pig.speak
    val olderPig: Pig = pig.grow
    olderPig.speak
  }
}