package homework3

import java.util.*


fun main() {
    val scan = Scanner(System.`in`)
    val n = scan.nextInt()
    val setBig = mutableSetOf<String>()
    var m = scan.nextInt()
    for (j in 1..m) {
        setBig.add(scan.next())
    }
    var intersection = setBig
    for (i in 1 until n) {
        val setIteration = mutableSetOf<String>()
        m = scan.nextInt()
        for (j in 1..m) {
            val cur = scan.next()
            setIteration.add(cur)
            setBig.add(cur)
        }
        intersection = intersection.intersect(setIteration) as MutableSet<String>
    }
    println(intersection.size)
    for (item in intersection) {
        println(item)
    }
    setBig.remove("")
    println(setBig.size)
    for (item in setBig) {
        println(item)
    }
}