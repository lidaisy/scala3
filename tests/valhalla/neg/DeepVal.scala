import scala.annotation.valhalla

class A extends DeepValhalla // error

@valhalla
class B extends AnyVal

@valhalla class C(val b: B) extends AnyVal with DeepValhalla // error

class D

@valhalla class E(val d: D) extends AnyVal with DeepValhalla // error

trait Fred extends Any with Product

@valhalla
class George extends AnyVal with DeepValhalla with Fred // error