import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomStack customStack = new CustomStack();

        String line = scanner.nextLine();
        while (!"END".equals(line)) {
            String[] tokens = line.split("\\s+");
            String command = tokens[0];

            if ("Push".equals(command)) {
                Arrays.stream(tokens)
                        .skip(1)
                        .map(Integer::parseInt)
                        .forEach(customStack::push);
            } else if ("Pop".equals(command)) {
                customStack.pop();
            }

            line = scanner.nextLine();
        }

        customStack.forEach(System.out::println);
        customStack.forEach(System.out::println);
    }
}