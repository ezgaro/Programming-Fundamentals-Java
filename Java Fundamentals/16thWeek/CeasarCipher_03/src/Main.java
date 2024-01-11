import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        for(char symbol : text.toCharArray()) {
            symbol +=3;
            result.append(symbol);
        }
        System.out.println(result);
    }
}