package oop_136309_FeliciaAulia.belajar

enum class MembershipLevel(val discount: Double) {
    BRONZE(0.1), SILVER(0.15), GOLD(0.2)
}

data class DigitalProduct (val tittle: String, val price: Double, val rarity: MembershipLevel) {}

sealed class PurchaseStatus{

}