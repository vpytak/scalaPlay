/*
Solution works ok for target in range of Int
We have problem for Long target with max divider Long
*/
object Piska {
  def divider(data: Tuple2[Long, Int], divider: Int):Tuple2[Long, Int] = {
    var res = data
    if (res._1 != 0)
      if (divider > Math.sqrt(res._1)) 
        res = (res._1, res._1.toInt)
      else
        while (res._1%divider==0) {
          res = (res._1/divider, divider)
        }
    
    res
  }
  def main(args: Array[String]) {
    val target = 600851475143L
    println((2 to Math.sqrt(target).toInt).foldLeft(target.toLong,1)(divider)._1)
  }
}

Piska.main(args)
