import scala.annotation.valhalla

@valhalla
class A(val x: Int) extends AnyVal

@valhalla
class Z(val z: Int) extends AnyVal

class Y

class B {
  val a1: A = new A(1)
  val a2: A = new A(2)
  val z: Z = new Z(42)
  val y: Y = new Y
  val zz = z.z

  def print = println("Hello world!")
}

class Main {
  def main() = {
    (new B).print
  }
}