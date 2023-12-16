import java.util.*
fun main() {
    val scanner = Scanner(System.`in`)


    println("Введите количество строк:")
    val rows = scanner.nextInt()
    println("Введите количество столбцов:")
    val cols = scanner.nextInt()


    val array = Array(rows) { IntArray(cols) }


    println("Введите трехзначные числа:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            array[i][j] = scanner.nextInt()
        }
    }
    

    val digitSet = mutableSetOf<Int>()

    // Подсчитываем уникальные цифры
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            val num = array[i][j]
            digitSet.addAll(getDigits(num))
        }
    }


    println("Двумерный массив:")
    for (i in 0 until rows) {
        for (j in 0 until cols) {
            print("${array[i][j]}\t")
        }
        println()
    }
    println("В массиве использовано ${digitSet.size} различных цифр")
}


fun getDigits(num: Int): List<Int> {
    val digits = mutableListOf<Int>()
    var n = num
    while (n > 0) {
        digits.add(n % 10)
        n /= 10
    }
    return digits
}
