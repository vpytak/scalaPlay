object Piska {
  def isPol(numb :Int) = {
    numb.toString.compareTo(numb.toString.reverse) == 0
  }
  def maxPol(vals: List[Int]):Int = {
    (0 :: vals.filter(isPol)).reduceLeft { _ max _ }
  }
  def maxPolMultiplied(mult: Int):Int = {
    maxPol(((100 to 999) toList).map(_*mult))
  }
  def main(args: Array[String]) {
    println((100 to 999).foldLeft(0) (_ max maxPolMultiplied(_)))
  }
}

Piska.main(args)
