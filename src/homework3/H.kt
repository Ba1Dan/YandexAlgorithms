package homework3

import java.util.*


fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val set = mutableSetOf<Int>()
    for (i in 1..n) {
        val x = scan.nextInt()
        val y = scan.nextInt()
        set.add(x)
    }
    println(set.size)
}