import scala.annotation.valhalla

/**
 * Valhalla Class Extends AnyRef Class
 * */
abstract class Abs {
  var f: Int = 42
  def addOne(x : Int) : Int
}

@valhalla
class ValhallaAnnotWithoutExtendingAnyVal extends Abs{ // error
  def addOne(x : Int) : Int = x + 1
}