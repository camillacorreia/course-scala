package desafios

object SumOfOddElements extends App {
  def f(arr:List[Int]): Unit = {
    val res = arr.filter(_ % 2 != 0).sum;

    println(res);
  };

  f(List(10, 9, 8, 2, 7, 5, 1, 3, 0))
}
