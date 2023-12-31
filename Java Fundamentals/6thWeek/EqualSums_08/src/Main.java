import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            // Calculate left sum
            for (int j = 0; j < i; j++) {
                leftSum += arr[j];
            }

            // Calculate right sum
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];
            }

            // Check if left sum equals right sum
            if (leftSum == rightSum) {
                System.out.println(i);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("no");
        }
    }
}