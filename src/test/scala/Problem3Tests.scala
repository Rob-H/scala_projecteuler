import problem3._
import org.scalatest._

class Problem3Spec extends FlatSpec with Matchers { 
    it should "return 29 for 13195" in {
        LargestPrimeFactor.of(13195) should equal (29)  
    }

    it should "return 5 for 50" in {
        LargestPrimeFactor.of(50) should equal (5)  
    }

    "factors" should "return [4, 2, 1] for 4" in {
        LargestPrimeFactor.factors(4).toList should equal (List(4, 2, 1)) 
    }

    "factors" should "return [20, 10, 5, 4, 2, 1] for 20" in {
        LargestPrimeFactor.factors(20).toList should equal (List(20, 10, 5, 4, 2, 1)) 
    }

    "isPrime" should "return true for 5" in {
        LargestPrimeFactor.isPrime(5) should be (true)
    }

    "isPrime" should "return false for 6" in {
        LargestPrimeFactor.isPrime(6) should be (false)
    }
}
