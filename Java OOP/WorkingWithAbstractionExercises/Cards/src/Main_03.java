import java.util.Scanner;

public class Main_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String rank = scanner.nextLine();
		String suit = scanner.nextLine();
		Card card = new Card(CardRanks.valueOf(rank.toUpperCase()),CardSuits.valueOf(suit.toUpperCase()));
		
		System.out.println(card.toString());
	}
}
