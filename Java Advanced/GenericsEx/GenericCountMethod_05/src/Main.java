import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<GenericBox<String>> list = new ArrayList<>();
        while (n-- > 0) {
            String curEl = scanner.nextLine();
            GenericBox<String> box = new GenericBox<>(curEl);
            list.add(box);
        }
        GenericBox<String> stringGenericBox = new GenericBox<>(scanner.nextLine());

        System.out.println(countGreaterElements(list, stringGenericBox));
    }

    static <T extends Comparable<T>> int countGreaterElements(List<T> data, T element) {
        int count = 0;
        for (T e : data) {
            int res = e.compareTo(element);
            if(res > 0) {
                count++;
            }
        }
        return count;
    }
}