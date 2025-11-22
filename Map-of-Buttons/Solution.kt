data class TextField(
    var text: String = "Hello!",
    var textSize: Int = 12,
    var fontFamily: String = "Roboto"
)

fun main() {
    val textField = TextField()

    val valuesMap = mapOf<String, Int>(
        "Cancel" to 12,
        "Button" to 14,
        "Submit" to 13
    )

    textField
        .apply {
            // Write your code here

            when (val input = readln()) {
                "Button" -> {
                    text = input
                    textSize = valuesMap[input]!!
                }
                "Cancel" -> {
                    text = input
                    textSize = valuesMap[input]!!
                }
                "Submit" -> {
                    text = input
                    textSize = valuesMap[input]!!
                }
            }

        }
        .also { println("New settings: $it") }
}