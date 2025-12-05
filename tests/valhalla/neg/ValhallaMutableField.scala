import scala.annotation.valhalla

@valhalla
trait VTMutableField(var param: Int) extends Any { // error
  var a = 5 // error
}

@valhalla
class VVCMutableField(var param: Int) extends AnyVal { // error
  var a = 5 // error
}