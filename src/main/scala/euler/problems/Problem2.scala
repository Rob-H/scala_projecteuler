package euler.problems

object Fibonacci {
    val sequence: Stream[Int] = 1 #:: 2 #:: sequence.zip(sequence.tail).map(x => x._1 + x._2)
    def sumEvenNumbersThatDoNotExceed(limit: Int) = sequence.takeWhile(_ <= limit).filter(_ % 2 == 0).sum
}
