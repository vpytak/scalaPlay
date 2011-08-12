object Piska {
  def main(args: Array[String]) {
    val topLimit = 100
    val targetList = ((1 to topLimit) toList)
    val sumSquares = targetList.map(s => s * s).foldLeft(0)(_+_)
    val sum = targetList.foldLeft(0)(_+_)
    println(sum * sum - sumSquares)
  }
}

Piska.main(args)
