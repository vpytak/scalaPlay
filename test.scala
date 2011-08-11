/*
http://www.spoj.pl/problems/TEST/
*/
import io.Source._

object test {
  def main(args: Array[String]) {
    fromFile("tests/42test.txt").getLines.takeWhile(!_.equals("42\n")).foreach(print)
  }
}
test.main(args)
