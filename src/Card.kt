val clubs = "Clubs"
val diamonds = "Diamond"
val hearts = "Hearts"
val spades = "Spades"
val redSuits = arrayOf(diamonds, hearts)
val blackSuits = arrayOf(clubs, spades)gi

class Card(val value: Int, val suit: String, var faceUp: Boolean = false) {

}