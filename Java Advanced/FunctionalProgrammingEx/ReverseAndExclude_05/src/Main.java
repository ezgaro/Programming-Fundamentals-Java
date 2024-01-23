import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numberList = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int divisibleNum = Integer.parseInt(scanner.nextLine());
        Predicate<Integer> isDivisible = number -> number % divisibleNum ==0;
        numberList.removeIf(isDivisible);
        Collections.reverse(numberList);

        Consumer<List<Integer>> print = list -> list.forEach(e -> System.out.print(e + " "));

        print.accept(numberList);
    }
}