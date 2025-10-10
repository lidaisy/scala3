import scala.annotation.valhalla

/**
 * Valhalla Classes can extend non-Valhalla Any Traits, which are allowed to have valdefs
 */

trait AnyTrait extends Any:
  val x: Int = 5
  def add(x:Int, y:Int): Int


@valhalla
class VVC extends AnyVal with AnyTrait:
  def add(x:Int, y:Int): Int = x + y
  def addOne(x: Int): Int = x + 1
  def addx(y: Int): Int = x + y