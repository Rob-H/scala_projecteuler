import problem4._
import org.scalatest._

class Problem4Spec extends FlatSpec with Matchers { 
    "isPalindrome" should "be true for 101" in {
        LargestPalindromeProduct.isPalindrome(101) should be (true)
    }

    "isPalindrome" should "be false for 23" in {
        LargestPalindromeProduct.isPalindrome(23) should be (false)
    }
}
