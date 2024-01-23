import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> names = n -> System.out.println(n);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(names);
    }
}