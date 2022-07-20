package homework3



fun main() {
    val scan = java.util.Scanner(System.`in`)
    val n = scan.nextInt()
    val set = mutableSetOf<Pair<Int, Int>>()
    for (i in 1..n) {
        val x = scan.nextInt()
        val y = scan.nextInt()
        val pair = x to y
        val isPositive = x >= 0 && y >= 0
        val isCorrect = x + y + 1 == n
        if (isCorrect && isPositive && !set.contains(pair)) {
            set.add(pair)
        }
    }
    println(set.size)
}