import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Comparator<Integer> customComparator = ((first , second) -> {
            //first even , second odd -> not swap
            if(first % 2 == 0 && second % 2 != 0) {
                return -1;
            } else if(first % 2 != 0 && second % 2 == 0) {
                return 1;
            } else {
                 return first.compareTo(second);
            }
        });

        Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .sorted(customComparator)
                .forEach(e -> System.out.print(e + " "));
    }
}