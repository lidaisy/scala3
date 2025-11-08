import scala.annotation.valhalla

@valhalla abstract class Animal(val cuteness: Int) extends AnyVal:
  def speak: Unit

@valhalla trait Mammal(val averageHeight: Int) extends Any:
  this: Animal =>
    val hasFur: Boolean = true

@valhalla class Pig extends Animal(99) with Mammal(75):
  def speak = println("I'm a pig!")

