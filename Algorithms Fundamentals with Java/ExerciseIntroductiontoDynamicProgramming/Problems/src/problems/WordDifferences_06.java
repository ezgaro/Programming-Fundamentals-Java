package problems;

import java.util.Scanner;

public class WordDifferences_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char[] first = scanner.nextLine().toCharArray();
		char[] second = scanner.nextLine().toCharArray();
		scanner.close();
		
		int[][] dp = new int[first.length + 1][second.length + 1];
		for (int i = 1; i <= first.length; i++) {
			for(int j = 1; j <= second.length; j++) {
				if(i == 0) {
					dp[i][j] = j;
				} else if (j == 0) {
					dp[i][j] = i;
				} else {
					int cost = first[i] == second[j] ? 0 : 1;
					dp[i][j] = Math.min(dp[i - 1][j - 1] + cost, Math.min(dp[i - 1][j] + 1, dp[i][j - 1] + 1));
				}
			}
		}
	}
}
