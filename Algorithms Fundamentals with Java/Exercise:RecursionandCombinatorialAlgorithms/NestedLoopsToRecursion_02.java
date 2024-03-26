package stefan;

import java.util.Scanner;

public class NestedLoopsToRecursion_02 {
	public static int[] arr;
	public static int n;
			
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		n = Integer.parseInt(scanner.nextLine());
		
		arr = new int[n];
		permute(0);
	}

	private static void permute(int index) {
		if(index == arr.length) {
			printArr();
		} else 
			for(int i = 1; i <= n;i++) {
				arr[index] = i;
				permute(index + 1);
			}
		}

	private static void printArr() {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
