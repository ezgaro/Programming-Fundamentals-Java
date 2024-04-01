package problems;

import java.util.Arrays;
import java.util.Scanner;

public class LongestZigZagSubsequence_02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		scanner.close();
		
		int[][] dp = new int[numbers.length + 1][2];
		dp[0][0] = 1;
		dp[0][1] = 1;
		
		for(int currentIndex = 0; currentIndex < numbers.length;currentIndex++) {
			int current= numbers[currentIndex];
			for (int prevIndex = currentIndex - 1; prevIndex >= 0; prevIndex--) {
				int prev = numbers[prevIndex];
				if (current > prev) {
					dp[currentIndex][0] = Math.max(dp[currentIndex][0], dp[prevIndex][1] + 1);
				} else if (current < prev) {
					dp[currentIndex][1] = Math.max(dp[currentIndex][1], dp[prevIndex][0] + 1);
				}
			}
		}
	}
}
