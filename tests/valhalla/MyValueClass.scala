//import scala.annotation.valhalla
//
//@valhalla

class customAnnot extends scala.annotation.StaticAnnotation

@customAnnot
class MyValueClass extends AnyVal {
  val a: Int = 5
  val b: Int = 50

  def addOne(x: Int): Int = x + 1
}