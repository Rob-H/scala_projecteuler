import problem1._
import problem2._
import problem3._
object ProjectEuler { 
    def main(args: Array[String]) = {
        println("Problem 1: ") 
        println("\tThe sum of all multiples of 3 or 5 below 1000: " + MultiplesOf3And5.sumUntil(1000)) 
        println("Problem 2: ") 
        println("\tThe sum of all even Fibonacci numbers whose values do not exceed 4 million: " + Fibonacci.sumEvenNumbersThatDoNotExceed(4000000)) 
        println("Problem 3: ") 
        println("\tThe largest prime factor of 600851475143: " + LargestPrimeFactor.of(600851475143L)) 
    }
}
