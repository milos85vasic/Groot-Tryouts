package net.milosvasic.tryout.groot.kotlin

fun main(args: Array<String>) {

    println("Trying out Groot.")
    println("${BuildConfig.NAME} ${BuildConfig.VERSION} ${BuildConfig.VARIANT}")

    val items = mutableListOf("Lion", "Elephant")
    items.add("Cow")
    items.forEach(::println)

    val car = Car("Fiat", "Benzin")
    println(car.toString())

}
