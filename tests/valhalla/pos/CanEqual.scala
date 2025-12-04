import scala.language.strictEquality
import scala.annotation.valhalla

@valhalla
class T(val a: Int) extends AnyVal

class Main:
  def main = {
    val t = new T(1)
    t == null
  }