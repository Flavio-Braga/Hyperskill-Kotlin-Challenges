fun digitSum(n: Int): Int {
    // base case / terminal condition here
    if (n < 10) return n

    // recursive call here
    return digitSum(n / 10) + n % 10
}

fun main() {

    val number = readln()

    println(digitSum(number))

}


