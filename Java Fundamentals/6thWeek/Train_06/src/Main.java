import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        for(int i = 0 ; i <= n - 1 ; i++) {
            int curr = Integer.parseInt(scanner.nextLine());
            numbers[i] = curr;
            sum+=curr;
        }
        for(int j = 0 ; j<= n -1 ; j++) {
            System.out.print(numbers[j] + " ");
        }
        System.out.println();
        System.out.print(sum);
    }
}