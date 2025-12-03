class Control {
  val c = 9

  def print = println("Hello! " + c)
}

class Main{
  def main() = {
    val c: Control = new Control
    c.print
  }
}
