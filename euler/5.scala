object Piska {
  def divIfPossible(data: Int, divider:Int) = {
    if (data % divider == 0) {
      data/divider
    } else {
      data
    }
  }
  def divUsingErato(data: Tuple2[Int, List[Int]], number: Int): Tuple2[Int, List[Int]] = {
    val divider = data._2(number - 1)
    val res = (data._1 * divider, data._2.map(s => divIfPossible(s, divider)))
    res
  }
  def main(args: Array[String]) {
    val targetList = ((1 to 20) toList)
    println(targetList.foldLeft(1,targetList) (divUsingErato)._1)
  }
}

Piska.main(args)
