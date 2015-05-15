package euler.problems

object LargestPalindromeProduct {
    def isPalindrome(x: Int) = x.toString.reverse == x.toString
    def ofNumbersBetween(x: Int, y: Int) = {
        val max = math.max(x, y)
        val min = math.min(x, y)
        (for {
            factor1 <- max to min by -1
            factor2 <- factor1 to min by -1
            product = factor1 * factor2
            if(isPalindrome(product))
        } yield product).max
    }
}
