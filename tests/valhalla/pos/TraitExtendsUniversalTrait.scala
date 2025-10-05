import scala.annotation.valhalla

trait UniversalTrait extends Any

@valhalla
trait TraitExtendsUniversalTrait extends Any with UniversalTrait