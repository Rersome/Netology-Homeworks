fun main() {
    val minDiscount = 100
    val procentDiscount = 0.05
    val priceForMaxDiscount = 10_001
    val priceForMinDiscount = 1001
    val discountRegularCustomer = 0.01

    val amount = 1002

    var finalPrice = amount
    var isRegularCustomer = true

    if (amount > priceForMaxDiscount) {
        finalPrice -= (amount * procentDiscount).toInt()
        if (isRegularCustomer) {
            finalPrice -= (finalPrice * discountRegularCustomer).toInt()
            println("Итоговая стоимость покупки составляет: $finalPrice")
        } else if (!isRegularCustomer) {
            println("Итоговая стоимость покупки составляет: $finalPrice")
        }
    } else if (amount > priceForMinDiscount) {
        finalPrice = amount - minDiscount
        if (isRegularCustomer) {
            finalPrice -= (finalPrice * discountRegularCustomer).toInt()
            println("Итоговая стоимость покупки составляет: $finalPrice")
        } else if (!isRegularCustomer) {
            println("Итоговая стоимость покупки составляет: $finalPrice")
        }
    } else if (amount < priceForMinDiscount) {
        if (isRegularCustomer) {
            finalPrice -= (finalPrice * discountRegularCustomer).toInt()
            println("Итоговая стоимость покупки составляет: $finalPrice")
        } else if (!isRegularCustomer) {
            println("Итоговая стоимость покупки составляет: $finalPrice")
        }
    }
}