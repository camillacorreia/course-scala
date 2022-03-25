package desafios

object FilterArray extends App {
  def f(delim:Int, arr:List[Int]): Unit = {
    val res = arr.filter(_ < delim);

    println(res);
  };

  f(3, List(10, 9, 8, 2, 7, 5, 1, 3, 0))
}
