import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] topIntegers = new int[numbers.length];
        int count = 0;

        int max = numbers[numbers.length - 1];
        topIntegers[count++] = max;

        for (int i = numbers.length - 2; i >= 0; i--) {
            if (numbers[i] > max) {
                max = numbers[i];
                topIntegers[count++] = max;
            }
        }

        for (int i = count - 1; i >= 0; i--) {
            System.out.print(topIntegers[i] + " ");
        }
    }
}