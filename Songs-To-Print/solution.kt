fun main() {
    val title = readln()

    with(title) {
        println(if (length > 15) "OUR LONG SONG: ${title.uppercase()}"
                else "our short song: ${title.lowercase()}")
    }

}

