class Ident(val id: Int)

case class Book(isbn: String)

class Main{
  def main = {
    val a: Int = 5
    val b: Int = 6
    val intEqualsEquals = (a == b) // if_icmpne

    val c: Ident = new Ident(1)
    val d: Ident = new Ident(2)
    val classEqualsEquals = (c == d) // java/Object.equals

    val e: Ident = new Ident(1)
    val f: Ident = new Ident(2)
    val classEq = e.eq(f) // if_acmpne

    val frankenstein = Book("978-0486282114")
    val frankenstein1 = Book("978-0486282114")
    val caseClassEquals = (frankenstein == frankenstein1) // java/Object.equals
  }
}