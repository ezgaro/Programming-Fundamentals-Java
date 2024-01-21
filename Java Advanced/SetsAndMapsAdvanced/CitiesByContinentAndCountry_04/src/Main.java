import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        LinkedHashMap<String , LinkedHashMap<String , List<String>>> continents = new LinkedHashMap<>();
        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String continent = input[0];
            String countries = input[1];
            String cities = input[2];

            continents.putIfAbsent(continent , new LinkedHashMap<>());
            LinkedHashMap<String, List<String>> country = continents.get(continent);
            country.putIfAbsent(countries , new ArrayList<>());
            List<String> city = country.get(countries);
            city.add(cities);
        }

        continents.entrySet().stream()
                .forEach(e -> {
                    System.out.println(e.getKey() + ":");
                    e.getValue().entrySet().stream()
                            .forEach(innerE -> {
                                String cities = String.join(", " , innerE.getValue());
                                System.out.println("  " + innerE.getKey() + " -> " + cities);
                            });
                });
    }
}