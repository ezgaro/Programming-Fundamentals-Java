import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Box<Integer>> list = new ArrayList<>();
        while (n-- > 0) {
            int curNum = Integer.parseInt(scanner.nextLine());
            Box<Integer> box = new Box<>(curNum);
            list.add(box);
        }
        String[] tokens = scanner.nextLine().split("\\s+");

        int firstIndex = Integer.parseInt(tokens[0]);
        int secondIndex = Integer.parseInt(tokens[1]);
        swapNumbers(list , firstIndex , secondIndex);
        list.forEach(System.out::println);
    }

    static <T> void swapNumbers(List<T> list, int firstIndex, int secondIndex) {
        T firstElement = list.get(firstIndex);
        T secondElement = list.get(secondIndex);

        list.set(secondIndex , firstElement);
        list.set(firstIndex , secondElement);
    }

}