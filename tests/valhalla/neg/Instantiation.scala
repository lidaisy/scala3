import scala.annotation.valhalla

class Baz

@valhalla
abstract class Foo[A](value: A) extends AnyVal with DeepValhalla

@valhalla
abstract class ValueOption[+A] extends AnyVal with DeepValhalla

@valhalla
class ValueSome[+A](value: A) extends ValueOption[A] {
    def get: A = value
}

class Bar:
    def foobar() = {
        val y = new Foo(new Baz) { } // error
        val z = ValueSome(new Baz) // error
    }