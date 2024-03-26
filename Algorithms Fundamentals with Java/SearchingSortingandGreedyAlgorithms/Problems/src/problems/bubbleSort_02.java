package problems;

import java.util.Arrays;
import java.util.Scanner;

public class bubbleSort_02 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
	
		bubSort(arr);
		for (int el : arr) {
			System.out.print(el + " ");
		}
	}

	private static void bubSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] < arr[i]) {
					swap(arr, i, j);
				}
			}
		}
	}

	private static void swap(int[] arr, int first, int second) {
		int temp = arr[first];
		arr[first] = arr[second];
		arr[second] = temp;
	}

}
