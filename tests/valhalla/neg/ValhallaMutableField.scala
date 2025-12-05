import scala.annotation.valhalla

@valhalla
trait VTMutableField(var param: Int) extends Any {
  var a = 5 // error
}

@valhalla
class VVCMutableField(var param: Int) extends AnyVal {
  var a = 5 // error
}