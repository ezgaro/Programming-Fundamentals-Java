	package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MoveDownRight_03 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int rows = Integer.parseInt(scanner.nextLine());
		int cols = Integer.parseInt(scanner.nextLine());
		
		int[][] elements = new int[rows][cols];
		
		for(int row = 0 ; row < rows ;row++) {
			for(int col = 0 ; col < cols ; col++) {
				elements[row][col] = Integer.parseInt(scanner.nextLine());
            }		
		}
		int[][] dp = new int[rows][cols];
		
		dp[0][0] = elements[0][0];
		
		for (int col = 1; col < cols; col++) {
			dp[0][col] = dp[0][col] + elements[0][col];
		}
		
		for (int row = 1; row < rows; row++) {
			dp[row][0] = dp[row][0] + elements[row][0];
		}
		
		for( int row = 1; row < rows; row++) {
			for(int col = 0 ; col < cols; col++) {
				dp[row][col] = Math.max(dp[row-1][col], dp[row][col-1]) + elements[row][col];
			}
		}
		
		
		int row = rows - 1;
		int col = cols - 1;
		
		List<String> path = new ArrayList<>();
		path.add(formatPath(row, col));
		
		while(row >= 0 || col >= 0) {
			if (row == 0 && col == 0) {
				break;
			}

			if (row == 0) {
				col--;
			} else if (col == 0) {
				row--;
			} else if (dp[row - 1][col] > dp[row][col - 1]) {
				row--;
			} else {
				col--;
			}
			path.add(formatPath(row, col));
		}
	}

	private static String formatPath(int row, int col) {
		return '[' + row + ", " + col + ']';
	}
}
