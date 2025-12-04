import scala.annotation.valhalla
import java.time.LocalDate

class Y(val y1: Int, val y2: String, var y3: Seq[Z]):
  def this(y1: Int, y2: String) =
    this(y1, y2, Seq.empty[Z])
  var y4: Option[LocalDate] = None
  val y5: Int = 0

@valhalla
class Z(val z: Int) extends AnyVal

@valhalla
class C(val c: Y) extends AnyVal

@valhalla
class A(val a: Int) extends AnyVal

class B(val b: Int)

class Main {
  def main() = {
    val a1: A = new A(1)
    val a2: A = new A(1)
    println(f"a1 == a2 is ${a1 == a2}")
    assert(a1 == a2)

    val a3 = new A(3)
    println(f"a1 == a3 is ${a1 == a3}")
    assert(a1 != a3)

    val b1 = new B(1)
    val b2 = new B(1)
    println(f"b1 == b2 is ${b1 == b2}")
    assert(b1 != b2)

    val y = new Y(1, "one", Seq[Z](new Z(1), new Z(2)))
    val c1 = new C(y)
    val c2 = new C(y)
    println(f"c1 == c2 is ${c1 == c2}")
    assert(c1 == c2)

    val y1 = new Y(1, "one", Seq[Z](new Z(1), new Z(2)))
    val c3 = new C(y1)
    println(f"c1 == c3 is ${c1 == c3}")
    assert(c1 != c3)
  }
}