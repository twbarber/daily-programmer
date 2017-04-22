/**
 * [2017-04-17] Challenge #311 [Easy] Jolly Jumper
 */
fun isJollyJumper(seq: CharSequence) : Boolean {
    val values = seq.split(" ").map(String::toInt)
    return (1..values[0] - 1)
            .map { it -> Math.abs(values[it] - values[it + 1]) }
            .containsAll((1..values[0] - 1).toCollection(arrayListOf()))
}