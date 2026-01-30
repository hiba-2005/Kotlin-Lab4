fun getPoints(basePoints: Int, boost: Int): Int {
    val total = basePoints * boost
    println("Points calculés : $basePoints * $boost = $total")
    return total
}
fun main() {
    var score = 0
    println("Score initial : $score")

    score += getPoints(23, 5)
    println("Score après 1ère action : $score")

    score += getPoints(34, 2)
    println("Score après 2ème action : $score")

    score += getPoints(-55, 1)
    println("Score final : $score")
}