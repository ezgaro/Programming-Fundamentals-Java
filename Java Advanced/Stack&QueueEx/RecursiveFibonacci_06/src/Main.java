import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(fibonacciFunc(n));
    }
    private static long fibonacciFunc(int n) {
        if (n <= 2) {
            return 1;
        } else {
            return fibonacciFunc(n - 1) + fibonacciFunc(n - 2);
        }
    }
}