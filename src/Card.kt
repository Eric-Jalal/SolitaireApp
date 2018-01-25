class Card(val value: Int, val suit: String, var faceUp: Boolean = false) {
    companion object {
        val clubs = "Clubs"
        val diamonds = "Diamond"
        val hearts = "Hearts"
        val spades = "Spades"
    }
}