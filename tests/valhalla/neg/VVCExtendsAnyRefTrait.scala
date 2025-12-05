import scala.annotation.valhalla

trait Trait:
  var f: Int = 42
  def add(x:Int, y:Int): Int


@valhalla
class VVC extends AnyVal with Trait: // error
  def add(x:Int, y:Int): Int = x + y