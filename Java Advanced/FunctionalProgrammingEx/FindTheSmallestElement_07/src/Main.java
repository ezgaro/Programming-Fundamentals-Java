import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<List<Integer> , Integer> smallestIndex = numbers -> numbers.indexOf(Collections.min(numbers));
        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(smallestIndex.apply(numberList));

    }
}