/*
Big defect that 111111 was found experamentally
*/
object Piska {
  def filterErato(data: List[Int], piece: Int) = {
    val divider =  data(0)
    data.filter(s => (s%divider != 0))
  }
  def main(args: Array[String]) {
    val count = 5
    var targetList = ((1 to 10000) toList)
    val helpList = ((2 to 111111) toList)

    println(targetList.foldLeft(helpList)(filterErato)(0))
  }
}
Piska.main(args)
