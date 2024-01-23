import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Function<String , Double> doubleParseVATPrice = s->Double.parseDouble(s) * 1.2;

        Arrays.stream(scanner.nextLine().split(", "))
                .map(doubleParseVATPrice)
                .forEach(n -> System.out.printf("%.2f%n" , n));
    }
}