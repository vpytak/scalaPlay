object Piska {
  def divValid(x: Int) = (x%3==0 || x%5==0)
  def main(args: Array[String]) {
    println((1 to 999).filter(divValid).foldLeft(0)(_+_))
  }
}

Piska.main(args)
