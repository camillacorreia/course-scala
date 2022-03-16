package desafios

object ListReplication extends App {
  def f(num:Int, arr:List[Int]): Unit = {
    val res = arr.flatMap(List.fill(num)(_));

    println(res);
  };

  f(2, List(1, 2, 3, 4))
}
