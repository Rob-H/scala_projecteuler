import problem4._
import org.scalatest._

class Problem4Spec extends FlatSpec with Matchers { 
    "isPalindrome" should "be true for 101" in {
        LargestPalindromeProduct.isPalindrome(101) should be (true)
    }

    "isPalindrome" should "be false for 23" in {
        LargestPalindromeProduct.isPalindrome(23) should be (false)
    }

    "ofNumbersBetween" should "be 9009 for 10 & 99" in {
        LargestPalindromeProduct.ofNumbersBetween(10, 99) should be (9009)
    }

    "ofNumbersBetween" should "be 99 for 1 & 10" in {
        LargestPalindromeProduct.ofNumbersBetween(1, 10) should be (9)
    }
}
