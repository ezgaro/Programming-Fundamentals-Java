import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Box<String>> boxList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String curInput = scanner.nextLine();
            Box<String> box = new Box<>(curInput);
            boxList.add(box);
        }
        String[] tokens = scanner.nextLine().split("\\s+");
        int firstSwapIndex = Integer.parseInt(tokens[0]);
        int secondSwapIndex = Integer.parseInt(tokens[1]);

        swap(boxList, firstSwapIndex, secondSwapIndex);
        boxList.forEach(System.out::println);
    }

    static <T> void swap(List<T> boxList, int firstIndex , int secondIndex) {
        T firstElement = boxList.get(firstIndex);
        T secondElement = boxList.get(secondIndex);

        boxList.set(firstIndex, secondElement);
        boxList.set(secondIndex, firstElement);
    }
}