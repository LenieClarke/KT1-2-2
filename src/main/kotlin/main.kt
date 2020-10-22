fun main() {
    val likes = 61
    val optionsToShowLikes = if (likes%10 == 1 && likes%100 != 11) "Понравилось $likes человеку"
    else "Понравилось $likes людям"
    println(optionsToShowLikes)
}