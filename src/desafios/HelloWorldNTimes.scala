package desafios

object HelloWorldNTimes extends App {
  def f(n: Int): Unit = {
    println("Hello World");

    if(n>1) {
      f(n-1)
    }
  }

  f(10);
}
