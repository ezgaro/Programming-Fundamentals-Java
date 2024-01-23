import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(n -> n % 2 == 0)
                .toList();


        Function<List<Integer> ,String> format = l -> l
                .stream()
                .map(String::valueOf)
                .collect(Collectors.joining(", "));
        System.out.println(format.apply(list));

        List<Integer> sortedNumbers = list.stream().sorted().toList();
        System.out.println(format.apply(sortedNumbers));

    }
}