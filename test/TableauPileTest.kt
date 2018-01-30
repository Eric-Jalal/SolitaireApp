import org.junit.Test

import org.junit.Assert.*

class TableauPileTest {

    @Test
    fun addCard() {
        // arrange
        val tableauPile = TableauPile(mutableListOf(Card(12, spades)))
        val cards = mutableListOf(Card(11, hearts))

        // act
        tableauPile.addCard(cards)


        // assert
        assertEquals(2, tableauPile.cards.size)

    }

    @Test
    fun removeCards() {
    }
}