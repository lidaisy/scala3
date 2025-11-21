import scala.annotation.valhalla

@valhalla
trait ValhallaTrait extends Any:
  val x: Int = 5
  def add(x:Int, y:Int): Int

class IdentClass extends ValhallaTrait:
  def add(x:Int, y:Int): Int = x + y