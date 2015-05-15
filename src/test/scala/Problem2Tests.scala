import euler.problems._
import org.scalatest._

class Problem2Spec extends FlatSpec with Matchers {
    "Fibonacci sequence" should "return [1] for 1" in {
        Fibonacci.sequence.take(1).toList should equal (List(1))
    }

    "Fibonacci sequence" should "return [1, 2] for 2" in {
        Fibonacci.sequence.take(2).toList should equal (List(1, 2))
    }

    "Fibonacci sequence" should "return [1, 2, 3, 5, 8, 13, 21, 34, 55, 89] for 10" in {
        Fibonacci.sequence.take(10).toList should equal (List(1, 2, 3, 5, 8, 13, 21, 34, 55, 89))
    }

    "Sum of even fibonacci sequence until" should "return 2 for 2" in {
        Fibonacci.sumEvenNumbersThatDoNotExceed(2) should equal (2)
    }

    "Sum of even fibonacci sequence until" should "return 10 for 8" in {
        Fibonacci.sumEvenNumbersThatDoNotExceed(8) should equal (10)
    }

    "Sum of even fibonacci sequence until" should "return 10 for 21" in {
        Fibonacci.sumEvenNumbersThatDoNotExceed(8) should equal (10)
    }
} 
