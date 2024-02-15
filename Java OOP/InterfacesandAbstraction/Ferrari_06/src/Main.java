import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String driverName = scanner.nextLine();
		Car car = new Ferrari();
		System.out.println(car.toString());
	}
}
