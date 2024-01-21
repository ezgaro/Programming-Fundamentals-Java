import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> inputSet = new LinkedHashSet<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0) {
            String currentInput = scanner.nextLine();
            inputSet.add(currentInput);
        }

        for (String string : inputSet) {
            System.out.println(string);
        }
    }
}