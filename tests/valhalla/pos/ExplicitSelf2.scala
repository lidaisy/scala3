import scala.annotation.valhalla

@valhalla trait Animal extends Any:
  def speak: Unit

@valhalla trait Mammal extends Any:
  this: Animal =>
    val hasFur: Boolean = true

@valhalla trait LandAnimal extends Any, Animal:
  val onLand: Boolean = true

class Pig(age: Int) extends LandAnimal with Mammal:
  val numLegs = 4
  var _age = age
  def speak = println("I'm a pig!")
