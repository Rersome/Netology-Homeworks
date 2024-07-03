val MAX_SUM_DAY = 150_000.0
val MAX_SUM_MONTH = 600_000.0
val MONTH_LIMIT = 75_000.0
val PROCENT_COMMISSION_MASTERCARD = 0.006
val LITTLE_FEE_MASTERCARD = 20.0
val PROCENT_COMMISSION_VISA = 0.0075

fun main() {
    println(calculateCommission("Mastercard", 1500.0, 150000.0))
}

fun calculateCommission(cardType: String = "Mir", previousSum: Double = 0.0, sum: Double): String {

    if (sum > MAX_SUM_DAY) {
        return "Дневной лимит был превышен"
    }

    if (previousSum + sum > MAX_SUM_MONTH) {
        return "Месячный лимит был превышен"
    }

    val commission = when (cardType) {
        "Mir" -> 0.0
        "Mastercard" -> {
            when {
                sum + previousSum <= MONTH_LIMIT -> 0.0
                previousSum >= MONTH_LIMIT -> PROCENT_COMMISSION_MASTERCARD * sum + LITTLE_FEE_MASTERCARD
                else -> PROCENT_COMMISSION_MASTERCARD * (sum + previousSum - MONTH_LIMIT) + LITTLE_FEE_MASTERCARD
            }
        }
        "Visa" -> maxOf(PROCENT_COMMISSION_VISA * sum, 35.0)
        else -> null
    }
    return "Коммиссия составила $commission"
}