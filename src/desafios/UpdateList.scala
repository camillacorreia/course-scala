package desafios

object UpdateList extends App {
  def f(arr:List[Int]): Unit = {
    val res = arr.map(Math.abs(_))

    println(res);
  };

  f(List(-10, 9, -8, -2, 7, -5, 1, 3, 0))
}
