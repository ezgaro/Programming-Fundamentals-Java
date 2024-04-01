package problems;

import java.util.Arrays;
import java.util.Scanner;

public class SumUnlimitedAmountofCoins_04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] coins = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		int target = Integer.parseInt(scanner.nextLine());
		scanner.close();
		
		int[] dp = new int[coins.length + 1];
		dp[0] = 1;
		
		for (int i = 0; i < coins.length; i++) {
			for (int j = coins[i]; j <= target; j++) {
				dp[j] += dp[j - coins[i]];
			}
		}
	}
}
