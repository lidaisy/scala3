import scala.annotation.valhalla

@valhalla
abstract class AbstractVVC extends AnyVal {
  val a = 5
  val b = 50

  def addOne(x: Int): Int
}

@valhalla
class VVC extends AbstractVVC {
  def addOne(x: Int): Int = x + 1
}

/**
In Java, identity classes can extend abstract value classes. In scala, this is hard to do
since by extending an abstract vvc, the class is extending AnyVal, thus categorizing itself
as a value class.

class NotAnIdentityClass extends AbstractVVC {
  def addOne(x: Int): Int = x + 1
}

In Scala, one can use Valhalla Traits as abstract valhalla value classes

**/