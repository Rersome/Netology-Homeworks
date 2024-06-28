fun main() {
    val commission = 0.075
    val minCommission = 35
    val amount = 1000

    var totalPrice = if (amount * commission > minCommission) println("С суммы $amount было удержано " +
            amount * commission) else println("С суммы $amount было удержано " +
            minCommission)
}