import java.util.Scanner;

public class VariationsWithRepetition_04 {
	public static String[] elements;
	public static String[] variations;
	public static boolean[] used;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		elements = scanner.nextLine().split("\\s+");

		variations = new String[Integer.parseInt(scanner.nextLine())];

		used = new boolean[elements.length];
		variations(0);
	}

	private static void variations(int index) {
		if (index >= variations.length) {
			print(variations);
			return;
		}

		for (int i = 0; i < elements.length; i++) {
			variations[index] = elements[i];
			variations(index + 1);
		}
	}

	private static void print(String[] variations2) {
		System.out.println(String.join(" ", variations2));
	}
}
