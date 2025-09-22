object Extensions {
  class VC(val underlying : Int)

  extension(v: VC)
    def timesTen: Int = v.underlying * 10
}

class Main1 {
  def main(): Unit = {
    val vc = new Extensions.VC(10)
    val x = vc.timesTen
  }
}