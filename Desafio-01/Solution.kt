data class Movie(
    var name: String = "The Knack ...and How to Get It",
    var link: String = "https://",
    var dataBaseName: String = "IMDB"
)

fun main() {
    val movie = Movie()
    // write a code which receives new values for link and dataBaseName from standard input

    val input = readln().split(" ")

    // and configures your data class parameters
    movie.link = input[1]
    movie.dataBaseName = input[0]

    print(movie)
}