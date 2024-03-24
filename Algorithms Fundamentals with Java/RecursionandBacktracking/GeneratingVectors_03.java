import java.util.Scanner;

public class GeneratingVectors_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = Integer.parseInt(scanner.nextLine());
		int[] vector = new int[n];
		
		generate(vector, n);
	}

	private static void generate(int[] vector, int index) {
		for(int i = 0; i <= 1; i++) {
			vector[index] = i;
			generate(vector, index + 1);
		}
		
	}
}
