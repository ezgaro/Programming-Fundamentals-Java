package problems;

import java.util.Arrays;
import java.util.Scanner;

public class mergeSort_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] arr = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		
		StringBuilder builder = new StringBuilder();
		sort(arr);
		for(int el : arr) {
			builder.append(el).append(" ");
		}
		System.out.println(builder.toString());
	}

	private static void sort(int[] arr) {
		mergeSort(arr, 0, arr.length - 1);
	}

	private static void mergeSort(int[] arr, int begin, int end) {
		if(begin >= end) {
			return;
		}
		
		int mid = (begin + end) / 2;
		mergeSort(arr, begin, mid);
		mergeSort(arr, mid + 1, end);
		
		merge(arr, begin, mid,end);
	}

	private static void merge(int[] arr, int begin, int mid, int end) {
		if(mid < 0 || mid >= arr.length || arr[mid] < arr[mid + 1]) {
			return;
		}
		int left = begin;
		int right = mid + 1;
		int[] helper = new int[arr.length];
		
		for (int i = begin; i <= end; i++) {
			helper[i] = arr[i];
			
		}
		
		for(int i = begin; i <= end; i++) {
			if(left > mid) {
				arr[i] = helper[right++];
				
			} else if(right > end) {
				arr[i] = helper[left++];
			} else if(helper[left] < helper[right]) {
				arr[i] = helper[left++];
			} else {
				arr[i] = helper[right++];
			}
		}
	}
}
