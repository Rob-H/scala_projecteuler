package problem3

object LargestPrimeFactor {
    def isPrime(number: Long) = (2L to math.sqrt(number).toLong).forall(number % _ != 0)

    def factors(number: Long) = {
        def factors_p(nextAttempt: Long): Stream[Long] = {
            if(nextAttempt == 0) Stream.empty
            else if(number % nextAttempt == 0) nextAttempt #:: factors_p(nextAttempt - 1) 
            else factors_p(nextAttempt - 1)
        } 
        number #:: factors_p(number/2)
    }
    def of(number: Long) = factors(number).filter(isPrime).head
}
