import scala.annotation.valhalla

@valhalla
trait VVCMutableField extends Any {
  var a = 5 // error
}