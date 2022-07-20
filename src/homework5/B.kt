package homework5

import java.util.*


fun main() {
    val scanner = Scanner(System.`in`)

    val (n , k) = scanner.nextLine().split(" ").map { it.toInt() }
    val numbers = scanner.nextLine().split(" ").map { it.toInt() }.toTypedArray()
    println(subarraySum(numbers, k))
}

fun subarraySum(nums: Array<Int>, k: Int): Int {
    var count = 0
    var sum = 0
    val map = HashMap<Int, Int>()
    map[0] = 1
    for (i in nums.indices) {
        sum += nums[i]
        if (map.containsKey(sum - k)) count += map[sum - k]!!
        map[sum] = map.getOrDefault(sum, 0) + 1
    }
    return count
}