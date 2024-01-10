import java.util.LinkedHashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        LinkedHashMap<Character , Integer> symbolsCount = new LinkedHashMap<>();

        for(char symbol : text.toCharArray()) {
            if(!symbolsCount.containsKey(symbol)) {
                symbolsCount.put(symbol , 1);
            } else {
                symbolsCount.put(symbol , symbolsCount.get(symbol) + 1);
            }
        }

        symbolsCount.forEach((key, value) -> System.out.println(key + " -> " + value));
    }
}