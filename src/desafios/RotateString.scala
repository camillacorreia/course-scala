package desafios

object RotateString extends App {
  def f(): Unit = {
    (1 to scala.io.StdIn.readInt()) foreach { _ =>
      val s = scala.io.StdIn.readLine();
      println( (1 to s.size).map( i => s.substring(i).concat(s.substring(0,i))).mkString(" "))
    }
  };

  f();
}
