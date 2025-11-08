//class ScalaValueClass(val underlying: Int) extends AnyVal
//
//class Lazy:
//  lazy val x = 190 * 2
//
//trait Tr:
//  val y = 3

import scala.annotation.valhalla

@valhalla
class VVC extends AnyVal:
  val x = 10
  def addX(y: Int):Int = y + x

@valhalla
abstract class AbstractVVC extends AnyVal

@valhalla
class Child extends AbstractVVC

class Norm

trait Something extends Any

@valhalla
class VVCeT extends AnyVal with Something:
  val x = 10
  def addX(y: Int):Int = y + x

class Main:
  val cond = new VVC().x % 2 == 9
//  val z :VVC = new VVC()
  val s = if cond then new VVC() else null
//  val w: AbstractVVC | Null = if cond then new Child() else null
//  val s1 : VVC = if cond then new VVC() else null
  val s2 : VVC | Null = if cond then new VVC() else null
//  val t : Norm | Null = if cond then new Norm() else null
//  val u = if cond then new VVC() else new Norm()
//  val v: Something | Null = if cond then new VVCeT() else null
