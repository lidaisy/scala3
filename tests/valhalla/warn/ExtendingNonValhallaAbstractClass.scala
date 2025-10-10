import scala.annotation.valhalla

abstract class Abs {
  def addOne(x : Int) : Int
}

@valhalla
class ExtendingNonValhallaAbstractClass extends Abs{ // error or warning here
  def addOne(x : Int) : Int = x + 1
}