class Test {
  val x:Int = 1

  def hello() : Int = {
    val x:Int = 3
    x
  }
}

trait TraitWithVal extends Any{
  val x: Int = 9
  def absMeth(x: Int): Int = 42
  def ownMeth(x: Int): Int = 200
}

import scala.annotation.valhalla

@valhalla
class ConcreteVVC extends AnyVal {
  val a = 5
  val b = 50

  def addOne(x: Int): Int = x + 1
}