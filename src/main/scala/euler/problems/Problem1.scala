package euler.problems

object MultiplesOf3And5{
    def sumUntil(i: Int): Int = (3 until i).filter(x => x % 3 == 0 || x % 5 == 0).sum 
}

