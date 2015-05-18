package euler.problems

import org.scalatest._

class Problem5Spec extends FlatSpec with Matchers {
    it should "return 2520 for 1 to 10" in {
        SmallestNumberDivisibleBy.allIntegersUpTo(10) should be (2520)
    } 
}
