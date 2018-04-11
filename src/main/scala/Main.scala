import br.unb.cic.epl._

object Main extends App {
  val lit100 = new Literal(100)
  val lit500 = new Literal(500)

  println(lit100.print())
  println(lit500.print())

  val eval = new Eval
  val add = new Add(lit100, lit500)
  val sub = new Sub(lit100, lit500)
  val mult = new Mult(lit100, lit500)

  eval.visit(add)
  println(add.print() + " = " + eval.result())
  eval.visit(sub)
  println(sub.print() + " = " + eval.result())
  eval.visit(mult)
  println(mult.print() + " = " + eval.result())
}