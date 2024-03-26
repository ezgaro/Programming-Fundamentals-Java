package stefan;

import java.util.Scanner;

public class revArray_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String[] elements = scanner.nextLine().split("\\s+");
		
		revPrint(elements, elements.length - 1);
	}

	private static void revPrint(String[] elements, int index) {
		if(index < 0) {
			return;
		}
		
		System.out.print(elements[index] + " ");
		revPrint(elements, index - 1);
	}
}
