import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Predicate<String> isSmallerOrEqual = s -> s.length() <= n;

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .filter(isSmallerOrEqual)
                .forEach(System.out::println);
    }
}