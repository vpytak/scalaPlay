object Piska {
  def fibona44i(topMember: Int): List[Int] = {
    var res = List(1,1)
    var top = 1

    while (top<=topMember) {
      top = res(0) + res(1)
      res = top :: res
    }

    res.drop(1)
  }
  def even(a: Int) = a%2==0
  def main(args: Array[String]) {
    println(fibona44i(4000000).filter(even).foldLeft(0)(_+_))
  }
}
Piska.main(args)
