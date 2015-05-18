package euler.problems

object SmallestNumberDivisibleBy {
    def allIntegersUpTo(max: Int) = (max to Int.MaxValue).find(x => (1 to max).forall(x % _ == 0)).get

}
