val MINUTE = 60
val DAY = 24 * 60

fun main() {
    println(calculateTime(61))
}

fun calculateTime(time: Int): String {
    return when (time) {
        in 0 .. MINUTE + 1 -> "был(а) только что"
        in MINUTE + 1 ..  (MINUTE * MINUTE) -> getMinutes((time / 60).toInt())
        in MINUTE * MINUTE + 1 ..  DAY * MINUTE -> getHour((time / (MINUTE * MINUTE)).toInt())
        in DAY * MINUTE ..  DAY * MINUTE * 2 -> "был(а) вчера"
        in DAY * MINUTE * 2 .. DAY * MINUTE * 3 -> "был(а) позавчера"
        else -> "был(а) давно"
    }
}

fun getMinutes(minutes: Int): String {
    return when (minutes) {
        1, 21, 31, 41, 51 -> "был(а) $minutes минуту назад"
        2, 3, 4, 22, 23, 24, 32, 33, 34, 42, 43, 44, 52, 53, 54 -> "был(а) $minutes минуты назад"
        in 5..9, in 25..29, in 35..39, in 45..49, in 55..59 -> "был(а) $minutes минут назад"
        else -> "был(а) $minutes минут назад"
    }
}

fun getHour(hours: Int): String {
    return when (hours) {
        1, 21 -> "был(а) $hours час назад"
        2, 3, 4, 22, 23, 24 -> "был(а) $hours часа назад"
        in 5..20 -> "был(а) $hours часов назад"
        else -> "был(а) $hours часов назад"
    }
}