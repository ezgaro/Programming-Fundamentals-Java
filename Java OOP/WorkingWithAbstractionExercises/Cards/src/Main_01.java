
public class Main_01 {
	public static void main(String[] args) {
		CardSuits[] cardSuits = CardSuits.values();
		System.out.println("Card suits: ");
		
		for(CardSuits cardSuit : cardSuits) {
			System.out.printf("Ordinal value: %d; Name value: %s\n", cardSuit.ordinal(), cardSuit.name());
		}
	}

	
	
}
