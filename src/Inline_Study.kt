fun main(args: Array<String>) {
    (10).printa()
    15.printa()

    (10).printb { println("B Type") }
    15.printb { println("B Type") }
}

fun Int.printa() = println("this Number Type 1 = $this")

inline fun Int.printb(init : () -> Unit ) = println("this Number Type 2 = $this")