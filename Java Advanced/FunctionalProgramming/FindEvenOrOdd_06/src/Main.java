import java.util.Arrays;
import java.util.Scanner;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] range = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int start = range[0];
        int end = range[1];
        String command = scanner.nextLine();

        if(command.equals("odd")) {
            printNumbers(start , end , v -> v % 2 != 0);
        } else {
            printNumbers(start , end , v -> v % 2 == 0);
        }
    }

    private static void printNumbers(int start, int end, IntPredicate predicate) {
        IntStream.rangeClosed(start , end)
                .filter(predicate)
                .forEach(e -> System.out.print(e +" "));
    }
}