package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class LongestIncreasingSubsequence_02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] sequence = { 3,14, 5, 12, 15, 7, 8, 9, 11, 10 , 1};
		
		int[] length = new int[sequence.length];
		for (int i = 0; i < sequence.length; i++) {
			int current = sequence[i];
			int bestLength = 0;
			for (int j = i - 1; j > 0; j--) {
				if (sequence[j] < current && length[j] + 1> bestLength) {
					bestLength = length[j] + 1;
				}
			}
			length[i] = bestLength;
		}
		System.out.println(Arrays.stream(length).max().getAsInt());
	}
}
