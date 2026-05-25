package oop_136309_FeliciaAulia.week14

import java.lang.reflect.Type

class DiscountCalculator {
    fun calculate(price: Double, type: String): Double {
        return when (type) {
            "student" -> price * 0.80
            "members" -> price * 0.85
            "employee" -> price * 0.70
            else -> price
        }
    }
}