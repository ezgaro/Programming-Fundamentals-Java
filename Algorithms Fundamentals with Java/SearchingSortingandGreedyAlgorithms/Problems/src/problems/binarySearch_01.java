package problems;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		int n = Integer.parseInt(scanner.nextLine());
		int index = binarySearch(arr, n);
		System.out.println(index);
	}

	private static int binarySearch(int[] arr, int number) {
		int start = 0;
		int end = arr.length - 1;
		while(start <= end) {
			int mid = start + (end - start) / 2;
			if(number > arr[mid]) {
				start = mid + 1;
			} else if(number < arr[mid]) {
				end = mid - 1;
			} else {
				return mid;
			}
		}
		return -1;
	}
}
