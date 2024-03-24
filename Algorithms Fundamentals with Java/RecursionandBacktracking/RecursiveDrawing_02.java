import java.util.Scanner;

public class RecursiveDrawing_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		draw(n);
		reverseDraw(n);
		
	}

	private static void reverseDraw(int n) {
		if(n == 0) {
			return;
		}
		
		reverseDraw(n - 1);
		for (int i = 0; i < n; i++) {
			System.out.print("#");
		}
        System.out.println();
	}

	private static void draw(int n) {
		if (n == 0) {
			return;
		}
		for (int i = 0; i < n; i++) {
			System.out.print("*");
		}
		System.out.println();

		draw(n - 1);
	}
}
