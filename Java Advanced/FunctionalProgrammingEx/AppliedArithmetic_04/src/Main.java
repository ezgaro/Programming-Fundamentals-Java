import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .toList();


        Function<List<Integer> , List<Integer>> add = l -> {
            return l.stream().map(e -> e+1).collect(Collectors.toList());
        };

        Function<List<Integer> , List<Integer>> multiply = l -> {
            return l.stream().map(e -> e*2).collect(Collectors.toList());
        };

        Function<List<Integer> , List<Integer>> subtract = l -> {
            return l.stream().map(e -> e-1).collect(Collectors.toList());
        };

        Consumer<List<Integer>> print = (integer)  -> integer.forEach(e -> System.out.print(e + " "));
        String input = scanner.nextLine();
        while(!input.equals("end")) {
            switch (input) {
                case "add":
                    list = add.apply(list);
                    break;
                case "multiply" :
                    list = multiply.apply(list);
                    break;
                case "subtract":
                    list = subtract.apply(list);
                    break;
                case "print" :
                    print.accept(list);
                    System.out.println();
                    break;

            }

            input = scanner.nextLine();
        }
    }
}