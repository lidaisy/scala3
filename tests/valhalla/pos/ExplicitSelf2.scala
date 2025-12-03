import scala.annotation.valhalla

// Trait with trait self type

@valhalla trait Animal(val cuteness: Int) extends Any:
  def speak: Unit

@valhalla trait Mammal(val furColour: Tuple) extends Any:
  this: Animal =>

@valhalla trait LandAnimal(val habitat: String) extends Any, Animal

class Pig(cuteness: Int, furColour: Tuple, habitat: String, val age: Int) extends Animal(cuteness) with LandAnimal(habitat) with Mammal(furColour):
  def speak = println("I'm a pig!")
