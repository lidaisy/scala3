import scala.annotation.valhalla

@valhalla
class A(val a: Int, val b: Int, val c: Boolean) extends AnyVal:
  val x = if c then a else b

  def print = println("Hello world!")

class Main {
  def main() = {
    (new A(1,2,true)).print
  }
}