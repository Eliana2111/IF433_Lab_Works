package oop_136309_FeliciaAulia.week14
import java.io.File

class BadOrderProcessor {
    private val file = File("orders.csv")

    fun processOrder(itemName: String, basePrice: Double, customerType: String) {
        val finalPrice = when (customerType) {
            "REGULER" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        file.appendText("$itemName,$finalPrice,$customerType\n")

        println("Email terkirim: Pesanan $itemName Anda telah dikonfirmasi!")
    }
}

interface OrderRepository {
    fun saveOrder(orderDetails: String)
}

class CsvOrderRepository(
    private val fileName: String
) : OrderRepository {

    override fun saveOrder(orderDetails: String) {

        File(fileName).bufferedWriter().use { writer ->
            writer.appendLine(orderDetails)
        }
    }
}

interface NotificationService {
    fun sendNotification(message: String)
}

class EmailNotifier : NotificationService {

    override fun sendNotification(message: String) {
        println("Email terkirim: $message")
    }
}

class SafeOrderProcessor(
    private val repo: OrderRepository,
    private val notifier: NotificationService
) {

    fun processOrder(
        itemName: String,
        basePrice: Double,
        customerType: String
    ) {

        val finalPrice = when (customerType) {
            "REGULER" -> basePrice
            "VIP" -> basePrice * 0.90
            else -> basePrice
        }

        println("Memproses pesanan $itemName seharga $finalPrice")

        repo.saveOrder("$itemName,$finalPrice,$customerType")

        notifier.sendNotification(
            "Pesanan $itemName Anda telah dikonfirmasi!"
        )
    }
}

interface PricingStrategy {
    fun calculate(price: Double): Double
}

class RegularPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price
    }
}

class VipPricing : PricingStrategy {

    override fun calculate(price: Double): Double {
        return price * 0.90
    }
}
