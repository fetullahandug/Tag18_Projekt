fun main() {
    println("Bitte gib dein Alter ein:")
    var alterInput = readln()

    try {
        val alter = alterInput.toInt()

        if(alter >= 18){
            println("Willkommen, hier ist dein Bier, let's party!")
        }else if(alter < 18){
            println("Sorry, kein Einlass zur Party. Ist ab 18")
        }else if(alter < 13){
            println("Komisches Alter für eine Party, right ?")
        }
    }catch(e: Exception){
        println("Ein Laufzeitfehler ist aufgetreten!")
    }
}