import java.util.Scanner;

public class RhombusofStars {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		for(int i= 1 ; i <= n ; i++) {
			printRhombusLine(n, i);
		}
		
		for(int i = n - 1; i >= 1; i--) {
			printRhombusLine(n, i);
		}
	}

	private static void printRhombusLine(int rows, int currentRow) {
		for(int i = 0; i < rows- currentRow; i++) {
			System.out.print(" ");
		}
		for(int i = 0 ; i < currentRow; i++) {
			System.out.print("* ");
		}
		System.out.println();
	}

}
