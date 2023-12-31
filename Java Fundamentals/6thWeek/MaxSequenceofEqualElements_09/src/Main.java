import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int currentStart = 0;
        int currentLength = 1;
        int longestStart = 0;
        int longestLength = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == numbers[i - 1]) {
                currentLength++;
            } else {
                currentStart = i;
                currentLength = 1;
            }

            if (currentLength > longestLength) {
                longestStart = currentStart;
                longestLength = currentLength;
            }
        }

        for (int i = longestStart; i < longestStart + longestLength; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}