trait ATrait extends Any {
  val y : Int = 10000
  def absMeth(x: Int): Int
  def concreteMethod(x: Int, y: Int) = x * y
}

class VC(val underlying: Int) extends AnyVal with ATrait{
  def absMeth(x: Int): Int = {
    underlying + 42
  }
  def ownMeth(): Int = {
    underlying * 100
  }
}

class NormalClass extends ATrait{
  def absMeth(x: Int): Int = 42
  def ownMeth(y: Int): Int = 5
}

trait NormalTrait extends ATrait{
  def absMeth(x: Int): Int = 42
  def ownMeth(x: Int): Int = 200
}

trait TraitWithVal extends ATrait{
  val x: Int = 9
  def absMeth(x: Int): Int = 42
  def ownMeth(x: Int): Int = 200
}

class inheritsTrait extends TraitWithVal{

}

class Main {
  def main = {
    val vc : VC = new VC(100) // store somewhere
    val x = vc.absMeth(1000000) // Field VC$.MODULE$:LVC$, Method VC$.absMeth$extension
//    val y = vc.concreteMethod(3, 4) // here needs allocation

    val vc2: VC = new VC(200)
//    val cmp = vc.equals(vc2)

    val yy = vc.y
  }
}
