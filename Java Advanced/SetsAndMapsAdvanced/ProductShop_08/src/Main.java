import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<String , Map<String, Double>> shops = new TreeMap<>();

        while(!input.equals("Revision")) {
            String shop = input.split(", ")[0];
            String product = input.split(", ")[1];
            double price = Double.parseDouble(input.split(", ")[2]);
            shops.putIfAbsent(shop , new HashMap<>());
            shops.get(shop).put(product , price);
            input = scanner.nextLine();
        }

        for (Map.Entry<String, Map<String, Double>> entry : shops.entrySet()) {
            System.out.printf("%s->" ,entry.getKey());
            System.out.println();
            entry.getValue().forEach((k , v) -> {
                System.out.printf("Product: %s, Price: %.1f%n" , k , v);
            });
        }
    }
}