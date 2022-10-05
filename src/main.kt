fun main() {
    val nums: IntArray = intArrayOf(10, 22, 33, 44, 55, 65)
    println(sumArray(nums))
    println(Palindrome("asA"))
}

fun sumArray(array: IntArray): Int{
    var sum = 0
    for(number in array.indices) {
        if (number % 2 == 1) {
            sum += array[number]
        }
    }
    return sum
}

fun Palindrome(value: String): Boolean{
    var str = value.reversed()
    return str.lowercase().equals(value.lowercase())
}