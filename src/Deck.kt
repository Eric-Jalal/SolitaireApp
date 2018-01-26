import java.util.*

class Deck {
    val cards = Array(52, { Card(it % 13, getSuit(it)) })
    var cardsInDeck: MutableList<Card> = cards.toMutableList()

    private fun getSuit(i: Int) = when(i / 13) {
        0 -> Card.clubs
        1 -> Card.diamonds
        2 -> Card.hearts
        else -> Card.spades
    }

    fun drawCard(): Card = cardsInDeck.removeAt(0)

    fun reset() {
        cardsInDeck = cards.toMutableList()
        Collections.shuffle(cardsInDeck)
    }
}