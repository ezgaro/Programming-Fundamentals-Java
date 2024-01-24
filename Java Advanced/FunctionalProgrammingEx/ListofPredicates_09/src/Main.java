import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Integer> divisors = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> numberList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            numberList.add(i);
        }

        for (Integer divisor : divisors) {
            Predicate<Integer> devisorPredicate = number -> number % divisor == 0;
            numberList = numberList.stream().filter(devisorPredicate).collect(Collectors.toList());
        }

        numberList.forEach(e -> System.out.print(e + " "));
    }
}