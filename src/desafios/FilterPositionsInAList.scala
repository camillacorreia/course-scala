package desafios

object FilterPositionsInAList extends App {
  def f(arr:List[Int]): Unit = {
    val res = arr.zipWithIndex.filter(_._2 % 2 == 1).map(_._1);

    println(res);
  };

  f(List(8, 15, 22, 1, 10, 6, 2, 18, 1))
}
