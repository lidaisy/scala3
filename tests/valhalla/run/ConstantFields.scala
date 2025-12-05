import scala.annotation.valhalla

@valhalla
class A extends AnyVal:
  val x = 5
  val y = 6
  val z = 7

  def print = println("Hello world!")

class Main {
  def main() = {
    (new A).print
  }
}