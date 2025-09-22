import scala.annotation.valhalla

/**
 * Valhalla Traits can extend non-Valhalla Any Traits, which are allowed to have valdefs
 */

trait AnyTrait extends Any:
  val x: Int = 5
  def add(x:Int, y:Int): Int


@valhalla
trait TraitExtendsAnyTrait extends Any with AnyTrait:
  def addOne(x: Int): Int