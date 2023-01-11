fun main() {
    try{
        divideByZero(5)
    }catch(e: Exception){
        println("Es ist ein Fehler aufgetreten!")
    }
}

fun divideByZero(number: Int): Int {
    return number / 0
}
