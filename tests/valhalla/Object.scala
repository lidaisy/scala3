// trait Tr:
//   object Hi:
//     val x = 4

// trait TR

// class c extends TR



// class Main {
//   def main = {
//     val a = new c
//     val cond = 4 == 4

//     val b: TR | Null = if cond then a else null
//   }
// }

import scala.annotation.valhalla

@valhalla
class A extends AnyVal{
  val x: Int = 4
}

@valhalla
class Z extends AnyVal{
  val z: Int = 42
}

class B {
  val a1: A = new A
  val a2: A = new A
  val z: Z = new Z
  val zz = z.z
}