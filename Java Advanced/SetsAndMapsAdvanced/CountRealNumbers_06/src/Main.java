import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Map<Double , Integer> doubleIntegerMap = new LinkedHashMap<>();
        for (String s : input) {
            double currentNum = Double.parseDouble(s);
            if (!doubleIntegerMap.containsKey(currentNum)) {
                doubleIntegerMap.put(currentNum, 1);
            } else {
                doubleIntegerMap.put(currentNum, doubleIntegerMap.get(currentNum) + 1);
            }
        }
        doubleIntegerMap.forEach((k , v) -> System.out.println(k + " -> " + v));
    }
}