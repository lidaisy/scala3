import scala.annotation.valhalla

@valhalla
class A extends AnyVal{
  val x: Int = 4
}

@valhalla
class Z(x: Int) extends AnyVal{
  val z: Int = 42
  // val y: Int = if newX(x) > 3 then 10 else x
  val w: Int = x + 4

  final def newX(x: Int): Int = if x % 42 != 0 then x * 5 else x + 3
}

class B {
  val a1: A = new A
  val a2: A = new A
  val z: Z = new Z(2)
  val zz = z.z

  def print = println("Hello! " + zz)
}

class Main {
  def main() = {
    val b: B = new B
    b.print
  }
}