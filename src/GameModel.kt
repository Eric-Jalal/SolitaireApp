class GameModel {
    val deck = Deck()
    val wastePile: MutableList<Card> = mutableListOf()
    val foundationPiles: Array<FoundationPile> = arrayOf(FoundationPile("Clubs")
            , FoundationPile("Diamonds")
            , FoundationPile("Hearts")
            , FoundationPile("Spades"))
    val tableauPile = Array(7, { TableauPile()})

    fun resetGame() {
        wastePile.clear()
        for (pile in foundationPiles){
            pile.reset()
            foundationPiles.forEach { it.reset() }
        }
    }
}
