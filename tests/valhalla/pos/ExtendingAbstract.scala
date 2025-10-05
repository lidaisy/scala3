import scala.annotation.valhalla

@valhalla
abstract class AbstractVVC extends AnyVal {
  val a = 5
  val b = 50

  def addOne(x: Int): Int
}

@valhalla
class ExtendingAbstract extends AbstractVVC {
  def addOne(x: Int): Int = x + 1
}