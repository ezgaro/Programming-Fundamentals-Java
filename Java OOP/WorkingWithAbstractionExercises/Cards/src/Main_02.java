public class Main_02 {

	public static void main(String[] args) {
		CardRanks[] cardRanks = CardRanks.values();
		
		System.out.println("Card Ranks: ");
		for(CardRanks cardRank : cardRanks) {
			System.out.printf("Ordinal value: %d; Name value: %s\n", cardRank.ordinal(), cardRank.name());
		}
	}
	
}
