import scala.annotation.valhalla

@valhalla
class MyValueClass extends AnyVal {
  val a = 5
  val b = 50

  def addOne(x: Int): Int = x + 1
}