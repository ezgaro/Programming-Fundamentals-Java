import java.util.Scanner;

public class Main {

	Scanner scanner = new Scanner(System.in);
	String[] tokens = scanner.nextLine().split("\\s+");
	
	double pricePerDay = Double.parseDouble(tokens[0]);
	int days = Integer.parseInt (tokens[1]);
	Season season = Season.valueOf(tokens[2].toUpperCase());
	DiscountType discountType = DiscountType.fromString(tokens[3]);
	
	
	
	
}
