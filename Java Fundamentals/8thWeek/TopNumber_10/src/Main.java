import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for(int i = 1 ; i <= n ; i++) {
            if(isSumOfDigitsDivisibleBy8(i) &&isContainsOddDigits(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isContainsOddDigits(int number) {
        while (number> 0) {
            int lastDigit = number % 10;
            if(lastDigit % 2 == 0) {
                return true;
            } else {
                number = number / 10;
            }
        }
        return false;
    }

    public static boolean isSumOfDigitsDivisibleBy8(int number) {
        int sumDigits = 0;
        while (number > 0) {
            int lastDigit = number %10;
            sumDigits+=lastDigit;
            number = number / 10;
        }
        if(sumDigits % 8 == 0) {
            return true;
        } else {
            return false;
        }
    }
}