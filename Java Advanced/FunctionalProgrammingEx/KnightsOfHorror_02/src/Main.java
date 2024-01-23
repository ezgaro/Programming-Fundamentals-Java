import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Consumer<String> printNames = s  -> System.out.println("Sir " + s);
        Arrays.stream(scanner.nextLine().split("\\s+"))
                .forEach(printNames);
    }
}