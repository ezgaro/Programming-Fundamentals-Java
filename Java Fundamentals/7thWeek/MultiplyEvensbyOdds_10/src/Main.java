import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        System.out.println(getMultipleOfEvensAndOdds(n));
    }

    public static int getMultipleOfEvensAndOdds(int n) {
        int evenSum = getSumofEveryDigit(n);
        int oddSum = getSumofOddDigit(n);
        
        return evenSum * oddSum;
    }
    private static int getSumofEveryDigit(int n) {
        int evenSum = 0;
        while(n > 0) {
            int currentDigit = n % 10;
            if(currentDigit % 2 == 0) {
                evenSum = evenSum + currentDigit;
            }
            n = n / 10;
        }

        return evenSum;
    }
    private static int getSumofOddDigit(int n) {
        int oddSum = 0;
        while(n > 0) {
            int currentDigit = n % 10;
            if(currentDigit % 2 != 0) {
                oddSum = oddSum + currentDigit;
            }
            n = n / 10;
        }

        return oddSum;
    }
}