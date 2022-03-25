package desafios

object ReverseAList extends App {
  def f(arr:List[Int]): Unit = {
    val res = arr.reverse;

    println(res);
  };

  f(List(10, 9, 8, 2, 7, 5, 1, 3, 0))
}
