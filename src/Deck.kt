import java.util.*

class Deck {
    val cards = Array(52, { Cards(it % 13, getSuit(it)) })
    var cardsInDeck: MutableList<Cards> = cards.toMutableList()

    private fun getSuit(i: Int) = when(i / 13) {
        0 -> clubs
        1 -> diamonds
        2 -> hearts
        else -> spades
    }

    fun drawCard(): Cards = cardsInDeck.removeAt(0)

    fun reset() {
        cardsInDeck = cards.toMutableList()
        Collections.shuffle(cardsInDeck)
    }
}