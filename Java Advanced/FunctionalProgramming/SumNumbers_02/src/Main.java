import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt)
                .toArray();


        Function<int[], String> countNumbers = arr -> "Count = " + arr.length;
        Function<int[] , String> sumNumbers = arr -> "Sum = " + Arrays.stream(arr).sum();

        System.out.println(countNumbers.apply(numbers));
        System.out.println(sumNumbers.apply(numbers));
    }
}