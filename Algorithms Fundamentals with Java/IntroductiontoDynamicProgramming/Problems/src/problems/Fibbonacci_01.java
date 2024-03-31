package problems;

import java.util.Scanner;

public class Fibbonacci_01 {
	public static int[] dp;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = Integer.parseInt(sc.nextLine());
		dp = new int[(int) (n+1)];
		
		System.out.println(calcFib(n));
	}

	private static int calcFib(int n) {
		if(n <= 2) {
			return 1;
		}
		
		if (dp[(int) n] != 0) {
			return dp[(int) n];
		}
		
		
		return dp[(int) n] = calcFib(n-1) + calcFib(n-2);
	}
}
