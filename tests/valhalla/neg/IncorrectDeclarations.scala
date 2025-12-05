import scala.annotation.valhalla

@valhalla
class A // error

@valhalla
trait T // error

@valhalla
trait Uni extends Any

@valhalla
trait AnyRefTrait extends Uni // error
