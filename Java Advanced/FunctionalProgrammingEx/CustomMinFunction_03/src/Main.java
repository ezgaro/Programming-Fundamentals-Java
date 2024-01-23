import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<Integer[] , Integer> findSmallestNumber = arr -> {
            return Arrays.stream(arr)
                    .min(Integer::compare)
                    .get();
        };

        Integer[] numbersArray = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        System.out.println(findSmallestNumber.apply(numbersArray));

    }
}