import euler.problems._
import org.scalatest._

class Problem1Spec extends FlatSpec with Matchers {
    it should "return 23 for below 10" in {
        MultiplesOf3And5.sumUntil(10) should be (23) 
    }

    it should "return 33 for below 11" in {
        MultiplesOf3And5.sumUntil(11) should be (33) 
    }
} 
