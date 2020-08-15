package Kot

class Seller(name: String, age: Int): Worker(name, age), Cleaner {
    override fun work() {
        println("Продаю товр")
    }

    override fun clean() {
        println("Продавец убирает")
    }
}