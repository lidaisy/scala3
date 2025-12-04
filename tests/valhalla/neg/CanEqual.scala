import scala.language.strictEquality
import scala.annotation.valhalla

// Motivation:
// val x = ... // of type T
// val y = ... // of type S, but should be T
// x == y      // typechecks, will always yield false

@valhalla
class T(val a: Int) extends AnyVal

@valhalla
class S(val a: Int) extends AnyVal

class Main:
  def main = {
    val t = new T(1)
    val s = new S(1)
    t == s // error
  }