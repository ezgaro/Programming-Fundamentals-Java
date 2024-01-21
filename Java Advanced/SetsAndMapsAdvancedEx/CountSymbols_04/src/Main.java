import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] input = scanner.nextLine().toCharArray();
        Map<Character , Integer> symbolSet = new TreeMap<>();
        for(char symbol : input) {
            symbolSet.putIfAbsent(symbol , 0);
            symbolSet.put(symbol , symbolSet.get(symbol) + 1);
        }

        symbolSet.forEach((k , v) -> System.out.printf("%c: %d time/s\n", k , v));
    }
}