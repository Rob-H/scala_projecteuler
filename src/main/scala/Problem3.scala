package problem3

object LargestPrimeFactor {
    def isPrime(number: Long) = (2L to math.sqrt(number).toLong).forall(number % _ != 0)

    def factors(number: Long) = {
        def factorsIter(small: List[Long], big: List[Long], next: Long): List[Long] = {
            if(next >= big.head) (big ::: small).distinct
            else if(number % next == 0) factorsIter(next :: small, number / next :: big, next + 1)
            else factorsIter(small, big, next + 1)
        } 
        factorsIter(List(1), List(number), 2)
    }
    def of(number: Long) = factors(number).filter(isPrime).sortBy(-_).head
}
