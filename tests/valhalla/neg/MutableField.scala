import scala.annotation.valhalla

@valhalla
class MutableField extends AnyVal {
  var a = 5 // error
}