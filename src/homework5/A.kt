package homework5

import java.util.*
import kotlin.math.abs

fun main() {

    val `in` = Scanner(System.`in`)

    val n = `in`.nextInt()
    val shirts = IntArray(n)

    for (i in 0 until n) {
        shirts[i] = `in`.nextInt()
    }

    val m = `in`.nextInt()
    val pants = IntArray(m)
    for (i in 0 until m) {
        pants[i] = `in`.nextInt()
    }

    var counterShirt = 0
    var counterPants = 0
    var indexShirt = 0
    var indexPants = 0
    var dif = abs(shirts[counterShirt] - pants[counterPants])
    while (counterShirt < n && counterPants < m) {
        if (shirts[counterShirt] == pants[counterPants]) {
            indexShirt = counterShirt
            indexPants = counterPants
        }
        val curDif = abs(shirts[counterShirt] - pants[counterPants])
        if (curDif <= dif) {
            dif = curDif
            indexShirt = counterShirt
            indexPants = counterPants
        }

        if (shirts[counterShirt] < pants[counterPants]) {
            counterShirt++
        } else {
            counterPants++
        }
    }
    println("${shirts[indexShirt]} ${pants[indexPants]}")
}