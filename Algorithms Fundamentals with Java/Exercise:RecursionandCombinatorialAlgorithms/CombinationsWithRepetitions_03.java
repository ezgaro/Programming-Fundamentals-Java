package stefan;

import java.util.Scanner;

public class CombinationsWithRepetitions_03 {
	public static int[] arr;
	public static int n;
			
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		n = Integer.parseInt(scanner.nextLine());
		int k = Integer.parseInt(scanner.nextLine());
		
		arr = new int[k];
		combinate(0, 1);
	}

	private static void combinate(int index, int start) {
		if(index == arr.length) {
			printArr();
		} else {
			for(int i = start; i <= n; i++) {
				arr[index] = i;
				combinate(index + 1, i);
			}
		}
	}

	private static void printArr() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
