fun main() {

    try{
        buyItem()
    }catch(e: Exception){
        println("Es ist ein Fehler aufgetreten!")
    }

}

fun buyItem() {
    val isInStock = false

    if (isInStock) {
        // buying item
    } else {
        // exception
        throw Exception("item not in stock exception")
    }
}