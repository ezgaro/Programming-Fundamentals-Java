public class Card {
	
	private final CardRanks name;
	private final CardSuits suit;
	
	public Card(CardRanks name, CardSuits suit) {
		this.name = name;
		this.suit = suit;
	}

	@Override
	public String toString() {
		return String.format("Card name: %s of %s; Card power: %d", this.name , this.suit, (this.name.getPower() + this.suit.getPower()) );
	}
}
