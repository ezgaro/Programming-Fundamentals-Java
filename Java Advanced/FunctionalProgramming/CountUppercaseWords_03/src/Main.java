import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String[] words = text.split(" ");

        Predicate<String> isUpperCase= s -> Character.isUpperCase(s.charAt(0));
        Function<String[] , List<String>> getUppercaseWords = arr -> Arrays.stream(arr).filter(isUpperCase).collect(Collectors.toList());

        List<String> uppercase = getUppercaseWords.apply(words);
        System.out.println(uppercase.size());

        Consumer<String> word = System.out::println;
        uppercase.forEach(word);


    }
}