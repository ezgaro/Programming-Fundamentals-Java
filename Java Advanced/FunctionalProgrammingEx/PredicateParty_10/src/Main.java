import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Predicate<String> predicate;

        List<String> guests = Arrays.stream(scanner.nextLine().split("\\s+")).toList();
        String line = scanner.nextLine();
        while (!line.equals("Party!")) {
            String criteria = line.split("\\s+")[2];
            if(line.contains("StartsWith")) {
                predicate = str -> str.startsWith(criteria);
            } else if (line.contains("EndsWith")) {
                 predicate = str -> str.endsWith(criteria);
            } else {
                predicate = str -> str.length() == Integer.parseInt(criteria);
            }

            if(line.contains("Remove")) {
                guests.removeIf(predicate);
            } else {
                List<String> guestsToDouble = guests.stream().filter(predicate).collect(Collectors.toList());
                guests.addAll(guestsToDouble);
            }
            line = scanner.nextLine();
        }

        if (guests.isEmpty()) {
            System.out.println("Nobody is going to the party!");
        } else {
            String result = guests.stream().sorted().collect(Collectors.joining(", ")) + " are going to the party!";
            System.out.println(result);
        }
    }
}