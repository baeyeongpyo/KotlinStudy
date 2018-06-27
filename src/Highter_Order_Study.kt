fun main(args: Array<String>) {

    listOf(1,2,3,4,5).fold(10){
        acc : Int, i : Int ->
        println("acc = $acc, i = $i")
        val result = acc + i
        println("result = $result")
        result
    }

    listOf(1,2,3,4,5).fold(1, Int::times)

}

fun <T1, T2> Collection<T1>.fold(
        init : T2,
        Combine : ( acc : T2, next : T1 ) -> T2 ) : T2 {
    var accum : T2 = init
    for( element : T1 in this){
        accum = Combine(accum, element)
    }
    return accum
}