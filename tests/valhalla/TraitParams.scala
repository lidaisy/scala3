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
    val hasFur: Boolean = true

@valhalla trait LandAnimal(val habitat: String) extends Any, Animal:
  val onLand: Boolean = true

class Pig(cuteness: Int, furColour: Tuple, habitat: String, age: Int) extends Animal(cuteness) with LandAnimal(habitat) with Mammal(furColour):
  val numLegs = 4
  var _age = age
  def speak = println("I'm a pig!")