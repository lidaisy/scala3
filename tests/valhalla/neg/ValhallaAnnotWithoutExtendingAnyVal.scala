import scala.annotation.valhalla

abstract class Abs {
  def addOne(x : Int) : Int
}

@valhalla
class ValhallaAnnotWithoutExtendingAnyVal extends Abs{ // error
  def addOne(x : Int) : Int = x + 1
}