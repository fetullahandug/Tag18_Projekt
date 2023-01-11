fun main() {
    var numbers: List<Int> = listOf(1, 2, 3, 4)
    var number: Int

    try{
        number = numbers[10]

    }catch(e: Exception){
        println("Es ist ein Fehler aufgetreten!")
        println("Folgende Meldung: ${e.message}")
    }
}