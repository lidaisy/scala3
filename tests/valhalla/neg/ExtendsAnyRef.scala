import scala.annotation.valhalla

/**
 * Valhalla Class Extends AnyRef Class
 * */
abstract class Abs {
  def addOne(x : Int) : Int
}

@valhalla
class ValhallaAnnotWithoutExtendingAnyVal extends Abs{ // error
  def addOne(x : Int) : Int = x + 1
}

/**
 * Valhalla Trait Extends AnyRef
 * */
@valhalla
trait ExtendsAnyRef // error

/**
 * Valhalla Trait Extends AnyRef 2
 * */
@valhalla
trait Uni extends Any

@valhalla
trait AnyRefTrait extends Uni // error