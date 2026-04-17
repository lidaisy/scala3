import valuelib.*
import scala.annotation.valhalla

@valhalla
case class Pig(id: Int, luckyNumber: Int) extends AnyVal

@valhalla
case class Horse(id: Int) extends AnyVal

@valhalla
case class PigWithSomeHorse(id: Int, luckyNumber: Int, favouriteHorse: Option[Horse]) extends AnyVal

@valhalla
case class PigWithValueSomeHorse(id: Int, luckyNumber: Int, favouriteHorse: ValueOption[Horse]) extends AnyVal

@valhalla
class NonCaseClassPig(val id: Int, val luckyNumber: Int) extends AnyVal

class IdentityPig(val id: Int, val luckyNumber: Int)

@valhalla
case class GirlWithSomePig(id: Int, pig: IdentityPig) extends AnyVal

class Main:
    def main: Unit = {
        val clover = Horse(10)
        val clover1 = Horse(10)
        val notClover = Horse(11)

        val napoleon = PigWithValueSomeHorse(1, 2, ValueSome(clover))
        val napoleon1 = PigWithValueSomeHorse(1, 2, ValueSome(clover))
        val napoleon2 = PigWithValueSomeHorse(1, 2, ValueSome(clover1))

        val snowball = PigWithSomeHorse(1, 2, Some(clover))
        val snowball1 = PigWithSomeHorse(1, 2, Some(clover))
        val snowball2 = PigWithSomeHorse(1, 2, Some(clover1))

        val oldMajor = NonCaseClassPig(1, 2)
        val oldMajor1 = NonCaseClassPig(1, 2)

        val fluffy = IdentityPig(1, 2)
        val fluffy1 = IdentityPig(1, 2)
        val notFluffy = IdentityPig(1, 3)

        assert(clover == clover1 && clover != notClover) // valhalla case class
        assert(oldMajor == oldMajor1) // valhalla class

        assert(napoleon == napoleon1 && napoleon == napoleon2) // value some containing valhalla class
        assert(snowball == snowball1 && snowball == snowball2) // deep case class equals
    }